import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class bj extends j {
	@Override
	public String c() {
		return "spreadplayers";
	}

	@Override
	public int a() {
		return 2;
	}

	@Override
	public String b(n n) {
		return "commands.spreadplayers.usage";
	}

	@Override
	public void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd {
		if (arr.length < 6) {
			throw new ck("commands.spreadplayers.usage");
		} else {
			int integer5 = 0;
			co co6 = n.c();
			double double7 = b((double)co6.p(), arr[integer5++], true);
			double double9 = b((double)co6.r(), arr[integer5++], true);
			double double11 = a(arr[integer5++], 0.0);
			double double13 = a(arr[integer5++], double11 + 1.0);
			boolean boolean15 = d(arr[integer5++]);
			List<sn> list16 = Lists.newArrayList();

			while (integer5 < arr.length) {
				String string17 = arr[integer5++];
				if (p.b(string17)) {
					List<sn> list18 = p.b(n, string17, sn.class);
					if (list18.isEmpty()) {
						throw new ce("commands.generic.selector.notFound", string17);
					}

					list16.addAll(list18);
				} else {
					aay aay18 = minecraftServer.am().a(string17);
					if (aay18 == null) {
						throw new ci("commands.generic.player.notFound", string17);
					}

					list16.add(aay18);
				}
			}

			n.a(o.a.AFFECTED_ENTITIES, list16.size());
			if (list16.isEmpty()) {
				throw new ce("commands.spreadplayers.noop");
			} else {
				n.a(new fi("commands.spreadplayers.spreading." + (boolean15 ? "teams" : "players"), list16.size(), double13, double7, double9, double11));
				this.a(n, list16, new bj.a(double7, double9), double11, double13, ((sn)list16.get(0)).l, boolean15);
			}
		}
	}

	private void a(n n, List<sn> list, bj.a a, double double4, double double5, ajs ajs, boolean boolean7) throws cd {
		Random random11 = new Random();
		double double12 = a.a - double5;
		double double14 = a.b - double5;
		double double16 = a.a + double5;
		double double18 = a.b + double5;
		bj.a[] arr20 = this.a(random11, boolean7 ? this.b(list) : list.size(), double12, double14, double16, double18);
		int integer21 = this.a(a, double4, ajs, random11, double12, double14, double16, double18, arr20, boolean7);
		double double22 = this.a(list, ajs, arr20, boolean7);
		a(n, this, "commands.spreadplayers.success." + (boolean7 ? "teams" : "players"), new Object[]{arr20.length, a.a, a.b});
		if (arr20.length > 1) {
			n.a(new fi("commands.spreadplayers.info." + (boolean7 ? "teams" : "players"), String.format("%.2f", double22), integer21));
		}
	}

	private int b(List<sn> list) {
		Set<bee> set3 = Sets.newHashSet();

		for (sn sn5 : list) {
			if (sn5 instanceof aay) {
				set3.add(sn5.aQ());
			} else {
				set3.add(null);
			}
		}

		return set3.size();
	}

	private int a(bj.a a, double double2, ajs ajs, Random random, double double5, double double6, double double7, double double8, bj.a[] arr, boolean boolean10) throws cd {
		boolean boolean17 = true;
		double double19 = Float.MAX_VALUE;

		int integer18;
		for (integer18 = 0; integer18 < 10000 && boolean17; integer18++) {
			boolean17 = false;
			double19 = Float.MAX_VALUE;

			for (int integer21 = 0; integer21 < arr.length; integer21++) {
				bj.a a22 = arr[integer21];
				int integer23 = 0;
				bj.a a24 = new bj.a();

				for (int integer25 = 0; integer25 < arr.length; integer25++) {
					if (integer21 != integer25) {
						bj.a a26 = arr[integer25];
						double double27 = a22.a(a26);
						double19 = Math.min(double27, double19);
						if (double27 < double2) {
							integer23++;
							a24.a = a24.a + (a26.a - a22.a);
							a24.b = a24.b + (a26.b - a22.b);
						}
					}
				}

				if (integer23 > 0) {
					a24.a /= (double)integer23;
					a24.b /= (double)integer23;
					double double25 = (double)a24.b();
					if (double25 > 0.0) {
						a24.a();
						a22.b(a24);
					} else {
						a22.a(random, double5, double6, double7, double8);
					}

					boolean17 = true;
				}

				if (a22.a(double5, double6, double7, double8)) {
					boolean17 = true;
				}
			}

			if (!boolean17) {
				for (bj.a a24 : arr) {
					if (!a24.b(ajs)) {
						a24.a(random, double5, double6, double7, double8);
						boolean17 = true;
					}
				}
			}
		}

		if (integer18 >= 10000) {
			throw new cd("commands.spreadplayers.failure." + (boolean10 ? "teams" : "players"), arr.length, a.a, a.b, String.format("%.2f", double19));
		} else {
			return integer18;
		}
	}

	private double a(List<sn> list, ajs ajs, bj.a[] arr, boolean boolean4) {
		double double6 = 0.0;
		int integer8 = 0;
		Map<bee, bj.a> map9 = Maps.newHashMap();

		for (int integer10 = 0; integer10 < list.size(); integer10++) {
			sn sn11 = (sn)list.get(integer10);
			bj.a a12;
			if (boolean4) {
				bee bee13 = sn11 instanceof aay ? sn11.aQ() : null;
				if (!map9.containsKey(bee13)) {
					map9.put(bee13, arr[integer8++]);
				}

				a12 = (bj.a)map9.get(bee13);
			} else {
				a12 = arr[integer8++];
			}

			sn11.a((double)((float)ot.c(a12.a) + 0.5F), (double)a12.a(ajs), (double)ot.c(a12.b) + 0.5);
			double double13 = Double.MAX_VALUE;

			for (bj.a a18 : arr) {
				if (a12 != a18) {
					double double19 = a12.a(a18);
					double13 = Math.min(double19, double13);
				}
			}

			double6 += double13;
		}

		return double6 / (double)list.size();
	}

	private bj.a[] a(Random random, int integer, double double3, double double4, double double5, double double6) {
		bj.a[] arr12 = new bj.a[integer];

		for (int integer13 = 0; integer13 < arr12.length; integer13++) {
			bj.a a14 = new bj.a();
			a14.a(random, double3, double4, double5, double6);
			arr12[integer13] = a14;
		}

		return arr12;
	}

	@Override
	public List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co) {
		return arr.length >= 1 && arr.length <= 2 ? b(arr, 0, co) : Collections.emptyList();
	}

	static class a {
		double a;
		double b;

		a() {
		}

		a(double double1, double double2) {
			this.a = double1;
			this.b = double2;
		}

		double a(bj.a a) {
			double double3 = this.a - a.a;
			double double5 = this.b - a.b;
			return Math.sqrt(double3 * double3 + double5 * double5);
		}

		void a() {
			double double2 = (double)this.b();
			this.a /= double2;
			this.b /= double2;
		}

		float b() {
			return ot.a(this.a * this.a + this.b * this.b);
		}

		public void b(bj.a a) {
			this.a = this.a - a.a;
			this.b = this.b - a.b;
		}

		public boolean a(double double1, double double2, double double3, double double4) {
			boolean boolean10 = false;
			if (this.a < double1) {
				this.a = double1;
				boolean10 = true;
			} else if (this.a > double3) {
				this.a = double3;
				boolean10 = true;
			}

			if (this.b < double2) {
				this.b = double2;
				boolean10 = true;
			} else if (this.b > double4) {
				this.b = double4;
				boolean10 = true;
			}

			return boolean10;
		}

		public int a(ajs ajs) {
			co co3 = new co(this.a, 256.0, this.b);

			while (co3.q() > 0) {
				co3 = co3.b();
				if (ajs.o(co3).a() != azs.a) {
					return co3.q() + 1;
				}
			}

			return 257;
		}

		public boolean b(ajs ajs) {
			co co3 = new co(this.a, 256.0, this.b);

			while (co3.q() > 0) {
				co3 = co3.b();
				azs azs4 = ajs.o(co3).a();
				if (azs4 != azs.a) {
					return !azs4.d() && azs4 != azs.o;
				}
			}

			return false;
		}

		public void a(Random random, double double2, double double3, double double4, double double5) {
			this.a = ot.a(random, double2, double4);
			this.b = ot.a(random, double3, double5);
		}
	}
}
