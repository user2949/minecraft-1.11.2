import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public abstract class bhu {
	protected final bfq a;
	protected final boolean b;
	protected boolean c;
	protected boolean d;
	protected int e;
	protected List<String> f = Lists.newArrayList();

	public bhu(bfq bfq, boolean boolean2) {
		this.a = bfq;
		this.b = boolean2;
	}

	public void a() {
		if (this.c) {
			this.a.b(0);
			this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
			if (this.e >= this.f.size()) {
				this.e = 0;
			}
		} else {
			int integer2 = this.a.a(-1, this.a.i(), false);
			this.f.clear();
			this.e = 0;
			String string3 = this.a.b().substring(0, this.a.i());
			this.a(string3);
			if (this.f.isEmpty()) {
				return;
			}

			this.c = true;
			this.a.b(integer2 - this.a.i());
		}

		this.a.b((String)this.f.get(this.e++));
	}

	private void a(String string) {
		if (string.length() >= 1) {
			bes.z().h.d.a(new io(string, this.b(), this.b));
			this.d = true;
		}
	}

	@Nullable
	public abstract co b();

	public void a(String... arr) {
		if (this.d) {
			this.c = false;
			this.f.clear();

			for (String string6 : arr) {
				if (!string6.isEmpty()) {
					this.f.add(string6);
				}
			}

			String string3 = this.a.b().substring(this.a.a(-1, this.a.i(), false));
			String string4 = StringUtils.getCommonPrefix(arr);
			if (!string4.isEmpty() && !string3.equalsIgnoreCase(string4)) {
				this.a.b(0);
				this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
				this.a.b(string4);
			} else if (!this.f.isEmpty()) {
				this.c = true;
				this.a();
			}
		}
	}

	public void c() {
		this.c = false;
	}

	public void d() {
		this.d = false;
	}
}
