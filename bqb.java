import com.google.common.collect.Lists;
import java.util.List;

public abstract class bqb {
	private double c;
	private double d;
	private double e;
	protected List<bte> a = Lists.newArrayListWithCapacity(17424);
	protected boolean b;

	public void a(double double1, double double2, double double3) {
		this.b = true;
		this.a.clear();
		this.c = double1;
		this.d = double2;
		this.e = double3;
	}

	public void a(bte bte) {
		co co3 = bte.k();
		bqg.c((float)((double)co3.p() - this.c), (float)((double)co3.q() - this.d), (float)((double)co3.r() - this.e));
	}

	public void a(bte bte, ajk ajk) {
		this.a.add(bte);
	}

	public abstract void a(ajk ajk);
}
