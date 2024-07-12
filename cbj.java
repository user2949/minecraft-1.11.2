import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class cbj implements cbh {
	private final brq a;
	private final bro b;

	public cbj(brq brq, bro bro) {
		this.a = brq;
		this.b = bro;
	}

	@Override
	public List<brd> a(@Nullable atl atl, @Nullable cv cv, long long3) {
		return Collections.emptyList();
	}

	@Override
	public boolean a() {
		return false;
	}

	@Override
	public boolean b() {
		return true;
	}

	@Override
	public boolean c() {
		return true;
	}

	@Override
	public byz d() {
		return null;
	}

	@Override
	public brq e() {
		return this.a;
	}

	@Override
	public bro f() {
		return this.b;
	}
}
