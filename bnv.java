import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnv {
	private static final Splitter a = Splitter.on('\u0000').limit(6);
	private static final Logger b = LogManager.getLogger();
	private final List<er> c = Collections.synchronizedList(Lists.newArrayList());

	public void a(bnt bnt) throws UnknownHostException {
		bns bns3 = bns.a(bnt.b);
		final er er4 = er.a(InetAddress.getByName(bns3.a()), bns3.b(), false);
		this.c.add(er4);
		bnt.d = "Pinging...";
		bnt.e = -1L;
		bnt.i = null;
		er4.a(new kc() {
			private boolean d;
			private boolean e;
			private long f;

			@Override
			public void a(ke ke) {
				if (this.e) {
					er4.a(new fh("Received unrequested status"));
				} else {
					this.e = true;
					kf kf3 = ke.a();
					if (kf3.a() != null) {
						bnt.d = kf3.a().d();
					} else {
						bnt.d = "";
					}

					if (kf3.c() != null) {
						bnt.g = kf3.c().a();
						bnt.f = kf3.c().b();
					} else {
						bnt.g = "Old";
						bnt.f = 0;
					}

					if (kf3.b() != null) {
						bnt.c = a.GRAY + "" + kf3.b().b() + "" + a.DARK_GRAY + "/" + a.GRAY + kf3.b().a();
						if (ArrayUtils.isNotEmpty(kf3.b().c())) {
							StringBuilder stringBuilder4 = new StringBuilder();

							for (GameProfile gameProfile8 : kf3.b().c()) {
								if (stringBuilder4.length() > 0) {
									stringBuilder4.append("\n");
								}

								stringBuilder4.append(gameProfile8.getName());
							}

							if (kf3.b().c().length < kf3.b().b()) {
								if (stringBuilder4.length() > 0) {
									stringBuilder4.append("\n");
								}

								stringBuilder4.append("... and ").append(kf3.b().b() - kf3.b().c().length).append(" more ...");
							}

							bnt.i = stringBuilder4.toString();
						}
					} else {
						bnt.c = a.DARK_GRAY + "???";
					}

					if (kf3.d() != null) {
						String string4 = kf3.d();
						if (string4.startsWith("data:image/png;base64,")) {
							bnt.a(string4.substring("data:image/png;base64,".length()));
						} else {
							bnv.b.error("Invalid server icon (unknown format)");
						}
					} else {
						bnt.a(null);
					}

					this.f = bes.I();
					er4.a(new kh(this.f));
					this.d = true;
				}
			}

			@Override
			public void a(kd kd) {
				long long3 = this.f;
				long long5 = bes.I();
				bnt.e = long5 - long3;
				er4.a(new fh("Finished"));
			}

			@Override
			public void a(fb fb) {
				if (!this.d) {
					bnv.b.error("Can't ping {}: {}", new Object[]{bnt.b, fb.c()});
					bnt.d = a.DARK_RED + "Can't connect to server.";
					bnt.c = "";
					bnv.this.b(bnt);
				}
			}
		});

		try {
			er4.a(new jp(316, bns3.a(), bns3.b(), es.STATUS));
			er4.a(new ki());
		} catch (Throwable var5) {
			b.error(var5);
		}
	}

	private void b(bnt bnt) {
		final bns bns3 = bns.a(bnt.b);
		((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)er.d.c())).handler(new ChannelInitializer<Channel>() {
			protected void initChannel(Channel channel) throws Exception {
				try {
					channel.config().setOption(ChannelOption.TCP_NODELAY, true);
				} catch (ChannelException var3) {
				}

				channel.pipeline().addLast(new ChannelHandler[]{new SimpleChannelInboundHandler<ByteBuf>() {
					public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
						super.channelActive(channelHandlerContext);
						ByteBuf byteBuf3 = Unpooled.buffer();

						try {
							byteBuf3.writeByte(254);
							byteBuf3.writeByte(1);
							byteBuf3.writeByte(250);
							char[] arr4 = "MC|PingHost".toCharArray();
							byteBuf3.writeShort(arr4.length);

							for (char character8 : arr4) {
								byteBuf3.writeChar(character8);
							}

							byteBuf3.writeShort(7 + 2 * bns3.a().length());
							byteBuf3.writeByte(127);
							arr4 = bns3.a().toCharArray();
							byteBuf3.writeShort(arr4.length);

							for (char character8 : arr4) {
								byteBuf3.writeChar(character8);
							}

							byteBuf3.writeInt(bns3.b());
							channelHandlerContext.channel().writeAndFlush(byteBuf3).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
						} finally {
							byteBuf3.release();
						}
					}

					protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
						short short4 = byteBuf.readUnsignedByte();
						if (short4 == 255) {
							String string5 = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE);
							String[] arr6 = (String[])Iterables.toArray(bnv.a.split(string5), String.class);
							if ("§1".equals(arr6[0])) {
								int integer7 = ot.a(arr6[1], 0);
								String string8 = arr6[2];
								String string9 = arr6[3];
								int integer10 = ot.a(arr6[4], -1);
								int integer11 = ot.a(arr6[5], -1);
								bnt.f = -1;
								bnt.g = string8;
								bnt.d = string9;
								bnt.c = a.GRAY + "" + integer10 + "" + a.DARK_GRAY + "/" + a.GRAY + integer11;
							}
						}

						channelHandlerContext.close();
					}

					public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
						channelHandlerContext.close();
					}
				}});
			}
		})).channel(NioSocketChannel.class)).connect(bns3.a(), bns3.b());
	}

	public void a() {
		synchronized (this.c) {
			Iterator<er> iterator3 = this.c.iterator();

			while (iterator3.hasNext()) {
				er er4 = (er)iterator3.next();
				if (er4.g()) {
					er4.a();
				} else {
					iterator3.remove();
					er4.l();
				}
			}
		}
	}

	public void b() {
		synchronized (this.c) {
			Iterator<er> iterator3 = this.c.iterator();

			while (iterator3.hasNext()) {
				er er4 = (er)iterator3.next();
				if (er4.g()) {
					iterator3.remove();
					er4.a(new fh("Cancelled"));
				}
			}
		}
	}
}
