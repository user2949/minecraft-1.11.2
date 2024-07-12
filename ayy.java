import java.util.Random;
import javax.annotation.Nullable;

public class ayy implements azb {
	private final float a;
	private final Random b;

	public ayy(co co, aza aza) {
		this.a = aza.f();
		this.b = aza.a(co);
	}

	@Nullable
	@Override
	public azc.b a(ajs ajs, co co, azc.b b) {
		return !(this.a >= 1.0F) && !(this.b.nextFloat() <= this.a) ? null : b;
	}
}
