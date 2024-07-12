import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class cdb {
	private static final Logger T = LogManager.getLogger();
	public static boolean a;
	public static boolean b;
	public static int c;
	public static int d;
	public static int e;
	public static int f;
	public static int g;
	public static int h;
	public static int i;
	public static int j;
	public static int k;
	private static cdb.a U;
	public static boolean l;
	private static boolean V;
	private static boolean W;
	public static int m;
	public static int n;
	public static int o;
	public static int p;
	private static boolean X;
	public static int q;
	public static int r;
	public static int s;
	private static boolean Y;
	public static int t;
	public static int u;
	public static int v;
	public static int w;
	public static int x;
	public static int y;
	public static int z;
	public static int A;
	public static int B;
	public static int C;
	public static int D;
	public static int E;
	public static int F;
	public static int G;
	public static int H;
	public static int I;
	public static int J;
	public static int K;
	public static int L;
	private static boolean Z;
	public static boolean M;
	public static boolean N;
	public static boolean O;
	private static String aa = "";
	private static String ab;
	public static boolean P;
	public static boolean Q;
	private static boolean ac;
	public static int R;
	public static int S;

	public static void a() {
		ContextCapabilities contextCapabilities1 = GLContext.getCapabilities();
		X = contextCapabilities1.GL_ARB_multitexture && !contextCapabilities1.OpenGL13;
		Y = contextCapabilities1.GL_ARB_texture_env_combine && !contextCapabilities1.OpenGL13;
		if (X) {
			aa = aa + "Using ARB_multitexture.\n";
			q = 33984;
			r = 33985;
			s = 33986;
		} else {
			aa = aa + "Using GL 1.3 multitexturing.\n";
			q = 33984;
			r = 33985;
			s = 33986;
		}

		if (Y) {
			aa = aa + "Using ARB_texture_env_combine.\n";
			t = 34160;
			u = 34165;
			v = 34167;
			w = 34166;
			x = 34168;
			y = 34161;
			z = 34176;
			A = 34177;
			B = 34178;
			C = 34192;
			D = 34193;
			E = 34194;
			F = 34162;
			G = 34184;
			H = 34185;
			I = 34186;
			J = 34200;
			K = 34201;
			L = 34202;
		} else {
			aa = aa + "Using GL 1.3 texture combiners.\n";
			t = 34160;
			u = 34165;
			v = 34167;
			w = 34166;
			x = 34168;
			y = 34161;
			z = 34176;
			A = 34177;
			B = 34178;
			C = 34192;
			D = 34193;
			E = 34194;
			F = 34162;
			G = 34184;
			H = 34185;
			I = 34186;
			J = 34200;
			K = 34201;
			L = 34202;
		}

		M = contextCapabilities1.GL_EXT_blend_func_separate && !contextCapabilities1.OpenGL14;
		Z = contextCapabilities1.OpenGL14 || contextCapabilities1.GL_EXT_blend_func_separate;
		l = Z && (contextCapabilities1.GL_ARB_framebuffer_object || contextCapabilities1.GL_EXT_framebuffer_object || contextCapabilities1.OpenGL30);
		if (l) {
			aa = aa + "Using framebuffer objects because ";
			if (contextCapabilities1.OpenGL30) {
				aa = aa + "OpenGL 3.0 is supported and separate blending is supported.\n";
				U = cdb.a.BASE;
				c = 36160;
				d = 36161;
				e = 36064;
				f = 36096;
				g = 36053;
				h = 36054;
				i = 36055;
				j = 36059;
				k = 36060;
			} else if (contextCapabilities1.GL_ARB_framebuffer_object) {
				aa = aa + "ARB_framebuffer_object is supported and separate blending is supported.\n";
				U = cdb.a.ARB;
				c = 36160;
				d = 36161;
				e = 36064;
				f = 36096;
				g = 36053;
				i = 36055;
				h = 36054;
				j = 36059;
				k = 36060;
			} else if (contextCapabilities1.GL_EXT_framebuffer_object) {
				aa = aa + "EXT_framebuffer_object is supported.\n";
				U = cdb.a.EXT;
				c = 36160;
				d = 36161;
				e = 36064;
				f = 36096;
				g = 36053;
				i = 36055;
				h = 36054;
				j = 36059;
				k = 36060;
			}
		} else {
			aa = aa + "Not using framebuffer objects because ";
			aa = aa + "OpenGL 1.4 is " + (contextCapabilities1.OpenGL14 ? "" : "not ") + "supported, ";
			aa = aa + "EXT_blend_func_separate is " + (contextCapabilities1.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
			aa = aa + "OpenGL 3.0 is " + (contextCapabilities1.OpenGL30 ? "" : "not ") + "supported, ";
			aa = aa + "ARB_framebuffer_object is " + (contextCapabilities1.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
			aa = aa + "EXT_framebuffer_object is " + (contextCapabilities1.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
		}

		N = contextCapabilities1.OpenGL21;
		V = N || contextCapabilities1.GL_ARB_vertex_shader && contextCapabilities1.GL_ARB_fragment_shader && contextCapabilities1.GL_ARB_shader_objects;
		aa = aa + "Shaders are " + (V ? "" : "not ") + "available because ";
		if (V) {
			if (contextCapabilities1.OpenGL21) {
				aa = aa + "OpenGL 2.1 is supported.\n";
				W = false;
				m = 35714;
				n = 35713;
				o = 35633;
				p = 35632;
			} else {
				aa = aa + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
				W = true;
				m = 35714;
				n = 35713;
				o = 35633;
				p = 35632;
			}
		} else {
			aa = aa + "OpenGL 2.1 is " + (contextCapabilities1.OpenGL21 ? "" : "not ") + "supported, ";
			aa = aa + "ARB_shader_objects is " + (contextCapabilities1.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
			aa = aa + "ARB_vertex_shader is " + (contextCapabilities1.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
			aa = aa + "ARB_fragment_shader is " + (contextCapabilities1.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
		}

		O = l && V;
		String string2 = GL11.glGetString(7936).toLowerCase(Locale.ROOT);
		a = string2.contains("nvidia");
		ac = !contextCapabilities1.OpenGL15 && contextCapabilities1.GL_ARB_vertex_buffer_object;
		P = contextCapabilities1.OpenGL15 || ac;
		aa = aa + "VBOs are " + (P ? "" : "not ") + "available because ";
		if (P) {
			if (ac) {
				aa = aa + "ARB_vertex_buffer_object is supported.\n";
				S = 35044;
				R = 34962;
			} else {
				aa = aa + "OpenGL 1.5 is supported.\n";
				S = 35044;
				R = 34962;
			}
		}

		b = string2.contains("ati");
		if (b) {
			if (P) {
				Q = true;
			} else {
				beu.a.RENDER_DISTANCE.a(16.0F);
			}
		}

		try {
			Processor[] arr3 = new SystemInfo().getHardware().getProcessors();
			ab = String.format("%dx %s", arr3.length, arr3[0]).replaceAll("\\s+", " ");
		} catch (Throwable var3) {
		}
	}

	public static boolean b() {
		return O;
	}

	public static String c() {
		return aa;
	}

	public static int a(int integer1, int integer2) {
		return W ? ARBShaderObjects.glGetObjectParameteriARB(integer1, integer2) : GL20.glGetProgrami(integer1, integer2);
	}

	public static void b(int integer1, int integer2) {
		if (W) {
			ARBShaderObjects.glAttachObjectARB(integer1, integer2);
		} else {
			GL20.glAttachShader(integer1, integer2);
		}
	}

	public static void a(int integer) {
		if (W) {
			ARBShaderObjects.glDeleteObjectARB(integer);
		} else {
			GL20.glDeleteShader(integer);
		}
	}

	public static int b(int integer) {
		return W ? ARBShaderObjects.glCreateShaderObjectARB(integer) : GL20.glCreateShader(integer);
	}

	public static void a(int integer, ByteBuffer byteBuffer) {
		if (W) {
			ARBShaderObjects.glShaderSourceARB(integer, byteBuffer);
		} else {
			GL20.glShaderSource(integer, byteBuffer);
		}
	}

	public static void c(int integer) {
		if (W) {
			ARBShaderObjects.glCompileShaderARB(integer);
		} else {
			GL20.glCompileShader(integer);
		}
	}

	public static int c(int integer1, int integer2) {
		return W ? ARBShaderObjects.glGetObjectParameteriARB(integer1, integer2) : GL20.glGetShaderi(integer1, integer2);
	}

	public static String d(int integer1, int integer2) {
		return W ? ARBShaderObjects.glGetInfoLogARB(integer1, integer2) : GL20.glGetShaderInfoLog(integer1, integer2);
	}

	public static String e(int integer1, int integer2) {
		return W ? ARBShaderObjects.glGetInfoLogARB(integer1, integer2) : GL20.glGetProgramInfoLog(integer1, integer2);
	}

	public static void d(int integer) {
		if (W) {
			ARBShaderObjects.glUseProgramObjectARB(integer);
		} else {
			GL20.glUseProgram(integer);
		}
	}

	public static int d() {
		return W ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
	}

	public static void e(int integer) {
		if (W) {
			ARBShaderObjects.glDeleteObjectARB(integer);
		} else {
			GL20.glDeleteProgram(integer);
		}
	}

	public static void f(int integer) {
		if (W) {
			ARBShaderObjects.glLinkProgramARB(integer);
		} else {
			GL20.glLinkProgram(integer);
		}
	}

	public static int a(int integer, CharSequence charSequence) {
		return W ? ARBShaderObjects.glGetUniformLocationARB(integer, charSequence) : GL20.glGetUniformLocation(integer, charSequence);
	}

	public static void a(int integer, IntBuffer intBuffer) {
		if (W) {
			ARBShaderObjects.glUniform1ARB(integer, intBuffer);
		} else {
			GL20.glUniform1(integer, intBuffer);
		}
	}

	public static void f(int integer1, int integer2) {
		if (W) {
			ARBShaderObjects.glUniform1iARB(integer1, integer2);
		} else {
			GL20.glUniform1i(integer1, integer2);
		}
	}

	public static void a(int integer, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniform1ARB(integer, floatBuffer);
		} else {
			GL20.glUniform1(integer, floatBuffer);
		}
	}

	public static void b(int integer, IntBuffer intBuffer) {
		if (W) {
			ARBShaderObjects.glUniform2ARB(integer, intBuffer);
		} else {
			GL20.glUniform2(integer, intBuffer);
		}
	}

	public static void b(int integer, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniform2ARB(integer, floatBuffer);
		} else {
			GL20.glUniform2(integer, floatBuffer);
		}
	}

	public static void c(int integer, IntBuffer intBuffer) {
		if (W) {
			ARBShaderObjects.glUniform3ARB(integer, intBuffer);
		} else {
			GL20.glUniform3(integer, intBuffer);
		}
	}

	public static void c(int integer, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniform3ARB(integer, floatBuffer);
		} else {
			GL20.glUniform3(integer, floatBuffer);
		}
	}

	public static void d(int integer, IntBuffer intBuffer) {
		if (W) {
			ARBShaderObjects.glUniform4ARB(integer, intBuffer);
		} else {
			GL20.glUniform4(integer, intBuffer);
		}
	}

	public static void d(int integer, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniform4ARB(integer, floatBuffer);
		} else {
			GL20.glUniform4(integer, floatBuffer);
		}
	}

	public static void a(int integer, boolean boolean2, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniformMatrix2ARB(integer, boolean2, floatBuffer);
		} else {
			GL20.glUniformMatrix2(integer, boolean2, floatBuffer);
		}
	}

	public static void b(int integer, boolean boolean2, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniformMatrix3ARB(integer, boolean2, floatBuffer);
		} else {
			GL20.glUniformMatrix3(integer, boolean2, floatBuffer);
		}
	}

	public static void c(int integer, boolean boolean2, FloatBuffer floatBuffer) {
		if (W) {
			ARBShaderObjects.glUniformMatrix4ARB(integer, boolean2, floatBuffer);
		} else {
			GL20.glUniformMatrix4(integer, boolean2, floatBuffer);
		}
	}

	public static int b(int integer, CharSequence charSequence) {
		return W ? ARBVertexShader.glGetAttribLocationARB(integer, charSequence) : GL20.glGetAttribLocation(integer, charSequence);
	}

	public static int e() {
		return ac ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
	}

	public static void g(int integer1, int integer2) {
		if (ac) {
			ARBVertexBufferObject.glBindBufferARB(integer1, integer2);
		} else {
			GL15.glBindBuffer(integer1, integer2);
		}
	}

	public static void a(int integer1, ByteBuffer byteBuffer, int integer3) {
		if (ac) {
			ARBVertexBufferObject.glBufferDataARB(integer1, byteBuffer, integer3);
		} else {
			GL15.glBufferData(integer1, byteBuffer, integer3);
		}
	}

	public static void g(int integer) {
		if (ac) {
			ARBVertexBufferObject.glDeleteBuffersARB(integer);
		} else {
			GL15.glDeleteBuffers(integer);
		}
	}

	public static boolean f() {
		return P && bes.z().u.v;
	}

	public static void h(int integer1, int integer2) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glBindFramebuffer(integer1, integer2);
					break;
				case ARB:
					ARBFramebufferObject.glBindFramebuffer(integer1, integer2);
					break;
				case EXT:
					EXTFramebufferObject.glBindFramebufferEXT(integer1, integer2);
			}
		}
	}

	public static void i(int integer1, int integer2) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glBindRenderbuffer(integer1, integer2);
					break;
				case ARB:
					ARBFramebufferObject.glBindRenderbuffer(integer1, integer2);
					break;
				case EXT:
					EXTFramebufferObject.glBindRenderbufferEXT(integer1, integer2);
			}
		}
	}

	public static void h(int integer) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glDeleteRenderbuffers(integer);
					break;
				case ARB:
					ARBFramebufferObject.glDeleteRenderbuffers(integer);
					break;
				case EXT:
					EXTFramebufferObject.glDeleteRenderbuffersEXT(integer);
			}
		}
	}

	public static void i(int integer) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glDeleteFramebuffers(integer);
					break;
				case ARB:
					ARBFramebufferObject.glDeleteFramebuffers(integer);
					break;
				case EXT:
					EXTFramebufferObject.glDeleteFramebuffersEXT(integer);
			}
		}
	}

	public static int g() {
		if (!l) {
			return -1;
		} else {
			switch (U) {
				case BASE:
					return GL30.glGenFramebuffers();
				case ARB:
					return ARBFramebufferObject.glGenFramebuffers();
				case EXT:
					return EXTFramebufferObject.glGenFramebuffersEXT();
				default:
					return -1;
			}
		}
	}

	public static int h() {
		if (!l) {
			return -1;
		} else {
			switch (U) {
				case BASE:
					return GL30.glGenRenderbuffers();
				case ARB:
					return ARBFramebufferObject.glGenRenderbuffers();
				case EXT:
					return EXTFramebufferObject.glGenRenderbuffersEXT();
				default:
					return -1;
			}
		}
	}

	public static void a(int integer1, int integer2, int integer3, int integer4) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glRenderbufferStorage(integer1, integer2, integer3, integer4);
					break;
				case ARB:
					ARBFramebufferObject.glRenderbufferStorage(integer1, integer2, integer3, integer4);
					break;
				case EXT:
					EXTFramebufferObject.glRenderbufferStorageEXT(integer1, integer2, integer3, integer4);
			}
		}
	}

	public static void b(int integer1, int integer2, int integer3, int integer4) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glFramebufferRenderbuffer(integer1, integer2, integer3, integer4);
					break;
				case ARB:
					ARBFramebufferObject.glFramebufferRenderbuffer(integer1, integer2, integer3, integer4);
					break;
				case EXT:
					EXTFramebufferObject.glFramebufferRenderbufferEXT(integer1, integer2, integer3, integer4);
			}
		}
	}

	public static int j(int integer) {
		if (!l) {
			return -1;
		} else {
			switch (U) {
				case BASE:
					return GL30.glCheckFramebufferStatus(integer);
				case ARB:
					return ARBFramebufferObject.glCheckFramebufferStatus(integer);
				case EXT:
					return EXTFramebufferObject.glCheckFramebufferStatusEXT(integer);
				default:
					return -1;
			}
		}
	}

	public static void a(int integer1, int integer2, int integer3, int integer4, int integer5) {
		if (l) {
			switch (U) {
				case BASE:
					GL30.glFramebufferTexture2D(integer1, integer2, integer3, integer4, integer5);
					break;
				case ARB:
					ARBFramebufferObject.glFramebufferTexture2D(integer1, integer2, integer3, integer4, integer5);
					break;
				case EXT:
					EXTFramebufferObject.glFramebufferTexture2DEXT(integer1, integer2, integer3, integer4, integer5);
			}
		}
	}

	public static void k(int integer) {
		if (X) {
			ARBMultitexture.glActiveTextureARB(integer);
		} else {
			GL13.glActiveTexture(integer);
		}
	}

	public static void l(int integer) {
		if (X) {
			ARBMultitexture.glClientActiveTextureARB(integer);
		} else {
			GL13.glClientActiveTexture(integer);
		}
	}

	public static void a(int integer, float float2, float float3) {
		if (X) {
			ARBMultitexture.glMultiTexCoord2fARB(integer, float2, float3);
		} else {
			GL13.glMultiTexCoord2f(integer, float2, float3);
		}
	}

	public static void c(int integer1, int integer2, int integer3, int integer4) {
		if (Z) {
			if (M) {
				EXTBlendFuncSeparate.glBlendFuncSeparateEXT(integer1, integer2, integer3, integer4);
			} else {
				GL14.glBlendFuncSeparate(integer1, integer2, integer3, integer4);
			}
		} else {
			GL11.glBlendFunc(integer1, integer2);
		}
	}

	public static boolean j() {
		return l && bes.z().u.g;
	}

	public static String k() {
		return ab == null ? "<unknown>" : ab;
	}

	public static void m(int integer) {
		bqg.z();
		bqg.a(false);
		bqs bqs2 = bqs.a();
		bpy bpy3 = bqs2.c();
		GL11.glLineWidth(4.0F);
		bpy3.a(1, bzh.f);
		bpy3.b(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
		bpy3.b((double)integer, 0.0, 0.0).b(0, 0, 0, 255).d();
		bpy3.b(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
		bpy3.b(0.0, (double)integer, 0.0).b(0, 0, 0, 255).d();
		bpy3.b(0.0, 0.0, 0.0).b(0, 0, 0, 255).d();
		bpy3.b(0.0, 0.0, (double)integer).b(0, 0, 0, 255).d();
		bqs2.b();
		GL11.glLineWidth(2.0F);
		bpy3.a(1, bzh.f);
		bpy3.b(0.0, 0.0, 0.0).b(255, 0, 0, 255).d();
		bpy3.b((double)integer, 0.0, 0.0).b(255, 0, 0, 255).d();
		bpy3.b(0.0, 0.0, 0.0).b(0, 255, 0, 255).d();
		bpy3.b(0.0, (double)integer, 0.0).b(0, 255, 0, 255).d();
		bpy3.b(0.0, 0.0, 0.0).b(127, 127, 255, 255).d();
		bpy3.b(0.0, 0.0, (double)integer).b(127, 127, 255, 255).d();
		bqs2.b();
		GL11.glLineWidth(1.0F);
		bqg.a(true);
		bqg.y();
	}

	public static void a(File file) {
		String string2 = file.getAbsolutePath();
		if (h.a() == h.a.OSX) {
			try {
				T.info(string2);
				Runtime.getRuntime().exec(new String[]{"/usr/bin/open", string2});
				return;
			} catch (IOException var7) {
				T.error("Couldn't open file", var7);
			}
		} else if (h.a() == h.a.WINDOWS) {
			String string3 = String.format("cmd.exe /C start \"Open file\" \"%s\"", string2);

			try {
				Runtime.getRuntime().exec(string3);
				return;
			} catch (IOException var6) {
				T.error("Couldn't open file", var6);
			}
		}

		boolean boolean3 = false;

		try {
			Class<?> class4 = Class.forName("java.awt.Desktop");
			Object object5 = class4.getMethod("getDesktop").invoke(null);
			class4.getMethod("browse", URI.class).invoke(object5, file.toURI());
		} catch (Throwable var5) {
			T.error("Couldn't open link", var5);
			boolean3 = true;
		}

		if (boolean3) {
			T.info("Opening via system class!");
			Sys.openURL("file://" + string2);
		}
	}

	static enum a {
		BASE,
		ARB,
		EXT;
	}
}
