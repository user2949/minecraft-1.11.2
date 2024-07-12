import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcz extends bcr {
	private static final Logger a = LogManager.getLogger();

	public bcz(bdd[] arr) {
		super(arr);
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		afj afj5 = ahk.a().a(afj);
		if (afj5.b()) {
			a.warn("Couldn't smelt {} because there is no smelting recipe", new Object[]{afj});
			return afj;
		} else {
			afj afj6 = afj5.l();
			afj6.e(afj.E());
			return afj6;
		}
	}

	public static class a extends bcr.a<bcz> {
		protected a() {
			super(new kq("furnace_smelt"), bcz.class);
		}

		public void a(JsonObject jsonObject, bcz bcz, JsonSerializationContext jsonSerializationContext) {
		}

		public bcz b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			return new bcz(arr);
		}
	}
}
