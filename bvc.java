import com.google.common.collect.Maps;
import java.util.Map;

public class bvc extends bvq<xo> {
	private static final Map<String, kq> a = Maps.newHashMap();

	public bvc(bur bur) {
		super(bur, new bll(), 0.75F);
	}

	protected kq a(xo xo) {
		String string3 = xo.dk();
		kq kq4 = (kq)a.get(string3);
		if (kq4 == null) {
			kq4 = new kq(string3);
			bes.z().N().a(kq4, new byt(xo.dl()));
			a.put(string3, kq4);
		}

		return kq4;
	}
}
