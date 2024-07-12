import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bqw {
	public static final bqw.a a = new bqw.a("B", new kq("textures/entity/banner_base.png"), "textures/entity/banner/");
	public static final bqw.a b = new bqw.a("S", new kq("textures/entity/shield_base.png"), "textures/entity/shield/");
	public static final kq c = new kq("textures/entity/shield_base_nopattern.png");
	public static final kq d = new kq("textures/entity/banner/base.png");

	public static class a {
		private final Map<String, bqw.b> a = Maps.newLinkedHashMap();
		private final kq b;
		private final String c;
		private final String d;

		public a(String string1, kq kq, String string3) {
			this.d = string1;
			this.b = kq;
			this.c = string3;
		}

		@Nullable
		public kq a(String string, List<asa> list2, List<aem> list3) {
			if (string.isEmpty()) {
				return null;
			} else {
				string = this.d + string;
				bqw.b b5 = (bqw.b)this.a.get(string);
				if (b5 == null) {
					if (this.a.size() >= 256 && !this.a()) {
						return bqw.d;
					}

					List<String> list6 = Lists.newArrayList();

					for (asa asa8 : list2) {
						list6.add(this.c + asa8.a() + ".png");
					}

					b5 = new bqw.b();
					b5.b = new kq(string);
					bes.z().N().a(b5.b, new bys(this.b, list6, list3));
					this.a.put(string, b5);
				}

				b5.a = System.currentTimeMillis();
				return b5.b;
			}
		}

		private boolean a() {
			long long2 = System.currentTimeMillis();
			Iterator<String> iterator4 = this.a.keySet().iterator();

			while (iterator4.hasNext()) {
				String string5 = (String)iterator4.next();
				bqw.b b6 = (bqw.b)this.a.get(string5);
				if (long2 - b6.a > 5000L) {
					bes.z().N().c(b6.b);
					iterator4.remove();
					return true;
				}
			}

			return this.a.size() < 256;
		}
	}

	static class b {
		public long a;
		public kq b;

		private b() {
		}
	}
}
