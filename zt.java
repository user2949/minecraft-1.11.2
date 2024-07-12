import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public interface zt extends sm {
	Predicate<sn> d = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof zt;
		}
	};
	Predicate<sn> e = new Predicate<sn>() {
		public boolean apply(@Nullable sn sn) {
			return sn instanceof zt && !sn.aP();
		}
	};
}
