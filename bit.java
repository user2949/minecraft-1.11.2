import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import org.lwjgl.util.glu.Project;

public class bit extends big {
	private static final kq B = new kq("textures/gui/container/enchanting_table.png");
	private static final kq C = new kq("textures/entity/enchanting_table_book.png");
	private static final bkz D = new bkz();
	private final aax E;
	private final Random F = new Random();
	private final acv G;
	public int u;
	public float v;
	public float w;
	public float x;
	public float y;
	public float z;
	public float A;
	private afj H = afj.a;
	private final rp I;

	public bit(aax aax, ajs ajs, rp rp) {
		super(new acv(aax, ajs));
		this.E = aax;
		this.G = (acv)this.h;
		this.I = rp;
	}

	@Override
	protected void b(int integer1, int integer2) {
		this.q.a(this.I.i_().c(), 12, 5, 4210752);
		this.q.a(this.E.i_().c(), 8, this.g - 96 + 2, 4210752);
	}

	@Override
	public void e() {
		super.e();
		this.a();
	}

	@Override
	protected void a(int integer1, int integer2, int integer3) {
		super.a(integer1, integer2, integer3);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;

		for (int integer7 = 0; integer7 < 3; integer7++) {
			int integer8 = integer1 - (integer5 + 60);
			int integer9 = integer2 - (integer6 + 14 + 19 * integer7);
			if (integer8 >= 0 && integer9 >= 0 && integer8 < 108 && integer9 < 19 && this.G.a(this.j.h, integer7)) {
				this.j.c.a(this.G.d, integer7);
			}
		}
	}

