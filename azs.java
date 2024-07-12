public class azs {
	public static final azs a = new azq(azt.b);
	public static final azs b = new azs(azt.c);
	public static final azs c = new azs(azt.l);
	public static final azs d = new azs(azt.o).g();
	public static final azs e = new azs(azt.m).f();
	public static final azs f = new azs(azt.h).f();
	public static final azs g = new azs(azt.h).f().o();
	public static final azs h = new azr(azt.n).n();
	public static final azs i = new azr(azt.f).n();
	public static final azs j = new azs(azt.i).g().s().n();
	public static final azs k = new azp(azt.i).n();
	public static final azs l = new azp(azt.i).g().n().i();
	public static final azs m = new azs(azt.t);
	public static final azs n = new azs(azt.e).g();
	public static final azs o = new azq(azt.b).n();
	public static final azs p = new azs(azt.d);
	public static final azs q = new azp(azt.b).n();
	public static final azs r = new azp(azt.e).g();
	public static final azs s = new azs(azt.b).s().p();
	public static final azs t = new azs(azt.b).p();
	public static final azs u = new azs(azt.f).g().s();
	public static final azs v = new azs(azt.i).n();
	public static final azs w = new azs(azt.g).s().p();
	public static final azs x = new azs(azt.g).p();
	public static final azs y = new azp(azt.j).i().s().f().n();
	public static final azs z = new azs(azt.j).f();
	public static final azs A = new azs(azt.i).s().n();
	public static final azs B = new azs(azt.k);
	public static final azs C = new azs(azt.i).n();
	public static final azs D = new azs(azt.i).n();
	public static final azs E = new azu(azt.b).o();
	public static final azs F = new azs(azt.b).n();
	public static final azs G = (new azs(azt.e) {
		@Override
		public boolean c() {
			return false;
		}
	}).f().n();
	public static final azs H = new azs(azt.m).o();
	public static final azs I = new azs(azt.b).f().o();
	public static final azs J = new azq(azt.b);
	private boolean K;
	private boolean L;
	private boolean M;
	private final azt N;
	private boolean O = true;
	private azv P = azv.NORMAL;
	private boolean Q;

	public azs(azt azt) {
		this.N = azt;
	}

	public boolean d() {
		return false;
	}

	public boolean a() {
		return true;
	}

	public boolean b() {
		return true;
	}

	public boolean c() {
		return true;
	}

	private azs s() {
		this.M = true;
		return this;
	}

	protected azs f() {
		this.O = false;
		return this;
	}

	protected azs g() {
		this.K = true;
		return this;
	}

	public boolean h() {
		return this.K;
	}

	public azs i() {
		this.L = true;
		return this;
	}

	public boolean j() {
		return this.L;
	}

	public boolean k() {
		return this.M ? false : this.c();
	}

	public boolean l() {
		return this.O;
	}

	public azv m() {
		return this.P;
	}

	protected azs n() {
		this.P = azv.DESTROY;
		return this;
	}

	protected azs o() {
		this.P = azv.BLOCK;
		return this;
	}

	protected azs p() {
		this.Q = true;
		return this;
	}

	public azt r() {
		return this.N;
	}
}
