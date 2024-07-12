import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class att implements Predicate<atl> {
	private final alu a;

	private att(alu alu) {
		this.a = alu;
	}

	public static att a(alu alu) {
		return new att(alu);
	}

	public boolean apply(@Nullable atl atl) {
		return atl != null && atl.v() == this.a;
	}
}
