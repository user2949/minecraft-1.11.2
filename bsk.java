import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bsk {
	private final Map<Class<? extends asc>, bsl<? extends asc>> n = Maps.newHashMap();
	public static bsk a = new bsk();
	private bfg o;
	public static double b;
	public static double c;
	public static double d;
	public bza e;
	public ajs f;
	public sn g;
	public float h;
	public float i;
	public bdu j;
	public double k;
	public double l;
	public double m;

	private bsk() {
		this.n.put(asv.class, new bss());
		this.n.put(asr.class, new bsp());
		this.n.put(atf.class, new bsq());
		this.n.put(ase.class, new bsm());
		this.n.put(asl.class, new bso());
		this.n.put(ask.class, new bsn());
		this.n.put(asz.class, new bsw());
		this.n.put(asy.class, new bsv());
		this.n.put(asb.class, new bsj());
		this.n.put(asw.class, new bst());
		this.n.put(arz.class, new bsi());
		this.n.put(asx.class, new bsu());
		this.n.put(asu.class, new bsr(new bmh()));

		for (bsl<?> bsl3 : this.n.values()) {
			bsl3.a(this);
		}
	}

	public <T extends asc> bsl<T> a(Class<? extends asc> class1) {
		bsl<? extends asc> bsl3 = (bsl<? extends asc>)this.n.get(class1);
		if (bsl3 == null && class1 != asc.class) {
			bsl3 = this.a(class1.getSuperclass());
			this.n.put(class1, bsl3);
		}

		return (bsl<T>)bsl3;
	}

	@Nullable
	public <T extends asc> bsl<T> a(@Nullable asc asc) {
		return asc == null ? null : this.a(asc.getClass());
	}

	public void a(ajs ajs, bza bza, bfg bfg, sn sn, bdu bdu, float float6) {
		if (this.f != ajs) {
			this.a(ajs);
		}

		this.e = bza;
		this.g = sn;
		this.o = bfg;
		this.j = bdu;
		this.h = sn.x + (sn.v - sn.x) * float6;
		this.i = sn.y + (sn.w - sn.y) * float6;
		this.k = sn.M + (sn.p - sn.M) * (double)float6;
		this.l = sn.N + (sn.q - sn.N) * (double)float6;
		this.m = sn.O + (sn.r - sn.O) * (double)float6;
	}

	public void a(asc asc, float float2, int integer) {
		if (asc.a(this.k, this.l, this.m) < asc.t()) {
			beq.b();
			int integer5 = this.f.b(asc.w(), 0);
			int integer6 = integer5 % 65536;
			int integer7 = integer5 / 65536;
			cdb.a(cdb.r, (float)integer6, (float)integer7);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			co co8 = asc.w();
			this.a(asc, (double)co8.p() - b, (double)co8.q() - c, (double)co8.r() - d, float2, integer);
		}
	}

	public void a(asc asc, double double2, double double3, double double4, float float5) {
		this.a(asc, double2, double3, double4, float5, -1);
	}

	public void a(asc asc, double double2, double double3, double double4, float float5, int integer) {
		bsl<asc> bsl11 = this.a(asc);
		if (bsl11 != null) {
			try {
				bsl11.a(asc, double2, double3, double4, float5, integer);
			} catch (Throwable var14) {
				b b13 = b.a(var14, "Rendering Block Entity");
				c c14 = b13.a("Block Entity Details");
				asc.a(c14);
				throw new f(b13);
			}
		}
	}

	public void a(@Nullable ajs ajs) {
		this.f = ajs;
		if (ajs == null) {
			this.g = null;
		}
	}

	public bfg a() {
		return this.o;
	}
}
