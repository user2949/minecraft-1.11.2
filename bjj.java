import com.google.common.collect.Lists;
import java.util.List;

public class bjj extends bfy {
	private final bjf u;
	private final List<bji> v = Lists.newArrayList();
	private final List<bjh> w = Lists.newArrayList();
	private final bfy.a x = new bjg();
	private int y = -1;

	public bjj(bjf bjf, bes bes, int integer3, int integer4, int integer5, int integer6, int integer7) {
		super(bes, integer3, integer4, integer5, integer6, integer7);
		this.u = bjf;
	}

	@Override
	public bfy.a b(int integer) {
		if (integer < this.v.size()) {
			return (bfy.a)this.v.get(integer);
		} else {
			integer -= this.v.size();
			return integer == 0 ? this.x : (bfy.a)this.w.get(--integer);
		}
	}

	@Override
	protected int b() {
		return this.v.size() + 1 + this.w.size();
	}

	public void c(int integer) {
		this.y = integer;
	}

	@Override
	protected boolean a(int integer) {
		return integer == this.y;
	}

	public int e() {
		return this.y;
	}

	public void a(bnu bnu) {
		this.v.clear();

		for (int integer3 = 0; integer3 < bnu.c(); integer3++) {
			this.v.add(new bji(this.u, bnu.a(integer3)));
		}
	}

	public void a(List<ccj> list) {
		this.w.clear();

		for (ccj ccj4 : list) {
			this.w.add(new bjh(this.u, ccj4));
		}
	}

	@Override
	protected int d() {
		return super.d() + 30;
	}

	@Override
	public int c() {
		return super.c() + 85;
	}
}
