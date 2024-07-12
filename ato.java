import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class ato {
	private final ajs a;
	private final co b;
	private final boolean c;
	private atl d;
	private asc e;
	private boolean f;

	public ato(ajs ajs, co co, boolean boolean3) {
		this.a = ajs;
		this.b = co;
		this.c = boolean3;
	}

	public atl a() {
		if (this.d == null && (this.c || this.a.e(this.b))) {
			this.d = this.a.o(this.b);
		}

		return this.d;
	}

	@Nullable
	public asc b() {
		if (this.e == null && !this.f) {
			this.e = this.a.r(this.b);
			this.f = true;
		}

		return this.e;
	}

	public co d() {
		return this.b;
	}

	public static Predicate<ato> a(Predicate<atl> predicate) {
		return new Predicate<ato>() {
			public boolean apply(@Nullable ato ato) {
				return ato != null && predicate.apply(ato.a());
			}
		};
	}
}
