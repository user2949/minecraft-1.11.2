import javax.annotation.Nullable;

public class vr extends vf {
	private final float h;

	public vr(te te, double double2) {
		this(te, double2, 0.001F);
	}

	public vr(te te, double double2, float float3) {
		super(te, double2);
		this.h = float3;
	}

	@Nullable
	@Override
	protected bdw f() {
		if (this.a.aj()) {
			bdw bdw2 = wm.b(this.a, 15, 7);
			return bdw2 == null ? super.f() : bdw2;
		} else {
			return this.a.bJ().nextFloat() >= this.h ? wm.b(this.a, 10, 7) : super.f();
		}
	}
}
