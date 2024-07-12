import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.annotation.Nullable;

public class bqn implements bqh {
	private int[] a;
	private int b;
	private int c;

	@Nullable
	@Override
	public BufferedImage a(BufferedImage bufferedImage) {
		if (bufferedImage == null) {
			return null;
		} else {
			this.b = 64;
			this.c = 64;
			BufferedImage bufferedImage3 = new BufferedImage(this.b, this.c, 2);
			Graphics graphics4 = bufferedImage3.getGraphics();
			graphics4.drawImage(bufferedImage, 0, 0, null);
			boolean boolean5 = bufferedImage.getHeight() == 32;
			if (boolean5) {
				graphics4.setColor(new Color(0, 0, 0, 0));
				graphics4.fillRect(0, 32, 64, 32);
				graphics4.drawImage(bufferedImage3, 24, 48, 20, 52, 4, 16, 8, 20, null);
				graphics4.drawImage(bufferedImage3, 28, 48, 24, 52, 8, 16, 12, 20, null);
				graphics4.drawImage(bufferedImage3, 20, 52, 16, 64, 8, 20, 12, 32, null);
				graphics4.drawImage(bufferedImage3, 24, 52, 20, 64, 4, 20, 8, 32, null);
				graphics4.drawImage(bufferedImage3, 28, 52, 24, 64, 0, 20, 4, 32, null);
				graphics4.drawImage(bufferedImage3, 32, 52, 28, 64, 12, 20, 16, 32, null);
				graphics4.drawImage(bufferedImage3, 40, 48, 36, 52, 44, 16, 48, 20, null);
				graphics4.drawImage(bufferedImage3, 44, 48, 40, 52, 48, 16, 52, 20, null);
				graphics4.drawImage(bufferedImage3, 36, 52, 32, 64, 48, 20, 52, 32, null);
				graphics4.drawImage(bufferedImage3, 40, 52, 36, 64, 44, 20, 48, 32, null);
				graphics4.drawImage(bufferedImage3, 44, 52, 40, 64, 40, 20, 44, 32, null);
				graphics4.drawImage(bufferedImage3, 48, 52, 44, 64, 52, 20, 56, 32, null);
			}

			graphics4.dispose();
			this.a = ((DataBufferInt)bufferedImage3.getRaster().getDataBuffer()).getData();
			this.b(0, 0, 32, 16);
			if (boolean5) {
				this.a(32, 0, 64, 32);
			}

			this.b(0, 16, 64, 32);
			this.b(16, 48, 48, 64);
			return bufferedImage3;
		}
	}

	@Override
	public void a() {
	}

	private void a(int integer1, int integer2, int integer3, int integer4) {
		for (int integer6 = integer1; integer6 < integer3; integer6++) {
			for (int integer7 = integer2; integer7 < integer4; integer7++) {
				int integer8 = this.a[integer6 + integer7 * this.b];
				if ((integer8 >> 24 & 0xFF) < 128) {
					return;
				}
			}
		}

		for (int integer6 = integer1; integer6 < integer3; integer6++) {
			for (int integer7x = integer2; integer7x < integer4; integer7x++) {
				this.a[integer6 + integer7x * this.b] = this.a[integer6 + integer7x * this.b] & 16777215;
			}
		}
	}

	private void b(int integer1, int integer2, int integer3, int integer4) {
		for (int integer6 = integer1; integer6 < integer3; integer6++) {
			for (int integer7 = integer2; integer7 < integer4; integer7++) {
				this.a[integer6 + integer7 * this.b] = this.a[integer6 + integer7 * this.b] | 0xFF000000;
			}
		}
	}
}
