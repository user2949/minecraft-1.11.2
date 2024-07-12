import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class gs implements fm<fp> {
	private double a;
	private double b;
	private double c;
	private float d;
	private List<co> e;
	private float f;
	private float g;
	private float h;

	public gs() {
	}

	public gs(double double1, double double2, double double3, float float4, List<co> list, bdw bdw) {
		this.a = double1;
		this.b = double2;
		this.c = double3;
		this.d = float4;
		this.e = Lists.newArrayList(list);
		if (bdw != null) {
			this.f = (float)bdw.b;
			this.g = (float)bdw.c;
			this.h = (float)bdw.d;
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = (double)et.readFloat();
		this.b = (double)et.readFloat();
		this.c = (double)et.readFloat();
		this.d = et.readFloat();
		int integer3 = et.readInt();
		this.e = Lists.newArrayListWithCapacity(integer3);
		int integer4 = (int)this.a;
		int integer5 = (int)this.b;
		int integer6 = (int)this.c;

		for (int integer7 = 0; integer7 < integer3; integer7++) {
			int integer8 = et.readByte() + integer4;
			int integer9 = et.readByte() + integer5;
			int integer10 = et.readByte() + integer6;
			this.e.add(new co(integer8, integer9, integer10));
		}

		this.f = et.readFloat();
		this.g = et.readFloat();
		this.h = et.readFloat();
	}

	@Override
	public void b(et et) throws IOException {
		et.writeFloat((float)this.a);
		et.writeFloat((float)this.b);
		et.writeFloat((float)this.c);
		et.writeFloat(this.d);
		et.writeInt(this.e.size());
		int integer3 = (int)this.a;
		int integer4 = (int)this.b;
		int integer5 = (int)this.c;

		for (co co7 : this.e) {
			int integer8 = co7.p() - integer3;
			int integer9 = co7.q() - integer4;
			int integer10 = co7.r() - integer5;
			et.writeByte(integer8);
			et.writeByte(integer9);
			et.writeByte(integer10);
		}

		et.writeFloat(this.f);
		et.writeFloat(this.g);
		et.writeFloat(this.h);
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public float a() {
		return this.f;
	}

	public float b() {
		return this.g;
	}

	public float c() {
		return this.h;
	}

	public double d() {
		return this.a;
	}

	public double e() {
		return this.b;
	}

	public double f() {
		return this.c;
	}

	public float g() {
		return this.d;
	}

	public List<co> h() {
		return this.e;
	}
}
