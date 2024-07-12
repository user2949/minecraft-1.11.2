import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcp extends bcr {
	private static final Logger a = LogManager.getLogger();
	private final List<aii> b;

	public bcp(bdd[] arr, @Nullable List<aii> list) {
		super(arr);
		this.b = list == null ? Collections.emptyList() : list;
	}

	@Override
	public afj a(afj afj, Random random, bcl bcl) {
		aii aii5;
		if (this.b.isEmpty()) {
			List<aii> list6 = Lists.newArrayList();

			for (aii aii8 : aii.b) {
				if (afj.c() == afl.aT || aii8.a(afj)) {
					list6.add(aii8);
				}
			}

			if (list6.isEmpty()) {
				a.warn("Couldn't find a compatible enchantment for {}", new Object[]{afj});
				return afj;
			}

			aii5 = (aii)list6.get(random.nextInt(list6.size()));
		} else {
			aii5 = (aii)this.b.get(random.nextInt(this.b.size()));
		}

		int integer6 = ot.a(random, aii5.f(), aii5.b());
		if (afj.c() == afl.aT) {
			afj = new afj(afl.co);
			afl.co.a(afj, new ail(aii5, integer6));
		} else {
			afj.a(aii5, integer6);
		}

		return afj;
	}

	public static class a extends bcr.a<bcp> {
		public a() {
			super(new kq("enchant_randomly"), bcp.class);
		}

		public void a(JsonObject jsonObject, bcp bcp, JsonSerializationContext jsonSerializationContext) {
			if (!bcp.b.isEmpty()) {
				JsonArray jsonArray5 = new JsonArray();

				for (aii aii7 : bcp.b) {
					kq kq8 = aii.b.b(aii7);
					if (kq8 == null) {
						throw new IllegalArgumentException("Don't know how to serialize enchantment " + aii7);
					}

					jsonArray5.add(new JsonPrimitive(kq8.toString()));
				}

				jsonObject.add("enchantments", jsonArray5);
			}
		}

		public bcp b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, bdd[] arr) {
			List<aii> list5 = Lists.newArrayList();
			if (jsonObject.has("enchantments")) {
				for (JsonElement jsonElement8 : ok.u(jsonObject, "enchantments")) {
					String string9 = ok.a(jsonElement8, "enchantment");
					aii aii10 = aii.b.c(new kq(string9));
					if (aii10 == null) {
						throw new JsonSyntaxException("Unknown enchantment '" + string9 + "'");
					}

					list5.add(aii10);
				}
			}

			return new bcp(arr, list5);
		}
	}
}
