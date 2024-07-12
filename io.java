import java.io.IOException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class io implements fm<im> {
	private String a;
	private boolean b;
	@Nullable
	private co c;

	public io() {
	}

	public io(String string, @Nullable co co, boolean boolean3) {
		this.a = string;
		this.c = co;
		this.b = boolean3;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.e(32767);
		this.b = et.readBoolean();
		boolean boolean3 = et.readBoolean();
		if (boolean3) {
			this.c = et.e();
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(StringUtils.substring(this.a, 0, 32767));
		et.writeBoolean(this.b);
		boolean boolean3 = this.c != null;
		et.writeBoolean(boolean3);
		if (boolean3) {
			et.a(this.c);
		}
	}

	public void a(im im) {
		im.a(this);
	}

	public String a() {
		return this.a;
	}

	@Nullable
	public co b() {
		return this.c;
	}

	public boolean c() {
		return this.b;
	}
}
