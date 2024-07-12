public class bwa extends bvq<aae> {
	public static final kq[] a = new kq[]{
		new kq("textures/entity/shulker/shulker_white.png"),
		new kq("textures/entity/shulker/shulker_orange.png"),
		new kq("textures/entity/shulker/shulker_magenta.png"),
		new kq("textures/entity/shulker/shulker_light_blue.png"),
		new kq("textures/entity/shulker/shulker_yellow.png"),
		new kq("textures/entity/shulker/shulker_lime.png"),
		new kq("textures/entity/shulker/shulker_pink.png"),
		new kq("textures/entity/shulker/shulker_gray.png"),
		new kq("textures/entity/shulker/shulker_silver.png"),
		new kq("textures/entity/shulker/shulker_cyan.png"),
		new kq("textures/entity/shulker/shulker_purple.png"),
		new kq("textures/entity/shulker/shulker_blue.png"),
		new kq("textures/entity/shulker/shulker_brown.png"),
		new kq("textures/entity/shulker/shulker_green.png"),
		new kq("textures/entity/shulker/shulker_red.png"),
		new kq("textures/entity/shulker/shulker_black.png")
	};

	public bwa(bur bur) {
		super(bur, new bmh(), 0.0F);
		this.a(new bwa.a());
	}

	public bmh b() {
		return (bmh)super.b();
	}

	public void a(aae aae, double double2, double double3, double double4, float float5, float float6) {
		int integer11 = aae.dk();
		if (integer11 > 0 && aae.dm()) {
			co co12 = aae.di();
			co co13 = aae.dl();
			double double14 = (double)((float)integer11 - float6) / 6.0;
			double14 *= double14;
			double double16 = (double)(co12.p() - co13.p()) * double14;
			double double18 = (double)(co12.q() - co13.q()) * double14;
			double double20 = (double)(co12.r() - co13.r()) * double14;
			super.a(aae, double2 - double16, double3 - double18, double4 - double20, float5, float6);
		} else {
			super.a(aae, double2, double3, double4, float5, float6);
		}
	}

	public boolean a(aae aae, btl btl, double double3, double double4, double double5) {
		if (super.a(aae, btl, double3, double4, double5)) {
			return true;
		} else {
			if (aae.dk() > 0 && aae.dm()) {
				co co10 = aae.dl();
				co co11 = aae.di();
				bdw bdw12 = new bdw((double)co11.p(), (double)co11.q(), (double)co11.r());
				bdw bdw13 = new bdw((double)co10.p(), (double)co10.q(), (double)co10.r());
				if (btl.a(new bdt(bdw13.b, bdw13.c, bdw13.d, bdw12.b, bdw12.c, bdw12.d))) {
					return true;
				}
			}

			return false;
		}
	}

	protected kq a(aae aae) {
		return a[aae.dn().a()];
	}

	protected void a(aae aae, float float2, float float3, float float4) {
		super.a(aae, float2, float3, float4);
		switch (aae.dh()) {
			case DOWN:
			default:
				break;
			case EAST:
				bqg.c(0.5F, 0.5F, 0.0F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(90.0F, 0.0F, 0.0F, 1.0F);
				break;
			case WEST:
				bqg.c(-0.5F, 0.5F, 0.0F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(-90.0F, 0.0F, 0.0F, 1.0F);
				break;
			case NORTH:
				bqg.c(0.0F, 0.5F, -0.5F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				break;
			case SOUTH:
				bqg.c(0.0F, 0.5F, 0.5F);
				bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
				bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
				break;
			case UP:
				bqg.c(0.0F, 1.0F, 0.0F);
				bqg.b(180.0F, 1.0F, 0.0F, 0.0F);
		}
	}

	protected void a(aae aae, float float2) {
		float float4 = 0.999F;
		bqg.b(0.999F, 0.999F, 0.999F);
	}

	class a implements bxp<aae> {
		private a() {
		}

		public void a(aae aae, float float2, float float3, float float4, float float5, float float6, float float7, float float8) {
			bqg.G();
			switch (aae.dh()) {
				case DOWN:
				default:
					break;
				case EAST:
					bqg.b(90.0F, 0.0F, 0.0F, 1.0F);
					bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
					bqg.c(1.0F, -1.0F, 0.0F);
					bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
					break;
				case WEST:
					bqg.b(-90.0F, 0.0F, 0.0F, 1.0F);
					bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
					bqg.c(-1.0F, -1.0F, 0.0F);
					bqg.b(180.0F, 0.0F, 1.0F, 0.0F);
					break;
				case NORTH:
					bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
					bqg.c(0.0F, -1.0F, -1.0F);
					break;
				case SOUTH:
					bqg.b(180.0F, 0.0F, 0.0F, 1.0F);
					bqg.b(90.0F, 1.0F, 0.0F, 0.0F);
					bqg.c(0.0F, -1.0F, 1.0F);
					break;
				case UP:
					bqg.b(180.0F, 1.0F, 0.0F, 0.0F);
					bqg.c(0.0F, -2.0F, 0.0F);
			}

			bni bni10 = bwa.this.h().c;
			bni10.g = float6 * (float) (Math.PI / 180.0);
			bni10.f = float7 * (float) (Math.PI / 180.0);
			bwa.this.a(bwa.a[aae.dn().a()]);
			bni10.a(float8);
			bqg.H();
		}

		@Override
		public boolean a() {
			return false;
		}
	}
}
