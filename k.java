import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class k implements m {
	private static final Logger a = LogManager.getLogger();
	private final Map<String, l> b = Maps.newHashMap();
	private final Set<l> c = Sets.newHashSet();

	@Override
	public int a(n n, String string) {
		string = string.trim();
		if (string.startsWith("/")) {
			string = string.substring(1);
		}

		String[] arr4 = string.split(" ");
		String string5 = arr4[0];
		arr4 = a(arr4);
		l l6 = (l)this.b.get(string5);
		int integer7 = 0;

		try {
			int integer8 = this.a(l6, arr4);
			if (l6 == null) {
				fi fi9 = new fi("commands.generic.notFound");
				fi9.b().a(a.RED);
				n.a(fi9);
			} else if (l6.a(this.a(), n)) {
				if (integer8 > -1) {
					List<sn> list9 = p.b(n, arr4[integer8], sn.class);
					String string10 = arr4[integer8];
					n.a(o.a.AFFECTED_ENTITIES, list9.size());
					if (list9.isEmpty()) {
						throw new ci("commands.generic.selector.notFound", arr4[integer8]);
					}

					for (sn sn12 : list9) {
						arr4[integer8] = sn12.bf();
						if (this.a(n, arr4, l6, string)) {
							integer7++;
						}
					}

					arr4[integer8] = string10;
				} else {
					n.a(o.a.AFFECTED_ENTITIES, 1);
					if (this.a(n, arr4, l6, string)) {
						integer7++;
					}
				}
			} else {
				fi fi9 = new fi("commands.generic.permission");
				fi9.b().a(a.RED);
				n.a(fi9);
			}
		} catch (cd var12) {
			fi fi9 = new fi(var12.getMessage(), var12.a());
			fi9.b().a(a.RED);
			n.a(fi9);
		}

		n.a(o.a.SUCCESS_COUNT, integer7);
		return integer7;
	}

	protected boolean a(n n, String[] arr, l l, String string) {
		try {
			l.a(this.a(), n, arr);
			return true;
		} catch (ck var7) {
			fi fi7 = new fi("commands.generic.usage", new fi(var7.getMessage(), var7.a()));
			fi7.b().a(a.RED);
			n.a(fi7);
		} catch (cd var8) {
			fi fi7x = new fi(var8.getMessage(), var8.a());
			fi7x.b().a(a.RED);
			n.a(fi7x);
		} catch (Throwable var9) {
			fi fi7xx = new fi("commands.generic.exception");
			fi7xx.b().a(a.RED);
			n.a(fi7xx);
			a.warn("Couldn't process command: '{}'", new Object[]{string});
		}

		return false;
	}

	protected abstract MinecraftServer a();

	public l a(l l) {
		this.b.put(l.c(), l);
		this.c.add(l);

		for (String string4 : l.b()) {
			l l5 = (l)this.b.get(string4);
			if (l5 == null || !l5.c().equals(string4)) {
				this.b.put(string4, l);
			}
		}

		return l;
	}

	private static String[] a(String[] arr) {
		String[] arr2 = new String[arr.length - 1];
		System.arraycopy(arr, 1, arr2, 0, arr.length - 1);
		return arr2;
	}

	@Override
	public List<String> a(n n, String string, @Nullable co co) {
		String[] arr5 = string.split(" ", -1);
		String string6 = arr5[0];
		if (arr5.length == 1) {
			List<String> list7 = Lists.newArrayList();

			for (Entry<String, l> entry9 : this.b.entrySet()) {
				if (j.a(string6, (String)entry9.getKey()) && ((l)entry9.getValue()).a(this.a(), n)) {
					list7.add(entry9.getKey());
				}
			}

			return list7;
		} else {
			if (arr5.length > 1) {
				l l7 = (l)this.b.get(string6);
				if (l7 != null && l7.a(this.a(), n)) {
					return l7.a(this.a(), n, a(arr5), co);
				}
			}

			return Collections.emptyList();
		}
	}

	@Override
	public List<l> a(n n) {
		List<l> list3 = Lists.newArrayList();

		for (l l5 : this.c) {
			if (l5.a(this.a(), n)) {
				list3.add(l5);
			}
		}

		return list3;
	}

	@Override
	public Map<String, l> b() {
		return this.b;
	}

	private int a(l l, String[] arr) throws cd {
		if (l == null) {
			return -1;
		} else {
			for (int integer4 = 0; integer4 < arr.length; integer4++) {
				if (l.b(arr, integer4) && p.a(arr[integer4])) {
					return integer4;
				}
			}

			return -1;
		}
	}
}
