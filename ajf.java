import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nullable;

public class ajf extends ArrayList<aje> {
	public ajf() {
	}

	public ajf(du du) {
		this.a(du);
	}

	@Nullable
	public aje a(afj afj1, afj afj2, int integer) {
		if (integer > 0 && integer < this.size()) {
			aje aje5 = (aje)this.get(integer);
			return !this.a(afj1, aje5.a())
					|| (!afj2.b() || aje5.c()) && (!aje5.c() || !this.a(afj2, aje5.b()))
					|| afj1.E() < aje5.a().E()
					|| aje5.c() && afj2.E() < aje5.b().E()
				? null
				: aje5;
		} else {
			for (int integer5 = 0; integer5 < this.size(); integer5++) {
				aje aje6 = (aje)this.get(integer5);
				if (this.a(afj1, aje6.a()) && afj1.E() >= aje6.a().E() && (!aje6.c() && afj2.b() || aje6.c() && this.a(afj2, aje6.b()) && afj2.E() >= aje6.b().E())) {
					return aje6;
				}
			}

			return null;
		}
	}

	private boolean a(afj afj1, afj afj2) {
		return afj.c(afj1, afj2) && (!afj2.o() || afj1.o() && ee.a(afj2.p(), afj1.p(), false));
	}

	public void a(et et) {
		et.writeByte((byte)(this.size() & 0xFF));

		for (int integer3 = 0; integer3 < this.size(); integer3++) {
			aje aje4 = (aje)this.get(integer3);
			et.a(aje4.a());
			et.a(aje4.d());
			afj afj5 = aje4.b();
			et.writeBoolean(!afj5.b());
			if (!afj5.b()) {
				et.a(afj5);
			}

			et.writeBoolean(aje4.h());
			et.writeInt(aje4.e());
			et.writeInt(aje4.f());
		}
	}

	public static ajf b(et et) throws IOException {
		ajf ajf2 = new ajf();
		int integer3 = et.readByte() & 255;

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			afj afj5 = et.k();
			afj afj6 = et.k();
			afj afj7 = afj.a;
			if (et.readBoolean()) {
				afj7 = et.k();
			}

			boolean boolean8 = et.readBoolean();
			int integer9 = et.readInt();
			int integer10 = et.readInt();
			aje aje11 = new aje(afj5, afj7, afj6, integer9, integer10);
			if (boolean8) {
				aje11.i();
			}

			ajf2.add(aje11);
		}

		return ajf2;
	}

	public void a(du du) {
		ea ea3 = du.c("Recipes", 10);

		for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
			du du5 = ea3.b(integer4);
			this.add(new aje(du5));
		}
	}

	public du a() {
		du du2 = new du();
		ea ea3 = new ea();

		for (int integer4 = 0; integer4 < this.size(); integer4++) {
			aje aje5 = (aje)this.get(integer4);
			ea3.a(aje5.k());
		}

		du2.a("Recipes", ea3);
		return du2;
	}
}
