import com.google.common.collect.Multimap;
import java.util.Set;

public class aek extends afh {
	private final Set<alu> e;
	protected float a = 4.0F;
	protected float b;
	protected float c;
	protected afh.a d;

	protected aek(float float1, float float2, afh.a a, Set<alu> set) {
		this.d = a;
		this.e = set;
		this.k = 1;
		this.e(a.a());
		this.a = a.b();
		this.b = float1 + a.c();
		this.c = float2;
		this.a(aej.i);
	}

	protected aek(afh.a a, Set<alu> set) {
		this(0.0F, 0.0F, a, set);
	}

	@Override
	public float a(afj afj, atl atl) {
		return this.e.contains(atl.v()) ? this.a : 1.0F;
	}

	@Override
	public boolean a(afj afj, sw sw2, sw sw3) {
		afj.a(2, sw3);
		return true;
	}

	@Override
	public boolean a(afj afj, ajs ajs, atl atl, co co, sw sw) {
		if (!ajs.E && (double)atl.b(ajs, co) != 0.0) {
			afj.a(1, sw);
		}

		return true;
	}

	@Override
	public boolean C_() {
		return true;
	}

	public afh.a g() {
		return this.d;
	}

	@Override
	public int c() {
		return this.d.e();
	}

	public String h() {
		return this.d.toString();
	}

	@Override
	public boolean a(afj afj1, afj afj2) {
		return this.d.f() == afj2.c() ? true : super.a(afj1, afj2);
	}

	@Override
	public Multimap<String, tl> a(ss ss) {
		Multimap<String, tl> multimap3 = super.a(ss);
		if (ss == ss.MAINHAND) {
			multimap3.put(aad.e.a(), new tl(h, "Tool modifier", (double)this.b, 0));
			multimap3.put(aad.f.a(), new tl(i, "Tool modifier", (double)this.c, 0));
		}

		return multimap3;
	}
}
