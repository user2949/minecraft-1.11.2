import com.google.gson.JsonParseException;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bjq extends bjn {
	private static final Logger c = LogManager.getLogger();
	private final caa d;
	private final kq e;

	public bjq(bjm bjm, caa caa) {
		super(bjm);
		this.d = caa;

		byp byp4;
		try {
			byp4 = new byp(caa.a());
		} catch (IOException var5) {
			byp4 = bzc.a;
		}

		this.e = this.a.N().a("texturepackicon", byp4);
	}

	@Override
	protected int a() {
		return 3;
	}

	@Override
	protected String b() {
		try {
			cba cba2 = this.d.a(this.a.P().b, "pack");
			if (cba2 != null) {
				return cba2.a().d();
			}
		} catch (JsonParseException var2) {
			c.error("Couldn't load metadata info", var2);
		} catch (IOException var3) {
			c.error("Couldn't load metadata info", var3);
		}

		return a.RED + "Missing " + "pack.mcmeta" + " :(";
	}

	@Override
	protected boolean f() {
		return false;
	}

	@Override
	protected boolean g() {
		return false;
	}

	@Override
	protected boolean h() {
		return false;
	}

	@Override
	protected boolean i() {
		return false;
	}

	@Override
	protected String c() {
		return "Server";
	}

	@Override
	protected void d() {
		this.a.N().a(this.e);
	}

	@Override
	protected boolean e() {
		return false;
	}

	@Override
	public boolean j() {
		return true;
	}
}
