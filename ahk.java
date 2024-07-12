import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class ahk {
	private static final ahk a = new ahk();
	private final Map<afj, afj> b = Maps.newHashMap();
	private final Map<afj, Float> c = Maps.newHashMap();

	public static ahk a() {
		return a;
	}

	private ahk() {
		this.a(alv.p, new afj(afl.m), 0.7F);
		this.a(alv.o, new afj(afl.n), 1.0F);
		this.a(alv.ag, new afj(afl.l), 1.0F);
		this.a(alv.m, new afj(alv.w), 0.1F);
		this.a(afl.ao, new afj(afl.ap), 0.35F);
		this.a(afl.bq, new afj(afl.br), 0.35F);
		this.a(afl.bs, new afj(afl.bt), 0.35F);
		this.a(afl.bw, new afj(afl.bx), 0.35F);
		this.a(afl.bu, new afj(afl.bv), 0.35F);
		this.a(alv.e, new afj(alv.b), 0.1F);
		this.a(new afj(alv.bf, 1, ard.b), new afj(alv.bf, 1, ard.d), 0.1F);
		this.a(afl.aQ, new afj(afl.aP), 0.3F);
		this.a(alv.aL, new afj(alv.cz), 0.35F);
		this.a(alv.aK, new afj(afl.be, 1, aem.GREEN.b()), 0.2F);
		this.a(alv.r, new afj(afl.k, 1, 1), 0.15F);
		this.a(alv.s, new afj(afl.k, 1, 1), 0.15F);
		this.a(alv.bP, new afj(afl.bZ), 1.0F);
		this.a(afl.cd, new afj(afl.ce), 0.35F);
		this.a(alv.aV, new afj(afl.cq), 0.1F);
		this.a(new afj(alv.v, 1, 1), new afj(alv.v, 1, 0), 0.15F);
		this.a(afl.cT, new afj(afl.cU), 0.1F);

		for (afa.a a5 : afa.a.values()) {
			if (a5.g()) {
				this.a(new afj(afl.bc, 1, a5.a()), new afj(afl.bd, 1, a5.a()), 0.35F);
			}
		}

		this.a(alv.q, new afj(afl.k), 0.1F);
		this.a(alv.aC, new afj(afl.aF), 0.7F);
		this.a(alv.x, new afj(afl.be, 1, aem.BLUE.b()), 0.2F);
		this.a(alv.co, new afj(afl.cr), 0.2F);
		this.a(afl.X, new afj(afl.da), 0.1F);
		this.a(afl.Y, new afj(afl.da), 0.1F);
		this.a(afl.Z, new afj(afl.da), 0.1F);
		this.a(afl.aa, new afj(afl.da), 0.1F);
		this.a(afl.c, new afj(afl.da), 0.1F);
		this.a(afl.b, new afj(afl.da), 0.1F);
		this.a(afl.d, new afj(afl.da), 0.1F);
		this.a(afl.N, new afj(afl.da), 0.1F);
		this.a(afl.o, new afj(afl.da), 0.1F);
		this.a(afl.ab, new afj(afl.da), 0.1F);
		this.a(afl.ac, new afj(afl.da), 0.1F);
		this.a(afl.ad, new afj(afl.da), 0.1F);
		this.a(afl.ae, new afj(afl.da), 0.1F);
		this.a(afl.cv, new afj(afl.da), 0.1F);
		this.a(afl.G, new afj(afl.bF), 0.1F);
		this.a(afl.F, new afj(afl.bF), 0.1F);
		this.a(afl.H, new afj(afl.bF), 0.1F);
		this.a(afl.P, new afj(afl.bF), 0.1F);
		this.a(afl.E, new afj(afl.bF), 0.1F);
		this.a(afl.aj, new afj(afl.bF), 0.1F);
		this.a(afl.ak, new afj(afl.bF), 0.1F);
		this.a(afl.al, new afj(afl.bF), 0.1F);
		this.a(afl.am, new afj(afl.bF), 0.1F);
		this.a(afl.cw, new afj(afl.bF), 0.1F);
	}

	public void a(alu alu, afj afj, float float3) {
		this.a(afh.a(alu), afj, float3);
	}

	public void a(afh afh, afj afj, float float3) {
		this.a(new afj(afh, 1, 32767), afj, float3);
	}

	public void a(afj afj1, afj afj2, float float3) {
		this.b.put(afj1, afj2);
		this.c.put(afj2, float3);
	}

	public afj a(afj afj) {
		for (Entry<afj, afj> entry4 : this.b.entrySet()) {
			if (this.a(afj, (afj)entry4.getKey())) {
				return (afj)entry4.getValue();
			}
		}

		return afj.a;
	}

	private boolean a(afj afj1, afj afj2) {
		return afj2.c() == afj1.c() && (afj2.j() == 32767 || afj2.j() == afj1.j());
	}

	public Map<afj, afj> b() {
		return this.b;
	}

	public float b(afj afj) {
		for (Entry<afj, Float> entry4 : this.c.entrySet()) {
			if (this.a(afj, (afj)entry4.getKey())) {
				return (Float)entry4.getValue();
			}
		}

		return 0.0F;
	}
}
