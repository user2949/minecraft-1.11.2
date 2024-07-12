import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bro {
	public static final bro a = new bro();
	private final List<brn> b = Lists.newArrayList();

	private bro() {
	}

	public bro(List<brn> list) {
		for (int integer3 = list.size() - 1; integer3 >= 0; integer3--) {
			this.b.add(list.get(integer3));
		}
	}

	@Nullable
	public kq a(afj afj, @Nullable ajs ajs, @Nullable sw sw) {
		if (!this.b.isEmpty()) {
			for (brn brn6 : this.b) {
				if (brn6.a(afj, ajs, sw)) {
					return brn6.a();
				}
			}
		}

		return null;
	}
}
