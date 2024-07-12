import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.vector.Quaternion;

public class bqg {
	private static final FloatBuffer a = BufferUtils.createFloatBuffer(16);
	private static final FloatBuffer b = BufferUtils.createFloatBuffer(4);
	private static final bqg.a c = new bqg.a();
	private static final bqg.c d = new bqg.c(2896);
	private static final bqg.c[] e = new bqg.c[8];
	private static final bqg.h f;
	private static final bqg.b g;
	private static final bqg.k h;
	private static final bqg.n i;
	private static final bqg.j j;
	private static final bqg.p k;
	private static final bqg.f l;
	private static final bqg.w m;
	private static final bqg.d n;
	private static final bqg.t o;
	private static final bqg.c p;
	private static int q;
	private static final bqg.x[] r;
	private static int s;
	private static final bqg.c t;
	private static final bqg.g u;
	private static final bqg.e v;

	public static void a() {
		GL11.glPushAttrib(8256);
	}

	public static void c() {
		GL11.glPopAttrib();
	}

	public static void d() {
		c.a.a();
	}

	public static void e() {
		c.a.b();
	}

	public static void a(int integer, float float2) {
		if (integer != c.b || float2 != c.c) {
			c.b = integer;
			c.c = float2;
			GL11.glAlphaFunc(integer, float2);
		}
	}

	public static void f() {
		d.b();
	}

	public static void g() {
		d.a();
	}

	public static void a(int integer) {
		e[integer].b();
	}

	public static void b(int integer) {
		e[integer].a();
	}

	public static void h() {
		f.a.b();
	}

	public static void i() {
		f.a.a();
	}

	public static void a(int integer1, int integer2) {
		if (integer1 != f.b || integer2 != f.c) {
			f.b = integer1;
			f.c = integer2;
			GL11.glColorMaterial(integer1, integer2);
		}
	}

	public static void a(int integer1, int integer2, FloatBuffer floatBuffer) {
		GL11.glLight(integer1, integer2, floatBuffer);
	}

	public static void a(int integer, FloatBuffer floatBuffer) {
		GL11.glLightModel(integer, floatBuffer);
	}

	public static void a(float float1, float float2, float float3) {
		GL11.glNormal3f(float1, float2, float3);
	}

	public static void j() {
		h.a.a();
	}

	public static void k() {
		h.a.b();
	}

	public static void c(int integer) {
		if (integer != h.c) {
			h.c = integer;
			GL11.glDepthFunc(integer);
		}
	}

	public static void a(boolean boolean1) {
		if (boolean1 != h.b) {
			h.b = boolean1;
			GL11.glDepthMask(boolean1);
		}
	}

	public static void l() {
		g.a.a();
	}

	public static void m() {
		g.a.b();
	}

	public static void a(bqg.r r, bqg.l l) {
		b(r.p, l.o);
	}

	public static void b(int integer1, int integer2) {
		if (integer1 != g.b || integer2 != g.c) {
			g.b = integer1;
			g.c = integer2;
			GL11.glBlendFunc(integer1, integer2);
		}
	}

	public static void a(bqg.r r1, bqg.l l2, bqg.r r3, bqg.l l4) {
		a(r1.p, l2.o, r3.p, l4.o);
	}

	public static void a(int integer1, int integer2, int integer3, int integer4) {
		if (integer1 != g.b || integer2 != g.c || integer3 != g.d || integer4 != g.e) {
			g.b = integer1;
			g.c = integer2;
			g.d = integer3;
			g.e = integer4;
			cdb.c(integer1, integer2, integer3, integer4);
		}
	}

	public static void d(int integer) {
		GL14.glBlendEquation(integer);
	}

	public static void e(int integer) {
		b.put(0, (float)(integer >> 16 & 0xFF) / 255.0F);
		b.put(1, (float)(integer >> 8 & 0xFF) / 255.0F);
		b.put(2, (float)(integer >> 0 & 0xFF) / 255.0F);
		b.put(3, (float)(integer >> 24 & 0xFF) / 255.0F);
		b(8960, 8705, b);
		a(8960, 8704, 34160);
		a(8960, 34161, 7681);
		a(8960, 34176, 34166);
		a(8960, 34192, 768);
		a(8960, 34162, 7681);
		a(8960, 34184, 5890);
		a(8960, 34200, 770);
	}

