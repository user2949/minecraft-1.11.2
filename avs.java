import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class avs implements aui {
	private final ajs a;
	private final Random b;
	private final atl[] c = new atl[256];
	private final axu d;
	private final Map<String, ayn> e = new HashMap();
	private final boolean f;
	private final boolean g;
	private awx h;
	private awx i;

	public avs(ajs ajs, long long2, boolean boolean3, String string) {
		this.a = ajs;
		this.b = new Random(long2);
		this.d = axu.a(string);
		if (boolean3) {
			Map<String, Map<String, String>> map7 = this.d.b();
			if (map7.containsKey("village")) {
				Map<String, String> map8 = (Map<String, String>)map7.get("village");
				if (!map8.containsKey("size")) {
					map8.put("size", "1");
				}

				this.e.put("Village", new ayt(map8));
			}

			if (map7.containsKey("biome_1")) {
				this.e.put("Temple", new ayj((Map<String, String>)map7.get("biome_1")));
			}

			if (map7.containsKey("mineshaft")) {
				this.e.put("Mineshaft", new ayc((Map<String, String>)map7.get("mineshaft")));
			}

			if (map7.containsKey("stronghold")) {
				this.e.put("Stronghold", new ayl((Map<String, String>)map7.get("stronghold")));
			}

			if (map7.containsKey("oceanmonument")) {
				this.e.put("Monument", new ayh((Map<String, String>)map7.get("oceanmonument")));
			}
		}

		if (this.d.b().containsKey("lake")) {
			this.h = new awx(alv.j);
		}

		if (this.d.b().containsKey("lava_lake")) {
			this.i = new awx(alv.l);
		}

		this.g = this.d.b().containsKey("dungeon");
		int integer7 = 0;
		int integer8 = 0;
		boolean boolean9 = true;

		for (axv axv11 : this.d.c()) {
			for (int integer12 = axv11.d(); integer12 < axv11.d() + axv11.b(); integer12++) {
				atl atl13 = axv11.c();
				if (atl13.v() != alv.a) {
					boolean9 = false;
					this.c[integer12] = atl13;
				}
			}

			if (axv11.c().v() == alv.a) {
				integer8 += axv11.b();
			} else {
				integer7 += axv11.b() + integer8;
				integer8 = 0;
			}
		}

		ajs.b(integer7);
		this.f = boolean9 && this.d.a() != akf.a(akk.P) ? false : this.d.b().containsKey("decoration");
	}

	@Override
	public auo a(int integer1, int integer2) {
		avp avp4 = new avp();

		for (int integer5 = 0; integer5 < this.c.length; integer5++) {
			atl atl6 = this.c[integer5];
			if (atl6 != null) {
				for (int integer7 = 0; integer7 < 16; integer7++) {
					for (int integer8 = 0; integer8 < 16; integer8++) {
						avp4.a(integer7, integer5, integer8, atl6);
					}
				}
			}
		}

		for (avu avu6 : this.e.values()) {
			avu6.a(this.a, integer1, integer2, avp4);
		}

		auo auo5 = new auo(this.a, avp4, integer1, integer2);
		akf[] arr6 = this.a.A().b(null, integer1 * 16, integer2 * 16, 16, 16);
		byte[] arr7 = auo5.l();

		for (int integer8 = 0; integer8 < arr7.length; integer8++) {
			arr7[integer8] = (byte)akf.a(arr6[integer8]);
		}

		auo5.b();
		return auo5;
	}

	@Override
	public void b(int integer1, int integer2) {
		int integer4 = integer1 * 16;
		int integer5 = integer2 * 16;
		co co6 = new co(integer4, 0, integer5);
		akf akf7 = this.a.b(new co(integer4 + 16, 0, integer5 + 16));
		boolean boolean8 = false;
		this.b.setSeed(this.a.O());
		long long9 = this.b.nextLong() / 2L * 2L + 1L;
		long long11 = this.b.nextLong() / 2L * 2L + 1L;
		this.b.setSeed((long)integer1 * long9 + (long)integer2 * long11 ^ this.a.O());
		ajl ajl13 = new ajl(integer1, integer2);

		for (ayn ayn15 : this.e.values()) {
			boolean boolean16 = ayn15.a(this.a, this.b, ajl13);
			if (ayn15 instanceof ayt) {
				boolean8 |= boolean16;
			}
		}

		if (this.h != null && !boolean8 && this.b.nextInt(4) == 0) {
			this.h.b(this.a, this.b, co6.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
		}

		if (this.i != null && !boolean8 && this.b.nextInt(8) == 0) {
			co co14 = co6.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8);
			if (co14.q() < this.a.K() || this.b.nextInt(10) == 0) {
				this.i.b(this.a, this.b, co14);
			}
		}

		if (this.g) {
			for (int integer14 = 0; integer14 < 8; integer14++) {
				new axd().b(this.a, this.b, co6.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
			}
		}

		if (this.f) {
			akf7.a(this.a, this.b, co6);
		}
	}

	@Override
	public boolean a(auo auo, int integer2, int integer3) {
		return false;
	}

	@Override
	public List<akf.c> a(sy sy, co co) {
		akf akf4 = this.a.b(co);
		return akf4.a(sy);
	}

	@Nullable
	@Override
	public co a(ajs ajs, String string, co co, boolean boolean4) {
		ayn ayn6 = (ayn)this.e.get(string);
		return ayn6 != null ? ayn6.a(ajs, co, boolean4) : null;
	}

	@Override
	public void b(auo auo, int integer2, int integer3) {
		for (ayn ayn6 : this.e.values()) {
			ayn6.a(this.a, integer2, integer3, null);
		}
	}
}
