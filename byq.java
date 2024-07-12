import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class byq extends byv {
	private static final Logger g = LogManager.getLogger();
	private static final AtomicInteger h = new AtomicInteger(0);
	@Nullable
	private final File i;
	private final String j;
	@Nullable
	private final bqh k;
	@Nullable
	private BufferedImage l;
	@Nullable
	private Thread m;
	private boolean n;

	public byq(@Nullable File file, String string, kq kq, @Nullable bqh bqh) {
		super(kq);
		this.i = file;
		this.j = string;
		this.k = bqh;
	}

	private void g() {
		if (!this.n) {
			if (this.l != null) {
				if (this.f != null) {
					this.c();
				}

				bzc.a(super.b(), this.l);
				this.n = true;
			}
		}
	}

	@Override
	public int b() {
		this.g();
		return super.b();
	}

	public void a(BufferedImage bufferedImage) {
		this.l = bufferedImage;
		if (this.k != null) {
			this.k.a();
		}
	}

	@Override
	public void a(bzy bzy) throws IOException {
		if (this.l == null && this.f != null) {
			super.a(bzy);
		}

		if (this.m == null) {
			if (this.i != null && this.i.isFile()) {
				g.debug("Loading http texture from local cache ({})", new Object[]{this.i});

				try {
					this.l = ImageIO.read(this.i);
					if (this.k != null) {
						this.a(this.k.a(this.l));
					}
				} catch (IOException var3) {
					g.error("Couldn't load skin {}", new Object[]{this.i, var3});
					this.d();
				}
			} else {
				this.d();
			}
		}
	}

	protected void d() {
		this.m = new Thread("Texture Downloader #" + h.incrementAndGet()) {
			public void run() {
				HttpURLConnection httpURLConnection2 = null;
				byq.g.debug("Downloading http texture from {} to {}", new Object[]{byq.this.j, byq.this.i});

				try {
					httpURLConnection2 = (HttpURLConnection)new URL(byq.this.j).openConnection(bes.z().M());
					httpURLConnection2.setDoInput(true);
					httpURLConnection2.setDoOutput(false);
					httpURLConnection2.connect();
					if (httpURLConnection2.getResponseCode() / 100 == 2) {
						BufferedImage bufferedImage3;
						if (byq.this.i != null) {
							FileUtils.copyInputStreamToFile(httpURLConnection2.getInputStream(), byq.this.i);
							bufferedImage3 = ImageIO.read(byq.this.i);
						} else {
							bufferedImage3 = bzc.a(httpURLConnection2.getInputStream());
						}

						if (byq.this.k != null) {
							bufferedImage3 = byq.this.k.a(bufferedImage3);
						}

						byq.this.a(bufferedImage3);
						return;
					}
				} catch (Exception var6) {
					byq.g.error("Couldn't download http texture", var6);
					return;
				} finally {
					if (httpURLConnection2 != null) {
						httpURLConnection2.disconnect();
					}
				}
			}
		};
		this.m.setDaemon(true);
		this.m.start();
	}
}
