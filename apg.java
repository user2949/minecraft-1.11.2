import com.google.common.collect.Lists;
import java.util.List;

public class apg extends alo {
	private static final List<nm> a = Lists.newArrayList(new nm[]{nn.ej, nn.eh, nn.em, nn.ek, nn.ei});

	public apg() {
		super(azs.d);
		this.a(aej.d);
	}

	@Override
	public void a(atl atl, ajs ajs, co co3, alu alu, co co5) {
		boolean boolean7 = ajs.y(co3);
		asc asc8 = ajs.r(co3);
		if (asc8 instanceof ass) {
			ass ass9 = (ass)asc8;
			if (ass9.f != boolean7) {
				if (boolean7) {
					ass9.a(ajs, co3);
				}

				ass9.f = boolean7;
			}
		}
	}

	@Override
	public boolean a(ajs ajs, co co, atl atl, aay aay, ri ri, cv cv, float float7, float float8, float float9) {
		if (ajs.E) {
			return true;
		} else {
			asc asc11 = ajs.r(co);
			if (asc11 instanceof ass) {
				ass ass12 = (ass)asc11;
				ass12.a();
				ass12.a(ajs, co);
				aay.b(oa.S);
			}

			return true;
		}
	}

	@Override
	public void a(ajs ajs, co co, aay aay) {
		if (!ajs.E) {
			asc asc5 = ajs.r(co);
			if (asc5 instanceof ass) {
				((ass)asc5).a(ajs, co);
				aay.b(oa.R);
			}
		}
	}

	@Override
	public asc a(ajs ajs, int integer) {
		return new ass();
	}

	private nm e(int integer) {
		if (integer < 0 || integer >= a.size()) {
			integer = 0;
		}

		return (nm)a.get(integer);
	}

	@Override
	public boolean a(atl atl, ajs ajs, co co, int integer4, int integer5) {
		float float7 = (float)Math.pow(2.0, (double)(integer5 - 12) / 12.0);
		ajs.a(null, co, this.e(integer4), no.RECORDS, 3.0F, float7);
		ajs.a(de.NOTE, (double)co.p() + 0.5, (double)co.q() + 1.2, (double)co.r() + 0.5, (double)integer5 / 24.0, 0.0, 0.0);
		return true;
	}

	@Override
	public aqf a(atl atl) {
		return aqf.MODEL;
	}
}
