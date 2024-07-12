import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mk implements jx, lf {
	private static final AtomicInteger b = new AtomicInteger(0);
	private static final Logger c = LogManager.getLogger();
	private static final Random d = new Random();
	private final byte[] e = new byte[4];
	private final MinecraftServer f;
	public final er a;
	private mk.a g = mk.a.HELLO;
	private int h;
	private GameProfile i;
	private final String j = "";
	private SecretKey k;
	private ly l;

	public mk(MinecraftServer minecraftServer, er er) {
		this.f = minecraftServer;
		this.a = er;
		d.nextBytes(this.e);
	}

	@Override
	public void F_() {
		if (this.g == mk.a.READY_TO_ACCEPT) {
			this.b();
		} else if (this.g == mk.a.DELAY_ACCEPT) {
			ly ly2 = this.f.am().a(this.i.getId());
			if (ly2 == null) {
				this.g = mk.a.READY_TO_ACCEPT;
				this.f.am().a(this.a, this.l);
				this.l = null;
			}
		}

		if (this.h++ == 600) {
			this.a("Took too long to log in");
		}
	}

	public void a(String string) {
		try {
			c.info("Disconnecting {}: {}", new Object[]{this.d(), string});
			fh fh3 = new fh(string);
			this.a.a(new jw(fh3));
			this.a.a(fh3);
		} catch (Exception var3) {
			c.error("Error whilst disconnecting player", var3);
		}
	}

	public void b() {
		if (!this.i.isComplete()) {
			this.i = this.a(this.i);
		}

		String string2 = this.f.am().a(this.a.b(), this.i);
		if (string2 != null) {
			this.a(string2);
		} else {
			this.g = mk.a.ACCEPTED;
			if (this.f.aG() >= 0 && !this.a.c()) {
				this.a.a(new jv(this.f.aG()), new ChannelFutureListener() {
					public void operationComplete(ChannelFuture channelFuture) throws Exception {
						mk.this.a.a(mk.this.f.aG());
					}
				});
			}

			this.a.a(new jt(this.i));
			ly ly3 = this.f.am().a(this.i.getId());
			if (ly3 != null) {
				this.g = mk.a.DELAY_ACCEPT;
				this.l = this.f.am().g(this.i);
			} else {
				this.f.am().a(this.a, this.f.am().g(this.i));
			}
		}
	}

	@Override
	public void a(fb fb) {
		c.info("{} lost connection: {}", new Object[]{this.d(), fb.c()});
	}

	public String d() {
		return this.i != null ? this.i + " (" + this.a.b() + ")" : String.valueOf(this.a.b());
	}

	@Override
	public void a(jy jy) {
		Validate.validState(this.g == mk.a.HELLO, "Unexpected hello packet", new Object[0]);
		this.i = jy.a();
		if (this.f.ab() && !this.a.c()) {
			this.g = mk.a.KEY;
			this.a.a(new ju("", this.f.O().getPublic(), this.e));
		} else {
			this.g = mk.a.READY_TO_ACCEPT;
		}
	}

	@Override
	public void a(jz jz) {
		Validate.validState(this.g == mk.a.KEY, "Unexpected key packet", new Object[0]);
		PrivateKey privateKey3 = this.f.O().getPrivate();
		if (!Arrays.equals(this.e, jz.b(privateKey3))) {
			throw new IllegalStateException("Invalid nonce!");
		} else {
			this.k = jz.a(privateKey3);
			this.g = mk.a.AUTHENTICATING;
			this.a.a(this.k);
			(new Thread("User Authenticator #" + b.incrementAndGet()) {
				public void run() {
					GameProfile gameProfile2 = mk.this.i;

					try {
						String string3 = new BigInteger(oi.a("", mk.this.f.O().getPublic(), mk.this.k)).toString(16);
						mk.this.i = mk.this.f.az().hasJoinedServer(new GameProfile(null, gameProfile2.getName()), string3, this.a());
						if (mk.this.i != null) {
							mk.c.info("UUID of player {} is {}", new Object[]{mk.this.i.getName(), mk.this.i.getId()});
							mk.this.g = mk.a.READY_TO_ACCEPT;
						} else if (mk.this.f.R()) {
							mk.c.warn("Failed to verify username but will let them in anyway!");
							mk.this.i = mk.this.a(gameProfile2);
							mk.this.g = mk.a.READY_TO_ACCEPT;
						} else {
							mk.this.a("Failed to verify username!");
							mk.c.error("Username '{}' tried to join with an invalid session", new Object[]{gameProfile2.getName()});
						}
					} catch (AuthenticationUnavailableException var3) {
						if (mk.this.f.R()) {
							mk.c.warn("Authentication servers are down but will let them in anyway!");
							mk.this.i = mk.this.a(gameProfile2);
							mk.this.g = mk.a.READY_TO_ACCEPT;
						} else {
							mk.this.a("Authentication servers are down. Please try again later, sorry!");
							mk.c.error("Couldn't verify username because servers are unavailable");
						}
					}
				}

				@Nullable
				private InetAddress a() {
					SocketAddress socketAddress2 = mk.this.a.b();
					return mk.this.f.ac() && socketAddress2 instanceof InetSocketAddress ? ((InetSocketAddress)socketAddress2).getAddress() : null;
				}
			}).start();
		}
	}

	protected GameProfile a(GameProfile gameProfile) {
		UUID uUID3 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8));
		return new GameProfile(uUID3, gameProfile.getName());
	}

	static enum a {
		HELLO,
		KEY,
		AUTHENTICATING,
		READY_TO_ACCEPT,
		DELAY_ACCEPT,
		ACCEPTED;
	}
}
