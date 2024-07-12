import java.awt.image.BufferedImage;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class byv extends byo {
	private static final Logger g = LogManager.getLogger();
	protected final kq f;

	public byv(kq kq) {
		this.f = kq;
	}

	@Override
	public void a(bzy bzy) throws IOException {
		this.c();
		bzx bzx3 = null;

		try {
			bzx3 = bzy.a(this.f);
			BufferedImage bufferedImage4 = bzc.a(bzx3.b());
			boolean boolean5 = false;
			boolean boolean6 = false;
			if (bzx3.c()) {
				try {
					cbe cbe7 = bzx3.a("texture");
					if (cbe7 != null) {
						boolean5 = cbe7.a();
						boolean6 = cbe7.b();
					}
				} catch (RuntimeException var10) {
					g.warn("Failed reading metadata of: {}", new Object[]{this.f, var10});
				}
			}

			bzc.a(this.b(), bufferedImage4, boolean5, boolean6);
		} finally {
			IOUtils.closeQuietly(bzx3);
		}
	}
}
