import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public interface bru {
	bru a = new bru() {
		@Override
		public Predicate<atl> a(atm atm) {
			return new Predicate<atl>() {
				public boolean apply(@Nullable atl atl) {
					return true;
				}
			};
		}
	};
	bru b = new bru() {
		@Override
		public Predicate<atl> a(atm atm) {
			return new Predicate<atl>() {
				public boolean apply(@Nullable atl atl) {
					return false;
				}
			};
		}
	};

	Predicate<atl> a(atm atm);
}
