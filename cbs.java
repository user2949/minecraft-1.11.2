import javax.annotation.Nullable;

public abstract class cbs implements ccc {
	protected cbz a;
	@Nullable
	private ccu l;
	protected no b;
	protected kq c;
	protected float d = 1.0F;
	protected float e = 1.0F;
	protected float f;
	protected float g;
	protected float h;
	protected boolean i;
	protected int j;
	protected ccc.a k = ccc.a.LINEAR;

	protected cbs(nm nm, no no) {
		this(nm.a(), no);
	}

	protected cbs(kq kq, no no) {
		this.c = kq;
		this.b = no;
	}

	@Override
	public kq a() {
		return this.c;
	}

	@Override
	public ccu a(ccs ccs) {
		this.l = ccs.a(this.c);
		if (this.l == null) {
			this.a = ccs.a;
		} else {
			this.a = this.l.a();
		}

		return this.l;
	}

	@Override
	public cbz b() {
		return this.a;
	}

	@Override
	public no c() {
		return this.b;
	}

	@Override
	public boolean d() {
		return this.i;
	}

	@Override
	public int e() {
		return this.j;
	}

	@Override
	public float f() {
		return this.d * this.a.c();
	}

	@Override
	public float g() {
		return this.e * this.a.d();
	}

	@Override
	public float h() {
		return this.f;
	}

	@Override
	public float i() {
		return this.g;
	}

	@Override
	public float j() {
		return this.h;
	}

	@Override
	public ccc.a k() {
		return this.k;
	}
}
