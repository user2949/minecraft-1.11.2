import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ccs implements bzz, lf {
	public static final cbz a = new cbz("meta:missing_sound", 1.0F, 1.0F, 1, cbz.a.FILE, false);
	private static final Logger b = LogManager.getLogger();
	private static final Gson c = new GsonBuilder().registerTypeHierarchyAdapter(fb.class, new fb.a()).registerTypeAdapter(cca.class, new ccb()).create();
	private static final ParameterizedType d = new ParameterizedType() {
		public Type[] getActualTypeArguments() {
			return new Type[]{String.class, cca.class};
		}

		public Type getRawType() {
			return Map.class;
		}

		public Type getOwnerType() {
			return null;
		}
	};
	private final cct e = new cct();
	private final ccq f;
	private final bzy g;

	public ccs(bzy bzy, beu beu) {
		this.g = bzy;
		this.f = new ccq(this, beu);
	}

	@Override
	public void a(bzy bzy) {
		this.e.a();

		for (String string4 : bzy.a()) {
			try {
				for (bzx bzx7 : bzy.b(new kq(string4, "sounds.json"))) {
					try {
						Map<String, cca> map8 = this.a(bzx7.b());

						for (Entry<String, cca> entry10 : map8.entrySet()) {
							this.a(new kq(string4, (String)entry10.getKey()), (cca)entry10.getValue());
						}
					} catch (RuntimeException var10) {
						b.warn("Invalid sounds.json", var10);
					}
				}
			} catch (IOException var11) {
			}
		}

		for (kq kq4 : this.e.c()) {
			ccu ccu5 = this.e.c(kq4);
			if (ccu5.c() instanceof fi) {
				String string6 = ((fi)ccu5.c()).i();
				if (!cah.a(string6)) {
					b.debug("Missing subtitle {} for event: {}", new Object[]{string6, kq4});
				}
			}
		}

		for (kq kq4x : this.e.c()) {
			if (nm.a.c(kq4x) == null) {
				b.debug("Not having sound event for: {}", new Object[]{kq4x});
			}
		}

		this.f.a();
	}

	protected Map<String, cca> a(InputStream inputStream) {
		Map var2;
		try {
			var2 = (Map)c.fromJson(new InputStreamReader(inputStream), d);
		} finally {
			IOUtils.closeQuietly(inputStream);
		}

		return var2;
	}

	private void a(kq kq, cca cca) {
		ccu ccu4 = this.e.c(kq);
		boolean boolean5 = ccu4 == null;
		if (boolean5 || cca.b()) {
			if (!boolean5) {
				b.debug("Replaced sound event location {}", new Object[]{kq});
			}

			ccu4 = new ccu(kq, cca.c());
			this.e.a(ccu4);
		}

		for (cbz cbz7 : cca.a()) {
			final kq kq8 = cbz7.a();
			ccv<cbz> ccv9;
			switch (cbz7.g()) {
				case FILE:
					if (!this.a(cbz7, kq)) {
						continue;
					}

					ccv9 = cbz7;
					break;
				case SOUND_EVENT:
					ccv9 = new ccv<cbz>() {
						@Override
						public int e() {
							ccu ccu2 = ccs.this.e.c(kq8);
							return ccu2 == null ? 0 : ccu2.e();
						}

						public cbz i() {
							ccu ccu2 = ccs.this.e.c(kq8);
							return ccu2 == null ? ccs.a : ccu2.a();
						}
					};
					break;
				default:
					throw new IllegalStateException("Unknown SoundEventRegistration type: " + cbz7.g());
			}

			ccu4.a(ccv9);
		}
	}

	private boolean a(cbz cbz, kq kq) {
		kq kq4 = cbz.b();
		bzx bzx5 = null;

		boolean var6;
		try {
			bzx5 = this.g.a(kq4);
			bzx5.b();
			return true;
		} catch (FileNotFoundException var11) {
			b.warn("File {} does not exist, cannot add it to event {}", new Object[]{kq4, kq});
			return false;
		} catch (IOException var12) {
			b.warn("Could not load sound file {}, cannot add it to event {}", new Object[]{kq4, kq, var12});
			var6 = false;
		} finally {
			IOUtils.closeQuietly(bzx5);
		}

		return var6;
	}

	@Nullable
	public ccu a(kq kq) {
		return this.e.c(kq);
	}

	public void a(ccc ccc) {
		this.f.c(ccc);
	}

	public void a(ccc ccc, int integer) {
		this.f.a(ccc, integer);
	}

	public void a(aay aay, float float2) {
		this.f.a(aay, float2);
	}

	public void a() {
		this.f.e();
	}

	public void b() {
		this.f.c();
	}

	public void c() {
		this.f.b();
	}

	@Override
	public void F_() {
		this.f.d();
	}

	public void d() {
		this.f.f();
	}

	public void a(no no, float float2) {
		if (no == no.MASTER && float2 <= 0.0F) {
			this.b();
		}

		this.f.a(no, float2);
	}

	public void b(ccc ccc) {
		this.f.b(ccc);
	}

	public boolean c(ccc ccc) {
		return this.f.a(ccc);
	}

	public void a(ccr ccr) {
		this.f.a(ccr);
	}

	public void b(ccr ccr) {
		this.f.b(ccr);
	}

	public void a(String string, no no) {
		this.f.a(string, no);
	}
}
