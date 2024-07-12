import com.google.common.base.Predicate;
import java.util.Random;

public class axe extends awn {
	private final atl a;
	private final int b;
	private final Predicate<atl> c;

	public axe(atl atl, int integer) {
		this(atl, integer, new axe.a());
	}

	public axe(atl atl, int integer, Predicate<atl> predicate) {
		this.a = atl;
		this.b = integer;
		this.c = predicate;
	}

	@Override
	public boolean b(ajs ajs, Random random, co co) {
		float float5 = random.nextFloat() * (float) Math.PI;
		double double6 = (double)((float)(co.p() + 8) + ot.a(float5) * (float)this.b / 8.0F);
		double double8 = (double)((float)(co.p() + 8) - ot.a(float5) * (float)this.b / 8.0F);
		double double10 = (double)((float)(co.r() + 8) + ot.b(float5) * (float)this.b / 8.0F);
		double double12 = (double)((float)(co.r() + 8) - ot.b(float5) * (float)this.b / 8.0F);
		double double14 = (double)(co.q() + random.nextInt(3) - 2);
		double double16 = (double)(co.q() + random.nextInt(3) - 2);

		for (int integer18 = 0; integer18 < this.b; integer18++) {
			float float19 = (float)integer18 / (float)this.b;
			double double20 = double6 + (double8 - double6) * (double)float19;
			double double22 = double14 + (double16 - double14) * (double)float19;
			double double24 = double10 + (double12 - double10) * (double)float19;
			double double26 = random.nextDouble() * (double)this.b / 16.0;
			double double28 = (double)(ot.a((float) Math.PI * float19) + 1.0F) * double26 + 1.0;
			double double30 = (double)(ot.a((float) Math.PI * float19) + 1.0F) * double26 + 1.0;
			int integer32 = ot.c(double20 - double28 / 2.0);
			int integer33 = ot.c(double22 - double30 / 2.0);
			int integer34 = ot.c(double24 - double28 / 2.0);
			int integer35 = ot.c(double20 + double28 / 2.0);
			int integer36 = ot.c(double22 + double30 / 2.0);
			int integer37 = ot.c(double24 + double28 / 2.0);

			for (int integer38 = integer32; integer38 <= integer35; integer38++) {
				double double39 = ((double)integer38 + 0.5 - double20) / (double28 / 2.0);
				if (double39 * double39 < 1.0) {
					for (int integer41 = integer33; integer41 <= integer36; integer41++) {
						double double42 = ((double)integer41 + 0.5 - double22) / (double30 / 2.0);
						if (double39 * double39 + double42 * double42 < 1.0) {
							for (int integer44 = integer34; integer44 <= integer37; integer44++) {
								double double45 = ((double)integer44 + 0.5 - double24) / (double28 / 2.0);
								if (double39 * double39 + double42 * double42 + double45 * double45 < 1.0) {
									co co47 = new co(integer38, integer41, integer44);
									if (this.c.apply(ajs.o(co47))) {
										ajs.a(co47, this.a, 2);
									}
								}
							}
						}
					}
				}
			}
		}

		return true;
	}

	static class a implements Predicate<atl> {
		private a() {
		}

		public boolean apply(atl atl) {
			if (atl != null && atl.v() == alv.b) {
				arc.a a3 = atl.c(arc.a);
				return a3.e();
			} else {
				return false;
			}
		}
	}
}
