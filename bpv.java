import com.google.common.collect.Maps;
import java.util.Map;

public class bpv extends rr implements ro {
	private final String a;
	private final Map<Integer, Integer> b = Maps.newHashMap();

	public bpv(String string, fb fb, int integer) {
		super(fb, integer);
		this.a = string;
	}

	@Override
	public int c_(int integer) {
		return this.b.containsKey(integer) ? (Integer)this.b.get(integer) : 0;
	}

	@Override
	public void b(int integer1, int integer2) {
		this.b.put(integer1, integer2);
	}

	@Override
	public int h() {
		return this.b.size();
	}

	@Override
	public boolean z_() {
		return false;
	}

	@Override
	public void a(rn rn) {
	}

	@Override
	public rn j() {
		return rn.a;
	}

	@Override
	public String l() {
		return this.a;
	}

	@Override
	public acl a(aax aax, aay aay) {
		throw new UnsupportedOperationException();
	}
}
