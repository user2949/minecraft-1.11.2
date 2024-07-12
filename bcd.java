import javax.annotation.Nullable;

public class bcd extends bce {
	public bcd() {
		super(null);
	}

	@Nullable
	@Override
	public bbl a(Class<? extends bbl> class1, String string) {
		return (bbl)this.a.get(string);
	}

	@Override
	public void a(String string, bbl bbl) {
		this.a.put(string, bbl);
	}

	@Override
	public void a() {
	}

	@Override
	public int a(String string) {
		return 0;
	}
}
