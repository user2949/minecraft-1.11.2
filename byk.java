import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class byk {
	private static final Logger a = LogManager.getLogger();
	private static byk b;

	public static void a() {
		b = new byk();
	}

	public static byk b() {
		return b;
	}

	private byk() {
	}

	public void a(byg byg) {
		byg.f().b(byg);
		byg.e().b(byg);
		cdb.e(byg.h());
	}

	public int c() throws ku {
		int integer2 = cdb.d();
		if (integer2 <= 0) {
			throw new ku("Could not create shader program (returned program ID " + integer2 + ")");
		} else {
			return integer2;
		}
	}

	public void b(byg byg) throws IOException {
		byg.f().a(byg);
		byg.e().a(byg);
		cdb.f(byg.h());
		int integer3 = cdb.a(byg.h(), cdb.m);
		if (integer3 == 0) {
			a.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", new Object[]{byg.e().a(), byg.f().a()});
			a.warn(cdb.e(byg.h(), 32768));
		}
	}
}
