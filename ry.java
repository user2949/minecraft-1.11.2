import javax.annotation.Nullable;

public class ry {
	public static final ry a = new ry("inFire").n();
	public static final ry b = new ry("lightningBolt");
	public static final ry c = new ry("onFire").k().n();
	public static final ry d = new ry("lava").n();
	public static final ry e = new ry("hotFloor").n();
	public static final ry f = new ry("inWall").k();
	public static final ry g = new ry("cramming").k();
	public static final ry h = new ry("drown").k();
	public static final ry i = new ry("starve").k().m();
	public static final ry j = new ry("cactus");
	public static final ry k = new ry("fall").k();
	public static final ry l = new ry("flyIntoWall").k();
	public static final ry m = new ry("outOfWorld").k().l();
	public static final ry n = new ry("generic").k();
	public static final ry o = new ry("magic").k().t();
	public static final ry p = new ry("wither").k();
	public static final ry q = new ry("anvil");
	public static final ry r = new ry("fallingBlock");
	public static final ry s = new ry("dragonBreath").k();
	public static final ry t = new ry("fireworks").d();
	private boolean v;
	private boolean w;
	private boolean x;
	private float y = 0.1F;
	private boolean z;
	private boolean A;
	private boolean B;
	private boolean C;
	private boolean D;
	public String u;

	public static ry a(sw sw) {
		return new rz("mob", sw);
	}

	public static ry a(sn sn, sw sw) {
		return new sa("mob", sn, sw);
	}

	public static ry a(aay aay) {
		return new rz("player", aay);
	}

	public static ry a(abb abb, @Nullable sn sn) {
		return new sa("arrow", abb, sn).b();
	}

	public static ry a(abf abf, @Nullable sn sn) {
		return sn == null ? new sa("onFire", abf, abf).n().b() : new sa("fireball", abf, sn).n().b();
	}

	public static ry a(sn sn1, @Nullable sn sn2) {
		return new sa("thrown", sn1, sn2).b();
	}

	public static ry b(sn sn1, @Nullable sn sn2) {
		return new sa("indirectMagic", sn1, sn2).k().t();
	}

	public static ry a(sn sn) {
		return new rz("thorns", sn).w().t();
	}

	public static ry a(@Nullable ajn ajn) {
		return ajn != null && ajn.c() != null ? new rz("explosion.player", ajn.c()).q().d() : new ry("explosion").q().d();
	}

	public static ry b(@Nullable sw sw) {
		return sw != null ? new rz("explosion.player", sw).q().d() : new ry("explosion").q().d();
	}

	public boolean a() {
		return this.A;
	}

	public ry b() {
		this.A = true;
		return this;
	}

	public boolean c() {
		return this.D;
	}

	public ry d() {
		this.D = true;
		return this;
	}

	public boolean e() {
		return this.v;
	}

	public float f() {
		return this.y;
	}

	public boolean g() {
		return this.w;
	}

	public boolean h() {
		return this.x;
	}

	protected ry(String string) {
		this.u = string;
	}

	@Nullable
	public sn i() {
		return this.j();
	}

	@Nullable
	public sn j() {
		return null;
	}

	protected ry k() {
		this.v = true;
		this.y = 0.0F;
		return this;
	}

	protected ry l() {
		this.w = true;
		return this;
	}

	protected ry m() {
		this.x = true;
		this.y = 0.0F;
		return this;
	}

	protected ry n() {
		this.z = true;
		return this;
	}

	public fb c(sw sw) {
		sw sw3 = sw.ca();
		String string4 = "death.attack." + this.u;
		String string5 = string4 + ".player";
		return sw3 != null && dp.c(string5) ? new fi(string5, sw.i_(), sw3.i_()) : new fi(string4, sw.i_());
	}

	public boolean o() {
		return this.z;
	}

	public String p() {
		return this.u;
	}

	public ry q() {
		this.B = true;
		return this;
	}

	public boolean r() {
		return this.B;
	}

	public boolean s() {
		return this.C;
	}

	public ry t() {
		this.C = true;
		return this;
	}

	public boolean u() {
		sn sn2 = this.j();
		return sn2 instanceof aay && ((aay)sn2).bK.d;
	}

	@Nullable
	public bdw v() {
		return null;
	}
}
