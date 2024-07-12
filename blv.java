import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class blv {
	public float o;
	public boolean p;
	public boolean q = true;
	public List<bni> r = Lists.newArrayList();
	private final Map<String, bnj> a = Maps.newHashMap();
	public int s = 64;
	public int t = 32;

	public void a(sn sn, float float2, float float3, float float4, float float5, float float6, float float7) {
	}

	public void a(float float1, float float2, float float3, float float4, float float5, float float6, sn sn) {
	}

	public void a(sw sw, float float2, float float3, float float4) {
	}

	public bni a(Random random) {
		return (bni)this.r.get(random.nextInt(this.r.size()));
	}

	protected void a(String string, int integer2, int integer3) {
		this.a.put(string, new bnj(integer2, integer3));
	}

	public bnj a(String string) {
		return (bnj)this.a.get(string);
	}

	public static void a(bni bni1, bni bni2) {
		bni2.f = bni1.f;
		bni2.g = bni1.g;
		bni2.h = bni1.h;
		bni2.c = bni1.c;
		bni2.d = bni1.d;
		bni2.e = bni1.e;
	}

	public void a(blv blv) {
		this.o = blv.o;
		this.p = blv.p;
		this.q = blv.q;
	}
}
