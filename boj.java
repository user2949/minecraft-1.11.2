import javax.annotation.Nullable;

public class boj {
	public static class a extends bou {
		protected a(ajs ajs, double double2, double double3, double double4) {
			super(ajs, double2, double3, double4);
			this.x = 4;
		}

		@Override
		public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
			float float10 = 0.25F;
			float float11 = 0.5F;
			float float12 = 0.125F;
			float float13 = 0.375F;
			float float14 = 7.1F * ot.a(((float)this.w + float3 - 1.0F) * 0.25F * (float) Math.PI);
			this.e(0.6F - ((float)this.w + float3 - 1.0F) * 0.25F * 0.5F);
			float float15 = (float)(this.d + (this.g - this.d) * (double)float3 - H);
			float float16 = (float)(this.e + (this.h - this.e) * (double)float3 - I);
			float float17 = (float)(this.f + (this.i - this.f) * (double)float3 - J);
			int integer18 = this.a(float3);
			int integer19 = integer18 >> 16 & 65535;
			int integer20 = integer18 & 65535;
			bpy.b((double)(float15 - float4 * float14 - float7 * float14), (double)(float16 - float5 * float14), (double)(float17 - float6 * float14 - float8 * float14))
				.a(0.5, 0.375)
				.a(this.A, this.B, this.C, this.D)
				.a(integer19, integer20)
				.d();
			bpy.b((double)(float15 - float4 * float14 + float7 * float14), (double)(float16 + float5 * float14), (double)(float17 - float6 * float14 + float8 * float14))
				.a(0.5, 0.125)
				.a(this.A, this.B, this.C, this.D)
				.a(integer19, integer20)
				.d();
			bpy.b((double)(float15 + float4 * float14 + float7 * float14), (double)(float16 + float5 * float14), (double)(float17 + float6 * float14 + float8 * float14))
				.a(0.25, 0.125)
				.a(this.A, this.B, this.C, this.D)
				.a(integer19, integer20)
				.d();
			bpy.b((double)(float15 + float4 * float14 - float7 * float14), (double)(float16 - float5 * float14), (double)(float17 + float6 * float14 - float8 * float14))
				.a(0.25, 0.375)
				.a(this.A, this.B, this.C, this.D)
				.a(integer19, integer20)
				.d();
		}
	}

	public static class b extends bpa {
		private boolean a;
		private boolean b;
		private final bov L;
		private float M;
		private float N;
		private float O;
		private boolean P;

		public b(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, bov bov) {
			super(ajs, double2, double3, double4, 160, 8, -0.004F);
			this.j = double5;
			this.k = double6;
			this.l = double7;
			this.L = bov;
			this.y *= 0.75F;
			this.x = 48 + this.r.nextInt(12);
		}

		public void a(boolean boolean1) {
			this.a = boolean1;
		}

		public void b(boolean boolean1) {
			this.b = boolean1;
		}

		@Override
		public boolean c() {
			return true;
		}

		@Override
		public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
			if (!this.b || this.w < this.x / 3 || (this.w + this.x) / 3 % 2 == 0) {
				super.a(bpy, sn, float3, float4, float5, float6, float7, float8);
			}
		}

		@Override
		public void a() {
			super.a();
			if (this.a && this.w < this.x / 2 && (this.w + this.x) % 2 == 0) {
				boj.b b2 = new boj.b(this.c, this.g, this.h, this.i, 0.0, 0.0, 0.0, this.L);
				b2.e(0.99F);
				b2.a(this.A, this.B, this.C);
				b2.w = b2.x / 2;
				if (this.P) {
					b2.P = true;
					b2.M = this.M;
					b2.N = this.N;
					b2.O = this.O;
				}

				b2.b = this.b;
				this.L.a(b2);
			}
		}
	}

	public static class c extends bou {
		private int b;
		private final bov L;
		private ea M;
		boolean a;

		public c(ajs ajs, double double2, double double3, double double4, double double5, double double6, double double7, bov bov, @Nullable du du) {
			super(ajs, double2, double3, double4, 0.0, 0.0, 0.0);
			this.j = double5;
			this.k = double6;
			this.l = double7;
			this.L = bov;
			this.x = 8;
			if (du != null) {
				this.M = du.c("Explosions", 10);
				if (this.M.b_()) {
					this.M = null;
				} else {
					this.x = this.M.c() * 2 - 1;

					for (int integer17 = 0; integer17 < this.M.c(); integer17++) {
						du du18 = this.M.b(integer17);
						if (du18.p("Flicker")) {
							this.a = true;
							this.x += 15;
							break;
						}
					}
				}
			}
		}

		@Override
		public void a(bpy bpy, sn sn, float float3, float float4, float float5, float float6, float float7, float float8) {
		}

		@Override
		public void a() {
			if (this.b == 0 && this.M != null) {
				boolean boolean2 = this.m();
				boolean boolean3 = false;
				if (this.M.c() >= 3) {
					boolean3 = true;
				} else {
					for (int integer4 = 0; integer4 < this.M.c(); integer4++) {
						du du5 = this.M.b(integer4);
						if (du5.f("Type") == 1) {
							boolean3 = true;
							break;
						}
					}
				}

				nm nm4;
				if (boolean3) {
					nm4 = boolean2 ? nn.bB : nn.bA;
				} else {
					nm4 = boolean2 ? nn.bz : nn.by;
				}

				this.c.a(this.g, this.h, this.i, nm4, no.AMBIENT, 20.0F, 0.95F + this.r.nextFloat() * 0.1F, true);
			}

			if (this.b % 2 == 0 && this.M != null && this.b / 2 < this.M.c()) {
				int integer2 = this.b / 2;
				du du3 = this.M.b(integer2);
				int integer4x = du3.f("Type");
				boolean boolean5 = du3.p("Trail");
				boolean boolean6 = du3.p("Flicker");
				int[] arr7 = du3.n("Colors");
				int[] arr8 = du3.n("FadeColors");
				if (arr7.length == 0) {
					arr7 = new int[]{aen.a[0]};
				}

				if (integer4x == 1) {
					this.a(0.5, 4, arr7, arr8, boolean5, boolean6);
				} else if (integer4x == 2) {
					this.a(
						0.5,
						new double[][]{
							{0.0, 1.0},
							{0.3455, 0.309},
							{0.9511, 0.309},
							{0.3795918367346939, -0.12653061224489795},
							{0.6122448979591837, -0.8040816326530612},
							{0.0, -0.35918367346938773}
						},
						arr7,
						arr8,
						boolean5,
						boolean6,
						false
					);
				} else if (integer4x == 3) {
					this.a(
						0.5,
						new double[][]{
							{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}
						},
						arr7,
						arr8,
						boolean5,
						boolean6,
						true
					);
				} else if (integer4x == 4) {
					this.a(arr7, arr8, boolean5, boolean6);
				} else {
					this.a(0.25, 2, arr7, arr8, boolean5, boolean6);
				}

				int integer9 = arr7[0];
				float float10 = (float)((integer9 & 0xFF0000) >> 16) / 255.0F;
				float float11 = (float)((integer9 & 0xFF00) >> 8) / 255.0F;
				float float12 = (float)((integer9 & 0xFF) >> 0) / 255.0F;
				boj.a a13 = new boj.a(this.c, this.g, this.h, this.i);
				a13.a(float10, float11, float12);
				this.L.a(a13);
			}

			this.b++;
			if (this.b > this.x) {
				if (this.a) {
					boolean boolean2x = this.m();
					nm nm3 = boolean2x ? nn.bF : nn.bE;
					this.c.a(this.g, this.h, this.i, nm3, no.AMBIENT, 20.0F, 0.9F + this.r.nextFloat() * 0.15F, true);
				}

				this.i();
			}
		}

		private boolean m() {
			bes bes2 = bes.z();
			return bes2 == null || bes2.aa() == null || !(bes2.aa().d(this.g, this.h, this.i) < 256.0);
		}

		private void a(
			double double1, double double2, double double3, double double4, double double5, double double6, int[] arr7, int[] arr8, boolean boolean9, boolean boolean10
		) {
			boj.b b18 = new boj.b(this.c, double1, double2, double3, double4, double5, double6, this.L);
			b18.e(0.99F);
			b18.a(boolean9);
			b18.b(boolean10);
			int integer19 = this.r.nextInt(arr7.length);
			b18.c(arr7[integer19]);
			if (arr8 != null && arr8.length > 0) {
				b18.d(arr8[this.r.nextInt(arr8.length)]);
			}

			this.L.a(b18);
		}

		private void a(double double1, int integer, int[] arr3, int[] arr4, boolean boolean5, boolean boolean6) {
			double double9 = this.g;
			double double11 = this.h;
			double double13 = this.i;

			for (int integer15 = -integer; integer15 <= integer; integer15++) {
				for (int integer16 = -integer; integer16 <= integer; integer16++) {
					for (int integer17 = -integer; integer17 <= integer; integer17++) {
						double double18 = (double)integer16 + (this.r.nextDouble() - this.r.nextDouble()) * 0.5;
						double double20 = (double)integer15 + (this.r.nextDouble() - this.r.nextDouble()) * 0.5;
						double double22 = (double)integer17 + (this.r.nextDouble() - this.r.nextDouble()) * 0.5;
						double double24 = (double)ot.a(double18 * double18 + double20 * double20 + double22 * double22) / double1 + this.r.nextGaussian() * 0.05;
						this.a(double9, double11, double13, double18 / double24, double20 / double24, double22 / double24, arr3, arr4, boolean5, boolean6);
						if (integer15 != -integer && integer15 != integer && integer16 != -integer && integer16 != integer) {
							integer17 += integer * 2 - 1;
						}
					}
				}
			}
		}

		private void a(double double1, double[][] arr, int[] arr3, int[] arr4, boolean boolean5, boolean boolean6, boolean boolean7) {
			double double10 = arr[0][0];
			double double12 = arr[0][1];
			this.a(this.g, this.h, this.i, double10 * double1, double12 * double1, 0.0, arr3, arr4, boolean5, boolean6);
			float float14 = this.r.nextFloat() * (float) Math.PI;
			double double15 = boolean7 ? 0.034 : 0.34;

			for (int integer17 = 0; integer17 < 3; integer17++) {
				double double18 = (double)float14 + (double)((float)integer17 * (float) Math.PI) * double15;
				double double20 = double10;
				double double22 = double12;

				for (int integer24 = 1; integer24 < arr.length; integer24++) {
					double double25 = arr[integer24][0];
					double double27 = arr[integer24][1];

					for (double double29 = 0.25; double29 <= 1.0; double29 += 0.25) {
						double double31 = (double20 + (double25 - double20) * double29) * double1;
						double double33 = (double22 + (double27 - double22) * double29) * double1;
						double double35 = double31 * Math.sin(double18);
						double31 *= Math.cos(double18);

						for (double double37 = -1.0; double37 <= 1.0; double37 += 2.0) {
							this.a(this.g, this.h, this.i, double31 * double37, double33, double35 * double37, arr3, arr4, boolean5, boolean6);
						}
					}

					double20 = double25;
					double22 = double27;
				}
			}
		}

		private void a(int[] arr1, int[] arr2, boolean boolean3, boolean boolean4) {
			double double6 = this.r.nextGaussian() * 0.05;
			double double8 = this.r.nextGaussian() * 0.05;

			for (int integer10 = 0; integer10 < 70; integer10++) {
				double double11 = this.j * 0.5 + this.r.nextGaussian() * 0.15 + double6;
				double double13 = this.l * 0.5 + this.r.nextGaussian() * 0.15 + double8;
				double double15 = this.k * 0.5 + this.r.nextDouble() * 0.5;
				this.a(this.g, this.h, this.i, double11, double15, double13, arr1, arr2, boolean3, boolean4);
			}
		}

		@Override
		public int b() {
			return 0;
		}
	}

	public static class d implements bow {
		@Override
		public bou a(int integer, ajs ajs, double double3, double double4, double double5, double double6, double double7, double double8, int... arr) {
			boj.b b17 = new boj.b(ajs, double3, double4, double5, double6, double7, double8, bes.z().j);
			b17.e(0.99F);
			return b17;
		}
	}
}
