import io.netty.util.internal.ThreadLocalRandom;
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class tl {
	private final double a;
	private final int b;
	private final String c;
	private final UUID d;
	private boolean e = true;

	public tl(String string, double double2, int integer) {
		this(ot.a(ThreadLocalRandom.current()), string, double2, integer);
	}

	public tl(UUID uUID, String string, double double3, int integer) {
		this.d = uUID;
		this.c = string;
		this.a = double3;
		this.b = integer;
		Validate.notEmpty(string, "Modifier name cannot be empty", new Object[0]);
		Validate.inclusiveBetween(0L, 2L, (long)integer, "Invalid operation");
	}

	public UUID a() {
		return this.d;
	}

	public String b() {
		return this.c;
	}

	public int c() {
		return this.b;
	}

	public double d() {
		return this.a;
	}

	public boolean e() {
		return this.e;
	}

	public tl a(boolean boolean1) {
		this.e = boolean1;
		return this;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object != null && this.getClass() == object.getClass()) {
			tl tl3 = (tl)object;
			return this.d != null ? this.d.equals(tl3.d) : tl3.d == null;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.d != null ? this.d.hashCode() : 0;
	}

	public String toString() {
		return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
	}
}
