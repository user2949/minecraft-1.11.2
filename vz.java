import com.google.common.base.Predicate;

public class vz<T extends sw> extends vy<T> {
	private final ti i;

	public vz(ti ti, Class<T> class2, boolean boolean3, Predicate<? super T> predicate) {
		super(ti, class2, 10, boolean3, false, predicate);
		this.i = ti;
	}

	@Override
	public boolean a() {
		return !this.i.dh() && super.a();
	}
}
