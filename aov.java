import java.util.Random;

public class aov extends alo {
	protected aov() {
		super(azs.e);
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new asr();
	}

	@Override
	public afh a(atl atl, Random random, int integer) {
		return afl.a;
	}

	@Override
	public int a(Random random) {
		return 0;
	}

	@Override
	public void a(ajs ajs, co co, atl atl, float float4, int integer) {
		super.a(ajs, co, atl, float4, integer);
		int integer7 = 15 + ajs.r.nextInt(15) + ajs.r.nextInt(15);
		this.b(ajs, co, integer7);
	}

	@Override
	public boolean b(atl atl) {
		return false;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}

	@Override
	public ajk f() {
		return ajk.CUTOUT;
	}

	@Override
	public afj a(ajs ajs, co co, atl atl) {
		return afj.a;
	}
}
