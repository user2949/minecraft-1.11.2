import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class q extends j {
	@Override
	public String c() {
		return "achievement";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.achievement.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 2) {
			throw new ck("commands.achievement.usage");
		} else {
			final nw nw5 = oa.a(arr[1]);
			if ((nw5 != null || "*".equals(arr[1])) && (nw5 == null || nw5.d())) {
				final ly ly6 = arr.length >= 3 ? a(minecraftServer, n, arr[2]) : a(n);
				boolean boolean7 = "give".equalsIgnoreCase(arr[0]);
				boolean boolean8 = "take".equalsIgnoreCase(arr[0]);
				if (boolean7 || boolean8) {
					if (nw5 == null) {
						if (boolean7) {
							for (nq nq10 : nr.e) {
								ly6.b(nq10);
							}

							a(n, this, "commands.achievement.give.success.all", new Object[]{ly6.h_()});
						} else if (boolean8) {
							for (nq nq10 : Lists.reverse(nr.e)) {
								ly6.a((nw)nq10);
							}

							a(n, this, "commands.achievement.take.success.all", new Object[]{ly6.h_()});
						}
					} else {
						if (nw5 instanceof nq) {
							nq nq9 = (nq)nw5;
							if (boolean7) {
								if (ly6.E().a(nq9)) {
									throw new cd("commands.achievement.alreadyHave", ly6.h_(), nw5.j());
								}

								List<nq> list10;
								for (list10 = Lists.newArrayList(); nq9.c != null && !ly6.E().a(nq9.c); nq9 = nq9.c) {
									list10.add(nq9.c);
								}

								for (nq nq12 : Lists.reverse(list10)) {
									ly6.b(nq12);
								}
							} else if (boolean8) {
								if (!ly6.E().a(nq9)) {
									throw new cd("commands.achievement.dontHave", ly6.h_(), nw5.j());
								}

								List<nq> list10 = Lists.newArrayList(Iterators.filter(nr.e.iterator(), new Predicate<nq>() {
									public boolean apply(@Nullable nq nq) {
										return ly6.E().a(nq) && nq != nw5;
									}
								}));
								List<nq> list11 = Lists.newArrayList(list10);

								for (nq nq13 : list10) {
									nq nq14 = nq13;

									boolean boolean15;
									for (boolean15 = false; nq14 != null; nq14 = nq14.c) {
										if (nq14 == nw5) {
											boolean15 = true;
										}
									}

									if (!boolean15) {
										for (nq var24 = nq13; var24 != null; var24 = var24.c) {
											list11.remove(nq13);
										}
									}
								}

								for (nq nq13 : list11) {
									ly6.a((nw)nq13);
								}
							}
						}

						if (boolean7) {
							ly6.b(nw5);
							a(n, this, "commands.achievement.give.success.one", new Object[]{ly6.h_(), nw5.j()});
						} else if (boolean8) {
							ly6.a(nw5);
							a(n, this, "commands.achievement.take.success.one", new Object[]{nw5.j(), ly6.h_()});
						}
					}
				}
			} else {
				throw new cd("commands.achievement.unknownAchievement", arr[1]);
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"give", "take"});
		} else if (arr.length != 2) {
			return arr.length == 3 ? a(arr, minecraftServer.J()) : Collections.emptyList();
		} else {
			List<String> list6 = Lists.newArrayList();

			for (nw nw8 : nr.e) {
				list6.add(nw8.e);
			}

			return a(arr, list6);
		}
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return integer == 2;
	}
}
