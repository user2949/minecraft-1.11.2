import com.google.common.collect.Maps;
import java.util.Map;

public class btz extends bvq<xm> {
	private static final Map<Class<?>, kq> a = Maps.newHashMap();
	private final float j;

	public btz(bur bur) {
		this(bur, 1.0F);
	}

	public btz(bur bur, float float2) {
		super(bur, new bll(), 0.75F);
		this.j = float2;
	}

	protected void a(xm xm, float float2) {
		bqg.b(this.j, this.j, this.j);
		super.a(xm, float2);
	}

	protected kq a(xm xm) {
		return (kq)a.get(xm.getClass());
	}

	static {
		a.put(xn.class, new kq("textures/entity/horse/donkey.png"));
		a.put(xr.class, new kq("textures/entity/horse/mule.png"));
		a.put(xu.class, new kq("textures/entity/horse/horse_zombie.png"));
		a.put(xs.class, new kq("textures/entity/horse/horse_skeleton.png"));
	}
}
