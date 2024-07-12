import java.util.Random;
import javax.annotation.Nullable;

public class aza {
	private aou a = aou.NONE;
	private aqi b = aqi.NONE;
	private boolean c;
	@Nullable
	private alu d;
	@Nullable
	private ajl e;
	@Nullable
	private axz f;
	private boolean g = true;
	private float h = 1.0F;
	@Nullable
	private Random i;
	@Nullable
	private Long j;

	public aza a() {
		aza aza2 = new aza();
		aza2.a = this.a;
		aza2.b = this.b;
		aza2.c = this.c;
		aza2.d = this.d;
		aza2.e = this.e;
		aza2.f = this.f;
		aza2.g = this.g;
		aza2.h = this.h;
		aza2.i = this.i;
		aza2.j = this.j;
		return aza2;
	}

	public aza a(aou aou) {
		this.a = aou;
		return this;
	}

	public aza a(aqi aqi) {
		this.b = aqi;
		return this;
	}

	public aza a(boolean boolean1) {
		this.c = boolean1;
		return this;
	}

	public aza a(alu alu) {
		this.d = alu;
		return this;
	}

	public aza a(ajl ajl) {
		this.e = ajl;
		return this;
	}

	public aza a(axz axz) {
		this.f = axz;
		return this;
	}

	public aza a(@Nullable Long long1) {
		this.j = long1;
		return this;
	}

	public aza a(@Nullable Random random) {
		this.i = random;
		return this;
	}

	public aza a(float float1) {
		this.h = float1;
		return this;
	}

	public aou b() {
		return this.a;
	}

	public aza b(boolean boolean1) {
		this.g = boolean1;
		return this;
	}

	public aqi c() {
		return this.b;
	}

	public Random a(@Nullable co co) {
		if (this.i != null) {
			return this.i;
		} else if (this.j != null) {
			return this.j == 0L ? new Random(System.currentTimeMillis()) : new Random(this.j);
		} else if (co == null) {
			return new Random(System.currentTimeMillis());
		} else {
			int integer3 = co.p();
			int integer4 = co.r();
			return new Random(
				(long)(integer3 * integer3 * 4987142 + integer3 * 5947611) + (long)(integer4 * integer4) * 4392871L + (long)(integer4 * 389711) ^ 987234911L
			);
		}
	}

	public float f() {
		return this.h;
	}

	public boolean g() {
		return this.c;
	}

	@Nullable
	public alu h() {
		return this.d;
	}

	@Nullable
	public axz i() {
		if (this.f == null && this.e != null) {
			this.k();
		}

		return this.f;
	}

	public boolean j() {
		return this.g;
	}

	void k() {
		this.f = this.b(this.e);
	}

	@Nullable
	private axz b(@Nullable ajl ajl) {
		if (ajl == null) {
			return null;
		} else {
			int integer3 = ajl.a * 16;
			int integer4 = ajl.b * 16;
			return new axz(integer3, 0, integer4, integer3 + 16 - 1, 255, integer4 + 16 - 1);
		}
	}
}
