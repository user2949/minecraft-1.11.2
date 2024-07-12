import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Doubles;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.exception.ExceptionUtils;

public abstract class j implements l {
	private static i a;
	private static final Splitter b = Splitter.on(',');
	private static final Splitter c = Splitter.on('=').limit(2);

	protected static ch a(JsonParseException jsonParseException) {
		Throwable throwable2 = ExceptionUtils.getRootCause(jsonParseException);
		String string3 = "";
		if (throwable2 != null) {
			string3 = throwable2.getMessage();
			if (string3.contains("setLenient")) {
				string3 = string3.substring(string3.indexOf("to accept ") + 10);
			}
		}

		return new ch("commands.tellraw.jsonException", string3);
	}

	protected static du a(sn sn) {
		du du2 = sn.e(new du());
		if (sn instanceof aay) {
			afj afj3 = ((aay)sn).bs.i();
			if (!afj3.b()) {
				du2.a("SelectedItem", afj3.a(new du()));
			}
		}

		return du2;
	}

	public int a() {
		return 4;
	}

	@Override
	public List<String> b() {
		return Collections.emptyList();
	}

	@Override
	public boolean a(MinecraftServer minecraftServer, n n) {
		return n.a(this.a(), this.c());
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return Collections.emptyList();
	}

	public static int a(String string) throws cg {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException var2) {
			throw new cg("commands.generic.num.invalid", string);
		}
	}

	public static int a(String string, int integer) throws cg {
		return a(string, integer, Integer.MAX_VALUE);
	}

	public static int a(String string, int integer2, int integer3) throws cg {
		int integer4 = a(string);
		if (integer4 < integer2) {
			throw new cg("commands.generic.num.tooSmall", integer4, integer2);
		} else if (integer4 > integer3) {
			throw new cg("commands.generic.num.tooBig", integer4, integer3);
		} else {
			return integer4;
		}
	}

	public static long b(String string) throws cg {
		try {
			return Long.parseLong(string);
		} catch (NumberFormatException var2) {
			throw new cg("commands.generic.num.invalid", string);
		}
	}

	public static long a(String string, long long2, long long3) throws cg {
		long long6 = b(string);
		if (long6 < long2) {
			throw new cg("commands.generic.num.tooSmall", long6, long2);
		} else if (long6 > long3) {
			throw new cg("commands.generic.num.tooBig", long6, long3);
		} else {
			return long6;
		}
	}

	public static co a(n n, String[] arr, int integer, boolean boolean4) throws cg {
		co co5 = n.c();
		return new co(
			b((double)co5.p(), arr[integer], -30000000, 30000000, boolean4),
			b((double)co5.q(), arr[integer + 1], 0, 256, false),
			b((double)co5.r(), arr[integer + 2], -30000000, 30000000, boolean4)
		);
	}

	public static double c(String string) throws cg {
		try {
			double double2 = Double.parseDouble(string);
			if (!Doubles.isFinite(double2)) {
				throw new cg("commands.generic.num.invalid", string);
			} else {
				return double2;
			}
		} catch (NumberFormatException var3) {
			throw new cg("commands.generic.num.invalid", string);
		}
	}

	public static double a(String string, double double2) throws cg {
		return a(string, double2, Double.MAX_VALUE);
	}

	public static double a(String string, double double2, double double3) throws cg {
		double double6 = c(string);
		if (double6 < double2) {
			throw new cg("commands.generic.num.tooSmall", String.format("%.2f", double6), String.format("%.2f", double2));
		} else if (double6 > double3) {
			throw new cg("commands.generic.num.tooBig", String.format("%.2f", double6), String.format("%.2f", double3));
		} else {
			return double6;
		}
	}

	public static boolean d(String string) throws cd {
		if ("true".equals(string) || "1".equals(string)) {
			return true;
		} else if (!"false".equals(string) && !"0".equals(string)) {
			throw new cd("commands.generic.boolean.invalid", string);
		} else {
			return false;
		}
	}

	public static ly a(n n) throws ci {
		if (n instanceof ly) {
			return (ly)n;
		} else {
			throw new ci("commands.generic.player.unspecified");
		}
	}

	public static ly a(MinecraftServer minecraftServer, n n, String string) throws cd {
		ly ly4 = p.a(n, string);
		if (ly4 == null) {
			try {
				ly4 = minecraftServer.am().a(UUID.fromString(string));
			} catch (IllegalArgumentException var5) {
			}
		}

		if (ly4 == null) {
			ly4 = minecraftServer.am().a(string);
		}

		if (ly4 == null) {
			throw new ci("commands.generic.player.notFound", string);
		} else {
			return ly4;
		}
	}

	public static sn b(MinecraftServer minecraftServer, n n, String string) throws cd {
		return a(minecraftServer, n, string, sn.class);
	}

	public static <T extends sn> T a(MinecraftServer minecraftServer, n n, String string, Class<? extends T> class4) throws cd {
		sn sn5 = p.a(n, string, class4);
		if (sn5 == null) {
			sn5 = minecraftServer.am().a(string);
		}

		if (sn5 == null) {
			try {
				UUID uUID6 = UUID.fromString(string);
				sn5 = minecraftServer.a(uUID6);
				if (sn5 == null) {
					sn5 = minecraftServer.am().a(uUID6);
				}
			} catch (IllegalArgumentException var6) {
				if (string.split("-").length == 5) {
					throw new ce("commands.generic.entity.invalidUuid", string);
				}
			}
		}

		if (sn5 != null && class4.isAssignableFrom(sn5.getClass())) {
			return (T)sn5;
		} else {
			throw new ce(string);
		}
	}

	public static List<sn> c(MinecraftServer minecraftServer, n n, String string) throws cd {
		return (List<sn>)(p.b(string) ? p.b(n, string, sn.class) : Lists.newArrayList(new sn[]{b(minecraftServer, n, string)}));
	}

	public static String d(MinecraftServer minecraftServer, n n, String string) throws cd {
		try {
			return a(minecraftServer, n, string).h_();
		} catch (cd var4) {
			if (p.b(string)) {
				throw var4;
			} else {
				return string;
			}
		}
	}

	public static String e(MinecraftServer minecraftServer, n n, String string) throws cd {
		try {
			return a(minecraftServer, n, string).h_();
		} catch (ci var6) {
			try {
				return b(minecraftServer, n, string).bf();
			} catch (ce var5) {
				if (p.b(string)) {
					throw var5;
				} else {
					return string;
				}
			}
		}
	}

	public static fb a(n n, String[] arr, int integer) throws cd {
		return b(n, arr, integer, false);
	}

	public static fb b(n n, String[] arr, int integer, boolean boolean4) throws cd {
		fb fb5 = new fh("");

		for (int integer6 = integer; integer6 < arr.length; integer6++) {
			if (integer6 > integer) {
				fb5.a(" ");
			}

			fb fb7 = new fh(arr[integer6]);
			if (boolean4) {
				fb fb8 = p.b(n, arr[integer6]);
				if (fb8 == null) {
					if (p.b(arr[integer6])) {
						throw new ci("commands.generic.selector.notFound", arr[integer6]);
					}
				} else {
					fb7 = fb8;
				}
			}

			fb5.a(fb7);
		}

		return fb5;
	}

	public static String a(String[] arr, int integer) {
		StringBuilder stringBuilder3 = new StringBuilder();

		for (int integer4 = integer; integer4 < arr.length; integer4++) {
			if (integer4 > integer) {
				stringBuilder3.append(" ");
			}

			String string5 = arr[integer4];
			stringBuilder3.append(string5);
		}

		return stringBuilder3.toString();
	}

	public static j.a a(double double1, String string, boolean boolean3) throws cg {
		return a(double1, string, -30000000, 30000000, boolean3);
	}

	public static j.a a(double double1, String string, int integer3, int integer4, boolean boolean5) throws cg {
		boolean boolean7 = string.startsWith("~");
		if (boolean7 && Double.isNaN(double1)) {
			throw new cg("commands.generic.num.invalid", double1);
		} else {
			double double8 = 0.0;
			if (!boolean7 || string.length() > 1) {
				boolean boolean10 = string.contains(".");
				if (boolean7) {
					string = string.substring(1);
				}

				double8 += c(string);
				if (!boolean10 && !boolean7 && boolean5) {
					double8 += 0.5;
				}
			}

			double double10 = double8 + (boolean7 ? double1 : 0.0);
			if (integer3 != 0 || integer4 != 0) {
				if (double10 < (double)integer3) {
					throw new cg("commands.generic.num.tooSmall", String.format("%.2f", double10), integer3);
				}

				if (double10 > (double)integer4) {
					throw new cg("commands.generic.num.tooBig", String.format("%.2f", double10), integer4);
				}
			}

			return new j.a(double10, double8, boolean7);
		}
	}

	public static double b(double double1, String string, boolean boolean3) throws cg {
		return b(double1, string, -30000000, 30000000, boolean3);
	}

	public static double b(double double1, String string, int integer3, int integer4, boolean boolean5) throws cg {
		boolean boolean7 = string.startsWith("~");
		if (boolean7 && Double.isNaN(double1)) {
			throw new cg("commands.generic.num.invalid", double1);
		} else {
			double double8 = boolean7 ? double1 : 0.0;
			if (!boolean7 || string.length() > 1) {
				boolean boolean10 = string.contains(".");
				if (boolean7) {
					string = string.substring(1);
				}

				double8 += c(string);
				if (!boolean10 && !boolean7 && boolean5) {
					double8 += 0.5;
				}
			}

			if (integer3 != 0 || integer4 != 0) {
				if (double8 < (double)integer3) {
					throw new cg("commands.generic.num.tooSmall", String.format("%.2f", double8), integer3);
				}

				if (double8 > (double)integer4) {
					throw new cg("commands.generic.num.tooBig", String.format("%.2f", double8), integer4);
				}
			}

			return double8;
		}
	}

	public static afh a(n n, String string) throws cg {
		kq kq3 = new kq(string);
		afh afh4 = afh.g.c(kq3);
		if (afh4 == null) {
			throw new cg("commands.give.item.notFound", kq3);
		} else {
			return afh4;
		}
	}

	public static alu b(n n, String string) throws cg {
		kq kq3 = new kq(string);
		if (!alu.h.d(kq3)) {
			throw new cg("commands.give.block.notFound", kq3);
		} else {
			return alu.h.c(kq3);
		}
	}

	public static atl a(alu alu, String string) throws cg, cf {
		try {
			int integer3 = Integer.parseInt(string);
			if (integer3 < 0) {
				throw new cg("commands.generic.num.tooSmall", integer3, 0);
			} else if (integer3 > 15) {
				throw new cg("commands.generic.num.tooBig", integer3, 15);
			} else {
				return alu.a(Integer.parseInt(string));
			}
		} catch (RuntimeException var7) {
			try {
				Map<aub<?>, Comparable<?>> map3 = c(alu, string);
				atl atl4 = alu.t();

				for (Entry<aub<?>, Comparable<?>> entry6 : map3.entrySet()) {
					atl4 = a(atl4, (aub)entry6.getKey(), (Comparable<?>)entry6.getValue());
				}

				return atl4;
			} catch (RuntimeException var6) {
				throw new cf("commands.generic.blockstate.invalid", string, alu.h.b(alu));
			}
		}
	}

	private static <T extends Comparable<T>> atl a(atl atl, aub<T> aub, Comparable<?> comparable) {
		return atl.a(aub, comparable);
	}

	public static Predicate<atl> b(alu alu, String string) throws cf {
		if (!"*".equals(string) && !"-1".equals(string)) {
			try {
				final int integer3 = Integer.parseInt(string);
				return new Predicate<atl>() {
					public boolean apply(@Nullable atl atl) {
						return integer3 == atl.v().e(atl);
					}
				};
			} catch (RuntimeException var3) {
				final Map<aub<?>, Comparable<?>> map3 = c(alu, string);
				return new Predicate<atl>() {
					public boolean apply(@Nullable atl atl) {
						if (atl != null && alu == atl.v()) {
							for (Entry<aub<?>, Comparable<?>> entry4 : map3.entrySet()) {
								if (!atl.c((aub)entry4.getKey()).equals(entry4.getValue())) {
									return false;
								}
							}

							return true;
						} else {
							return false;
						}
					}
				};
			}
		} else {
			return Predicates.alwaysTrue();
		}
	}

	private static Map<aub<?>, Comparable<?>> c(alu alu, String string) throws cf {
		Map<aub<?>, Comparable<?>> map3 = Maps.newHashMap();
		if ("default".equals(string)) {
			return alu.t().u();
		} else {
			atm atm4 = alu.s();
			Iterator var4 = b.split(string).iterator();

			while (true) {
				if (!var4.hasNext()) {
					return map3;
				}

				String string6 = (String)var4.next();
				Iterator<String> iterator7 = c.split(string6).iterator();
				if (!iterator7.hasNext()) {
					break;
				}

				aub<?> aub8 = atm4.a((String)iterator7.next());
				if (aub8 == null || !iterator7.hasNext()) {
					break;
				}

				Comparable<?> comparable9 = a((aub<Comparable<?>>)aub8, (String)iterator7.next());
				if (comparable9 == null) {
					break;
				}

				map3.put(aub8, comparable9);
			}

			throw new cf("commands.generic.blockstate.invalid", string, alu.h.b(alu));
		}
	}

	@Nullable
	private static <T extends Comparable<T>> T a(aub<T> aub, String string) {
		return (T)aub.b(string).orNull();
	}

	public static String a(Object[] arr) {
		StringBuilder stringBuilder2 = new StringBuilder();

		for (int integer3 = 0; integer3 < arr.length; integer3++) {
			String string4 = arr[integer3].toString();
			if (integer3 > 0) {
				if (integer3 == arr.length - 1) {
					stringBuilder2.append(" and ");
				} else {
					stringBuilder2.append(", ");
				}
			}

			stringBuilder2.append(string4);
		}

		return stringBuilder2.toString();
	}

	public static fb a(List<fb> list) {
		fb fb2 = new fh("");

		for (int integer3 = 0; integer3 < list.size(); integer3++) {
			if (integer3 > 0) {
				if (integer3 == list.size() - 1) {
					fb2.a(" and ");
				} else if (integer3 > 0) {
					fb2.a(", ");
				}
			}

			fb2.a((fb)list.get(integer3));
		}

		return fb2;
	}

	public static String a(Collection<String> collection) {
		return a(collection.toArray(new String[collection.size()]));
	}

	public static List<String> a(String[] arr, int integer, @Nullable co co) {
		if (co == null) {
			return Lists.newArrayList(new String[]{"~"});
		} else {
			int integer5 = arr.length - 1;
			String string4;
			if (integer5 == integer) {
				string4 = Integer.toString(co.p());
			} else if (integer5 == integer + 1) {
				string4 = Integer.toString(co.q());
			} else {
				if (integer5 != integer + 2) {
					return Collections.emptyList();
				}

				string4 = Integer.toString(co.r());
			}

			return Lists.newArrayList(new String[]{string4});
		}
	}

	public static List<String> b(String[] arr, int integer, @Nullable co co) {
		if (co == null) {
			return Lists.newArrayList(new String[]{"~"});
		} else {
			int integer5 = arr.length - 1;
			String string4;
			if (integer5 == integer) {
				string4 = Integer.toString(co.p());
			} else {
				if (integer5 != integer + 1) {
					return Collections.emptyList();
				}

				string4 = Integer.toString(co.r());
			}

			return Lists.newArrayList(new String[]{string4});
		}
	}

	public static boolean a(String string1, String string2) {
		return string2.regionMatches(true, 0, string1, 0, string1.length());
	}

	public static List<String> a(String[] arr1, String... arr2) {
		return a(arr1, Arrays.asList(arr2));
	}

	public static List<String> a(String[] arr, Collection<?> collection) {
		String string3 = arr[arr.length - 1];
		List<String> list4 = Lists.newArrayList();
		if (!collection.isEmpty()) {
			for (String string6 : Iterables.transform(collection, Functions.toStringFunction())) {
				if (a(string3, string6)) {
					list4.add(string6);
				}
			}

			if (list4.isEmpty()) {
				for (Object object6 : collection) {
					if (object6 instanceof kq && a(string3, ((kq)object6).a())) {
						list4.add(String.valueOf(object6));
					}
				}
			}
		}

		return list4;
	}

	@Override
	public boolean b(String[] arr, int integer) {
		return false;
	}

	public static void a(n n, l l, String string, Object... arr) {
		a(n, l, 0, string, arr);
	}

	public static void a(n n, l l, int integer, String string, Object... arr) {
		if (a != null) {
			a.a(n, l, integer, string, arr);
		}
	}

	public static void a(i i) {
		a = i;
	}

	public int compareTo(l l) {
		return this.c().compareTo(l.c());
	}

	public static class a {
		private final double a;
		private final double b;
		private final boolean c;

		protected a(double double1, double double2, boolean boolean3) {
			this.a = double1;
			this.b = double2;
			this.c = boolean3;
		}

		public double a() {
			return this.a;
		}

		public double b() {
			return this.b;
		}

		public boolean c() {
			return this.c;
		}
	}
}
