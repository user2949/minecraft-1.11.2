import java.awt.image.BufferedImage;
import java.io.IOException;

public class byp extends byo {
	private final int[] f;
	private final int g;
	private final int h;

	public byp(BufferedImage bufferedImage) {
		this(bufferedImage.getWidth(), bufferedImage.getHeight());
		bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.f, 0, bufferedImage.getWidth());
		this.d();
	}

	public byp(int integer1, int integer2) {
		this.g = integer1;
		this.h = integer2;
		this.f = new int[integer1 * integer2];
		bzc.a(this.b(), integer1, integer2);
	}

	@Override
	public void a(bzy bzy) throws IOException {
	}

	public void d() {
		bzc.a(this.b(), this.f, this.g, this.h);
	}

	public int[] e() {
		return this.f;
	}
}
