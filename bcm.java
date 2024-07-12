import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;

public class bcm extends bcj {
	protected final kq a;

	public bcm(kq kq, int integer2, int integer3, bdd[] arr) {
		super(integer2, integer3, arr);
		this.a = kq;
	}

	@Override
	public void a(Collection<afj> collection, Random random, bcl bcl) {
		bck bck5 = bcl.e().a(this.a);
		Collection<afj> collection6 = bck5.a(random, bcl);
		collection.addAll(collection6);
	}

	@Override
	protected void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
		jsonObject.addProperty("name", this.a.toString());
	}

	public static bcm a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int integer3, int integer4, bdd[] arr) {
		kq kq6 = new kq(ok.h(jsonObject, "name"));
		return new bcm(kq6, integer3, integer4, arr);
	}
}
