import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import org.lwjgl.input.Keyboard;

public class bep implements Comparable<bep> {
	private static final List<bep> a = Lists.newArrayList();
	private static final oo<bep> b = new oo<>();
	private static final Set<String> c = Sets.newHashSet();
	private final String d;
	private final int e;
	private final String f;
	private int g;
	private boolean h;
	private int i;

	public static void a(int integer) {
		if (integer != 0) {
			bep bep2 = b.a(integer);
			if (bep2 != null) {
				bep2.i++;
			}
		}
	}

	public static void a(int integer, boolean boolean2) {
		if (integer != 0) {
			bep bep3 = b.a(integer);
			if (bep3 != null) {
				bep3.h = boolean2;
			}
		}
	}

	public static void a() {
		for (bep bep2 : a) {
			try {
				a(bep2.g, bep2.g < 256 && Keyboard.isKeyDown(bep2.g));
			} catch (IndexOutOfBoundsException var3) {
			}
		}
	}

	public static void b() {
		for (bep bep2 : a) {
			bep2.k();
		}
	}

	public static void c() {
		b.c();

		for (bep bep2 : a) {
			b.a(bep2.g, bep2);
		}
	}

	public static Set<String> d() {
		return c;
	}

	public bep(String string1, int integer, String string3) {
		this.d = string1;
		this.g = integer;
		this.e = integer;
		this.f = string3;
		a.add(this);
		b.a(integer, this);
		c.add(string3);
	}

	public boolean e() {
		return this.h;
	}

	public String f() {
		return this.f;
	}

	public boolean g() {
		if (this.i == 0) {
			return false;
		} else {
			this.i--;
			return true;
		}
	}

	private void k() {
		this.i = 0;
		this.h = false;
	}

	public String h() {
		return this.d;
	}

	public int i() {
		return this.e;
	}

	public int j() {
		return this.g;
	}

	public void b(int integer) {
		this.g = integer;
	}

	public int compareTo(bep bep) {
		int integer3 = cah.a(this.f).compareTo(cah.a(bep.f));
		if (integer3 == 0) {
			integer3 = cah.a(this.d).compareTo(cah.a(bep.d));
		}

		return integer3;
	}
}
