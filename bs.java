import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bs extends j {
	@Override
	public String c() {
		return "testforblocks";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.compare.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 9) {
			throw new ck("commands.compare.usage");
		} else {
			n.a(o.a.AFFECTED_BLOCKS, 0);
			co co5 = a(n, arr, 0, false);
			co co6 = a(n, arr, 3, false);
			co co7 = a(n, arr, 6, false);
			axz axz8 = new axz(co5, co6);
			axz axz9 = new axz(co7, co7.a(axz8.b()));
			int integer10 = axz8.c() * axz8.d() * axz8.e();
			if (integer10 > 524288) {
				throw new cd("commands.compare.tooManyBlocks", integer10, 524288);
			} else if (axz8.b >= 0 && axz8.e < 256 && axz9.b >= 0 && axz9.e < 256) {
				ajs ajs11 = n.e();
				if (ajs11.a(axz8) && ajs11.a(axz9)) {
					boolean boolean12 = false;
					if (arr.length > 9 && "masked".equals(arr[9])) {
						boolean12 = true;
					}

					integer10 = 0;
					co co13 = new co(axz9.a - axz8.a, axz9.b - axz8.b, axz9.c - axz8.c);
					co.a a14 = new co.a();
					co.a a15 = new co.a();

					for (int integer16 = axz8.c; integer16 <= axz8.f; integer16++) {
						for (int integer17 = axz8.b; integer17 <= axz8.e; integer17++) {
							for (int integer18 = axz8.a; integer18 <= axz8.d; integer18++) {
								a14.c(integer18, integer17, integer16);
								a15.c(integer18 + co13.p(), integer17 + co13.q(), integer16 + co13.r());
								boolean boolean19 = false;
								atl atl20 = ajs11.o(a14);
								if (!boolean12 || atl20.v() != alv.a) {
									if (atl20 == ajs11.o(a15)) {
										asc asc21 = ajs11.r(a14);
										asc asc22 = ajs11.r(a15);
										if (asc21 != null && asc22 != null) {
											du du23 = asc21.b(new du());
											du23.q("x");
											du23.q("y");
											du23.q("z");
											du du24 = asc22.b(new du());
											du24.q("x");
											du24.q("y");
											du24.q("z");
											if (!du23.equals(du24)) {
												boolean19 = true;
											}
										} else if (asc21 != null) {
											boolean19 = true;
										}
									} else {
										boolean19 = true;
									}

									integer10++;
									if (boolean19) {
										throw new cd("commands.compare.failed");
									}
								}
							}
						}
					}

					n.a(o.a.AFFECTED_BLOCKS, integer10);
					a(n, this, "commands.compare.success", new Object[]{integer10});
				} else {
					throw new cd("commands.compare.outOfWorld");
				}
			} else {
				throw new cd("commands.compare.outOfWorld");
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length > 0 && arr.length <= 3) {
			return a(arr, 0, co);
		} else if (arr.length > 3 && arr.length <= 6) {
			return a(arr, 3, co);
		} else if (arr.length > 6 && arr.length <= 9) {
			return a(arr, 6, co);
		} else {
			return arr.length == 10 ? a(arr, new String[]{"masked", "all"}) : Collections.emptyList();
		}
	}
}
