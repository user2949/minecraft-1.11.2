import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;

public class bch extends bcj {
	protected final afh a;
	protected final bcr[] b;

	public bch(afh afh, int integer2, int integer3, bcr[] arr, bdd[] arr) {
		super(integer2, integer3, arr);
		this.a = afh;
		this.b = arr;
	}

	@Override
	public void a(Collection<afj> collection, Random random, bcl bcl) {
		afj afj5 = new afj(this.a);

		for (bcr bcr9 : this.b) {
			if (bde.a(bcr9.a(), random, bcl)) {
				afj5 = bcr9.a(afj5, random, bcl);
			}
		}

		if (!afj5.b()) {
			if (afj5.E() < this.a.k()) {
				collection.add(afj5);
			} else {
				int integer6 = afj5.E();

				while (integer6 > 0) {
					afj afj7 = afj5.l();
					afj7.e(Math.min(afj5.d(), integer6));
					integer6 -= afj7.E();
					collection.add(afj7);
				}
			}
		}
	}

	@Override
	protected void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
		if (this.b != null && this.b.length > 0) {
			jsonObject.add("functions", jsonSerializationContext.serialize(this.b));
		}

		kq kq4 = afh.g.b(this.a);
		if (kq4 == null) {
			throw new IllegalArgumentException("Can't serialize unknown item " + this.a);
		} else {
			jsonObject.addProperty("name", kq4.toString());
		}
	}

	public static bch a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int integer3, int integer4, bdd[] arr) {
		afh afh6 = ok.i(jsonObject, "name");
		bcr[] arr7;
		if (jsonObject.has("functions")) {
			arr7 = ok.a(jsonObject, "functions", jsonDeserializationContext, bcr[].class);
		} else {
			arr7 = new bcr[0];
		}

		return new bch(afh6, integer3, integer4, arr7, arr);
	}
}
