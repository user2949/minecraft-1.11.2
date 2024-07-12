import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class w extends j {
	@Override
	public String c() {
		return "clone";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.clone.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 9) {
			throw new ck("commands.clone.usage");
		} else {
			n.a(o.a.AFFECTED_BLOCKS, 0);
			co co5 = a(n, arr, 0, false);
			co co6 = a(n, arr, 3, false);
			co co7 = a(n, arr, 6, false);
			axz axz8 = new axz(co5, co6);
			axz axz9 = new axz(co7, co7.a(axz8.b()));
			int integer10 = axz8.c() * axz8.d() * axz8.e();
			if (integer10 > 32768) {
				throw new cd("commands.clone.tooManyBlocks", integer10, 32768);
			} else {
				boolean boolean11 = false;
				alu alu12 = null;
				Predicate<atl> predicate13 = null;
				if ((arr.length < 11 || !"force".equals(arr[10]) && !"move".equals(arr[10])) && axz8.a(axz9)) {
					throw new cd("commands.clone.noOverlap");
				} else {
					if (arr.length >= 11 && "move".equals(arr[10])) {
						boolean11 = true;
					}

					if (axz8.b >= 0 && axz8.e < 256 && axz9.b >= 0 && axz9.e < 256) {
						ajs ajs14 = n.e();
						if (ajs14.a(axz8) && ajs14.a(axz9)) {
							boolean boolean15 = false;
							if (arr.length >= 10) {
								if ("masked".equals(arr[9])) {
									boolean15 = true;
								} else if ("filtered".equals(arr[9])) {
									if (arr.length < 12) {
										throw new ck("commands.clone.usage");
									}

									alu12 = b(n, arr[11]);
									if (arr.length >= 13) {
										predicate13 = b(alu12, arr[12]);
									}
								}
							}

							List<w.a> list16 = Lists.newArrayList();
							List<w.a> list17 = Lists.newArrayList();
							List<w.a> list18 = Lists.newArrayList();
							Deque<co> deque19 = Lists.newLinkedList();
							co co20 = new co(axz9.a - axz8.a, axz9.b - axz8.b, axz9.c - axz8.c);

							for (int integer21 = axz8.c; integer21 <= axz8.f; integer21++) {
								for (int integer22 = axz8.b; integer22 <= axz8.e; integer22++) {
									for (int integer23 = axz8.a; integer23 <= axz8.d; integer23++) {
										co co24 = new co(integer23, integer22, integer21);
										co co25 = co24.a(co20);
										atl atl26 = ajs14.o(co24);
										if ((!boolean15 || atl26.v() != alv.a) && (alu12 == null || atl26.v() == alu12 && (predicate13 == null || predicate13.apply(atl26)))) {
											asc asc27 = ajs14.r(co24);
											if (asc27 != null) {
												du du28 = asc27.b(new du());
												list17.add(new w.a(co25, atl26, du28));
												deque19.addLast(co24);
											} else if (!atl26.b() && !atl26.h()) {
												list18.add(new w.a(co25, atl26, null));
												deque19.addFirst(co24);
											} else {
												list16.add(new w.a(co25, atl26, null));
												deque19.addLast(co24);
											}
										}
									}
								}
							}

							if (boolean11) {
								for (co co22 : deque19) {
									asc asc23 = ajs14.r(co22);
									if (asc23 instanceof rc) {
										((rc)asc23).m();
									}

									ajs14.a(co22, alv.cv.t(), 2);
								}

								for (co co22 : deque19) {
									ajs14.a(co22, alv.a.t(), 3);
								}
							}

							List<w.a> list21 = Lists.newArrayList();
							list21.addAll(list16);
							list21.addAll(list17);
							list21.addAll(list18);
							List<w.a> list22 = Lists.reverse(list21);

							for (w.a a24 : list22) {
								asc asc25 = ajs14.r(a24.a);
								if (asc25 instanceof rc) {
									((rc)asc25).m();
								}

								ajs14.a(a24.a, alv.cv.t(), 2);
							}

							integer10 = 0;

							for (w.a a24 : list21) {
								if (ajs14.a(a24.a, a24.b, 2)) {
									integer10++;
								}
							}

							for (w.a a24x : list17) {
								asc asc25 = ajs14.r(a24x.a);
								if (a24x.c != null && asc25 != null) {
									a24x.c.a("x", a24x.a.p());
									a24x.c.a("y", a24x.a.q());
									a24x.c.a("z", a24x.a.r());
									asc25.a(a24x.c);
									asc25.x_();
								}

								ajs14.a(a24x.a, a24x.b, 2);
							}

							for (w.a a24x : list22) {
								ajs14.a(a24x.a, a24x.b.v(), false);
							}

							List<akd> list23 = ajs14.a(axz8, false);
							if (list23 != null) {
								for (akd akd25 : list23) {
									if (axz8.b(akd25.a)) {
										co co26 = akd25.a.a(co20);
										ajs14.b(co26, akd25.a(), (int)(akd25.b - ajs14.T().e()), akd25.c);
									}
								}
							}

							if (integer10 <= 0) {
								throw new cd("commands.clone.failed");
							} else {
								n.a(o.a.AFFECTED_BLOCKS, integer10);
								a(n, this, "commands.clone.success", new Object[]{integer10});
							}
						} else {
							throw new cd("commands.clone.outOfWorld");
						}
					} else {
						throw new cd("commands.clone.outOfWorld");
					}
				}
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
		} else if (arr.length == 10) {
			return a(arr, new String[]{"replace", "masked", "filtered"});
		} else if (arr.length == 11) {
			return a(arr, new String[]{"normal", "force", "move"});
		} else {
			return arr.length == 12 && "filtered".equals(arr[9]) ? a(arr, alu.h.c()) : Collections.emptyList();
		}
	}

	static class a {
		public final co a;
		public final atl b;
		public final du c;

		public a(co co, atl atl, du du) {
			this.a = co;
			this.b = atl;
			this.c = du;
		}
	}
}
