import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;

public class bte {
	private ajs d;
	private final bqm e;
	public static int a;
	public btb b = btb.a;
	private final ReentrantLock f = new ReentrantLock();
	private final ReentrantLock g = new ReentrantLock();
	private bsy h;
	private final Set<asc> i = Sets.newHashSet();
	private final int j;
	private final FloatBuffer k = ber.h(16);
	private final bzi[] l = new bzi[ajk.values().length];
	public bdt c;
	private int m = -1;
	private boolean n = true;
	private final co.a o = new co.a(-1, -1, -1);
	private final co.a[] p = new co.a[6];
	private boolean q;
	private akb r;

	public bte(ajs ajs, bqm bqm, int integer) {
		for (int integer5 = 0; integer5 < this.p.length; integer5++) {
			this.p[integer5] = new co.a();
		}

		this.d = ajs;
		this.e = bqm;
		this.j = integer;
		if (cdb.f()) {
			for (int integer5 = 0; integer5 < ajk.values().length; integer5++) {
				this.l[integer5] = new bzi(bzh.a);
			}
		}
	}

	public boolean a(int integer) {
		if (this.m == integer) {
			return false;
		} else {
			this.m = integer;
			return true;
		}
	}

	public bzi b(int integer) {
		return this.l[integer];
	}

	public void a(int integer1, int integer2, int integer3) {
		if (integer1 != this.o.p() || integer2 != this.o.q() || integer3 != this.o.r()) {
			this.i();
			this.o.c(integer1, integer2, integer3);
			this.c = new bdt((double)integer1, (double)integer2, (double)integer3, (double)(integer1 + 16), (double)(integer2 + 16), (double)(integer3 + 16));

			for (cv cv8 : cv.values()) {
				this.p[cv8.ordinal()].g(this.o).c(cv8, 16);
			}

			this.r();
		}
	}

	public void a(float float1, float float2, float float3, bsy bsy) {
		btb btb6 = bsy.c();
		if (btb6.c() != null && !btb6.b(ajk.TRANSLUCENT)) {
			this.a(bsy.d().a(ajk.TRANSLUCENT), this.o);
			bsy.d().a(ajk.TRANSLUCENT).a(btb6.c());
			this.a(ajk.TRANSLUCENT, float1, float2, float3, bsy.d().a(ajk.TRANSLUCENT), btb6);
		}
	}

	public void b(float float1, float float2, float float3, bsy bsy) {
		btb btb6 = new btb();
		int integer7 = 1;
		co co8 = this.o;
		co co9 = co8.a(15, 15, 15);
		bsy.f().lock();

		try {
			if (bsy.a() != bsy.a.COMPILING) {
				return;
			}

			bsy.a(btb6);
		} finally {
			bsy.f().unlock();
		}

		bth bth10 = new bth();
		HashSet set11 = Sets.newHashSet();
		if (!this.r.aa()) {
			a++;
			boolean[] arr12 = new boolean[ajk.values().length];
			bra bra13 = bes.z().ab();

			for (co.a a15 : co.b(co8, co9)) {
				atl atl16 = this.r.o(a15);
				alu alu17 = atl16.v();
				if (atl16.q()) {
					bth10.a(a15);
				}

				if (alu17.l()) {
					asc asc18 = this.r.a(a15, auo.a.CHECK);
					if (asc18 != null) {
						bsl<asc> bsl19 = bsk.a.a(asc18);
						if (bsl19 != null) {
							btb6.a(asc18);
							if (bsl19.a(asc18)) {
								set11.add(asc18);
							}
						}
					}
				}

				ajk ajk18 = alu17.f();
				int integer19 = ajk18.ordinal();
				if (alu17.t().j() != aqf.INVISIBLE) {
					bpy bpy20 = bsy.d().a(integer19);
					if (!btb6.d(ajk18)) {
						btb6.c(ajk18);
						this.a(bpy20, co8);
					}

					arr12[integer19] |= bra13.a(atl16, a15, this.r, bpy20);
				}
			}

			for (ajk ajk17 : ajk.values()) {
				if (arr12[ajk17.ordinal()]) {
					btb6.a(ajk17);
				}

				if (btb6.d(ajk17)) {
					this.a(ajk17, float1, float2, float3, bsy.d().a(ajk17), btb6);
				}
			}
		}

		btb6.a(bth10.a());
		this.f.lock();

		try {
			Set<asc> set12 = Sets.newHashSet(set11);
			Set<asc> set13 = Sets.newHashSet(this.i);
			set12.removeAll(this.i);
			set13.removeAll(set11);
			this.i.clear();
			this.i.addAll(set11);
			this.e.a(set13, set12);
		} finally {
			this.f.unlock();
		}
	}

