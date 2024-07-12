import javax.annotation.Nullable;

public class aar implements ajd {
	private final add a;
	private final aay b;
	private ajf c;
	private final fb d;

	public aar(aay aay, fb fb) {
		this.b = aay;
		this.d = fb;
		this.a = new add(aay, this);
	}

	@Override
	public aay s_() {
		return this.b;
	}

	@Override
	public void a_(aay aay) {
	}

	@Nullable
	@Override
	public ajf b_(aay aay) {
		return this.c;
	}

	@Override
	public void a(@Nullable ajf ajf) {
		this.c = ajf;
	}

	@Override
	public void a(aje aje) {
		aje.g();
	}

	@Override
	public void a(afj afj) {
	}

	@Override
	public fb i_() {
		return (fb)(this.d != null ? this.d : new fi("entity.Villager.name"));
	}

	@Override
	public ajs t_() {
		return this.b.l;
	}

	@Override
	public co u_() {
		return new co(this.b);
	}
}
