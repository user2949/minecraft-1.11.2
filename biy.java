import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class biy extends big {
	private static final Logger u = LogManager.getLogger();
	private static final kq v = new kq("textures/gui/container/villager.png");
	private final ajd w;
	private biy.a x;
	private biy.a y;
	private int z;
	private final fb A;

	public biy(aax aax, ajd ajd, ajs ajs) {
		super(new ade(aax, ajd, ajs));
		this.w = ajd;
		this.A = ajd.i_();
	}

	@Override
	public void b() {
		super.b();
		int integer2 = (this.l - this.f) / 2;
		int integer3 = (this.m - this.g) / 2;
		this.x = this.b(new biy.a(1, integer2 + 120 + 27, integer3 + 24 - 1, true));
		this.y = this.b(new biy.a(2, integer2 + 36 - 19, integer3 + 24 - 1, false));
		this.x.l = false;
		this.y.l = false;
	}

	@Override
	protected void b(int integer1, int integer2) {
		String string4 = this.A.c();
		this.q.a(string4, this.f / 2 - this.q.a(string4) / 2, 6, 4210752);
		this.q.a(cah.a("container.inventory"), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	public void e() {
		super.e();
		ajf ajf2 = this.w.b_(this.j.h);
		if (ajf2 != null) {
			this.x.l = this.z < ajf2.size() - 1;
			this.y.l = this.z > 0;
		}
	}

	@Override
	protected void a(bfm bfm) {
		boolean boolean3 = false;
		if (bfm == this.x) {
			this.z++;
			ajf ajf4 = this.w.b_(this.j.h);
			if (ajf4 != null && this.z >= ajf4.size()) {
				this.z = ajf4.size() - 1;
			}

			boolean3 = true;
		} else if (bfm == this.y) {
			this.z--;
			if (this.z < 0) {
				this.z = 0;
			}

			boolean3 = true;
		}

		if (boolean3) {
			((ade)this.h).d(this.z);
			et et4 = new et(Unpooled.buffer());
			et4.writeInt(this.z);
			this.j.v().a(new iw("MC|TrSel", et4));
		}
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(v);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		ajf ajf7 = this.w.b_(this.j.h);
		if (ajf7 != null && !ajf7.isEmpty()) {
			int integer8 = this.z;
			if (integer8 < 0 || integer8 >= ajf7.size()) {
				return;
			}

			aje aje9 = (aje)ajf7.get(integer8);
			if (aje9.h()) {
				this.j.N().a(v);
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				bqg.g();
				this.b(this.i + 83, this.r + 21, 212, 0, 28, 21);
				this.b(this.i + 83, this.r + 51, 212, 0, 28, 21);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		super.a(integer1, integer2, float3);
		ajf ajf5 = this.w.b_(this.j.h);
		if (ajf5 != null && !ajf5.isEmpty()) {
			int integer6 = (this.l - this.f) / 2;
			int integer7 = (this.m - this.g) / 2;
			int integer8 = this.z;
			aje aje9 = (aje)ajf5.get(integer8);
			afj afj10 = aje9.a();
			afj afj11 = aje9.b();
			afj afj12 = aje9.d();
			bqg.G();
			beq.c();
			bqg.g();
			bqg.D();
			bqg.h();
			bqg.f();
			this.k.a = 100.0F;
			this.k.b(afj10, integer6 + 36, integer7 + 24);
			this.k.a(this.q, afj10, integer6 + 36, integer7 + 24);
			if (!afj11.b()) {
				this.k.b(afj11, integer6 + 62, integer7 + 24);
				this.k.a(this.q, afj11, integer6 + 62, integer7 + 24);
			}

			this.k.b(afj12, integer6 + 120, integer7 + 24);
			this.k.a(this.q, afj12, integer6 + 120, integer7 + 24);
			this.k.a = 0.0F;
			bqg.g();
			if (this.c(36, 24, 16, 16, integer1, integer2) && !afj10.b()) {
				this.a(afj10, integer1, integer2);
			} else if (!afj11.b() && this.c(62, 24, 16, 16, integer1, integer2) && !afj11.b()) {
				this.a(afj11, integer1, integer2);
			} else if (!afj12.b() && this.c(120, 24, 16, 16, integer1, integer2) && !afj12.b()) {
				this.a(afj12, integer1, integer2);
			} else if (aje9.h() && (this.c(83, 21, 28, 21, integer1, integer2) || this.c(83, 51, 28, 21, integer1, integer2))) {
				this.a(cah.a("merchant.deprecated"), integer1, integer2);
			}

			bqg.H();
			bqg.f();
			bqg.k();
			beq.b();
		}
	}

	public ajd a() {
		return this.w;
	}

	static class a extends bfm {
		private final boolean o;

		public a(int integer1, int integer2, int integer3, boolean boolean4) {
			super(integer1, integer2, integer3, 12, 19, "");
			this.o = boolean4;
		}

		@Override
		public void a(bes bes, int integer2, int integer3) {
			if (this.m) {
				bes.N().a(biy.v);
				bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
				boolean boolean5 = integer2 >= this.h && integer3 >= this.i && integer2 < this.h + this.f && integer3 < this.i + this.g;
				int integer6 = 0;
				int integer7 = 176;
				if (!this.l) {
					integer7 += this.f * 2;
				} else if (boolean5) {
					integer7 += this.f;
				}

				if (!this.o) {
					integer6 += this.g;
				}

				this.b(this.h, this.i, integer7, integer6, this.f, this.g);
			}
		}
	}
}
