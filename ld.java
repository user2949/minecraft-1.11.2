import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class ld extends bec {
	private final MinecraftServer a;
	private final Set<bdy> b = Sets.newHashSet();
	private Runnable[] c = new Runnable[0];

	public ld(MinecraftServer minecraftServer) {
		this.a = minecraftServer;
	}

	@Override
	public void a(bea bea) {
		super.a(bea);
		if (this.b.contains(bea.d())) {
			this.a.am().a(new ib(bea));
		}

		this.b();
	}

	@Override
	public void a(String string) {
		super.a(string);
		this.a.am().a(new ib(string));
		this.b();
	}

	@Override
	public void a(String string, bdy bdy) {
		super.a(string, bdy);
		this.a.am().a(new ib(string, bdy));
		this.b();
	}

	@Override
	public void a(int integer, bdy bdy) {
		bdy bdy4 = this.a(integer);
		super.a(integer, bdy);
		if (bdy4 != bdy && bdy4 != null) {
			if (this.h(bdy4) > 0) {
				this.a.am().a(new hr(integer, bdy));
			} else {
				this.g(bdy4);
			}
		}

		if (bdy != null) {
			if (this.b.contains(bdy)) {
				this.a.am().a(new hr(integer, bdy));
			} else {
				this.e(bdy);
			}
		}

		this.b();
	}

	@Override
	public boolean a(String string1, String string2) {
		if (super.a(string1, string2)) {
			bdz bdz4 = this.d(string2);
			this.a.am().a(new ia(bdz4, Arrays.asList(string1), 3));
			this.b();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void a(String string, bdz bdz) {
		super.a(string, bdz);
		this.a.am().a(new ia(bdz, Arrays.asList(string), 4));
		this.b();
	}

	@Override
	public void a(bdy bdy) {
		super.a(bdy);
		this.b();
	}

	@Override
	public void b(bdy bdy) {
		super.b(bdy);
		if (this.b.contains(bdy)) {
			this.a.am().a(new hy(bdy, 2));
		}

		this.b();
	}

	@Override
	public void c(bdy bdy) {
		super.c(bdy);
		if (this.b.contains(bdy)) {
			this.g(bdy);
		}

		this.b();
	}

	@Override
	public void a(bdz bdz) {
		super.a(bdz);
		this.a.am().a(new ia(bdz, 0));
		this.b();
	}

	@Override
	public void b(bdz bdz) {
		super.b(bdz);
		this.a.am().a(new ia(bdz, 2));
		this.b();
	}

	@Override
	public void c(bdz bdz) {
		super.c(bdz);
		this.a.am().a(new ia(bdz, 1));
		this.b();
	}

	public void a(Runnable runnable) {
		this.c = (Runnable[])Arrays.copyOf(this.c, this.c.length + 1);
		this.c[this.c.length - 1] = runnable;
	}

	protected void b() {
		for (Runnable runnable5 : this.c) {
			runnable5.run();
		}
	}

	public List<fm<?>> d(bdy bdy) {
		List<fm<?>> list3 = Lists.newArrayList();
		list3.add(new hy(bdy, 0));

		for (int integer4 = 0; integer4 < 19; integer4++) {
			if (this.a(integer4) == bdy) {
				list3.add(new hr(integer4, bdy));
			}
		}

		for (bea bea5 : this.i(bdy)) {
			list3.add(new ib(bea5));
		}

		return list3;
	}

	public void e(bdy bdy) {
		List<fm<?>> list3 = this.d(bdy);

		for (ly ly5 : this.a.am().v()) {
			for (fm<?> fm7 : list3) {
				ly5.a.a(fm7);
			}
		}

		this.b.add(bdy);
	}

	public List<fm<?>> f(bdy bdy) {
		List<fm<?>> list3 = Lists.newArrayList();
		list3.add(new hy(bdy, 1));

		for (int integer4 = 0; integer4 < 19; integer4++) {
			if (this.a(integer4) == bdy) {
				list3.add(new hr(integer4, bdy));
			}
		}

		return list3;
	}

	public void g(bdy bdy) {
		List<fm<?>> list3 = this.f(bdy);

		for (ly ly5 : this.a.am().v()) {
			for (fm<?> fm7 : list3) {
				ly5.a.a(fm7);
			}
		}

		this.b.remove(bdy);
	}

	public int h(bdy bdy) {
		int integer3 = 0;

		for (int integer4 = 0; integer4 < 19; integer4++) {
			if (this.a(integer4) == bdy) {
				integer3++;
			}
		}

		return integer3;
	}
}
