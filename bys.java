import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bys extends byo {
	private static final Logger f = LogManager.getLogger();
	private final kq g;
	private final List<String> h;
	private final List<aem> i;

	public bys(kq kq, List<String> list2, List<aem> list3) {
		this.g = kq;
		this.h = list2;
		this.i = list3;
	}

	@Override
	public void a(bzy bzy) throws IOException {
		this.c();
		bzx bzx4 = null;

		BufferedImage bufferedImage3;
		label198: {
			try {
				bzx4 = bzy.a(this.g);
				BufferedImage bufferedImage5 = bzc.a(bzx4.b());
				int integer6 = bufferedImage5.getType();
				if (integer6 == 0) {
					integer6 = 6;
				}

				bufferedImage3 = new BufferedImage(bufferedImage5.getWidth(), bufferedImage5.getHeight(), integer6);
				Graphics graphics7 = bufferedImage3.getGraphics();
				graphics7.drawImage(bufferedImage5, 0, 0, null);
				int integer8 = 0;

				while (true) {
					if (integer8 >= 17 || integer8 >= this.h.size() || integer8 >= this.i.size()) {
						break label198;
					}

					bzx bzx9 = null;

					try {
						String string10 = (String)this.h.get(integer8);
						azt azt11 = ((aem)this.i.get(integer8)).e();
						if (string10 != null) {
							bzx9 = bzy.a(new kq(string10));
							BufferedImage bufferedImage12 = bzc.a(bzx9.b());
							if (bufferedImage12.getWidth() == bufferedImage3.getWidth()
								&& bufferedImage12.getHeight() == bufferedImage3.getHeight()
								&& bufferedImage12.getType() == 6) {
								for (int integer13 = 0; integer13 < bufferedImage12.getHeight(); integer13++) {
									for (int integer14 = 0; integer14 < bufferedImage12.getWidth(); integer14++) {
										int integer15 = bufferedImage12.getRGB(integer14, integer13);
										if ((integer15 & 0xFF000000) != 0) {
											int integer16 = (integer15 & 0xFF0000) << 8 & 0xFF000000;
											int integer17 = bufferedImage5.getRGB(integer14, integer13);
											int integer18 = ot.d(integer17, azt11.L) & 16777215;
											bufferedImage12.setRGB(integer14, integer13, integer16 | integer18);
										}
									}
								}

								bufferedImage3.getGraphics().drawImage(bufferedImage12, 0, 0, null);
							}
						}
					} finally {
						IOUtils.closeQuietly(bzx9);
					}

					integer8++;
				}
			} catch (IOException var27) {
				f.error("Couldn't load layered image", var27);
			} finally {
				IOUtils.closeQuietly(bzx4);
			}

			return;
		}

		bzc.a(this.b(), bufferedImage3);
	}
}
