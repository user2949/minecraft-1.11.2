import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mh {
	private static final Logger e = LogManager.getLogger();
	public static final op<NioEventLoopGroup> a = new op<NioEventLoopGroup>() {
		protected NioEventLoopGroup b() {
			return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
		}
	};
	public static final op<EpollEventLoopGroup> b = new op<EpollEventLoopGroup>() {
		protected EpollEventLoopGroup b() {
			return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
		}
	};
	public static final op<LocalEventLoopGroup> c = new op<LocalEventLoopGroup>() {
		protected LocalEventLoopGroup b() {
			return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
		}
	};
	private final MinecraftServer f;
	public volatile boolean d;
	private final List<ChannelFuture> g = Collections.synchronizedList(Lists.newArrayList());
	private final List<er> h = Collections.synchronizedList(Lists.newArrayList());

	public mh(MinecraftServer minecraftServer) {
		this.f = minecraftServer;
		this.d = true;
	}

	public void a(InetAddress inetAddress, int integer) throws IOException {
		synchronized (this.g) {
			Class<? extends ServerSocketChannel> class5;
			op<? extends EventLoopGroup> op6;
			if (Epoll.isAvailable() && this.f.af()) {
				class5 = EpollServerSocketChannel.class;
				op6 = b;
				e.info("Using epoll channel type");
			} else {
				class5 = NioServerSocketChannel.class;
				op6 = a;
				e.info("Using default channel type");
			}

			this.g
				.add(
					((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(class5))
							.childHandler(
								new ChannelInitializer<Channel>() {
									protected void initChannel(Channel channel) throws Exception {
										try {
											channel.config().setOption(ChannelOption.TCP_NODELAY, true);
										} catch (ChannelException var3) {
										}
					
										channel.pipeline()
											.addLast("timeout", new ReadTimeoutHandler(30))
											.addLast("legacy_query", new mf(mh.this))
											.addLast("splitter", new ex())
											.addLast("decoder", new eu(fn.SERVERBOUND))
											.addLast("prepender", new ey())
											.addLast("encoder", new ev(fn.CLIENTBOUND));
										er er3 = new er(fn.SERVERBOUND);
										mh.this.h.add(er3);
										channel.pipeline().addLast("packet_handler", er3);
										er3.a(new mj(mh.this.f, er3));
									}
								}
							)
							.group(op6.c())
							.localAddress(inetAddress, integer))
						.bind()
						.syncUninterruptibly()
				);
		}
	}

	public SocketAddress a() {
		ChannelFuture channelFuture2;
		synchronized (this.g) {
			channelFuture2 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
					.childHandler(new ChannelInitializer<Channel>() {
						protected void initChannel(Channel channel) throws Exception {
							er er3 = new er(fn.SERVERBOUND);
							er3.a(new mg(mh.this.f, er3));
							mh.this.h.add(er3);
							channel.pipeline().addLast("packet_handler", er3);
						}
					})
					.group((EventLoopGroup)a.c())
					.localAddress(LocalAddress.ANY))
				.bind()
				.syncUninterruptibly();
			this.g.add(channelFuture2);
		}

		return channelFuture2.channel().localAddress();
	}

	public void b() {
		this.d = false;

		for (ChannelFuture channelFuture3 : this.g) {
			try {
				channelFuture3.channel().close().sync();
			} catch (InterruptedException var4) {
				e.error("Interrupted whilst closing channel");
			}
		}
	}

	public void c() {
		synchronized (this.h) {
			Iterator<er> iterator3 = this.h.iterator();

			while (iterator3.hasNext()) {
				final er er4 = (er)iterator3.next();
				if (!er4.h()) {
					if (er4.g()) {
						try {
							er4.a();
						} catch (Exception var8) {
							if (er4.c()) {
								b b6 = b.a(var8, "Ticking memory connection");
								c c7 = b6.a("Ticking connection");
								c7.a("Connection", new d<String>() {
									public String call() throws Exception {
										return er4.toString();
									}
								});
								throw new f(b6);
							}

							e.warn("Failed to handle packet for {}", new Object[]{er4.b(), var8});
							final fh fh6 = new fh("Internal server error");
							er4.a(new gq(fh6), new GenericFutureListener<Future<? super Void>>() {
								public void operationComplete(Future<? super Void> future) throws Exception {
									er4.a(fh6);
								}
							});
							er4.k();
						}
					} else {
						iterator3.remove();
						er4.l();
					}
				}
			}
		}
	}

	public MinecraftServer d() {
		return this.f;
	}
}
