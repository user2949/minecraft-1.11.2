import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class o {
	private static final int a = o.a.values().length;
	private static final String[] b = new String[a];
	private String[] c = b;
	private String[] d = b;

	public void a(MinecraftServer minecraftServer, n n, o.a a, int integer) {
		String string6 = this.c[a.a()];
		if (string6 != null) {
			n n7 = new n() {
				@Override
				public String h_() {
					return n.h_();
				}

				@Override
				public fb i_() {
					return n.i_();
				}

				@Override
				public void a(fb fb) {
					n.a(fb);
				}

				@Override
				public boolean a(int integer, String string) {
					return true;
				}

				@Override
				public co c() {
					return n.c();
				}

				@Override
				public bdw d() {
					return n.d();
				}

				@Override
				public ajs e() {
					return n.e();
				}

				@Override
				public sn f() {
					return n.f();
				}

				@Override
				public boolean g() {
					return n.g();
				}

				@Override
				public void a(o.a a, int integer) {
					n.a(a, integer);
				}

				@Override
				public MinecraftServer B_() {
					return n.B_();
				}
			};

			String string8;
			try {
				string8 = j.e(minecraftServer, n7, string6);
			} catch (cd var12) {
				return;
			}

			String string9 = this.d[a.a()];
			if (string9 != null) {
				bec bec10 = n.e().ad();
				bdy bdy11 = bec10.b(string9);
				if (bdy11 != null) {
					if (bec10.b(string8, bdy11)) {
						bea bea12 = bec10.c(string8, bdy11);
						bea12.c(integer);
					}
				}
			}
		}
	}

	public void a(du du) {
		if (du.b("CommandStats", 10)) {
			du du3 = du.o("CommandStats");

			for (o.a a7 : o.a.values()) {
				String string8 = a7.b() + "Name";
				String string9 = a7.b() + "Objective";
				if (du3.b(string8, 8) && du3.b(string9, 8)) {
					String string10 = du3.l(string8);
					String string11 = du3.l(string9);
					a(this, a7, string10, string11);
				}
			}
		}
	}

	public void b(du du) {
		du du3 = new du();

		for (o.a a7 : o.a.values()) {
			String string8 = this.c[a7.a()];
			String string9 = this.d[a7.a()];
			if (string8 != null && string9 != null) {
				du3.a(a7.b() + "Name", string8);
				du3.a(a7.b() + "Objective", string9);
			}
		}

		if (!du3.b_()) {
			du.a("CommandStats", du3);
		}
	}

	public static void a(o o, o.a a, @Nullable String string3, @Nullable String string4) {
		if (string3 != null && !string3.isEmpty() && string4 != null && !string4.isEmpty()) {
			if (o.c == b || o.d == b) {
				o.c = new String[o.a];
				o.d = new String[o.a];
			}

			o.c[a.a()] = string3;
			o.d[a.a()] = string4;
		} else {
			a(o, a);
		}
	}

	private static void a(o o, o.a a) {
		if (o.c != b && o.d != b) {
			o.c[a.a()] = null;
			o.d[a.a()] = null;
			boolean boolean3 = true;

			for (o.a a7 : o.a.values()) {
				if (o.c[a7.a()] != null && o.d[a7.a()] != null) {
					boolean3 = false;
					break;
				}
			}

			if (boolean3) {
				o.c = b;
				o.d = b;
			}
		}
	}

	public void a(o o) {
		for (o.a a6 : o.a.values()) {
			a(this, a6, o.c[a6.a()], o.d[a6.a()]);
		}
	}

	public static enum a {
		SUCCESS_COUNT(0, "SuccessCount"),
		AFFECTED_BLOCKS(1, "AffectedBlocks"),
		AFFECTED_ENTITIES(2, "AffectedEntities"),
		AFFECTED_ITEMS(3, "AffectedItems"),
		QUERY_RESULT(4, "QueryResult");

		final int f;
		final String g;

		private a(int integer3, String string4) {
			this.f = integer3;
			this.g = string4;
		}

		public int a() {
			return this.f;
		}

		public String b() {
			return this.g;
		}

		public static String[] c() {
			String[] arr1 = new String[values().length];
			int integer2 = 0;

			for (o.a a6 : values()) {
				arr1[integer2++] = a6.b();
			}

			return arr1;
		}

		@Nullable
		public static o.a a(String string) {
			for (o.a a5 : values()) {
				if (a5.b().equals(string)) {
					return a5;
				}
			}

			return null;
		}
	}
}
