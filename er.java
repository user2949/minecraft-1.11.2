import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class er extends SimpleChannelInboundHandler<fm<?>> {
	private static final Logger g = LogManager.getLogger();
	public static final Marker a = MarkerManager.getMarker("NETWORK");
	public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
	public static final AttributeKey<es> c = AttributeKey.valueOf("protocol");
	public static final op<NioEventLoopGroup> d = new op<NioEventLoopGroup>() {
		protected NioEventLoopGroup b() {
			return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
		}
	};
	public static final op<EpollEventLoopGroup> e = new op<EpollEventLoopGroup>() {
		protected EpollEventLoopGroup b() {
			return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
		}
	};
	public static final op<LocalEventLoopGroup> f = new op<LocalEventLoopGroup>() {
		protected LocalEventLoopGroup b() {
			return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
		}
	};
	private final fn h;
	private final Queue<er.a> i = Queues.newConcurrentLinkedQueue();
	private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
	private Channel k;
	private SocketAddress l;
	private ew m;
	private fb n;
	private boolean o;
	private boolean p;

	public er(fn fn) {
		this.h = fn;
	}

	public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
		super.channelActive(channelHandlerContext);
		this.k = channelHandlerContext.channel();
		this.l = this.k.remoteAddress();

		try {
			this.a(es.HANDSHAKING);
		} catch (Throwable var3) {
			g.fatal(var3);
		}
	}

	public void a(es es) {
		this.k.attr(c).set(es);
		this.k.config().setAutoRead(true);
		g.debug("Enabled auto read");
	}

	public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
		this.a(new fi("disconnect.endOfStream"));
	}

	public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
		fi fi4;
		if (throwable instanceof TimeoutException) {
			fi4 = new fi("disconnect.timeout");
		} else {
			fi4 = new fi("disconnect.genericReason", "Internal Exception: " + throwable);
		}

		g.debug(throwable);
		this.a(fi4);
	}

	protected void channelRead0(ChannelHandlerContext channelHandlerContext, fm<?> fm) throws Exception {
		if (this.k.isOpen()) {
			try {
				((fm<ew>)fm).a(this.m);
			} catch (lb var4) {
			}
		}
	}

	public void a(ew ew) {
		Validate.notNull(ew, "packetListener", new Object[0]);
		g.debug("Set listener of {} to {}", new Object[]{this, ew});
		this.m = ew;
	}

	public void a(fm<?> fm) {
		if (this.g()) {
			this.m();
			this.a(fm, null);
		} else {
			this.j.writeLock().lock();

			try {
				this.i.add(new er.a(fm, null));
			} finally {
				this.j.writeLock().unlock();
			}
		}
	}

	public void a(
		fm<?> fm, GenericFutureListener<? extends Future<? super Void>> genericFutureListener, GenericFutureListener<? extends Future<? super Void>>... arr
	) {
		if (this.g()) {
			this.m();
			this.a(fm, (GenericFutureListener<? extends Future<? super Void>>[])ArrayUtils.add(arr, 0, genericFutureListener));
		} else {
			this.j.writeLock().lock();

			try {
				this.i.add(new er.a(fm, (GenericFutureListener<? extends Future<? super Void>>[])ArrayUtils.add(arr, 0, genericFutureListener)));
			} finally {
				this.j.writeLock().unlock();
			}
		}
	}

	private void a(fm<?> fm, @Nullable GenericFutureListener<? extends Future<? super Void>>[] arr) {
		final es es4 = es.a(fm);
		final es es5 = (es)this.k.attr(c).get();
		if (es5 != es4) {
			g.debug("Disabled auto read");
			this.k.config().setAutoRead(false);
		}

		if (this.k.eventLoop().inEventLoop()) {
			if (es4 != es5) {
				this.a(es4);
			}

			ChannelFuture channelFuture6 = this.k.writeAndFlush(fm);
			if (arr != null) {
				channelFuture6.addListeners(arr);
			}

			channelFuture6.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
		} else {
			this.k.eventLoop().execute(new Runnable() {
				public void run() {
					if (es4 != es5) {
						er.this.a(es4);
					}

					ChannelFuture channelFuture2 = er.this.k.writeAndFlush(fm);
					if (arr != null) {
						channelFuture2.addListeners(arr);
					}

					channelFuture2.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
				}
			});
		}
	}

	private void m() {
		if (this.k != null && this.k.isOpen()) {
			this.j.readLock().lock();

			try {
				while (!this.i.isEmpty()) {
					er.a a2 = (er.a)this.i.poll();
					this.a(a2.a, a2.b);
				}
			} finally {
				this.j.readLock().unlock();
			}
		}
	}

	public void a() {
		this.m();
		if (this.m instanceof lf) {
			((lf)this.m).F_();
		}

		this.k.flush();
	}

	public SocketAddress b() {
		return this.l;
	}

	public void a(fb fb) {
		if (this.k.isOpen()) {
			this.k.close().awaitUninterruptibly();
			this.n = fb;
		}
	}

	public boolean c() {
		return this.k instanceof LocalChannel || this.k instanceof LocalServerChannel;
	}

	public static er a(InetAddress inetAddress, int integer, boolean boolean3) {
		final er er4 = new er(fn.CLIENTBOUND);
		Class<? extends SocketChannel> class5;
		op<? extends EventLoopGroup> op6;
		if (Epoll.isAvailable() && boolean3) {
			class5 = EpollSocketChannel.class;
			op6 = e;
		} else {
			class5 = NioSocketChannel.class;
			op6 = d;
		}

		((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(op6.c()))
					.handler(
						new ChannelInitializer<Channel>() {
							protected void initChannel(Channel channel) throws Exception {
								try {
									channel.config().setOption(ChannelOption.TCP_NODELAY, true);
								} catch (ChannelException var3) {
								}
				
								channel.pipeline()
									.addLast("timeout", new ReadTimeoutHandler(30))
									.addLast("splitter", new ex())
									.addLast("decoder", new eu(fn.CLIENTBOUND))
									.addLast("prepender", new ey())
									.addLast("encoder", new ev(fn.SERVERBOUND))
									.addLast("packet_handler", er4);
							}
						}
					))
				.channel(class5))
			.connect(inetAddress, integer)
			.syncUninterruptibly();
		return er4;
	}

	public static er a(SocketAddress socketAddress) {
		final er er2 = new er(fn.CLIENTBOUND);
		((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)f.c())).handler(new ChannelInitializer<Channel>() {
			protected void initChannel(Channel channel) throws Exception {
				channel.pipeline().addLast("packet_handler", er2);
			}
		})).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
		return er2;
	}

	public void a(SecretKey secretKey) {
		this.o = true;
		this.k.pipeline().addBefore("splitter", "decrypt", new en(oi.a(2, secretKey)));
		this.k.pipeline().addBefore("prepender", "encrypt", new eo(oi.a(1, secretKey)));
	}

	public boolean f() {
		return this.o;
	}

	public boolean g() {
		return this.k != null && this.k.isOpen();
	}

	public boolean h() {
		return this.k == null;
	}

	public ew i() {
		return this.m;
	}

	public fb j() {
		return this.n;
	}

	public void k() {
		this.k.config().setAutoRead(false);
	}

	public void a(int integer) {
		if (integer >= 0) {
			if (this.k.pipeline().get("decompress") instanceof ep) {
				((ep)this.k.pipeline().get("decompress")).a(integer);
			} else {
				this.k.pipeline().addBefore("decoder", "decompress", new ep(integer));
			}

			if (this.k.pipeline().get("compress") instanceof eq) {
				((eq)this.k.pipeline().get("compress")).a(integer);
			} else {
				this.k.pipeline().addBefore("encoder", "compress", new eq(integer));
			}
		} else {
			if (this.k.pipeline().get("decompress") instanceof ep) {
				this.k.pipeline().remove("decompress");
			}

			if (this.k.pipeline().get("compress") instanceof eq) {
				this.k.pipeline().remove("compress");
			}
		}
	}

	public void l() {
		if (this.k != null && !this.k.isOpen()) {
			if (this.p) {
				g.warn("handleDisconnection() called twice");
			} else {
				this.p = true;
				if (this.j() != null) {
					this.i().a(this.j());
				} else if (this.i() != null) {
					this.i().a(new fh("Disconnected"));
				}
			}
		}
	}

	static class a {
		private final fm<?> a;
		private final GenericFutureListener<? extends Future<? super Void>>[] b;

		public a(fm<?> fm, GenericFutureListener<? extends Future<? super Void>>... arr) {
			this.a = fm;
			this.b = arr;
		}
	}
}
