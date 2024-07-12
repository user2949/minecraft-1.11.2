import net.minecraft.realms.RealmsSimpleScrolledSelectionList;

public class bgo extends bgd {
	private final RealmsSimpleScrolledSelectionList u;

	public bgo(RealmsSimpleScrolledSelectionList realmsSimpleScrolledSelectionList, int integer2, int integer3, int integer4, int integer5, int integer6) {
		super(bes.z(), integer2, integer3, integer4, integer5, integer6);
		this.u = realmsSimpleScrolledSelectionList;
	}

	@Override
	protected int b() {
		return this.u.getItemCount();
	}

	@Override
	protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
		this.u.selectItem(integer1, boolean2, integer3, integer4);
	}

	@Override
	protected boolean a(int integer) {
		return this.u.isSelectedItem(integer);
	}

	@Override
	protected void a() {
		this.u.renderBackground();
	}

	@Override
	protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.u.renderItem(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	public int e() {
		return this.b;
	}

	public int f() {
		return this.j;
	}

	public int g() {
		return this.i;
	}

	@Override
	protected int k() {
		return this.u.getMaxPosition();
	}

	@Override
	protected int d() {
		return this.u.getScrollbarPosition();
	}

	@Override
	public void p() {
		super.p();
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		if (this.q) {
			this.i = integer1;
			this.j = integer2;
			this.a();
			int integer5 = this.d();
			int integer6 = integer5 + 6;
			this.l();
			bqg.g();
			bqg.p();
			bqs bqs7 = bqs.a();
			bpy bpy8 = bqs7.c();
			int integer9 = this.g + this.b / 2 - this.c() / 2 + 2;
			int integer10 = this.d + 4 - (int)this.n;
			if (this.s) {
				this.a(integer9, integer10, bqs7);
			}

			this.b(integer9, integer10, integer1, integer2);
			bqg.j();
			this.c(0, this.d, 255, 255);
			this.c(this.e, this.c, 255, 255);
			bqg.m();
			bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA, bqg.r.ZERO, bqg.l.ONE);
			bqg.d();
			bqg.j(7425);
			bqg.z();
			int integer11 = this.m();
			if (integer11 > 0) {
				int integer12 = (this.e - this.d) * (this.e - this.d) / this.k();
				integer12 = ot.a(integer12, 32, this.e - this.d - 8);
				int integer13 = (int)this.n * (this.e - this.d - integer12) / integer11 + this.d;
				if (integer13 < this.d) {
					integer13 = this.d;
				}

				bpy8.a(7, bzh.i);
				bpy8.b((double)integer5, (double)this.e, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
				bpy8.b((double)integer6, (double)this.e, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
				bpy8.b((double)integer6, (double)this.d, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
				bpy8.b((double)integer5, (double)this.d, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
				bqs7.b();
				bpy8.a(7, bzh.i);
				bpy8.b((double)integer5, (double)(integer13 + integer12), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer6, (double)(integer13 + integer12), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer6, (double)integer13, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
				bpy8.b((double)integer5, (double)integer13, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
				bqs7.b();
				bpy8.a(7, bzh.i);
				bpy8.b((double)integer5, (double)(integer13 + integer12 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
				bpy8.b((double)(integer6 - 1), (double)(integer13 + integer12 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
				bpy8.b((double)(integer6 - 1), (double)integer13, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
				bpy8.b((double)integer5, (double)integer13, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
				bqs7.b();
			}

			this.b(integer1, integer2);
			bqg.y();
			bqg.j(7424);
			bqg.e();
			bqg.l();
		}
	}
}
