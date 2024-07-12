import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class ats implements Predicate<atl> {
	private final azs a;

	private ats(azs azs) {
		this.a = azs;
	}

	public static ats a(azs azs) {
		return new ats(azs);
	}

	public boolean apply(@Nullable atl atl) {
		return atl != null && atl.a() == this.a;
	}
}
