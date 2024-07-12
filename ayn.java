import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class ayn extends avu {
	private ayp a;
	protected Long2ObjectMap<ayr> c = new Long2ObjectOpenHashMap(1024);

	public abstract String a();

	@Override
	protected final synchronized void a(ajs ajs, int integer2, int integer3, int integer4, int integer5, avp avp) {
		this.a(ajs);
		if (!this.c.containsKey(ajl.a(integer2, integer3))) {
			this.f.nextInt();

			try {
				if (this.a(integer2, integer3)) {
					ayr ayr8 = this.b(integer2, integer3);
					this.c.put(ajl.a(integer2, integer3), ayr8);
					if (ayr8.a()) {
						this.a(integer2, integer3, ayr8);
					}
				}
			} catch (Throwable var10) {
				b b9 = b.a(var10, "Exception preparing structure feature");
				c c10 = b9.a("Feature being prepared");
				c10.a("Is feature chunk", new d<String>() {
					public String call() throws Exception {
						return ayn.this.a(integer2, integer3) ? "True" : "False";
					}
				});
				c10.a("Chunk location", String.format("%d,%d", integer2, integer3));
				c10.a("Chunk pos hash", new d<String>() {
					public String call() throws Exception {
						return String.valueOf(ajl.a(integer2, integer3));
					}
				});
				c10.a("Structure type", new d<String>() {
					public String call() throws Exception {
						return ayn.this.getClass().getCanonicalName();
					}
				});
				throw new f(b9);
			}
		}
	}

	public synchronized boolean a(ajs ajs, Random random, ajl ajl) {
		this.a(ajs);
		int integer5 = (ajl.a << 4) + 8;
		int integer6 = (ajl.b << 4) + 8;
		boolean boolean7 = false;
		ObjectIterator var7 = this.c.values().iterator();

		while (var7.hasNext()) {
			ayr ayr9 = (ayr)var7.next();
			if (ayr9.a() && ayr9.a(ajl) && ayr9.b().a(integer5, integer6, integer5 + 15, integer6 + 15)) {
				ayr9.a(ajs, random, new axz(integer5, integer6, integer5 + 15, integer6 + 15));
				ayr9.b(ajl);
				boolean7 = true;
				this.a(ayr9.e(), ayr9.f(), ayr9);
			}
		}

		return boolean7;
	}

	public boolean b(co co) {
		this.a(this.g);
		return this.c(co) != null;
	}

	@Nullable
	protected ayr c(co co) {
		ObjectIterator var2 = this.c.values().iterator();

		while (var2.hasNext()) {
			ayr ayr4 = (ayr)var2.next();
			if (ayr4.a() && ayr4.b().b(co)) {
				for (ayq ayq6 : ayr4.c()) {
					if (ayq6.d().b(co)) {
						return ayr4;
					}
				}
			}
		}

		return null;
	}

	public boolean a(ajs ajs, co co) {
		this.a(ajs);
		ObjectIterator var3 = this.c.values().iterator();

		while (var3.hasNext()) {
			ayr ayr5 = (ayr)var3.next();
			if (ayr5.a() && ayr5.b().b(co)) {
				return true;
			}
		}

		return false;
	}

	@Nullable
	public abstract co a(ajs ajs, co co, boolean boolean3);

	protected void a(ajs ajs) {
		if (this.a == null) {
			this.a = (ayp)ajs.a(ayp.class, this.a());
			if (this.a == null) {
				this.a = new ayp(this.a());
				ajs.a(this.a(), this.a);
			} else {
				du du3 = this.a.a();

				for (String string5 : du3.c()) {
					ei ei6 = du3.c(string5);
					if (ei6.a() == 10) {
						du du7 = (du)ei6;
						if (du7.e("ChunkX") && du7.e("ChunkZ")) {
							int integer8 = du7.h("ChunkX");
							int integer9 = du7.h("ChunkZ");
							ayr ayr10 = ayo.a(du7, ajs);
							if (ayr10 != null) {
								this.c.put(ajl.a(integer8, integer9), ayr10);
							}
						}
					}
				}
			}
		}
	}

	private void a(int integer1, int integer2, ayr ayr) {
		this.a.a(ayr.a(integer1, integer2), integer1, integer2);
		this.a.c();
	}

	protected abstract boolean a(int integer1, int integer2);

	protected abstract ayr b(int integer1, int integer2);

	protected static co a(ajs ajs, ayn ayn, co co, int integer4, int integer5, int integer6, boolean boolean7, int integer8, boolean boolean9) {
		int integer10 = co.p() >> 4;
		int integer11 = co.r() >> 4;
		int integer12 = 0;

		for (Random random13 = new Random(); integer12 <= integer8; integer12++) {
			for (int integer14 = -integer12; integer14 <= integer12; integer14++) {
				boolean boolean15 = integer14 == -integer12 || integer14 == integer12;

				for (int integer16 = -integer12; integer16 <= integer12; integer16++) {
					boolean boolean17 = integer16 == -integer12 || integer16 == integer12;
					if (boolean15 || boolean17) {
						int integer18 = integer10 + integer4 * integer14;
						int integer19 = integer11 + integer4 * integer16;
						if (integer18 < 0) {
							integer18 -= integer4 - 1;
						}

						if (integer19 < 0) {
							integer19 -= integer4 - 1;
						}

						int integer20 = integer18 / integer4;
						int integer21 = integer19 / integer4;
						Random random22 = ajs.a(integer20, integer21, integer6);
						integer20 *= integer4;
						integer21 *= integer4;
						if (boolean7) {
							integer20 += (random22.nextInt(integer4 - integer5) + random22.nextInt(integer4 - integer5)) / 2;
							integer21 += (random22.nextInt(integer4 - integer5) + random22.nextInt(integer4 - integer5)) / 2;
						} else {
							integer20 += random22.nextInt(integer4 - integer5);
							integer21 += random22.nextInt(integer4 - integer5);
						}

						avu.a(ajs.O(), random13, integer20, integer21);
						random13.nextInt();
						if (ayn.a(integer20, integer21)) {
							if (!boolean9 || !ajs.b(integer20, integer21)) {
								return new co((integer20 << 4) + 8, 64, (integer21 << 4) + 8);
							}
						} else if (integer12 == 0) {
							break;
						}
					}
				}

				if (integer12 == 0) {
					break;
				}
			}
		}

		return null;
	}
}
