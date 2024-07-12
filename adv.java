import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class adv extends afh {
	protected final alu a;

	public adv(alu alu) {
		this.a = alu;
	}

	@Override
	public rk a(aay aay, ajs ajs, co co, ri ri, cv cv, float float6, float float7, float float8) {
		atl atl10 = ajs.o(co);
		alu alu11 = atl10.v();
		if (!alu11.a((ajw)ajs, co)) {
			co = co.a(cv);
		}

		afj afj12 = aay.b(ri);
		if (!afj12.b() && aay.a(co, cv, afj12) && ajs.a(this.a, co, false, cv, null)) {
			int integer13 = this.a(afj12.j());
			atl atl14 = this.a.a(ajs, co, cv, float6, float7, float8, integer13, aay);
			if (ajs.a(co, atl14, 11)) {
				atl14 = ajs.o(co);
				if (atl14.v() == this.a) {
					a(ajs, aay, co, afj12);
					this.a.a(ajs, co, atl14, aay, afj12);
				}

				aqu aqu15 = this.a.v();
				ajs.a(aay, co, aqu15.e(), no.BLOCKS, (aqu15.a() + 1.0F) / 2.0F, aqu15.b() * 0.8F);
				afj12.g(1);
			}

			return rk.SUCCESS;
		} else {
			return rk.FAIL;
		}
	}

	public static boolean a(ajs ajs, @Nullable aay aay, co co, afj afj) {
		MinecraftServer minecraftServer5 = ajs.u();
		if (minecraftServer5 == null) {
			return false;
		} else {
			du du6 = afj.d("BlockEntityTag");
			if (du6 != null) {
				asc asc7 = ajs.r(co);
				if (asc7 != null) {
					if (!ajs.E && asc7.C() && (aay == null || !aay.dk())) {
						return false;
					}

					du du8 = asc7.b(new du());
					du du9 = du8.g();
					du8.a(du6);
					du8.a("x", co.p());
					du8.a("y", co.q());
					du8.a("z", co.r());
					if (!du8.equals(du9)) {
						asc7.a(du8);
						asc7.x_();
						return true;
					}
				}
			}

			return false;
		}
	}

	public boolean a(ajs ajs, co co, cv cv, aay aay, afj afj) {
		alu alu7 = ajs.o(co).v();
		if (alu7 == alv.aH) {
			cv = cv.UP;
		} else if (!alu7.a((ajw)ajs, co)) {
			co = co.a(cv);
		}

		return ajs.a(this.a, co, false, cv, null);
	}

	@Override
	public String a(afj afj) {
		return this.a.a();
	}

	@Override
	public String a() {
		return this.a.a();
	}

	@Override
	public aej b() {
		return this.a.q();
	}

	@Override
	public void a(afh afh, aej aej, dd<afj> dd) {
		this.a.a(afh, aej, dd);
	}

	@Override
	public void a(afj afj, aay aay, List<String> list, boolean boolean4) {
		super.a(afj, aay, list, boolean4);
		this.a.a(afj, aay, list, boolean4);
	}

	public alu d() {
		return this.a;
	}
}
