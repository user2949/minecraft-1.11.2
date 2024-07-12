import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

public class ke implements fm<kc> {
	private static final Gson a = new GsonBuilder()
		.registerTypeAdapter(kf.c.class, new kf.c.a())
		.registerTypeAdapter(kf.a.class, new kf.a.a())
		.registerTypeAdapter(kf.class, new kf.b())
		.registerTypeHierarchyAdapter(fb.class, new fb.a())
		.registerTypeHierarchyAdapter(fg.class, new fg.a())
		.registerTypeAdapterFactory(new os())
		.create();
	private kf b;

	public ke() {
	}

	public ke(kf kf) {
		this.b = kf;
	}

	@Override
	public void a(et et) throws IOException {
		this.b = ok.a(a, et.e(32767), kf.class);
	}

	@Override
	public void b(et et) throws IOException {
		et.a(a.toJson(this.b));
	}

	public void a(kc kc) {
		kc.a(this);
	}

	public kf a() {
		return this.b;
	}
}
