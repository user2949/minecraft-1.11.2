public class bdu {
	private co e;
	public bdu.a a;
	public cv b;
	public bdw c;
	public sn d;

	public bdu(bdw bdw, cv cv, co co) {
		this(bdu.a.BLOCK, bdw, cv, co);
	}

	public bdu(bdw bdw, cv cv) {
		this(bdu.a.BLOCK, bdw, cv, co.a);
	}

	public bdu(sn sn) {
		this(sn, new bdw(sn.p, sn.q, sn.r));
	}

	public bdu(bdu.a a, bdw bdw, cv cv, co co) {
		this.a = a;
		this.e = co;
		this.b = cv;
		this.c = new bdw(bdw.b, bdw.c, bdw.d);
	}

	public bdu(sn sn, bdw bdw) {
		this.a = bdu.a.ENTITY;
		this.d = sn;
		this.c = bdw;
	}

	public co a() {
		return this.e;
	}

	public String toString() {
		return "HitResult{type=" + this.a + ", blockpos=" + this.e + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.d + '}';
	}

	public static enum a {
		MISS,
		BLOCK,
		ENTITY;
	}
}