	@Override
	protected void a(float float1, int integer2, int integer3) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(B);
		int integer5 = (this.l - this.f) / 2;
		int integer6 = (this.m - this.g) / 2;
		this.b(integer5, integer6, 0, 0, this.f, this.g);
		bqg.G();
		bqg.n(5889);
		bqg.G();
		bqg.F();
		bfk bfk7 = new bfk(this.j);
		bqg.b((bfk7.a() - 320) / 2 * bfk7.e(), (bfk7.b() - 240) / 2 * bfk7.e(), 320 * bfk7.e(), 240 * bfk7.e());
		bqg.c(-0.34F, 0.23F, 0.0F);
		Project.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
		float float8 = 1.0F;
		bqg.n(5888);
		bqg.F();
		beq.b();
		bqg.c(0.0F, 3.3F, -16.0F);
		bqg.b(1.0F, 1.0F, 1.0F);
		float float9 = 5.0F;
		bqg.b(5.0F, 5.0F, 5.0F);
		bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
		this.j.N().a(C);
		bqg.b(20.0F, 1.0F, 0.0F, 0.0F);
		float float10 = this.A + (this.z - this.A) * float1;
		bqg.c((1.0F - float10) * 0.2F, (1.0F - float10) * 0.1F, (1.0F - float10) * 0.25F);
		bqg.b(-(1.0F - float10) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
		bqg.b(180.0F, 1.0F, 0.0F, 0.0F);
		float float11 = this.w + (this.v - this.w) * float1 + 0.25F;
		float float12 = this.w + (this.v - this.w) * float1 + 0.75F;
		float11 = (float11 - (float)ot.b((double)float11)) * 1.6F - 0.3F;
		float12 = (float12 - (float)ot.b((double)float12)) * 1.6F - 0.3F;
		if (float11 < 0.0F) {
			float11 = 0.0F;
		}

		if (float12 < 0.0F) {
			float12 = 0.0F;
		}

		if (float11 > 1.0F) {
			float11 = 1.0F;
		}

		if (float12 > 1.0F) {
			float12 = 1.0F;
		}

		bqg.D();
		D.a(null, 0.0F, float11, float12, float10, 0.0F, 0.0625F);
		bqg.E();
		beq.a();
		bqg.n(5889);
		bqg.b(0, 0, this.j.d, this.j.e);
		bqg.H();
		bqg.n(5888);
		bqg.H();
		beq.a();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bis.a().a((long)this.G.f);
		int integer13 = this.G.e();

		for (int integer14 = 0; integer14 < 3; integer14++) {
			int integer15 = integer5 + 60;
			int integer16 = integer15 + 20;
			this.e = 0.0F;
			this.j.N().a(B);
			int integer17 = this.G.g[integer14];
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			if (integer17 == 0) {
				this.b(integer15, integer6 + 14 + 19 * integer14, 0, 185, 108, 19);
			} else {
				String string18 = "" + integer17;
				int integer19 = 86 - this.q.a(string18);
				String string20 = bis.a().a(this.q, integer19);
				bfg bfg21 = this.j.l;
				int integer22 = 6839882;
				if ((integer13 < integer14 + 1 || this.j.h.bL < integer17) && !this.j.h.bK.d) {
					this.b(integer15, integer6 + 14 + 19 * integer14, 0, 185, 108, 19);
					this.b(integer15 + 1, integer6 + 15 + 19 * integer14, 16 * integer14, 239, 16, 16);
					bfg21.a(string20, integer16, integer6 + 16 + 19 * integer14, integer19, (integer22 & 16711422) >> 1);
					integer22 = 4226832;
				} else {
					int integer23 = integer2 - (integer5 + 60);
					int integer24 = integer3 - (integer6 + 14 + 19 * integer14);
					if (integer23 >= 0 && integer24 >= 0 && integer23 < 108 && integer24 < 19) {
						this.b(integer15, integer6 + 14 + 19 * integer14, 0, 204, 108, 19);
						integer22 = 16777088;
					} else {
						this.b(integer15, integer6 + 14 + 19 * integer14, 0, 166, 108, 19);
					}

					this.b(integer15 + 1, integer6 + 15 + 19 * integer14, 16 * integer14, 223, 16, 16);
					bfg21.a(string20, integer16, integer6 + 16 + 19 * integer14, integer19, integer22);
					integer22 = 8453920;
				}

				bfg21 = this.j.k;
				bfg21.a(string18, (float)(integer16 + 86 - bfg21.a(string18)), (float)(integer6 + 16 + 19 * integer14 + 7), integer22);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		super.a(integer1, integer2, float3);
		boolean boolean5 = this.j.h.bK.d;
		int integer6 = this.G.e();

		for (int integer7 = 0; integer7 < 3; integer7++) {
			int integer8 = this.G.g[integer7];
			aii aii9 = aii.c(this.G.h[integer7]);
			int integer10 = this.G.i[integer7];
			int integer11 = integer7 + 1;
			if (this.c(60, 14 + 19 * integer7, 108, 17, integer1, integer2) && integer8 > 0 && integer10 >= 0 && aii9 != null) {
				List<String> list12 = Lists.newArrayList();
				list12.add("" + a.WHITE + a.ITALIC + cah.a("container.enchant.clue", aii9.d(integer10)));
				if (!boolean5) {
					list12.add("");
					if (this.j.h.bL < integer8) {
						list12.add(a.RED + "Level Requirement: " + this.G.g[integer7]);
					} else {
						String string13;
						if (integer11 == 1) {
							string13 = cah.a("container.enchant.lapis.one");
						} else {
							string13 = cah.a("container.enchant.lapis.many", integer11);
						}

						a a14 = integer6 >= integer11 ? a.GRAY : a.RED;
						list12.add(a14 + "" + string13);
						if (integer11 == 1) {
							string13 = cah.a("container.enchant.level.one");
						} else {
							string13 = cah.a("container.enchant.level.many", integer11);
						}

						list12.add(a.GRAY + "" + string13);
					}
				}

				this.a(list12, integer1, integer2);
				break;
			}
		}
	}

	@Override
	public void a() {
		afj afj2 = this.h.a(0).d();
		if (!afj.b(afj2, this.H)) {
			this.H = afj2;

			do {
				this.x = this.x + (float)(this.F.nextInt(4) - this.F.nextInt(4));
			} while (this.v <= this.x + 1.0F && this.v >= this.x - 1.0F);
		}

		this.u++;
		this.w = this.v;
		this.A = this.z;
		boolean boolean3 = false;

		for (int integer4 = 0; integer4 < 3; integer4++) {
			if (this.G.g[integer4] != 0) {
				boolean3 = true;
			}
		}

		if (boolean3) {
			this.z += 0.2F;
		} else {
			this.z -= 0.2F;
		}

		this.z = ot.a(this.z, 0.0F, 1.0F);
		float float4 = (this.x - this.v) * 0.4F;
		float float5 = 0.2F;
		float4 = ot.a(float4, -0.2F, 0.2F);
		this.y = this.y + (float4 - this.y) * 0.9F;
		this.v = this.v + this.y;
	}
}
