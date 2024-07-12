import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class awp extends awn {
	private static final kq a = new kq("fossils/fossil_spine_01");
	private static final kq b = new kq("fossils/fossil_spine_02");
	private static final kq c = new kq("fossils/fossil_spine_03");
	private static final kq d = new kq("fossils/fossil_spine_04");
	private static final kq e = new kq("fossils/fossil_spine_01_coal");
	private static final kq f = new kq("fossils/fossil_spine_02_coal");
	private static final kq g = new kq("fossils/fossil_spine_03_coal");
	private static final kq h = new kq("fossils/fossil_spine_04_coal");
	private static final kq i = new kq("fossils/fossil_skull_01");
	private static final kq j = new kq("fossils/fossil_skull_02");
	private static final kq k = new kq("fossils/fossil_skull_03");
	private static final kq l = new kq("fossils/fossil_skull_04");
	private static final kq m = new kq("fossils/fossil_skull_01_coal");
	private static final kq n = new kq("fossils/fossil_skull_02_coal");
	private static final kq o = new kq("fossils/fossil_skull_03_coal");
	private static final kq p = new kq("fossils/fossil_skull_04_coal");
	private static final kq[] q = new kq[]{a, b, c, d, i, j, k, l};
	private static final kq[] r = new kq[]{e, f, g, h, m, n, o, p};

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		Random random5 = ajs.f(co).a(987234911L);
		MinecraftServer minecraftServer6 = ajs.u();
		aqi[] arr7 = aqi.values();
		aqi aqi8 = arr7[random5.nextInt(arr7.length)];
		int integer9 = random5.nextInt(q.length);
		ayz ayz10 = ajs.S().h();
		azc azc11 = ayz10.a(minecraftServer6, q[integer9]);
		azc azc12 = ayz10.a(minecraftServer6, r[integer9]);
		ajl ajl13 = new ajl(co);
		axz axz14 = new axz(ajl13.c(), 0, ajl13.d(), ajl13.e(), 256, ajl13.f());
		aza aza15 = new aza().a(aqi8).a(axz14).a(random5);
		co co16 = azc11.a(aqi8);
		int integer17 = random5.nextInt(16 - co16.p());
		int integer18 = random5.nextInt(16 - co16.r());
		int integer19 = 256;

		for (int integer20 = 0; integer20 < co16.p(); integer20++) {
			for (int integer21 = 0; integer21 < co16.p(); integer21++) {
				integer19 = Math.min(integer19, ajs.c(co.p() + integer20 + integer17, co.r() + integer21 + integer18));
			}
		}

		int integer20 = Math.max(integer19 - 15 - random5.nextInt(10), 10);
		co co21 = azc11.a(co.a(integer17, integer20, integer18), aou.NONE, aqi8);
		aza15.a(0.9F);
		azc11.a(ajs, co21, aza15, 20);
		aza15.a(0.1F);
		azc12.a(ajs, co21, aza15, 20);
		return true;
	}
}
