import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.Map.Entry;
import net.minecraft.client.ClientBrandRetriever;
import org.lwjgl.opengl.Display;

public class bfp extends bfi {
	private final bes a;
	private final bfg f;

	public bfp(bes bes) {
		this.a = bes;
		this.f = bes.k;
	}

	public void a(bfk bfk) {
		this.a.B.a("debug");
		bqg.G();
		this.a();
		this.b(bfk);
		bqg.H();
		if (this.a.u.av) {
			this.d();
		}

		this.a.B.b();
	}

	protected void a() {
		List<String> list2 = this.b();
		list2.add("");
		list2.add("Debug: Pie [shift]: " + (this.a.u.au ? "visible" : "hidden") + " FPS [alt]: " + (this.a.u.av ? "visible" : "hidden"));
		list2.add("For help: press F3 + Q");

		for (int integer3 = 0; integer3 < list2.size(); integer3++) {
			String string4 = (String)list2.get(integer3);
			if (!Strings.isNullOrEmpty(string4)) {
				int integer5 = this.f.a;
				int integer6 = this.f.a(string4);
				int integer7 = 2;
				int integer8 = 2 + integer5 * integer3;
				a(1, integer8 - 1, 2 + integer6 + 1, integer8 + integer5 - 1, -1873784752);
				this.f.a(string4, 2, integer8, 14737632);
			}
		}
	}

	protected void b(bfk bfk) {
		List<String> list3 = this.c();

		for (int integer4 = 0; integer4 < list3.size(); integer4++) {
			String string5 = (String)list3.get(integer4);
			if (!Strings.isNullOrEmpty(string5)) {
				int integer6 = this.f.a;
				int integer7 = this.f.a(string5);
				int integer8 = bfk.a() - 2 - integer7;
				int integer9 = 2 + integer6 * integer4;
				a(integer8 - 1, integer9 - 1, integer8 + integer7 + 1, integer9 + integer6 - 1, -1873784752);
				this.f.a(string5, integer8, integer9, 14737632);
			}
		}
	}

	protected List<String> b() {
		co co2 = new co(this.a.aa().p, this.a.aa().bo().b, this.a.aa().r);
		if (this.a.am()) {
			return Lists.newArrayList(
				new String[]{
					"Minecraft 1.11.2 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")",
					this.a.D,
					this.a.g.f(),
					this.a.g.h(),
					"P: " + this.a.j.b() + ". T: " + this.a.f.F(),
					this.a.f.G(),
					"",
					String.format("Chunk-relative: %d %d %d", co2.p() & 15, co2.q() & 15, co2.r() & 15)
				}
			);
		} else {
			sn sn3 = this.a.aa();
			cv cv4 = sn3.bl();
			String string5 = "Invalid";
			switch (cv4) {
				case NORTH:
					string5 = "Towards negative Z";
					break;
				case SOUTH:
					string5 = "Towards positive Z";
					break;
				case WEST:
					string5 = "Towards negative X";
					break;
				case EAST:
					string5 = "Towards positive X";
			}

			List<String> list6 = Lists.newArrayList(
				new String[]{
					"Minecraft 1.11.2 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ("release".equalsIgnoreCase(this.a.d()) ? "" : "/" + this.a.d()) + ")",
					this.a.D,
					this.a.g.f(),
					this.a.g.h(),
					"P: " + this.a.j.b() + ". T: " + this.a.f.F(),
					this.a.f.G(),
					"",
					String.format("XYZ: %.3f / %.5f / %.3f", this.a.aa().p, this.a.aa().bo().b, this.a.aa().r),
					String.format("Block: %d %d %d", co2.p(), co2.q(), co2.r()),
					String.format("Chunk: %d %d %d in %d %d %d", co2.p() & 15, co2.q() & 15, co2.r() & 15, co2.p() >> 4, co2.q() >> 4, co2.r() >> 4),
					String.format("Facing: %s (%s) (%.1f / %.1f)", cv4, string5, ot.g(sn3.v), ot.g(sn3.w))
				}
			);
			if (this.a.f != null) {
				auo auo7 = this.a.f.f(co2);
				if (!this.a.f.e(co2) || co2.q() < 0 || co2.q() >= 256) {
					list6.add("Outside of world...");
				} else if (!auo7.f()) {
					list6.add("Biome: " + auo7.a(co2, this.a.f.A()).l());
					list6.add("Light: " + auo7.a(co2, 0) + " (" + auo7.a(ajy.SKY, co2) + " sky, " + auo7.a(ajy.BLOCK, co2) + " block)");
					rh rh8 = this.a.f.D(co2);
					if (this.a.D() && this.a.F() != null) {
						ly ly9 = this.a.F().am().a(this.a.h.be());
						if (ly9 != null) {
							rh8 = ly9.l.D(new co(ly9));
						}
					}

					list6.add(String.format("Local Difficulty: %.2f // %.2f (Day %d)", rh8.b(), rh8.d(), this.a.f.Q() / 24000L));
				} else {
					list6.add("Waiting for chunk...");
				}
			}

			if (this.a.o != null && this.a.o.a()) {
				list6.add("Shader: " + this.a.o.f().b());
			}

			if (this.a.t != null && this.a.t.a == bdu.a.BLOCK && this.a.t.a() != null) {
				co co7 = this.a.t.a();
				list6.add(String.format("Looking at: %d %d %d", co7.p(), co7.q(), co7.r()));
			}

