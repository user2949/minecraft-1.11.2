import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.lwjgl.util.vector.Matrix4f;

public class byi {
	private final byg c;
	public final bqr a;
	public final bqr b;
	private final List<Object> d = Lists.newArrayList();
	private final List<String> e = Lists.newArrayList();
	private final List<Integer> f = Lists.newArrayList();
	private final List<Integer> g = Lists.newArrayList();
	private Matrix4f h;

	public byi(bzy bzy, String string, bqr bqr3, bqr bqr4) throws IOException {
		this.c = new byg(bzy, string);
		this.a = bqr3;
		this.b = bqr4;
	}

	public void b() {
		this.c.a();
	}

	public void a(String string, Object object, int integer3, int integer4) {
		this.e.add(this.e.size(), string);
		this.d.add(this.d.size(), object);
		this.f.add(this.f.size(), integer3);
		this.g.add(this.g.size(), integer4);
	}

	private void d() {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bqg.l();
		bqg.j();
		bqg.d();
		bqg.p();
		bqg.g();
		bqg.i();
		bqg.y();
		bqg.i(0);
	}

	public void a(Matrix4f matrix4f) {
		this.h = matrix4f;
	}

	public void a(float float1) {
		this.d();
		this.a.e();
		float float3 = (float)this.b.a;
		float float4 = (float)this.b.b;
		bqg.b(0, 0, (int)float3, (int)float4);
		this.c.a("DiffuseSampler", this.a);

		for (int integer5 = 0; integer5 < this.d.size(); integer5++) {
			this.c.a((String)this.e.get(integer5), this.d.get(integer5));
			this.c.b("AuxSize" + integer5).a((float)((Integer)this.f.get(integer5)).intValue(), (float)((Integer)this.g.get(integer5)).intValue());
		}

		this.c.b("ProjMat").a(this.h);
		this.c.b("InSize").a((float)this.a.a, (float)this.a.b);
		this.c.b("OutSize").a(float3, float4);
		this.c.b("Time").a(float1);
		bes bes5 = bes.z();
		this.c.b("ScreenSize").a((float)bes5.d, (float)bes5.e);
		this.c.c();
		this.b.f();
		this.b.a(false);
		bqg.a(false);
		bqg.a(true, true, true, true);
		bqs bqs6 = bqs.a();
		bpy bpy7 = bqs6.c();
		bpy7.a(7, bzh.f);
		bpy7.b(0.0, (double)float4, 500.0).b(255, 255, 255, 255).d();
		bpy7.b((double)float3, (double)float4, 500.0).b(255, 255, 255, 255).d();
		bpy7.b((double)float3, 0.0, 500.0).b(255, 255, 255, 255).d();
		bpy7.b(0.0, 0.0, 500.0).b(255, 255, 255, 255).d();
		bqs6.b();
		bqg.a(true);
		bqg.a(true, true, true, true);
		this.c.b();
		this.b.e();
		this.a.d();

		for (Object object9 : this.d) {
			if (object9 instanceof bqr) {
				((bqr)object9).d();
			}
		}
	}

	public byg c() {
		return this.c;
	}
}
