import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;

public class bew {
	private static final Logger a = LogManager.getLogger();
	private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
	private static IntBuffer c;
	private static int[] d;

	public static fb a(File file, int integer2, int integer3, bqr bqr) {
		return a(file, null, integer2, integer3, bqr);
	}

	public static fb a(File file, String string, int integer3, int integer4, bqr bqr) {
		try {
			File file6 = new File(file, "screenshots");
			file6.mkdir();
			BufferedImage bufferedImage7 = a(integer3, integer4, bqr);
			File file8;
			if (string == null) {
				file8 = a(file6);
			} else {
				file8 = new File(file6, string);
			}

			ImageIO.write(bufferedImage7, "png", file8);
			fb fb9 = new fh(file8.getName());
			fb9.b().a(new fa(fa.a.OPEN_FILE, file8.getAbsolutePath()));
			fb9.b().d(true);
			return new fi("screenshot.success", fb9);
		} catch (Exception var9) {
			a.warn("Couldn't save screenshot", var9);
			return new fi("screenshot.failure", var9.getMessage());
		}
	}

	public static BufferedImage a(int integer1, int integer2, bqr bqr) {
		if (cdb.j()) {
			integer1 = bqr.a;
			integer2 = bqr.b;
		}

		int integer4 = integer1 * integer2;
		if (c == null || c.capacity() < integer4) {
			c = BufferUtils.createIntBuffer(integer4);
			d = new int[integer4];
		}

		bqg.g(3333, 1);
		bqg.g(3317, 1);
		c.clear();
		if (cdb.j()) {
			bqg.i(bqr.g);
			bqg.a(3553, 0, 32993, 33639, c);
		} else {
			bqg.a(0, 0, integer1, integer2, 32993, 33639, c);
		}

		c.get(d);
		bzc.a(d, integer1, integer2);
		BufferedImage bufferedImage5 = new BufferedImage(integer1, integer2, 1);
		bufferedImage5.setRGB(0, 0, integer1, integer2, d, 0, integer1);
		return bufferedImage5;
	}

	private static File a(File file) {
		String string3 = b.format(new Date()).toString();
		int integer4 = 1;

		while (true) {
			File file2 = new File(file, string3 + (integer4 == 1 ? "" : "_" + integer4) + ".png");
			if (!file2.exists()) {
				return file2;
			}

			integer4++;
		}
	}
}