	protected void b() {
		this.f.lock();

		try {
			if (this.h != null && this.h.a() != bsy.a.DONE) {
				this.h.e();
				this.h = null;
			}
		} finally {
			this.f.unlock();
		}
	}

	public ReentrantLock c() {
		return this.f;
	}

	public bsy d() {
		this.f.lock();

		bsy var1;
		try {
			this.b();
			this.h = new bsy(this, bsy.b.REBUILD_CHUNK, this.f());
			this.q();
			var1 = this.h;
		} finally {
			this.f.unlock();
		}

		return var1;
	}

	private void q() {
		int integer2 = 1;
		this.r = new akb(this.d, this.o.a(-1, -1, -1), this.o.a(16, 16, 16), 1);
	}

	@Nullable
	public bsy e() {
		this.f.lock();

		Object var1;
		try {
			if (this.h == null || this.h.a() != bsy.a.PENDING) {
				if (this.h != null && this.h.a() != bsy.a.DONE) {
					this.h.e();
					this.h = null;
				}

				this.h = new bsy(this, bsy.b.RESORT_TRANSPARENCY, this.f());
				this.h.a(this.b);
				return this.h;
			}

			var1 = null;
		} finally {
			this.f.unlock();
		}

		return (bsy)var1;
	}

	protected double f() {
		bps bps2 = bes.z().h;
		double double3 = this.c.a + 8.0 - bps2.p;
		double double5 = this.c.b + 8.0 - bps2.q;
		double double7 = this.c.c + 8.0 - bps2.r;
		return double3 * double3 + double5 * double5 + double7 * double7;
	}

	private void a(bpy bpy, co co) {
		bpy.a(7, bzh.a);
		bpy.c((double)(-co.p()), (double)(-co.q()), (double)(-co.r()));
	}

	private void a(ajk ajk, float float2, float float3, float float4, bpy bpy, btb btb) {
		if (ajk == ajk.TRANSLUCENT && !btb.b(ajk)) {
			bpy.a(float2, float3, float4);
			btb.a(bpy.a());
		}

		bpy.e();
	}

	private void r() {
		bqg.G();
		bqg.F();
		float float2 = 1.000001F;
		bqg.c(-8.0F, -8.0F, -8.0F);
		bqg.b(1.000001F, 1.000001F, 1.000001F);
		bqg.c(8.0F, 8.0F, 8.0F);
		bqg.c(2982, this.k);
		bqg.H();
	}

	public void g() {
		bqg.a(this.k);
	}

	public btb h() {
		return this.b;
	}

	public void a(btb btb) {
		this.g.lock();

		try {
			this.b = btb;
		} finally {
			this.g.unlock();
		}
	}

	public void i() {
		this.b();
		this.b = btb.a;
	}

	public void a() {
		this.i();
		this.d = null;

		for (int integer2 = 0; integer2 < ajk.values().length; integer2++) {
			if (this.l[integer2] != null) {
				this.l[integer2].c();
			}
		}
	}

	public co k() {
		return this.o;
	}

	public void a(boolean boolean1) {
		if (this.n) {
			boolean1 |= this.q;
		}

		this.n = true;
		this.q = boolean1;
	}

	public void m() {
		this.n = false;
		this.q = false;
	}

	public boolean n() {
		return this.n;
	}

	public boolean o() {
		return this.n && this.q;
	}

	public co a(cv cv) {
		return this.p[cv.ordinal()];
	}

	public ajs p() {
		return this.d;
	}
}
