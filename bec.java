import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bec {
	private final Map<String, bdy> a = Maps.newHashMap();
	private final Map<bei, List<bdy>> b = Maps.newHashMap();
	private final Map<String, Map<bdy, bea>> c = Maps.newHashMap();
	private final bdy[] d = new bdy[19];
	private final Map<String, bdz> e = Maps.newHashMap();
	private final Map<String, bdz> f = Maps.newHashMap();
	private static String[] g;

	@Nullable
	public bdy b(String string) {
		return (bdy)this.a.get(string);
	}

	public bdy a(String string, bei bei) {
		if (string.length() > 16) {
			throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
		} else {
			bdy bdy4 = this.b(string);
			if (bdy4 != null) {
				throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
			} else {
				bdy4 = new bdy(this, string, bei);
				List<bdy> list5 = (List<bdy>)this.b.get(bei);
				if (list5 == null) {
					list5 = Lists.newArrayList();
					this.b.put(bei, list5);
				}

				list5.add(bdy4);
				this.a.put(string, bdy4);
				this.a(bdy4);
				return bdy4;
			}
		}
	}

	public Collection<bdy> a(bei bei) {
		Collection<bdy> collection3 = (Collection<bdy>)this.b.get(bei);
		return collection3 == null ? Lists.newArrayList() : Lists.newArrayList(collection3);
	}

	public boolean b(String string, bdy bdy) {
		Map<bdy, bea> map4 = (Map<bdy, bea>)this.c.get(string);
		if (map4 == null) {
			return false;
		} else {
			bea bea5 = (bea)map4.get(bdy);
			return bea5 != null;
		}
	}

	public bea c(String string, bdy bdy) {
		if (string.length() > 40) {
			throw new IllegalArgumentException("The player name '" + string + "' is too long!");
		} else {
			Map<bdy, bea> map4 = (Map<bdy, bea>)this.c.get(string);
			if (map4 == null) {
				map4 = Maps.newHashMap();
				this.c.put(string, map4);
			}

			bea bea5 = (bea)map4.get(bdy);
			if (bea5 == null) {
				bea5 = new bea(this, bdy, string);
				map4.put(bdy, bea5);
			}

			return bea5;
		}
	}

	public Collection<bea> i(bdy bdy) {
		List<bea> list3 = Lists.newArrayList();

		for (Map<bdy, bea> map5 : this.c.values()) {
			bea bea6 = (bea)map5.get(bdy);
			if (bea6 != null) {
				list3.add(bea6);
			}
		}

		Collections.sort(list3, bea.a);
		return list3;
	}

	public Collection<bdy> c() {
		return this.a.values();
	}

	public Collection<String> d() {
		return this.c.keySet();
	}

	public void d(String string, bdy bdy) {
		if (bdy == null) {
			Map<bdy, bea> map4 = (Map<bdy, bea>)this.c.remove(string);
			if (map4 != null) {
				this.a(string);
			}
		} else {
			Map<bdy, bea> map4 = (Map<bdy, bea>)this.c.get(string);
			if (map4 != null) {
				bea bea5 = (bea)map4.remove(bdy);
				if (map4.size() < 1) {
					Map<bdy, bea> map6 = (Map<bdy, bea>)this.c.remove(string);
					if (map6 != null) {
						this.a(string);
					}
				} else if (bea5 != null) {
					this.a(string, bdy);
				}
			}
		}
	}

	public Collection<bea> e() {
		Collection<Map<bdy, bea>> collection2 = this.c.values();
		List<bea> list3 = Lists.newArrayList();

		for (Map<bdy, bea> map5 : collection2) {
			list3.addAll(map5.values());
		}

		return list3;
	}

	public Map<bdy, bea> c(String string) {
		Map<bdy, bea> map3 = (Map<bdy, bea>)this.c.get(string);
		if (map3 == null) {
			map3 = Maps.newHashMap();
		}

		return map3;
	}

	public void k(bdy bdy) {
		this.a.remove(bdy.b());

		for (int integer3 = 0; integer3 < 19; integer3++) {
			if (this.a(integer3) == bdy) {
				this.a(integer3, null);
			}
		}

		List<bdy> list3 = (List<bdy>)this.b.get(bdy.c());
		if (list3 != null) {
			list3.remove(bdy);
		}

		for (Map<bdy, bea> map5 : this.c.values()) {
			map5.remove(bdy);
		}

		this.c(bdy);
	}

	public void a(int integer, bdy bdy) {
		this.d[integer] = bdy;
	}

	@Nullable
	public bdy a(int integer) {
		return this.d[integer];
	}

	public bdz d(String string) {
		return (bdz)this.e.get(string);
	}

	public bdz e(String string) {
		if (string.length() > 16) {
			throw new IllegalArgumentException("The team name '" + string + "' is too long!");
		} else {
			bdz bdz3 = this.d(string);
			if (bdz3 != null) {
				throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
			} else {
				bdz3 = new bdz(this, string);
				this.e.put(string, bdz3);
				this.a(bdz3);
				return bdz3;
			}
		}
	}

	public void d(bdz bdz) {
		this.e.remove(bdz.b());

		for (String string4 : bdz.d()) {
			this.f.remove(string4);
		}

		this.c(bdz);
	}

	public boolean a(String string1, String string2) {
		if (string1.length() > 40) {
			throw new IllegalArgumentException("The player name '" + string1 + "' is too long!");
		} else if (!this.e.containsKey(string2)) {
			return false;
		} else {
			bdz bdz4 = this.d(string2);
			if (this.g(string1) != null) {
				this.f(string1);
			}

			this.f.put(string1, bdz4);
			bdz4.d().add(string1);
			return true;
		}
	}

	public boolean f(String string) {
		bdz bdz3 = this.g(string);
		if (bdz3 != null) {
			this.a(string, bdz3);
			return true;
		} else {
			return false;
		}
	}

	public void a(String string, bdz bdz) {
		if (this.g(string) != bdz) {
			throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + bdz.b() + "'.");
		} else {
			this.f.remove(string);
			bdz.d().remove(string);
		}
	}

	public Collection<String> f() {
		return this.e.keySet();
	}

	public Collection<bdz> g() {
		return this.e.values();
	}

	@Nullable
	public bdz g(String string) {
		return (bdz)this.f.get(string);
	}

	public void a(bdy bdy) {
	}

	public void b(bdy bdy) {
	}

	public void c(bdy bdy) {
	}

	public void a(bea bea) {
	}

	public void a(String string) {
	}

	public void a(String string, bdy bdy) {
	}

	public void a(bdz bdz) {
	}

	public void b(bdz bdz) {
	}

	public void c(bdz bdz) {
	}

	public static String b(int integer) {
		switch (integer) {
			case 0:
				return "list";
			case 1:
				return "sidebar";
			case 2:
				return "belowName";
			default:
				if (integer >= 3 && integer <= 18) {
					a a2 = a.a(integer - 3);
					if (a2 != null && a2 != a.RESET) {
						return "sidebar.team." + a2.e();
					}
				}

				return null;
		}
	}

	public static int h(String string) {
		if ("list".equalsIgnoreCase(string)) {
			return 0;
		} else if ("sidebar".equalsIgnoreCase(string)) {
			return 1;
		} else if ("belowName".equalsIgnoreCase(string)) {
			return 2;
		} else {
			if (string.startsWith("sidebar.team.")) {
				String string2 = string.substring("sidebar.team.".length());
				a a3 = a.b(string2);
				if (a3 != null && a3.b() >= 0) {
					return a3.b() + 3;
				}
			}

			return -1;
		}
	}

	public static String[] h() {
		if (g == null) {
			g = new String[19];

			for (int integer1 = 0; integer1 < 19; integer1++) {
				g[integer1] = b(integer1);
			}
		}

		return g;
	}

	public void a(sn sn) {
		if (sn != null && !(sn instanceof aay) && !sn.au()) {
			String string3 = sn.bf();
			this.d(string3, null);
			this.f(string3);
		}
	}
}
