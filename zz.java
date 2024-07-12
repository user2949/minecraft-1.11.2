import javax.annotation.Nullable;

public class zz extends aah {
	public zz(ajs ajs) {
		super(ajs);
		this.X = true;
	}

	public static void a(ph ph) {
		sx.a(ph, zz.class);
	}

	@Override
	protected void bE() {
		super.bE();
		this.a(aad.d).a(0.2F);
	}

	@Override
	public boolean cM() {
		return this.l.ae() != rg.PEACEFUL;
	}

	@Override
	public boolean cN() {
		return this.l.a(this.bo(), this) && this.l.a(this, this.bo()).isEmpty() && !this.l.d(this.bo());
	}

	@Override
	protected void a(int integer, boolean boolean2) {
		super.a(integer, boolean2);
		this.a(aad.g).a((double)(integer * 3));
	}

	@Override
	public int d(float float1) {
		return 15728880;
	}

	@Override
	public float e(float float1) {
		return 1.0F;
	}

	@Override
	protected de o() {
		return de.FLAME;
	}

	@Override
	protected aah da() {
		return new zz(this.l);
	}

	@Nullable
	@Override
	protected kq J() {
		return this.di() ? bcf.a : bcf.ai;
	}

	@Override
	public boolean aJ() {
		return false;
	}

	@Override
	protected int db() {
		return super.db() * 4;
	}

	@Override
	protected void dc() {
		this.a *= 0.9F;
	}

	@Override
	protected void cm() {
		this.t = (double)(0.42F + (float)this.dh() * 0.1F);
		this.ai = true;
	}

	@Override
	protected void co() {
		this.t = (double)(0.22F + (float)this.dh() * 0.05F);
		this.ai = true;
	}

	@Override
	public void e(float float1, float float2) {
	}

	@Override
	protected boolean dd() {
		return true;
	}

	@Override
	protected int de() {
		return super.de() + 2;
	}

	@Override
	protected nm bW() {
		return this.di() ? nn.gi : nn.dJ;
	}

	@Override
	protected nm bX() {
		return this.di() ? nn.gh : nn.dI;
	}

	@Override
	protected nm df() {
		return this.di() ? nn.gj : nn.dL;
	}

	@Override
	protected nm dg() {
		return nn.dK;
	}
}
