import com.google.common.collect.Maps;
import java.util.Map;

public class cct extends dj<kq, ccu> {
	private Map<kq, ccu> a;

	@Override
	protected Map<kq, ccu> b() {
		this.a = Maps.newHashMap();
		return this.a;
	}

	public void a(ccu ccu) {
		this.a(ccu.b(), ccu);
	}

	public void a() {
		this.a.clear();
	}
}
