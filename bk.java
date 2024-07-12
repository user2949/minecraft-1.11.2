import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bk extends j {
	@Override
	public String c() {
		return "stats";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.stats.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 1) {
			throw new ck("commands.stats.usage");
		} else {
			boolean boolean5;
			if ("entity".equals(arr[0])) {
				boolean5 = false;
			} else {
				if (!"block".equals(arr[0])) {
					throw new ck("commands.stats.usage");
				}

				boolean5 = true;
			}

			int integer6;
			if (boolean5) {
				if (arr.length < 5) {
					throw new ck("commands.stats.block.usage");
				}

				integer6 = 4;
			} else {
				if (arr.length < 3) {
					throw new ck("commands.stats.entity.usage");
				}

				integer6 = 2;
			}

			String string7 = arr[integer6++];
			if ("set".equals(string7)) {
				if (arr.length < integer6 + 3) {
					if (integer6 == 5) {
						throw new ck("commands.stats.block.set.usage");
					}

					throw new ck("commands.stats.entity.set.usage");
				}
			} else {
				if (!"clear".equals(string7)) {
					throw new ck("commands.stats.usage");
				}

				if (arr.length < integer6 + 1) {
					if (integer6 == 5) {
						throw new ck("commands.stats.block.clear.usage");
					}

					throw new ck("commands.stats.entity.clear.usage");
				}
			}

			o.a a8 = o.a.a(arr[integer6++]);
			if (a8 == null) {
				throw new cd("commands.stats.failed");
			} else {
				ajs ajs9 = n.e();
				o o10;
				if (boolean5) {
					co co11 = a(n, arr, 1, false);
					asc asc12 = ajs9.r(co11);
					if (asc12 == null) {
						throw new cd("commands.stats.noCompatibleBlock", co11.p(), co11.q(), co11.r());
					}

					if (asc12 instanceof asf) {
						o10 = ((asf)asc12).e();
					} else {
						if (!(asc12 instanceof asv)) {
							throw new cd("commands.stats.noCompatibleBlock", co11.p(), co11.q(), co11.r());
						}

						o10 = ((asv)asc12).f();
					}
				} else {
					sn sn11 = b(minecraftServer, n, arr[1]);
					o10 = sn11.bs();
				}

				if ("set".equals(string7)) {
					String string11 = arr[integer6++];
					String string12 = arr[integer6];
					if (string11.isEmpty() || string12.isEmpty()) {
						throw new cd("commands.stats.failed");
					}

					o.a(o10, a8, string11, string12);
					a(n, this, "commands.stats.success", new Object[]{a8.b(), string12, string11});
				} else if ("clear".equals(string7)) {
					o.a(o10, a8, null, null);
					a(n, this, "commands.stats.cleared", new Object[]{a8.b()});
				}

				if (boolean5) {
					co co11x = a(n, arr, 1, false);
					asc asc12x = ajs9.r(co11x);
					asc12x.x_();
				}
			}
		}
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		if (arr.length == 1) {
			return a(arr, new String[]{"entity", "block"});
		} else if (arr.length == 2 && "entity".equals(arr[0])) {
			return a(arr, minecraftServer.J());
		} else if (arr.length >= 2 && arr.length <= 4 && "block".equals(arr[0])) {
			return a(arr, 1, co);
		} else if ((arr.length != 3 || !"entity".equals(arr[0])) && (arr.length != 5 || !"block".equals(arr[0]))) {
			if ((arr.length != 4 || !"entity".equals(arr[0])) && (arr.length != 6 || !"block".equals(arr[0]))) {
				return (arr.length != 6 || !"entity".equals(arr[0])) && (arr.length != 8 || !"block".equals(arr[0]))
					? Collections.emptyList()
					: a(arr, this.a(minecraftServer));
			} else {
				return a(arr, o.a.c());
			}
		} else {
			return a(arr, new String[]{"set", "clear"});
		}
	}

	protected List<String> a(MinecraftServer minecraftServer) {
		Collection<bdy> collection3 = minecraftServer.a(0).ad().c();
		List<String> list4 = Lists.newArrayList();

		for (bdy bdy6 : collection3) {
			if (!bdy6.c().b()) {
				list4.add(bdy6.b());
			}
		}

		return list4;
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return arr.length > 0 && "entity".equals(arr[0]) && integer == 1;
	}
}
