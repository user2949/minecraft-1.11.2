import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import io.netty.util.internal.ThreadLocalRandom;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class ccq {
	private static final Marker a = MarkerManager.getMarker("SOUNDS");
	private static final Logger b = LogManager.getLogger();
	private static final Set<kq> c = Sets.newHashSet();
	private final ccs d;
	private final beu e;
	private ccq.a f;
	private boolean g;
	private int h;
	private final Map<String, ccc> i = HashBiMap.create();
	private final Map<ccc, String> j = ((BiMap)this.i).inverse();
	private final Multimap<no, String> k = HashMultimap.create();
	private final List<ccd> l = Lists.newArrayList();
	private final Map<ccc, Integer> m = Maps.newHashMap();
	private final Map<String, Integer> n = Maps.newHashMap();
	private final List<ccr> o = Lists.newArrayList();
	private final List<String> p = Lists.newArrayList();

	public ccq(ccs ccs, beu beu) {
		this.d = ccs;
		this.e = beu;

		try {
			SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
			SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
		} catch (SoundSystemException var4) {
			b.error(a, "Error linking with the LibraryJavaSound plug-in", var4);
		}
	}

	public void a() {
		c.clear();

		for (nm nm3 : nm.a) {
			kq kq4 = nm3.a();
			if (this.d.a(kq4) == null) {
				b.warn("Missing sound for event: {}", new Object[]{nm.a.b(nm3)});
				c.add(kq4);
			}
		}

		this.b();
		this.i();
	}

	private synchronized void i() {
		if (!this.g) {
			try {
				new Thread(new Runnable() {
					public void run() {
						SoundSystemConfig.setLogger(new SoundSystemLogger() {
							public void message(String string, int integer) {
								if (!string.isEmpty()) {
									ccq.b.info(string);
								}
							}

							public void importantMessage(String string, int integer) {
								if (!string.isEmpty()) {
									ccq.b.warn(string);
								}
							}

							public void errorMessage(String string1, String string2, int integer) {
								if (!string2.isEmpty()) {
									ccq.b.error("Error in class '{}'", new Object[]{string1});
									ccq.b.error(string2);
								}
							}
						});
						ccq.this.f = ccq.this.new a();
						ccq.this.g = true;
						ccq.this.f.setMasterVolume(ccq.this.e.a(no.MASTER));
						ccq.b.info(ccq.a, "Sound engine started");
					}
				}, "Sound Library Loader").start();
			} catch (RuntimeException var2) {
				b.error(a, "Error starting SoundSystem. Turning off sounds & music", var2);
				this.e.a(no.MASTER, 0.0F);
				this.e.b();
			}
		}
	}

	private float a(no no) {
		return no != null && no != no.MASTER ? this.e.a(no) : 1.0F;
	}

	public void a(no no, float float2) {
		if (this.g) {
			if (no == no.MASTER) {
				this.f.setMasterVolume(float2);
			} else {
				for (String string5 : this.k.get(no)) {
					ccc ccc6 = (ccc)this.i.get(string5);
					float float7 = this.e(ccc6);
					if (float7 <= 0.0F) {
						this.b(ccc6);
					} else {
						this.f.setVolume(string5, float7);
					}
				}
			}
		}
	}

	public void b() {
		if (this.g) {
			this.c();
			this.f.cleanup();
			this.g = false;
		}
	}

	public void c() {
		if (this.g) {
			for (String string3 : this.i.keySet()) {
				this.f.stop(string3);
			}

			this.i.clear();
			this.m.clear();
			this.l.clear();
			this.k.clear();
			this.n.clear();
		}
	}

	public void a(ccr ccr) {
		this.o.add(ccr);
	}

	public void b(ccr ccr) {
		this.o.remove(ccr);
	}

	public void d() {
		this.h++;

		for (ccd ccd3 : this.l) {
			ccd3.F_();
			if (ccd3.l()) {
				this.b(ccd3);
			} else {
				String string4 = (String)this.j.get(ccd3);
				this.f.setVolume(string4, this.e(ccd3));
				this.f.setPitch(string4, this.d(ccd3));
				this.f.setPosition(string4, ccd3.h(), ccd3.i(), ccd3.j());
			}
		}

		Iterator<Entry<String, ccc>> iterator2 = this.i.entrySet().iterator();

		while (iterator2.hasNext()) {
			Entry<String, ccc> entry3 = (Entry<String, ccc>)iterator2.next();
			String string4 = (String)entry3.getKey();
			ccc ccc5 = (ccc)entry3.getValue();
			if (!this.f.playing(string4)) {
				int integer6 = (Integer)this.n.get(string4);
				if (integer6 <= this.h) {
					int integer7 = ccc5.e();
					if (ccc5.d() && integer7 > 0) {
						this.m.put(ccc5, this.h + integer7);
					}

					iterator2.remove();
					b.debug(a, "Removed channel {} because it's not playing anymore", new Object[]{string4});
					this.f.removeSource(string4);
					this.n.remove(string4);

					try {
						this.k.remove(ccc5.c(), string4);
					} catch (RuntimeException var8) {
					}

					if (ccc5 instanceof ccd) {
						this.l.remove(ccc5);
					}
				}
			}
		}

		Iterator<Entry<ccc, Integer>> iterator3 = this.m.entrySet().iterator();

		while (iterator3.hasNext()) {
			Entry<ccc, Integer> entry4 = (Entry<ccc, Integer>)iterator3.next();
			if (this.h >= (Integer)entry4.getValue()) {
				ccc ccc5 = (ccc)entry4.getKey();
				if (ccc5 instanceof ccd) {
					((ccd)ccc5).F_();
				}

				this.c(ccc5);
				iterator3.remove();
			}
		}
	}

	public boolean a(ccc ccc) {
		if (!this.g) {
			return false;
		} else {
			String string3 = (String)this.j.get(ccc);
			return string3 == null ? false : this.f.playing(string3) || this.n.containsKey(string3) && (Integer)this.n.get(string3) <= this.h;
		}
	}

	public void b(ccc ccc) {
		if (this.g) {
			String string3 = (String)this.j.get(ccc);
			if (string3 != null) {
				this.f.stop(string3);
			}
		}
	}

	public void c(ccc ccc) {
		if (this.g) {
			ccu ccu3 = ccc.a(this.d);
			kq kq4 = ccc.a();
			if (ccu3 == null) {
				if (c.add(kq4)) {
					b.warn(a, "Unable to play unknown soundEvent: {}", new Object[]{kq4});
				}
			} else {
				if (!this.o.isEmpty()) {
					for (ccr ccr6 : this.o) {
						ccr6.a(ccc, ccu3);
					}
				}

				if (this.f.getMasterVolume() <= 0.0F) {
					b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[]{kq4});
				} else {
					cbz cbz5 = ccc.b();
					if (cbz5 == ccs.a) {
						if (c.add(kq4)) {
							b.warn(a, "Unable to play empty soundEvent: {}", new Object[]{kq4});
						}
					} else {
						float float6 = ccc.f();
						float float7 = 16.0F;
						if (float6 > 1.0F) {
							float7 *= float6;
						}

						no no8 = ccc.c();
						float float9 = this.e(ccc);
						float float10 = this.d(ccc);
						if (float9 == 0.0F) {
							b.debug(a, "Skipped playing sound {}, volume was zero.", new Object[]{cbz5.a()});
						} else {
							boolean boolean11 = ccc.d() && ccc.e() == 0;
							String string12 = ot.a(ThreadLocalRandom.current()).toString();
							kq kq13 = cbz5.b();
							if (cbz5.h()) {
								this.f.newStreamingSource(false, string12, a(kq13), kq13.toString(), boolean11, ccc.h(), ccc.i(), ccc.j(), ccc.k().a(), float7);
							} else {
								this.f.newSource(false, string12, a(kq13), kq13.toString(), boolean11, ccc.h(), ccc.i(), ccc.j(), ccc.k().a(), float7);
							}

							b.debug(a, "Playing sound {} for event {} as channel {}", new Object[]{cbz5.a(), kq4, string12});
							this.f.setPitch(string12, float10);
							this.f.setVolume(string12, float9);
							this.f.play(string12);
							this.n.put(string12, this.h + 20);
							this.i.put(string12, ccc);
							this.k.put(no8, string12);
							if (ccc instanceof ccd) {
								this.l.add((ccd)ccc);
							}
						}
					}
				}
			}
		}
	}

	private float d(ccc ccc) {
		return ot.a(ccc.g(), 0.5F, 2.0F);
	}

	private float e(ccc ccc) {
		return ot.a(ccc.f() * this.a(ccc.c()), 0.0F, 1.0F);
	}

	public void e() {
		for (Entry<String, ccc> entry3 : this.i.entrySet()) {
			String string4 = (String)entry3.getKey();
			boolean boolean5 = this.a((ccc)entry3.getValue());
			if (boolean5) {
				b.debug(a, "Pausing channel {}", new Object[]{string4});
				this.f.pause(string4);
				this.p.add(string4);
			}
		}
	}

	public void f() {
		for (String string3 : this.p) {
			b.debug(a, "Resuming channel {}", new Object[]{string3});
			this.f.play(string3);
		}

		this.p.clear();
	}

	public void a(ccc ccc, int integer) {
		this.m.put(ccc, this.h + integer);
	}

	private static URL a(kq kq) {
		String string2 = String.format("%s:%s:%s", "mcsounddomain", kq.b(), kq.a());
		URLStreamHandler uRLStreamHandler3 = new URLStreamHandler() {
			protected URLConnection openConnection(URL uRL) {
				return new URLConnection(uRL) {
					public void connect() {
					}

					public InputStream getInputStream() throws IOException {
						return bes.z().O().a(kq).b();
					}
				};
			}
		};

		try {
			return new URL(null, string2, uRLStreamHandler3);
		} catch (MalformedURLException var4) {
			throw new Error("TODO: Sanely handle url exception! :D");
		}
	}

	public void a(aay aay, float float2) {
		if (this.g && aay != null) {
			float float4 = aay.y + (aay.w - aay.y) * float2;
			float float5 = aay.x + (aay.v - aay.x) * float2;
			double double6 = aay.m + (aay.p - aay.m) * (double)float2;
			double double8 = aay.n + (aay.q - aay.n) * (double)float2 + (double)aay.bq();
			double double10 = aay.o + (aay.r - aay.o) * (double)float2;
			float float12 = ot.b((float5 + 90.0F) * (float) (Math.PI / 180.0));
			float float13 = ot.a((float5 + 90.0F) * (float) (Math.PI / 180.0));
			float float14 = ot.b(-float4 * (float) (Math.PI / 180.0));
			float float15 = ot.a(-float4 * (float) (Math.PI / 180.0));
			float float16 = ot.b((-float4 + 90.0F) * (float) (Math.PI / 180.0));
			float float17 = ot.a((-float4 + 90.0F) * (float) (Math.PI / 180.0));
			float float18 = float12 * float14;
			float float20 = float13 * float14;
			float float21 = float12 * float16;
			float float23 = float13 * float16;
			this.f.setListenerPosition((float)double6, (float)double8, (float)double10);
			this.f.setListenerOrientation(float18, float15, float20, float21, float17, float23);
		}
	}

	public void a(String string, no no) {
		if (no != null) {
			for (String string5 : this.k.get(no)) {
				ccc ccc6 = (ccc)this.i.get(string5);
				if (string.isEmpty()) {
					this.b(ccc6);
				} else if (ccc6.a().equals(new kq(string))) {
					this.b(ccc6);
				}
			}
		} else if (string.isEmpty()) {
			this.c();
		} else {
			for (ccc ccc5 : this.i.values()) {
				if (ccc5.a().equals(new kq(string))) {
					this.b(ccc5);
				}
			}
		}
	}

	class a extends SoundSystem {
		private a() {
		}

		public boolean playing(String string) {
			synchronized (SoundSystemConfig.THREAD_SYNC) {
				if (this.soundLibrary == null) {
					return false;
				} else {
					Source source4 = (Source)this.soundLibrary.getSources().get(string);
					return source4 == null ? false : source4.playing() || source4.paused() || source4.preLoad;
				}
			}
		}
	}
}
