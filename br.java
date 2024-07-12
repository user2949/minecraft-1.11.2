import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class br extends j {
	@Override
	public String c() {
		return "testforblock";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.testforblock.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 4) {
			throw new ck("commands.testforblock.usage");
		} else {
			n.a(o.a.AFFECTED_BLOCKS, 0);
			co co5 = a(n, arr, 0, false);
			alu alu6 = b(n, arr[3]);
			if (alu6 == null) {
				throw new cg("commands.setblock.notFound", arr[3]);
			} else {
				ajs ajs7 = n.e();
				if (!ajs7.e(co5)) {
					throw new cd("commands.testforblock.outOfWorld");
				} else {
					du du8 = new du();
					boolean boolean9 = false;
					if (arr.length >= 6 && alu6.l()) {
						String string10 = a(n, arr, 5).c();

						try {
							du8 = ek.a(string10);
							boolean9 = true;
						} catch (ej var14) {
							throw new cd("commands.setblock.tagError", var14.getMessage());
						}
					}

					atl atl10 = ajs7.o(co5);
					alu alu11 = atl10.v();
					if (alu11 != alu6) {
						throw new cd("commands.testforblock.failed.tile", co5.p(), co5.q(), co5.r(), alu11.c(), alu6.c());
					} else if (arr.length >= 5 && !j.b(alu6, arr[4]).apply(atl10)) {
						try {
							int integer12 = atl10.v().e(atl10);
							throw new cd("commands.testforblock.failed.data", co5.p(), co5.q(), co5.r(), integer12, Integer.parseInt(arr[4]));
						} catch (NumberFormatException var13) {
							throw new cd("commands.testforblock.failed.data", co5.p(), co5.q(), co5.r(), atl10.toString(), arr[4]);
						}
					} else {
						if (boolean9) {
							asc asc12 = ajs7.r(co5);
							if (asc12 == null) {
								throw new cd("commands.testforblock.failed.tileEntity", co5.p(), co5.q(), co5.r());
							}

							du du13 = asc12.b(new du());
							if (!ee.a(du8, du13, true)) {
								throw new cd("commands.testforblock.failed.nbt", co5.p(), co5.q(), co5.r());
							}
						}

						n.a(o.a.AFFECTED_BLOCKS, 1);
						a(n, this, "commands.testforblock.success", new Object[]{co5.p(), co5.q(), co5.r()});
					}
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length > 0 && arr.length <= 3) {
			return a(arr, 0, co);
		} else {
			return arr.length == 4 ? a(arr, alu.h.c()) : Collections.emptyList();
		}
	}
}