	public static void n() {
		a(8960, 8704, 8448);
		a(8960, 34161, 8448);
		a(8960, 34162, 8448);
		a(8960, 34176, 5890);
		a(8960, 34184, 5890);
		a(8960, 34192, 768);
		a(8960, 34200, 770);
	}

	public static void o() {
		i.a.b();
	}

	public static void p() {
		i.a.a();
	}

	public static void a(bqg.m m) {
		w(m.d);
	}

	private static void w(int integer) {
		if (integer != i.b) {
			i.b = integer;
			GL11.glFogi(2917, integer);
		}
	}

	public static void a(float float1) {
		if (float1 != i.c) {
			i.c = float1;
			GL11.glFogf(2914, float1);
		}
	}

	public static void b(float float1) {
		if (float1 != i.d) {
			i.d = float1;
			GL11.glFogf(2915, float1);
		}
	}

	public static void c(float float1) {
		if (float1 != i.e) {
			i.e = float1;
			GL11.glFogf(2916, float1);
		}
	}

	public static void b(int integer, FloatBuffer floatBuffer) {
		GL11.glFog(integer, floatBuffer);
	}

	public static void c(int integer1, int integer2) {
		GL11.glFogi(integer1, integer2);
	}

	public static void q() {
		j.a.b();
	}

	public static void r() {
		j.a.a();
	}

	public static void a(bqg.i i) {
		x(i.d);
	}

	private static void x(int integer) {
		if (integer != j.b) {
			j.b = integer;
			GL11.glCullFace(integer);
		}
	}

	public static void d(int integer1, int integer2) {
		GL11.glPolygonMode(integer1, integer2);
	}

	public static void s() {
		k.a.b();
	}

	public static void t() {
		k.a.a();
	}

	public static void a(float float1, float float2) {
		if (float1 != k.c || float2 != k.d) {
			k.c = float1;
			k.d = float2;
			GL11.glPolygonOffset(float1, float2);
		}
	}

	public static void w() {
		l.a.b();
	}

	public static void x() {
		l.a.a();
	}

	public static void a(bqg.o o) {
		f(o.q);
	}

	public static void f(int integer) {
		if (integer != l.b) {
			l.b = integer;
			GL11.glLogicOp(integer);
		}
	}

	public static void a(bqg.u u) {
		c(u).a.b();
	}

	public static void b(bqg.u u) {
		c(u).a.a();
	}

	public static void a(bqg.u u, int integer) {
		bqg.v v3 = c(u);
		if (integer != v3.c) {
			v3.c = integer;
			GL11.glTexGeni(v3.b, 9472, integer);
		}
	}

	public static void a(bqg.u u, int integer, FloatBuffer floatBuffer) {
		GL11.glTexGen(c(u).b, integer, floatBuffer);
	}

	private static bqg.v c(bqg.u u) {
		switch (u) {
			case S:
				return m.a;
			case T:
				return m.b;
			case R:
				return m.c;
			case Q:
				return m.d;
			default:
				return m.a;
		}
	}

	public static void g(int integer) {
		if (q != integer - cdb.q) {
			q = integer - cdb.q;
			cdb.k(integer);
		}
	}

	public static void y() {
		r[q].a.b();
	}

	public static void z() {
		r[q].a.a();
	}

	public static void b(int integer1, int integer2, FloatBuffer floatBuffer) {
		GL11.glTexEnv(integer1, integer2, floatBuffer);
	}

	public static void a(int integer1, int integer2, int integer3) {
		GL11.glTexEnvi(integer1, integer2, integer3);
	}

	public static void a(int integer1, int integer2, float float3) {
		GL11.glTexEnvf(integer1, integer2, float3);
	}

	public static void b(int integer1, int integer2, float float3) {
		GL11.glTexParameterf(integer1, integer2, float3);
	}

	public static void b(int integer1, int integer2, int integer3) {
		GL11.glTexParameteri(integer1, integer2, integer3);
	}

	public static int c(int integer1, int integer2, int integer3) {
		return GL11.glGetTexLevelParameteri(integer1, integer2, integer3);
	}

	public static int A() {
		return GL11.glGenTextures();
	}

