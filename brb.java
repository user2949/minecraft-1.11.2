public class brb {
	private final bfb a;
	private final byz[] b = new byz[2];
	private final byz[] c = new byz[2];
	private byz d;

	public brb(bfb bfb) {
		this.a = bfb;
		this.a();
	}

	protected void a() {
		byy byy2 = bes.z().R();
		this.b[0] = byy2.a("minecraft:blocks/lava_still");
		this.b[1] = byy2.a("minecraft:blocks/lava_flow");
		this.c[0] = byy2.a("minecraft:blocks/water_still");
		this.c[1] = byy2.a("minecraft:blocks/water_flow");
		this.d = byy2.a("minecraft:blocks/water_overlay");
	}

	public boolean a(ajw ajw, atl atl, co co, bpy bpy) {
		aoq aoq6 = (aoq)atl.v();
		boolean boolean7 = atl.a() == azs.i;
		byz[] arr8 = boolean7 ? this.b : this.c;
		int integer9 = this.a.a(atl, ajw, co, 0);
		float float10 = (float)(integer9 >> 16 & 0xFF) / 255.0F;
		float float11 = (float)(integer9 >> 8 & 0xFF) / 255.0F;
		float float12 = (float)(integer9 & 0xFF) / 255.0F;
		boolean boolean13 = atl.c(ajw, co, cv.UP);
		boolean boolean14 = atl.c(ajw, co, cv.DOWN);
		boolean[] arr15 = new boolean[]{atl.c(ajw, co, cv.NORTH), atl.c(ajw, co, cv.SOUTH), atl.c(ajw, co, cv.WEST), atl.c(ajw, co, cv.EAST)};
		if (!boolean13 && !boolean14 && !arr15[0] && !arr15[1] && !arr15[2] && !arr15[3]) {
			return false;
		} else {
			boolean boolean16 = false;
			float float17 = 0.5F;
			float float18 = 1.0F;
			float float19 = 0.8F;
			float float20 = 0.6F;
			azs azs21 = atl.a();
			float float22 = this.a(ajw, co, azs21);
			float float23 = this.a(ajw, co.d(), azs21);
			float float24 = this.a(ajw, co.f().d(), azs21);
			float float25 = this.a(ajw, co.f(), azs21);
			double double26 = (double)co.p();
			double double28 = (double)co.q();
			double double30 = (double)co.r();
			float float32 = 0.001F;
			if (boolean13) {
				boolean16 = true;
				float float33 = aoq.a(ajw, co, azs21, atl);
				byz byz34 = float33 > -999.0F ? arr8[1] : arr8[0];
				float22 -= 0.001F;
				float23 -= 0.001F;
				float24 -= 0.001F;
				float25 -= 0.001F;
				float float35;
				float float36;
				float float37;
				float float38;
				float float39;
				float float40;
				float float41;
				float float42;
				if (float33 < -999.0F) {
					float35 = byz34.a(0.0);
					float39 = byz34.b(0.0);
					float36 = float35;
					float40 = byz34.b(16.0);
					float37 = byz34.a(16.0);
					float41 = float40;
					float38 = float37;
					float42 = float39;
				} else {
					float float43 = ot.a(float33) * 0.25F;
					float float44 = ot.b(float33) * 0.25F;
					float float45 = 8.0F;
					float35 = byz34.a((double)(8.0F + (-float44 - float43) * 16.0F));
					float39 = byz34.b((double)(8.0F + (-float44 + float43) * 16.0F));
					float36 = byz34.a((double)(8.0F + (-float44 + float43) * 16.0F));
					float40 = byz34.b((double)(8.0F + (float44 + float43) * 16.0F));
					float37 = byz34.a((double)(8.0F + (float44 + float43) * 16.0F));
					float41 = byz34.b((double)(8.0F + (float44 - float43) * 16.0F));
					float38 = byz34.a((double)(8.0F + (float44 - float43) * 16.0F));
					float42 = byz34.b((double)(8.0F + (-float44 - float43) * 16.0F));
				}

				int integer43 = atl.a(ajw, co);
				int integer44 = integer43 >> 16 & 65535;
				int integer45 = integer43 & 65535;
				float float46 = 1.0F * float10;
				float float47 = 1.0F * float11;
				float float48 = 1.0F * float12;
				bpy.b(double26 + 0.0, double28 + (double)float22, double30 + 0.0)
					.a(float46, float47, float48, 1.0F)
					.a((double)float35, (double)float39)
					.a(integer44, integer45)
					.d();
				bpy.b(double26 + 0.0, double28 + (double)float23, double30 + 1.0)
					.a(float46, float47, float48, 1.0F)
					.a((double)float36, (double)float40)
					.a(integer44, integer45)
					.d();
				bpy.b(double26 + 1.0, double28 + (double)float24, double30 + 1.0)
					.a(float46, float47, float48, 1.0F)
					.a((double)float37, (double)float41)
					.a(integer44, integer45)
					.d();
				bpy.b(double26 + 1.0, double28 + (double)float25, double30 + 0.0)
					.a(float46, float47, float48, 1.0F)
					.a((double)float38, (double)float42)
					.a(integer44, integer45)
					.d();
				if (aoq6.c(ajw, co.a())) {
					bpy.b(double26 + 0.0, double28 + (double)float22, double30 + 0.0)
						.a(float46, float47, float48, 1.0F)
						.a((double)float35, (double)float39)
						.a(integer44, integer45)
						.d();
					bpy.b(double26 + 1.0, double28 + (double)float25, double30 + 0.0)
						.a(float46, float47, float48, 1.0F)
						.a((double)float38, (double)float42)
						.a(integer44, integer45)
						.d();
					bpy.b(double26 + 1.0, double28 + (double)float24, double30 + 1.0)
						.a(float46, float47, float48, 1.0F)
						.a((double)float37, (double)float41)
						.a(integer44, integer45)
						.d();
					bpy.b(double26 + 0.0, double28 + (double)float23, double30 + 1.0)
						.a(float46, float47, float48, 1.0F)
						.a((double)float36, (double)float40)
						.a(integer44, integer45)
						.d();
				}
			}

			if (boolean14) {
				float float33x = arr8[0].e();
				float float34 = arr8[0].f();
				float float35x = arr8[0].g();
				float float36x = arr8[0].h();
				int integer37 = atl.a(ajw, co.b());
				int integer38 = integer37 >> 16 & 65535;
				int integer39 = integer37 & 65535;
				bpy.b(double26, double28, double30 + 1.0).a(0.5F, 0.5F, 0.5F, 1.0F).a((double)float33x, (double)float36x).a(integer38, integer39).d();
				bpy.b(double26, double28, double30).a(0.5F, 0.5F, 0.5F, 1.0F).a((double)float33x, (double)float35x).a(integer38, integer39).d();
				bpy.b(double26 + 1.0, double28, double30).a(0.5F, 0.5F, 0.5F, 1.0F).a((double)float34, (double)float35x).a(integer38, integer39).d();
				bpy.b(double26 + 1.0, double28, double30 + 1.0).a(0.5F, 0.5F, 0.5F, 1.0F).a((double)float34, (double)float36x).a(integer38, integer39).d();
				boolean16 = true;
			}

			for (int integer33 = 0; integer33 < 4; integer33++) {
				int integer34 = 0;
				int integer35 = 0;
				if (integer33 == 0) {
					integer35--;
				}

				if (integer33 == 1) {
					integer35++;
				}

				if (integer33 == 2) {
					integer34--;
				}

				if (integer33 == 3) {
					integer34++;
				}

				co co36 = co.a(integer34, 0, integer35);
				byz byz37 = arr8[1];
				if (!boolean7) {
					alu alu38 = ajw.o(co36).v();
					if (alu38 == alv.w || alu38 == alv.cG) {
						byz37 = this.d;
					}
				}

				if (arr15[integer33]) {
					float float38x;
					float float39x;
					double double40;
					double double42;
					double double44;
					double double46;
					if (integer33 == 0) {
						float38x = float22;
						float39x = float25;
						double40 = double26;
						double44 = double26 + 1.0;
						double42 = double30 + 0.001F;
						double46 = double30 + 0.001F;
					} else if (integer33 == 1) {
						float38x = float24;
						float39x = float23;
						double40 = double26 + 1.0;
						double44 = double26;
						double42 = double30 + 1.0 - 0.001F;
						double46 = double30 + 1.0 - 0.001F;
					} else if (integer33 == 2) {
						float38x = float23;
						float39x = float22;
						double40 = double26 + 0.001F;
						double44 = double26 + 0.001F;
						double42 = double30 + 1.0;
						double46 = double30;
					} else {
						float38x = float25;
						float39x = float24;
						double40 = double26 + 1.0 - 0.001F;
						double44 = double26 + 1.0 - 0.001F;
						double42 = double30;
						double46 = double30 + 1.0;
					}

					boolean16 = true;
					float float48 = byz37.a(0.0);
					float float49 = byz37.a(8.0);
					float float50 = byz37.b((double)((1.0F - float38x) * 16.0F * 0.5F));
					float float51 = byz37.b((double)((1.0F - float39x) * 16.0F * 0.5F));
					float float52 = byz37.b(8.0);
					int integer53 = atl.a(ajw, co36);
					int integer54 = integer53 >> 16 & 65535;
					int integer55 = integer53 & 65535;
					float float56 = integer33 < 2 ? 0.8F : 0.6F;
					float float57 = 1.0F * float56 * float10;
					float float58 = 1.0F * float56 * float11;
					float float59 = 1.0F * float56 * float12;
					bpy.b(double40, double28 + (double)float38x, double42).a(float57, float58, float59, 1.0F).a((double)float48, (double)float50).a(integer54, integer55).d();
					bpy.b(double44, double28 + (double)float39x, double46).a(float57, float58, float59, 1.0F).a((double)float49, (double)float51).a(integer54, integer55).d();
					bpy.b(double44, double28 + 0.0, double46).a(float57, float58, float59, 1.0F).a((double)float49, (double)float52).a(integer54, integer55).d();
					bpy.b(double40, double28 + 0.0, double42).a(float57, float58, float59, 1.0F).a((double)float48, (double)float52).a(integer54, integer55).d();
					if (byz37 != this.d) {
						bpy.b(double40, double28 + 0.0, double42).a(float57, float58, float59, 1.0F).a((double)float48, (double)float52).a(integer54, integer55).d();
						bpy.b(double44, double28 + 0.0, double46).a(float57, float58, float59, 1.0F).a((double)float49, (double)float52).a(integer54, integer55).d();
						bpy.b(double44, double28 + (double)float39x, double46).a(float57, float58, float59, 1.0F).a((double)float49, (double)float51).a(integer54, integer55).d();
						bpy.b(double40, double28 + (double)float38x, double42).a(float57, float58, float59, 1.0F).a((double)float48, (double)float50).a(integer54, integer55).d();
					}
				}
			}

			return boolean16;
		}
	}

	private float a(ajw ajw, co co, azs azs) {
		int integer5 = 0;
		float float6 = 0.0F;

		for (int integer7 = 0; integer7 < 4; integer7++) {
			co co8 = co.a(-(integer7 & 1), 0, -(integer7 >> 1 & 1));
			if (ajw.o(co8.a()).a() == azs) {
				return 1.0F;
			}

			atl atl9 = ajw.o(co8);
			azs azs10 = atl9.a();
			if (azs10 == azs) {
				int integer11 = (Integer)atl9.c(aoq.b);
				if (integer11 >= 8 || integer11 == 0) {
					float6 += aoq.e(integer11) * 10.0F;
					integer5 += 10;
				}

				float6 += aoq.e(integer11);
				integer5++;
			} else if (!azs10.a()) {
				float6++;
				integer5++;
			}
		}

		return 1.0F - float6 / (float)integer5;
	}
}
