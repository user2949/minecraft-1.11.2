import com.google.common.base.Objects;
import java.util.List;

public class bkk {
	private final bkh a;
	private final List<bki> b;
	private final int c;

	public bkk(bkh bkh, List<bki> list, int integer) {
		this.a = bkh;
		this.b = list;
		this.c = integer;
	}

	public bki a(int integer) {
		return integer >= 0 && integer < this.b.size() ? (bki)Objects.firstNonNull(this.b.get(integer), bkg.a) : bkg.a;
	}

	public int b() {
		return this.c;
	}
}
