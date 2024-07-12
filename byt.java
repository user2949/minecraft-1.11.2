import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class byt extends byo {
	private static final Logger g = LogManager.getLogger();
	public final List<String> f;

	public byt(String... arr) {
		this.f = Lists.newArrayList(arr);
	}

	@Override
	public void a(bzy bzy) throws IOException {
		this.c();
		BufferedImage bufferedImage3 = null;

		for (String string5 : this.f) {
			bzx bzx6 = null;

			try {
				if (string5 != null) {
					bzx6 = bzy.a(new kq(string5));
					BufferedImage bufferedImage7 = bzc.a(bzx6.b());
					if (bufferedImage3 == null) {
						bufferedImage3 = new BufferedImage(bufferedImage7.getWidth(), bufferedImage7.getHeight(), 2);
					}

					bufferedImage3.getGraphics().drawImage(bufferedImage7, 0, 0, null);
				}
				continue;
			} catch (IOException var10) {
				g.error("Couldn't load layered image", var10);
			} finally {
				IOUtils.closeQuietly(bzx6);
			}

			return;
		}

		bzc.a(this.b(), bufferedImage3);
	}
}
