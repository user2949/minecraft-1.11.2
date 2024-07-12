import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import net.minecraft.realms.DisconnectedRealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnn implements js {
	private static final Logger a = LogManager.getLogger();
	private final bes b;
	@Nullable
	private final bho c;
	private final er d;
	private GameProfile e;

	public bnn(er er, bes bes, @Nullable bho bho) {
		this.d = er;
		this.b = bes;
		this.c = bho;
	}

	@Override
	public void a(ju ju) {
		final SecretKey secretKey3 = oi.a();
		String string4 = ju.a();
		PublicKey publicKey5 = ju.b();
		String string6 = new BigInteger(oi.a(string4, publicKey5, secretKey3)).toString(16);
		if (this.b.C() != null && this.b.C().d()) {
			try {
				this.b().joinServer(this.b.K().e(), this.b.K().d(), string6);
			} catch (AuthenticationException var10) {
				a.warn("Couldn't connect to auth servers but will continue to join LAN");
			}
		} else {
			try {
				this.b().joinServer(this.b.K().e(), this.b.K().d(), string6);
			} catch (AuthenticationUnavailableException var7) {
				this.d.a(new fi("disconnect.loginFailedInfo", new fi("disconnect.loginFailedInfo.serversUnavailable")));
				return;
			} catch (InvalidCredentialsException var8) {
				this.d.a(new fi("disconnect.loginFailedInfo", new fi("disconnect.loginFailedInfo.invalidSession")));
				return;
			} catch (AuthenticationException var9) {
				this.d.a(new fi("disconnect.loginFailedInfo", var9.getMessage()));
				return;
			}
		}

		this.d.a(new jz(secretKey3, publicKey5, ju.c()), new GenericFutureListener<Future<? super Void>>() {
			public void operationComplete(Future<? super Void> future) throws Exception {
				bnn.this.d.a(secretKey3);
			}
		});
	}

	private MinecraftSessionService b() {
		return this.b.X();
	}

	@Override
	public void a(jt jt) {
		this.e = jt.a();
		this.d.a(es.PLAY);
		this.d.a(new bno(this.b, this.c, this.d, this.e));
	}

	@Override
	public void a(fb fb) {
		if (this.c != null && this.c instanceof bgm) {
			this.b.a(new DisconnectedRealmsScreen(((bgm)this.c).a(), "connect.failed", fb).getProxy());
		} else {
			this.b.a(new bhc(this.c, "connect.failed", fb));
		}
	}

	@Override
	public void a(jw jw) {
		this.d.a(jw.a());
	}

	@Override
	public void a(jv jv) {
		if (!this.d.c()) {
			this.d.a(jv.a());
		}
	}
}
