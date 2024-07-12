import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Random;

public class bcy extends bcr {
	private final du a;

	public bcy(bdd[] arr, du du) {
		super(arr);
		this.a = du;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		du du5 = afj.p();
		if (du5 == null) {
			du5 = this.a.g();
		} else {
			du5.a(this.a);
		}

		afj.b(du5);
		return afj;
	}

	public static class a extends bcr.a<bcy> {
		public a() {
			super(new kq("set_nbt"), bcy.class);
		}

		public void a(JsonObject jsonObject, bcy bcy, JsonSerializationContext jsonSerializationContext) {
			jsonObject.addProperty("tag", bcy.a.toString());
		}

		public bcy b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			try {
				du du5 = ek.a(ok.h(jsonObject, "tag"));
				return new bcy(arr, du5);
			} catch (ej var5) {
				throw new JsonSyntaxException(var5);
			}
		}
	}
}
