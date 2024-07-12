import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class afi {
	private final Map<afh, afi.a> a = Maps.newHashMap();
	private int b;

	public boolean a(afh afh) {
		return this.a(afh, 0.0F) > 0.0F;
	}

	public float a(afh afh, float float2) {
		afi.a a4 = (afi.a)this.a.get(afh);
		if (a4 != null) {
			float float5 = (float)(a4.b - a4.a);
			float float6 = (float)a4.b - ((float)this.b + float2);
			return ot.a(float6 / float5, 0.0F, 1.0F);
		} else {
			return 0.0F;
		}
	}

	public void a() {
		this.b++;
		if (!this.a.isEmpty()) {
			Iterator<Entry<afh, afi.a>> iterator2 = this.a.entrySet().iterator();

			while (iterator2.hasNext()) {
				Entry<afh, afi.a> entry3 = (Entry<afh, afi.a>)iterator2.next();
				if (((afi.a)entry3.getValue()).b <= this.b) {
					iterator2.remove();
					this.c((afh)entry3.getKey());
				}
			}
		}
	}

	public void a(afh afh, int integer) {
		this.a.put(afh, new afi.a(this.b, this.b + integer));
		this.b(afh, integer);
	}

	public void b(afh afh) {
		this.a.remove(afh);
		this.c(afh);
	}

	protected void b(afh afh, int integer) {
	}

	protected void c(afh afh) {
	}

	class a {
		final int a;
		final int b;

		private a(int integer2, int integer3) {
			this.a = integer2;
			this.b = integer3;
		}
	}
}