			return list6;
		}
	}

	protected <T extends Comparable<T>> List<String> c() {
		long long2 = Runtime.getRuntime().maxMemory();
		long long4 = Runtime.getRuntime().totalMemory();
		long long6 = Runtime.getRuntime().freeMemory();
		long long8 = long4 - long6;
		List<String> list10 = Lists.newArrayList(
			new String[]{
				String.format("Java: %s %dbit", System.getProperty("java.version"), this.a.S() ? 64 : 32),
				String.format("Mem: % 2d%% %03d/%03dMB", long8 * 100L / long2, a(long8), a(long2)),
				String.format("Allocated: % 2d%% %03dMB", long4 * 100L / long2, a(long4)),
				"",
				String.format("CPU: %s", cdb.k()),
				"",
				String.format("Display: %dx%d (%s)", Display.getWidth(), Display.getHeight(), bqg.u(7936)),
				bqg.u(7937),
				bqg.u(7938)
			}
		);
		if (this.a.am()) {
			return list10;
		} else {
			if (this.a.t != null && this.a.t.a == bdu.a.BLOCK && this.a.t.a() != null) {
				co co11 = this.a.t.a();
				atl atl12 = this.a.f.o(co11);
				if (this.a.f.L() != ajx.g) {
					atl12 = atl12.b(this.a.f, co11);
				}

				list10.add("");
				list10.add(String.valueOf(alu.h.b(atl12.v())));
				UnmodifiableIterator var12 = atl12.u().entrySet().iterator();

				while (var12.hasNext()) {
					Entry<aub<?>, Comparable<?>> entry14 = (Entry<aub<?>, Comparable<?>>)var12.next();
					aub<T> aub15 = (aub<T>)entry14.getKey();
					T comparable16 = (T)entry14.getValue();
					String string17 = aub15.a(comparable16);
					if (Boolean.TRUE.equals(comparable16)) {
						string17 = a.GREEN + string17;
					} else if (Boolean.FALSE.equals(comparable16)) {
						string17 = a.RED + string17;
					}

					list10.add(aub15.a() + ": " + string17);
				}
			}

			return list10;
		}
	}

	private void d() {
		bqg.j();
		oj oj2 = this.a.ag();
		int integer3 = oj2.a();
		int integer4 = oj2.b();
		long[] arr5 = oj2.c();
		bfk bfk6 = new bfk(this.a);
		int integer7 = integer3;
		int integer8 = 0;
		a(0, bfk6.b() - 60, 240, bfk6.b(), -1873784752);

		while (integer7 != integer4) {
			int integer9 = oj2.a(arr5[integer7], 30);
			int integer10 = this.c(ot.a(integer9, 0, 60), 0, 30, 60);
			this.b(integer8, bfk6.b(), bfk6.b() - integer9, integer10);
			integer8++;
			integer7 = oj2.b(integer7 + 1);
		}

		a(1, bfk6.b() - 30 + 1, 14, bfk6.b() - 30 + 10, -1873784752);
		this.f.a("60", 2, bfk6.b() - 30 + 2, 14737632);
		this.a(0, 239, bfk6.b() - 30, -1);
		a(1, bfk6.b() - 60 + 1, 14, bfk6.b() - 60 + 10, -1873784752);
		this.f.a("30", 2, bfk6.b() - 60 + 2, 14737632);
		this.a(0, 239, bfk6.b() - 60, -1);
		this.a(0, 239, bfk6.b() - 1, -1);
		this.b(0, bfk6.b() - 60, bfk6.b(), -1);
		this.b(239, bfk6.b() - 60, bfk6.b(), -1);
		if (this.a.u.h <= 120) {
			this.a(0, 239, bfk6.b() - 60 + this.a.u.h / 2, -16711681);
		}

		bqg.k();
	}

	private int c(int integer1, int integer2, int integer3, int integer4) {
		return integer1 < integer3
			? this.a(-16711936, -256, (float)integer1 / (float)integer3)
			: this.a(-256, -65536, (float)(integer1 - integer3) / (float)(integer4 - integer3));
	}

	private int a(int integer1, int integer2, float float3) {
		int integer5 = integer1 >> 24 & 0xFF;
		int integer6 = integer1 >> 16 & 0xFF;
		int integer7 = integer1 >> 8 & 0xFF;
		int integer8 = integer1 & 0xFF;
		int integer9 = integer2 >> 24 & 0xFF;
		int integer10 = integer2 >> 16 & 0xFF;
		int integer11 = integer2 >> 8 & 0xFF;
		int integer12 = integer2 & 0xFF;
		int integer13 = ot.a((int)((float)integer5 + (float)(integer9 - integer5) * float3), 0, 255);
		int integer14 = ot.a((int)((float)integer6 + (float)(integer10 - integer6) * float3), 0, 255);
		int integer15 = ot.a((int)((float)integer7 + (float)(integer11 - integer7) * float3), 0, 255);
		int integer16 = ot.a((int)((float)integer8 + (float)(integer12 - integer8) * float3), 0, 255);
		return integer13 << 24 | integer14 << 16 | integer15 << 8 | integer16;
	}

	private static long a(long long1) {
		return long1 / 1024L / 1024L;
	}
}
