import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.glu.GLU;

public class ber {
	public static synchronized int a(int integer) {
		int integer2 = bqg.t(integer);
		if (integer2 == 0) {
			int integer3 = bqg.L();
			String string4 = "No error code reported";
			if (integer3 != 0) {
				string4 = GLU.gluErrorString(integer3);
			}

			throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + integer + ", GL error (" + integer3 + "): " + string4);
		} else {
			return integer2;
		}
	}

	public static synchronized void a(int integer1, int integer2) {
		bqg.e(integer1, integer2);
	}

	public static synchronized void b(int integer) {
		a(integer, 1);
	}

	public static synchronized ByteBuffer c(int integer) {
		return ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
	}

	public static IntBuffer f(int integer) {
		return c(integer << 2).asIntBuffer();
	}

	public static FloatBuffer h(int integer) {
		return c(integer << 2).asFloatBuffer();
	}
}
