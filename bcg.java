import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;

public class bcg extends bcj {
	public bcg(int integer1, int integer2, bdd[] arr) {
		super(integer1, integer2, arr);
	}

	@Override
	public void a(Collection<afj> collection, Random random, bcl bcl) {
	}

	@Override
	protected void a(JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
	}

	public static bcg a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int integer3, int integer4, bdd[] arr) {
		return new bcg(integer3, integer4, arr);
	}
}
