import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bfj {
	private static final kq a = new kq("textures/map/map_icons.png");
	private final bza b;
	private final Map<String, bfj.a> c = Maps.newHashMap();

	public bfj(bza bza) {
		this.b = bza;
	}

	public void a(bbn bbn) {
		this.b(bbn).a();
	}

	public void a(bbn bbn, boolean boolean2) {
		this.b(bbn).a(boolean2);
	}

	private bfj.a b(bbn bbn) {
		bfj.a a3 = (bfj.a)this.c.get(bbn.a);
		if (a3 == null) {
			a3 = new bfj.a(bbn);
			this.c.put(bbn.a, a3);
		}

		return a3;
	}

	@Nullable
	public bfj.a a(String string) {
		return (bfj.a)this.c.get(string);
	}

	public void a() {
		for (bfj.a a3 : this.c.values()) {
			this.b.c(a3.d);
		}

		this.c.clear();
	}

	@Nullable
	public bbn a(@Nullable bfj.a a) {
		return a != null ? a.b : null;
	}

	class a {
		private final bbn b;
		private final byp c;
		private final kq d;
		private final int[] e;

		private a(bbn bbn) {
			this.b = bbn;
			this.c = new byp(128, 128);
			this.e = this.c.e();
			this.d = bfj.this.b.a("map/" + bbn.a, this.c);

			for (int integer4 = 0; integer4 < this.e.length; integer4++) {
				this.e[integer4] = 0;
			}
		}

		private void a() {
			for (int integer2 = 0; integer2 < 16384; integer2++) {
				int integer3 = this.b.h[integer2] & 255;
				if (integer3 / 4 == 0) {
					this.e[integer2] = (integer2 + integer2 / 128 & 1) * 8 + 16 << 24;
				} else {
					this.e[integer2] = azt.a[integer3 / 4].a(integer3 & 3);
				}
			}

			this.c.d();
		}

		private void a(boolean boolean1) {
			int integer3 = 0;
			int integer4 = 0;
			bqs bqs5 = bqs.a();
			bpy bpy6 = bqs5.c();
			float float7 = 0.0F;
			bfj.this.b.a(this.d);
			bqg.m();
			bqg.a(bqg.r.ONE, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ZERO, bqg.l.ONE);
			bqg.d();
			bpy6.a(7, bzh.g);
			bpy6.b(0.0, 128.0, -0.01F).a(0.0, 1.0).d();
			bpy6.b(128.0, 128.0, -0.01F).a(1.0, 1.0).d();
			bpy6.b(128.0, 0.0, -0.01F).a(1.0, 0.0).d();
			bpy6.b(0.0, 0.0, -0.01F).a(0.0, 0.0).d();
			bqs5.b();
			bqg.e();
			bqg.l();
			bfj.this.b.a(bfj.a);
			int integer8 = 0;

			for (bbm bbm10 : this.b.j.values()) {
				if (!boolean1 || bbm10.f()) {
					bqg.G();
					bqg.c(0.0F + (float)bbm10.c() / 2.0F + 64.0F, 0.0F + (float)bbm10.d() / 2.0F + 64.0F, -0.02F);
					bqg.b((float)(bbm10.e() * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
					bqg.b(4.0F, 4.0F, 3.0F);
					bqg.c(-0.125F, 0.125F, 0.0F);
					byte byte11 = bbm10.a();
					float float12 = (float)(byte11 % 4 + 0) / 4.0F;
					float float13 = (float)(byte11 / 4 + 0) / 4.0F;
					float float14 = (float)(byte11 % 4 + 1) / 4.0F;
					float float15 = (float)(byte11 / 4 + 1) / 4.0F;
					bpy6.a(7, bzh.g);
					float float16 = -0.001F;
					bpy6.b(-1.0, 1.0, (double)((float)integer8 * -0.001F)).a((double)float12, (double)float13).d();
					bpy6.b(1.0, 1.0, (double)((float)integer8 * -0.001F)).a((double)float14, (double)float13).d();
					bpy6.b(1.0, -1.0, (double)((float)integer8 * -0.001F)).a((double)float14, (double)float15).d();
					bpy6.b(-1.0, -1.0, (double)((float)integer8 * -0.001F)).a((double)float12, (double)float15).d();
					bqs5.b();
					bqg.H();
					integer8++;
				}
			}

			bqg.G();
			bqg.c(0.0F, 0.0F, -0.04F);
			bqg.b(1.0F, 1.0F, 1.0F);
			bqg.H();
		}
	}
}
