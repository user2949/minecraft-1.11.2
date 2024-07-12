import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class bdz extends bee {
	private final bec a;
	private final String b;
	private final Set<String> c = Sets.newHashSet();
	private String d;
	private String e = "";
	private String f = "";
	private boolean g = true;
	private boolean h = true;
	private bee.b i = bee.b.ALWAYS;
	private bee.b j = bee.b.ALWAYS;
	private a k = a.RESET;
	private bee.a l = bee.a.ALWAYS;

	public bdz(bec bec, String string) {
		this.a = bec;
		this.b = string;
		this.d = string;
	}

	@Override
	public String b() {
		return this.b;
	}

	public String c() {
		return this.d;
	}

	public void a(String string) {
		if (string == null) {
			throw new IllegalArgumentException("Name cannot be null");
		} else {
			this.d = string;
			this.a.b(this);
		}
	}

	@Override
	public Collection<String> d() {
		return this.c;
	}

	public String e() {
		return this.e;
	}

	public void b(String string) {
		if (string == null) {
			throw new IllegalArgumentException("Prefix cannot be null");
		} else {
			this.e = string;
			this.a.b(this);
		}
	}

	public String f() {
		return this.f;
	}

	public void c(String string) {
		this.f = string;
		this.a.b(this);
	}

	@Override
	public String d(String string) {
		return this.e() + string + this.f();
	}

	public static String a(@Nullable bee bee, String string) {
		return bee == null ? string : bee.d(string);
	}

	@Override
	public boolean g() {
		return this.g;
	}

	public void a(boolean boolean1) {
		this.g = boolean1;
		this.a.b(this);
	}

	@Override
	public boolean h() {
		return this.h;
	}

	public void b(boolean boolean1) {
		this.h = boolean1;
		this.a.b(this);
	}

	@Override
	public bee.b i() {
		return this.i;
	}

	@Override
	public bee.b j() {
		return this.j;
	}

	public void a(bee.b b) {
		this.i = b;
		this.a.b(this);
	}

	public void b(bee.b b) {
		this.j = b;
		this.a.b(this);
	}

	@Override
	public bee.a k() {
		return this.l;
	}

	public void a(bee.a a) {
		this.l = a;
		this.a.b(this);
	}

	public int l() {
		int integer2 = 0;
		if (this.g()) {
			integer2 |= 1;
		}

		if (this.h()) {
			integer2 |= 2;
		}

		return integer2;
	}

	public void a(int integer) {
		this.a((integer & 1) > 0);
		this.b((integer & 2) > 0);
	}

	public void a(a a) {
		this.k = a;
	}

	@Override
	public a m() {
		return this.k;
	}
}
