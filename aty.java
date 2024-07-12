import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;

public class aty extends atz<cv> {
	protected aty(String string, Collection<cv> collection) {
		super(string, cv.class, collection);
	}

	public static aty a(String string) {
		return a(string, Predicates.alwaysTrue());
	}

	public static aty a(String string, Predicate<cv> predicate) {
		return a(string, Collections2.filter(Lists.newArrayList(cv.values()), predicate));
	}

	public static aty a(String string, Collection<cv> collection) {
		return new aty(string, collection);
	}
}
