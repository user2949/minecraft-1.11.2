import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ag extends j {
	@Override
	public String c() {
		return "fill";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.fill.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 7) {
			throw new ck("commands.fill.usage");
		} else {
			n.a(o.a.AFFECTED_BLOCKS, 0);
			co co5 = a(n, arr, 0, false);
			co co6 = a(n, arr, 3, false);
			alu alu7 = j.b(n, arr[6]);
			atl atl8;
			if (arr.length >= 8) {
				atl8 = a(alu7, arr[7]);
			} else {
				atl8 = alu7.t();
			}

			co co9 = new co(Math.min(co5.p(), co6.p()), Math.min(co5.q(), co6.q()), Math.min(co5.r(), co6.r()));
			co co10 = new co(Math.max(co5.p(), co6.p()), Math.max(co5.q(), co6.q()), Math.max(co5.r(), co6.r()));
			int integer11 = (co10.p() - co9.p() + 1) * (co10.q() - co9.q() + 1) * (co10.r() - co9.r() + 1);
			if (integer11 > 32768) {
				throw new cd("commands.fill.tooManyBlocks", integer11, 32768);
			} else if (co9.q() >= 0 && co10.q() < 256) {
				ajs ajs12 = n.e();

				for (int integer13 = co9.r(); integer13 <= co10.r(); integer13 += 16) {
					for (int integer14 = co9.p(); integer14 <= co10.p(); integer14 += 16) {
						if (!ajs12.e(new co(integer14, co10.q() - co9.q(), integer13))) {
							throw new cd("commands.fill.outOfWorld");
						}
					}
				}

				du du13 = new du();
				boolean boolean14 = false;
				if (arr.length >= 10 && alu7.l()) {
					String string15 = a(n, arr, 9).c();

					try {
						du13 = ek.a(string15);
						boolean14 = true;
					} catch (ej var21) {
						throw new cd("commands.fill.tagError", var21.getMessage());
					}
				}

				List<co> list15 = Lists.newArrayList();
				integer11 = 0;

				for (int integer16 = co9.r(); integer16 <= co10.r(); integer16++) {
					for (int integer17 = co9.q(); integer17 <= co10.q(); integer17++) {
						for (int integer18 = co9.p(); integer18 <= co10.p(); integer18++) {
							co co19 = new co(integer18, integer17, integer16);
							if (arr.length >= 9) {
								if (!"outline".equals(arr[8]) && !"hollow".equals(arr[8])) {
									if ("destroy".equals(arr[8])) {
										ajs12.b(co19, true);
									} else if ("keep".equals(arr[8])) {
										if (!ajs12.d(co19)) {
											continue;
										}
									} else if ("replace".equals(arr[8]) && !alu7.l() && arr.length > 9) {
										alu alu20 = j.b(n, arr[9]);
										if (ajs12.o(co19).v() != alu20 || arr.length > 10 && !"-1".equals(arr[10]) && !"*".equals(arr[10]) && !j.b(alu20, arr[10]).apply(ajs12.o(co19))) {
											continue;
										}
									}
								} else if (integer18 != co9.p()
									&& integer18 != co10.p()
									&& integer17 != co9.q()
									&& integer17 != co10.q()
									&& integer16 != co9.r()
									&& integer16 != co10.r()) {
									if ("hollow".equals(arr[8])) {
										ajs12.a(co19, alv.a.t(), 2);
										list15.add(co19);
									}
									continue;
								}
							}

							asc asc20 = ajs12.r(co19);
							if (asc20 != null) {
								if (asc20 instanceof rc) {
									((rc)asc20).m();
								}

								ajs12.a(co19, alv.cv.t(), alu7 == alv.cv ? 2 : 4);
							}

							if (ajs12.a(co19, atl8, 2)) {
								list15.add(co19);
								integer11++;
								if (boolean14) {
									asc asc21 = ajs12.r(co19);
									if (asc21 != null) {
										du13.a("x", co19.p());
										du13.a("y", co19.q());
										du13.a("z", co19.r());
										asc21.a(du13);
									}
								}
							}
						}
					}
				}

				for (co co17 : list15) {
					alu alu18 = ajs12.o(co17).v();
					ajs12.a(co17, alu18, false);
				}

				if (integer11 <= 0) {
					throw new cd("commands.fill.failed");
				} else {
					n.a(o.a.AFFECTED_BLOCKS, integer11);
					a(n, this, "commands.fill.success", new Object[]{integer11});
				}
			} else {
				throw new cd("commands.fill.outOfWorld");
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length > 0 && arr.length <= 3) {
			return a(arr, 0, co);
		} else if (arr.length > 3 && arr.length <= 6) {
			return a(arr, 3, co);
		} else if (arr.length == 7) {
			return a(arr, alu.h.c());
		} else if (arr.length == 9) {
			return a(arr, new String[]{"replace", "destroy", "keep", "hollow", "outline"});
		} else {
			return arr.length == 10 && "replace".equals(arr[8]) ? a(arr, alu.h.c()) : Collections.emptyList();
		}
	}
}