	public static void h(int integer) {
		GL11.glDeleteTextures(integer);

		for (bqg.x x5 : r) {
			if (x5.b == integer) {
				x5.b = -1;
			}
		}
	}

	public static void i(int integer) {
		if (integer != r[q].b) {
			r[q].b = integer;
			GL11.glBindTexture(3553, integer);
		}
	}

	public static void a(
		int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, @Nullable IntBuffer intBuffer
	) {
		GL11.glTexImage2D(integer1, integer2, integer3, integer4, integer5, integer6, integer7, integer8, intBuffer);
	}

	public static void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, IntBuffer intBuffer) {
		GL11.glTexSubImage2D(integer1, integer2, integer3, integer4, integer5, integer6, integer7, integer8, intBuffer);
	}

	public static void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8) {
		GL11.glCopyTexSubImage2D(integer1, integer2, integer3, integer4, integer5, integer6, integer7, integer8);
	}

	public static void a(int integer1, int integer2, int integer3, int integer4, IntBuffer intBuffer) {
		GL11.glGetTexImage(integer1, integer2, integer3, integer4, intBuffer);
	}

	public static void B() {
		p.b();
	}

	public static void C() {
		p.a();
	}

	public static void j(int integer) {
		if (integer != s) {
			s = integer;
			GL11.glShadeModel(integer);
		}
	}

	public static void D() {
		t.b();
	}

	public static void E() {
		t.a();
	}

	public static void b(int integer1, int integer2, int integer3, int integer4) {
		GL11.glViewport(integer1, integer2, integer3, integer4);
	}

	public static void a(boolean boolean1, boolean boolean2, boolean boolean3, boolean boolean4) {
		if (boolean1 != u.a || boolean2 != u.b || boolean3 != u.c || boolean4 != u.d) {
			u.a = boolean1;
			u.b = boolean2;
			u.c = boolean3;
			u.d = boolean4;
			GL11.glColorMask(boolean1, boolean2, boolean3, boolean4);
		}
	}

	public static void a(double double1) {
		if (double1 != n.a) {
			n.a = double1;
			GL11.glClearDepth(double1);
		}
	}

	public static void a(float float1, float float2, float float3, float float4) {
		if (float1 != n.b.a || float2 != n.b.b || float3 != n.b.c || float4 != n.b.d) {
			n.b.a = float1;
			n.b.b = float2;
			n.b.c = float3;
			n.b.d = float4;
			GL11.glClearColor(float1, float2, float3, float4);
		}
	}

	public static void m(int integer) {
		GL11.glClear(integer);
	}

	public static void n(int integer) {
		GL11.glMatrixMode(integer);
	}

	public static void F() {
		GL11.glLoadIdentity();
	}

	public static void G() {
		GL11.glPushMatrix();
	}

	public static void H() {
		GL11.glPopMatrix();
	}

	public static void c(int integer, FloatBuffer floatBuffer) {
		GL11.glGetFloat(integer, floatBuffer);
	}

	public static void a(double double1, double double2, double double3, double double4, double double5, double double6) {
		GL11.glOrtho(double1, double2, double3, double4, double5, double6);
	}

	public static void b(float float1, float float2, float float3, float float4) {
		GL11.glRotatef(float1, float2, float3, float4);
	}

	public static void b(float float1, float float2, float float3) {
		GL11.glScalef(float1, float2, float3);
	}

	public static void a(double double1, double double2, double double3) {
		GL11.glScaled(double1, double2, double3);
	}

	public static void c(float float1, float float2, float float3) {
		GL11.glTranslatef(float1, float2, float3);
	}

	public static void b(double double1, double double2, double double3) {
		GL11.glTranslated(double1, double2, double3);
	}

	public static void a(FloatBuffer floatBuffer) {
		GL11.glMultMatrix(floatBuffer);
	}

	public static void a(Quaternion quaternion) {
		a(a(a, quaternion));
	}

	public static FloatBuffer a(FloatBuffer floatBuffer, Quaternion quaternion) {
		floatBuffer.clear();
		float float3 = quaternion.x * quaternion.x;
		float float4 = quaternion.x * quaternion.y;
		float float5 = quaternion.x * quaternion.z;
		float float6 = quaternion.x * quaternion.w;
		float float7 = quaternion.y * quaternion.y;
		float float8 = quaternion.y * quaternion.z;
		float float9 = quaternion.y * quaternion.w;
		float float10 = quaternion.z * quaternion.z;
		float float11 = quaternion.z * quaternion.w;
		floatBuffer.put(1.0F - 2.0F * (float7 + float10));
		floatBuffer.put(2.0F * (float4 + float11));
		floatBuffer.put(2.0F * (float5 - float9));
		floatBuffer.put(0.0F);
		floatBuffer.put(2.0F * (float4 - float11));
		floatBuffer.put(1.0F - 2.0F * (float3 + float10));
		floatBuffer.put(2.0F * (float8 + float6));
		floatBuffer.put(0.0F);
		floatBuffer.put(2.0F * (float5 + float9));
		floatBuffer.put(2.0F * (float8 - float6));
		floatBuffer.put(1.0F - 2.0F * (float3 + float7));
		floatBuffer.put(0.0F);
		floatBuffer.put(0.0F);
		floatBuffer.put(0.0F);
		floatBuffer.put(0.0F);
		floatBuffer.put(1.0F);
		floatBuffer.rewind();
		return floatBuffer;
	}

	public static void c(float float1, float float2, float float3, float float4) {
		if (float1 != v.a || float2 != v.b || float3 != v.c || float4 != v.d) {
			v.a = float1;
			v.b = float2;
			v.c = float3;
			v.d = float4;
			GL11.glColor4f(float1, float2, float3, float4);
		}
	}

	public static void d(float float1, float float2, float float3) {
		c(float1, float2, float3, 1.0F);
	}

	public static void b(float float1, float float2) {
		GL11.glTexCoord2f(float1, float2);
	}

	public static void e(float float1, float float2, float float3) {
		GL11.glVertex3f(float1, float2, float3);
	}

	public static void I() {
		v.a = -1.0F;
		v.b = -1.0F;
		v.c = -1.0F;
		v.d = -1.0F;
	}

	public static void a(int integer1, int integer2, ByteBuffer byteBuffer) {
		GL11.glNormalPointer(integer1, integer2, byteBuffer);
	}

	public static void c(int integer1, int integer2, int integer3, int integer4) {
		GL11.glTexCoordPointer(integer1, integer2, integer3, (long)integer4);
	}

	public static void a(int integer1, int integer2, int integer3, ByteBuffer byteBuffer) {
		GL11.glTexCoordPointer(integer1, integer2, integer3, byteBuffer);
	}

	public static void d(int integer1, int integer2, int integer3, int integer4) {
		GL11.glVertexPointer(integer1, integer2, integer3, (long)integer4);
	}

	public static void b(int integer1, int integer2, int integer3, ByteBuffer byteBuffer) {
		GL11.glVertexPointer(integer1, integer2, integer3, byteBuffer);
	}

	public static void e(int integer1, int integer2, int integer3, int integer4) {
		GL11.glColorPointer(integer1, integer2, integer3, (long)integer4);
	}

	public static void c(int integer1, int integer2, int integer3, ByteBuffer byteBuffer) {
		GL11.glColorPointer(integer1, integer2, integer3, byteBuffer);
	}

	public static void p(int integer) {
		GL11.glDisableClientState(integer);
	}

	public static void q(int integer) {
		GL11.glEnableClientState(integer);
	}

	public static void r(int integer) {
		GL11.glBegin(integer);
	}

	public static void J() {
		GL11.glEnd();
	}

	public static void f(int integer1, int integer2, int integer3) {
		GL11.glDrawArrays(integer1, integer2, integer3);
	}

	public static void d(float float1) {
		GL11.glLineWidth(float1);
	}

	public static void s(int integer) {
		GL11.glCallList(integer);
	}

	public static void e(int integer1, int integer2) {
		GL11.glDeleteLists(integer1, integer2);
	}

	public static void f(int integer1, int integer2) {
		GL11.glNewList(integer1, integer2);
	}

	public static void K() {
		GL11.glEndList();
	}

	public static int t(int integer) {
		return GL11.glGenLists(integer);
	}

	public static void g(int integer1, int integer2) {
		GL11.glPixelStorei(integer1, integer2);
	}

	public static void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, IntBuffer intBuffer) {
		GL11.glReadPixels(integer1, integer2, integer3, integer4, integer5, integer6, intBuffer);
	}

	public static int L() {
		return GL11.glGetError();
	}

	public static String u(int integer) {
		return GL11.glGetString(integer);
	}

	public static void a(int integer, IntBuffer intBuffer) {
		GL11.glGetInteger(integer, intBuffer);
	}

	public static int v(int integer) {
		return GL11.glGetInteger(integer);
	}

	public static void a(bqg.q q) {
		q.a();
	}

	public static void b(bqg.q q) {
		q.b();
	}

	static {
		for (int integer1 = 0; integer1 < 8; integer1++) {
			e[integer1] = new bqg.c(16384 + integer1);
		}

		f = new bqg.h();
		g = new bqg.b();
		h = new bqg.k();
		i = new bqg.n();
		j = new bqg.j();
		k = new bqg.p();
		l = new bqg.f();
		m = new bqg.w();
		n = new bqg.d();
		o = new bqg.t();
		p = new bqg.c(2977);
		r = new bqg.x[8];

		for (int integer1 = 0; integer1 < 8; integer1++) {
			r[integer1] = new bqg.x();
		}

		s = 7425;
		t = new bqg.c(32826);
		u = new bqg.g();
		v = new bqg.e();
	}

	static class a {
		public bqg.c a = new bqg.c(3008);
		public int b = 519;
		public float c = -1.0F;

		private a() {
		}
	}

	static class b {
		public bqg.c a = new bqg.c(3042);
		public int b = 1;
		public int c = 0;
		public int d = 1;
		public int e = 0;

		private b() {
		}
	}

	static class c {
		private final int a;
		private boolean b;

		public c(int integer) {
			this.a = integer;
		}

		public void a() {
			this.a(false);
		}

		public void b() {
			this.a(true);
		}

		public void a(boolean boolean1) {
			if (boolean1 != this.b) {
				this.b = boolean1;
				if (boolean1) {
					GL11.glEnable(this.a);
				} else {
					GL11.glDisable(this.a);
				}
			}
		}
	}

	static class d {
		public double a = 1.0;
		public bqg.e b = new bqg.e(0.0F, 0.0F, 0.0F, 0.0F);

		private d() {
		}
	}

	static class e {
		public float a = 1.0F;
		public float b = 1.0F;
		public float c = 1.0F;
		public float d = 1.0F;

		public e() {
			this(1.0F, 1.0F, 1.0F, 1.0F);
		}

		public e(float float1, float float2, float float3, float float4) {
			this.a = float1;
			this.b = float2;
			this.c = float3;
			this.d = float4;
		}
	}

	static class f {
		public bqg.c a = new bqg.c(3058);
		public int b = 5379;

		private f() {
		}
	}

	static class g {
		public boolean a = true;
		public boolean b = true;
		public boolean c = true;
		public boolean d = true;

		private g() {
		}
	}

	static class h {
		public bqg.c a = new bqg.c(2903);
		public int b = 1032;
		public int c = 5634;

		private h() {
		}
	}

	public static enum i {
		FRONT(1028),
		BACK(1029),
		FRONT_AND_BACK(1032);

		public final int d;

		private i(int integer3) {
			this.d = integer3;
		}
	}

	static class j {
		public bqg.c a = new bqg.c(2884);
		public int b = 1029;

		private j() {
		}
	}

	static class k {
		public bqg.c a = new bqg.c(2929);
		public boolean b = true;
		public int c = 513;

		private k() {
		}
	}

	public static enum l {
		CONSTANT_ALPHA(32771),
		CONSTANT_COLOR(32769),
		DST_ALPHA(772),
		DST_COLOR(774),
		ONE(1),
		ONE_MINUS_CONSTANT_ALPHA(32772),
		ONE_MINUS_CONSTANT_COLOR(32770),
		ONE_MINUS_DST_ALPHA(773),
		ONE_MINUS_DST_COLOR(775),
		ONE_MINUS_SRC_ALPHA(771),
		ONE_MINUS_SRC_COLOR(769),
		SRC_ALPHA(770),
		SRC_COLOR(768),
		ZERO(0);

		public final int o;

		private l(int integer3) {
			this.o = integer3;
		}
	}

	public static enum m {
		LINEAR(9729),
		EXP(2048),
		EXP2(2049);

		public final int d;

		private m(int integer3) {
			this.d = integer3;
		}
	}

	static class n {
		public bqg.c a = new bqg.c(2912);
		public int b = 2048;
		public float c = 1.0F;
		public float d;
		public float e = 1.0F;

		private n() {
		}
	}

	public static enum o {
		AND(5377),
		AND_INVERTED(5380),
		AND_REVERSE(5378),
		CLEAR(5376),
		COPY(5379),
		COPY_INVERTED(5388),
		EQUIV(5385),
		INVERT(5386),
		NAND(5390),
		NOOP(5381),
		NOR(5384),
		OR(5383),
		OR_INVERTED(5389),
		OR_REVERSE(5387),
		SET(5391),
		XOR(5382);

		public final int q;

		private o(int integer3) {
			this.q = integer3;
		}
	}

	static class p {
		public bqg.c a = new bqg.c(32823);
		public bqg.c b = new bqg.c(10754);
		public float c;
		public float d;

		private p() {
		}
	}

	public static enum q {
		DEFAULT {
			@Override
			public void a() {
				bqg.d();
				bqg.a(519, 0.0F);
				bqg.g();
				bqg.a(2899, beq.a(0.2F, 0.2F, 0.2F, 1.0F));

				for (int integer2 = 0; integer2 < 8; integer2++) {
					bqg.b(integer2);
					bqg.a(16384 + integer2, 4608, beq.a(0.0F, 0.0F, 0.0F, 1.0F));
					bqg.a(16384 + integer2, 4611, beq.a(0.0F, 0.0F, 1.0F, 0.0F));
					if (integer2 == 0) {
						bqg.a(16384 + integer2, 4609, beq.a(1.0F, 1.0F, 1.0F, 1.0F));
						bqg.a(16384 + integer2, 4610, beq.a(1.0F, 1.0F, 1.0F, 1.0F));
					} else {
						bqg.a(16384 + integer2, 4609, beq.a(0.0F, 0.0F, 0.0F, 1.0F));
						bqg.a(16384 + integer2, 4610, beq.a(0.0F, 0.0F, 0.0F, 1.0F));
					}
				}

				bqg.i();
				bqg.a(1032, 5634);
				bqg.j();
				bqg.c(513);
				bqg.a(true);
				bqg.l();
				bqg.a(bqg.r.ONE, bqg.l.ZERO);
				bqg.a(bqg.r.ONE, bqg.l.ZERO, bqg.r.ONE, bqg.l.ZERO);
				bqg.d(32774);
				bqg.p();
				bqg.c(2917, 2048);
				bqg.a(1.0F);
				bqg.b(0.0F);
				bqg.c(1.0F);
				bqg.b(2918, beq.a(0.0F, 0.0F, 0.0F, 0.0F));
				if (GLContext.getCapabilities().GL_NV_fog_distance) {
					bqg.c(2917, 34140);
				}

				bqg.a(0.0F, 0.0F);
				bqg.x();
				bqg.f(5379);
				bqg.b(bqg.u.S);
				bqg.a(bqg.u.S, 9216);
				bqg.a(bqg.u.S, 9474, beq.a(1.0F, 0.0F, 0.0F, 0.0F));
				bqg.a(bqg.u.S, 9217, beq.a(1.0F, 0.0F, 0.0F, 0.0F));
				bqg.b(bqg.u.T);
				bqg.a(bqg.u.T, 9216);
				bqg.a(bqg.u.T, 9474, beq.a(0.0F, 1.0F, 0.0F, 0.0F));
				bqg.a(bqg.u.T, 9217, beq.a(0.0F, 1.0F, 0.0F, 0.0F));
				bqg.b(bqg.u.R);
				bqg.a(bqg.u.R, 9216);
				bqg.a(bqg.u.R, 9474, beq.a(0.0F, 0.0F, 0.0F, 0.0F));
				bqg.a(bqg.u.R, 9217, beq.a(0.0F, 0.0F, 0.0F, 0.0F));
				bqg.b(bqg.u.Q);
				bqg.a(bqg.u.Q, 9216);
				bqg.a(bqg.u.Q, 9474, beq.a(0.0F, 0.0F, 0.0F, 0.0F));
				bqg.a(bqg.u.Q, 9217, beq.a(0.0F, 0.0F, 0.0F, 0.0F));
				bqg.g(0);
				bqg.b(3553, 10240, 9729);
				bqg.b(3553, 10241, 9986);
				bqg.b(3553, 10242, 10497);
				bqg.b(3553, 10243, 10497);
				bqg.b(3553, 33085, 1000);
				bqg.b(3553, 33083, 1000);
				bqg.b(3553, 33082, -1000);
				bqg.b(3553, 34049, 0.0F);
				bqg.a(8960, 8704, 8448);
				bqg.b(8960, 8705, beq.a(0.0F, 0.0F, 0.0F, 0.0F));
				bqg.a(8960, 34161, 8448);
				bqg.a(8960, 34162, 8448);
				bqg.a(8960, 34176, 5890);
				bqg.a(8960, 34177, 34168);
				bqg.a(8960, 34178, 34166);
				bqg.a(8960, 34184, 5890);
				bqg.a(8960, 34185, 34168);
				bqg.a(8960, 34186, 34166);
				bqg.a(8960, 34192, 768);
				bqg.a(8960, 34193, 768);
				bqg.a(8960, 34194, 770);
				bqg.a(8960, 34200, 770);
				bqg.a(8960, 34201, 770);
				bqg.a(8960, 34202, 770);
				bqg.a(8960, 34163, 1.0F);
				bqg.a(8960, 3356, 1.0F);
				bqg.C();
				bqg.j(7425);
				bqg.E();
				bqg.a(true, true, true, true);
				bqg.a(1.0);
				bqg.d(1.0F);
				bqg.a(0.0F, 0.0F, 1.0F);
				bqg.d(1028, 6914);
				bqg.d(1029, 6914);
			}

			@Override
			public void b() {
			}
		},
		PLAYER_SKIN {
			@Override
			public void a() {
				bqg.m();
				bqg.a(770, 771, 1, 0);
			}

			@Override
			public void b() {
				bqg.l();
			}
		},
		TRANSPARENT_MODEL {
			@Override
			public void a() {
				bqg.c(1.0F, 1.0F, 1.0F, 0.15F);
				bqg.a(false);
				bqg.m();
				bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
				bqg.a(516, 0.003921569F);
			}

			@Override
			public void b() {
				bqg.l();
				bqg.a(516, 0.1F);
				bqg.a(true);
			}
		};

		private q() {
		}

		public abstract void a();

		public abstract void b();
	}

	public static enum r {
		CONSTANT_ALPHA(32771),
		CONSTANT_COLOR(32769),
		DST_ALPHA(772),
		DST_COLOR(774),
		ONE(1),
		ONE_MINUS_CONSTANT_ALPHA(32772),
		ONE_MINUS_CONSTANT_COLOR(32770),
		ONE_MINUS_DST_ALPHA(773),
		ONE_MINUS_DST_COLOR(775),
		ONE_MINUS_SRC_ALPHA(771),
		ONE_MINUS_SRC_COLOR(769),
		SRC_ALPHA(770),
		SRC_ALPHA_SATURATE(776),
		SRC_COLOR(768),
		ZERO(0);

		public final int p;

		private r(int integer3) {
			this.p = integer3;
		}
	}

	static class s {
		public int a = 519;
		public int c = -1;

		private s() {
		}
	}

	static class t {
		public bqg.s a = new bqg.s();
		public int b = -1;
		public int c = 7680;
		public int d = 7680;
		public int e = 7680;

		private t() {
		}
	}

	public static enum u {
		S,
		T,
		R,
		Q;
	}

	static class v {
		public bqg.c a;
		public int b;
		public int c = -1;

		public v(int integer1, int integer2) {
			this.b = integer1;
			this.a = new bqg.c(integer2);
		}
	}

	static class w {
		public bqg.v a = new bqg.v(8192, 3168);
		public bqg.v b = new bqg.v(8193, 3169);
		public bqg.v c = new bqg.v(8194, 3170);
		public bqg.v d = new bqg.v(8195, 3171);

		private w() {
		}
	}

	static class x {
		public bqg.c a = new bqg.c(3553);
		public int b;

		private x() {
		}
	}
}
