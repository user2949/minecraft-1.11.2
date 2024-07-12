import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bck {
	private static final Logger b = LogManager.getLogger();
	public static final bck a = new bck(new bci[0]);
	private final bci[] c;

	public bck(bci[] arr) {
		this.c = arr;
	}

	public List<afj> a(Random random, bcl bcl) {
		List<afj> list4 = Lists.newArrayList();
		if (bcl.a(this)) {
			for (bci bci8 : this.c) {
				bci8.b(list4, random, bcl);
			}

			bcl.b(this);
		} else {
			b.warn("Detected infinite loop in loot tables");
		}

		return list4;
	}

	public void a(rc rc, Random random, bcl bcl) {
		List<afj> list5 = this.a(random, bcl);
		List<Integer> list6 = this.a(rc, random);
		this.a(list5, list6.size(), random);

		for (afj afj8 : list5) {
			if (list6.isEmpty()) {
				b.warn("Tried to over-fill a container");
				return;
			}

			if (afj8.b()) {
				rc.a((Integer)list6.remove(list6.size() - 1), afj.a);
			} else {
				rc.a((Integer)list6.remove(list6.size() - 1), afj8);
			}
		}
	}

	private void a(List<afj> list, int integer, Random random) {
		List<afj> list5 = Lists.newArrayList();
		Iterator<afj> iterator6 = list.iterator();

		while (iterator6.hasNext()) {
			afj afj7 = (afj)iterator6.next();
			if (afj7.b()) {
				iterator6.remove();
			} else if (afj7.E() > 1) {
				list5.add(afj7);
				iterator6.remove();
			}
		}

		integer -= list.size();

		while (integer > 0 && list5.size() > 0) {
			afj afj6 = (afj)list5.remove(ot.a(random, 0, list5.size() - 1));
			int integer7 = ot.a(random, 1, afj6.E() / 2);
			afj afj8 = afj6.a(integer7);
			if (afj6.E() > 1 && random.nextBoolean()) {
				list5.add(afj6);
			} else {
				list.add(afj6);
			}

			if (afj8.E() > 1 && random.nextBoolean()) {
				list5.add(afj8);
			} else {
				list.add(afj8);
			}
		}

		list.addAll(list5);
		Collections.shuffle(list, random);
	}

	private List<Integer> a(rc rc, Random random) {
		List<Integer> list4 = Lists.newArrayList();

		for (int integer5 = 0; integer5 < rc.v_(); integer5++) {
			if (rc.a(integer5).b()) {
				list4.add(integer5);
			}
		}

		Collections.shuffle(list4, random);
		return list4;
	}

	public static class a implements JsonDeserializer<bck>, JsonSerializer<bck> {
		public bck deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			JsonObject jsonObject5 = ok.m(jsonElement, "loot table");
			bci[] arr6 = ok.a(jsonObject5, "pools", new bci[0], jsonDeserializationContext, bci[].class);
			return new bck(arr6);
		}

		public JsonElement serialize(bck bck, Type type, JsonSerializationContext jsonSerializationContext) {
			JsonObject jsonObject5 = new JsonObject();
			jsonObject5.add("pools", jsonSerializationContext.serialize(bck.c));
			return jsonObject5;
		}
	}
}
