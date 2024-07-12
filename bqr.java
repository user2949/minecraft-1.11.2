public class bqr {
	public int a;
	public int b;
	public int c;
	public int d;
	public boolean e;
	public int f;
	public int g;
	public int h;
	public float[] i;
	public int j;

	public bqr(int integer1, int integer2, boolean boolean3) {
		this.e = boolean3;
		this.f = -1;
		this.g = -1;
		this.h = -1;
		this.i = new float[4];
		this.i[0] = 1.0F;
		this.i[1] = 1.0F;
		this.i[2] = 1.0F;
		this.i[3] = 0.0F;
		this.a(integer1, integer2);
	}

	public void a(int integer1, int integer2) {
		if (!cdb.j()) {
			this.c = integer1;
			this.d = integer2;
		} else {
			bqg.k();
			if (this.f >= 0) {
				this.a();
			}

			this.b(integer1, integer2);
			this.b();
			cdb.h(cdb.c, 0);
		}
	}

	public void a() {
		if (cdb.j()) {
			this.d();
			this.e();
			if (this.h > -1) {
				cdb.h(this.h);
				this.h = -1;
			}

			if (this.g > -1) {
				bzc.a(this.g);
				this.g = -1;
			}

			if (this.f > -1) {
				cdb.h(cdb.c, 0);
				cdb.i(this.f);
				this.f = -1;
			}
		}
	}

	public void b(int integer1, int integer2) {
		this.c = integer1;
		this.d = integer2;
		this.a = integer1;
		this.b = integer2;
		if (!cdb.j()) {
			this.f();
		} else {
			this.f = cdb.g();
			this.g = bzc.a();
			if (this.e) {
				this.h = cdb.h();
			}

			this.a(9728);
			bqg.i(this.g);
			bqg.a(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, null);
			cdb.h(cdb.c, this.f);
			cdb.a(cdb.c, cdb.e, 3553, this.g, 0);
			if (this.e) {
				cdb.i(cdb.d, this.h);
				cdb.a(cdb.d, 33190, this.a, this.b);
				cdb.b(cdb.c, cdb.f, cdb.d, this.h);
			}

			this.f();
			this.d();
		}
	}

	public void a(int integer) {
		if (cdb.j()) {
			this.j = integer;
			bqg.i(this.g);
			bqg.b(3553, 10241, integer);
			bqg.b(3553, 10240, integer);
			bqg.b(3553, 10242, 10496);
			bqg.b(3553, 10243, 10496);
			bqg.i(0);
		}
	}

	public void b() {
		int integer2 = cdb.j(cdb.c);
		if (integer2 != cdb.g) {
			if (integer2 == cdb.h) {
				throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
			} else if (integer2 == cdb.i) {
				throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
			} else if (integer2 == cdb.j) {
				throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
			} else if (integer2 == cdb.k) {
				throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
			} else {
				throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + integer2);
			}
		}
	}

	public void c() {
		if (cdb.j()) {
			bqg.i(this.g);
		}
	}

	public void d() {
		if (cdb.j()) {
			bqg.i(0);
		}
	}

	public void a(boolean boolean1) {
		if (cdb.j()) {
			cdb.h(cdb.c, this.f);
			if (boolean1) {
				bqg.b(0, 0, this.c, this.d);
			}
		}
	}

	public void e() {
		if (cdb.j()) {
			cdb.h(cdb.c, 0);
		}
	}

	public void a(float float1, float float2, float float3, float float4) {
		this.i[0] = float1;
		this.i[1] = float2;
		this.i[2] = float3;
		this.i[3] = float4;
	}

	public void c(int integer1, int integer2) {
		this.a(integer1, integer2, true);
	}

	public void a(int integer1, int integer2, boolean boolean3) {
		if (cdb.j()) {
			bqg.a(true, true, true, false);
			bqg.j();
			bqg.a(false);
			bqg.n(5889);
			bqg.F();
			bqg.a(0.0, (double)integer1, (double)integer2, 0.0, 1000.0, 3000.0);
			bqg.n(5888);
			bqg.F();
			bqg.c(0.0F, 0.0F, -2000.0F);
			bqg.b(0, 0, integer1, integer2);
			bqg.y();
			bqg.g();
			bqg.d();
			if (boolean3) {
				bqg.l();
				bqg.h();
			}

			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			this.c();
			float float5 = (float)integer1;
			float float6 = (float)integer2;
			float float7 = (float)this.c / (float)this.a;
			float float8 = (float)this.d / (float)this.b;
			bqs bqs9 = bqs.a();
			bpy bpy10 = bqs9.c();
			bpy10.a(7, bzh.i);
			bpy10.b(0.0, (double)float6, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
			bpy10.b((double)float5, (double)float6, 0.0).a((double)float7, 0.0).b(255, 255, 255, 255).d();
			bpy10.b((double)float5, 0.0, 0.0).a((double)float7, (double)float8).b(255, 255, 255, 255).d();
			bpy10.b(0.0, 0.0, 0.0).a(0.0, (double)float8).b(255, 255, 255, 255).d();
			bqs9.b();
			this.d();
			bqg.a(true);
			bqg.a(true, true, true, true);
		}
	}

	public void f() {
		this.a(true);
		bqg.a(this.i[0], this.i[1], this.i[2], this.i[3]);
		int integer2 = 16384;
		if (this.e) {
			bqg.a(1.0);
			integer2 |= 256;
		}

		bqg.m(integer2);
		this.e();
	}
}
