import com.google.common.collect.Lists;
import java.util.List;

public class bni {
	public float a = 64.0F;
	public float b = 32.0F;
	private int r;
	private int s;
	public float c;
	public float d;
	public float e;
	public float f;
	public float g;
	public float h;
	private boolean t;
	private int u;
	public boolean i;
	public boolean j = true;
	public boolean k;
	public List<bng> l = Lists.newArrayList();
	public List<bni> m;
	public final String n;
	private final blv v;
	public float o;
	public float p;
	public float q;

	public bni(blv blv, String string) {
		this.v = blv;
		blv.r.add(this);
		this.n = string;
		this.b(blv.s, blv.t);
	}

	public bni(blv blv) {
		this(blv, null);
	}

	public bni(blv blv, int integer2, int integer3) {
		this(blv);
		this.a(integer2, integer3);
	}

	public void a(bni bni) {
		if (this.m == null) {
			this.m = Lists.newArrayList();
		}

		this.m.add(bni);
	}

	public bni a(int integer1, int integer2) {
		this.r = integer1;
		this.s = integer2;
		return this;
	}

	public bni a(String string, float float2, float float3, float float4, int integer5, int integer6, int integer7) {
		string = this.n + "." + string;
		bnj bnj9 = this.v.a(string);
		this.a(bnj9.a, bnj9.b);
		this.l.add(new bng(this, this.r, this.s, float2, float3, float4, integer5, integer6, integer7, 0.0F).a(string));
		return this;
	}

	public bni a(float float1, float float2, float float3, int integer4, int integer5, int integer6) {
		this.l.add(new bng(this, this.r, this.s, float1, float2, float3, integer4, integer5, integer6, 0.0F));
		return this;
	}

	public bni a(float float1, float float2, float float3, int integer4, int integer5, int integer6, boolean boolean7) {
		this.l.add(new bng(this, this.r, this.s, float1, float2, float3, integer4, integer5, integer6, 0.0F, boolean7));
		return this;
	}

	public void a(float float1, float float2, float float3, int integer4, int integer5, int integer6, float float7) {
		this.l.add(new bng(this, this.r, this.s, float1, float2, float3, integer4, integer5, integer6, float7));
	}

	public void a(float float1, float float2, float float3) {
		this.c = float1;
		this.d = float2;
		this.e = float3;
	}

	public void a(float float1) {
		if (!this.k) {
			if (this.j) {
				if (!this.t) {
					this.d(float1);
				}

				bqg.c(this.o, this.p, this.q);
				if (this.f != 0.0F || this.g != 0.0F || this.h != 0.0F) {
					bqg.G();
					bqg.c(this.c * float1, this.d * float1, this.e * float1);
					if (this.h != 0.0F) {
						bqg.b(this.h * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
					}

					if (this.g != 0.0F) {
						bqg.b(this.g * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
					}

					if (this.f != 0.0F) {
						bqg.b(this.f * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
					}

					bqg.s(this.u);
					if (this.m != null) {
						for (int integer3 = 0; integer3 < this.m.size(); integer3++) {
							((bni)this.m.get(integer3)).a(float1);
						}
					}

					bqg.H();
				} else if (this.c == 0.0F && this.d == 0.0F && this.e == 0.0F) {
					bqg.s(this.u);
					if (this.m != null) {
						for (int integer3 = 0; integer3 < this.m.size(); integer3++) {
							((bni)this.m.get(integer3)).a(float1);
						}
					}
				} else {
					bqg.c(this.c * float1, this.d * float1, this.e * float1);
					bqg.s(this.u);
					if (this.m != null) {
						for (int integer3 = 0; integer3 < this.m.size(); integer3++) {
							((bni)this.m.get(integer3)).a(float1);
						}
					}

					bqg.c(-this.c * float1, -this.d * float1, -this.e * float1);
				}

				bqg.c(-this.o, -this.p, -this.q);
			}
		}
	}

	public void b(float float1) {
		if (!this.k) {
			if (this.j) {
				if (!this.t) {
					this.d(float1);
				}

				bqg.G();
				bqg.c(this.c * float1, this.d * float1, this.e * float1);
				if (this.g != 0.0F) {
					bqg.b(this.g * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
				}

				if (this.f != 0.0F) {
					bqg.b(this.f * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
				}

				if (this.h != 0.0F) {
					bqg.b(this.h * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
				}

				bqg.s(this.u);
				bqg.H();
			}
		}
	}

	public void c(float float1) {
		if (!this.k) {
			if (this.j) {
				if (!this.t) {
					this.d(float1);
				}

				if (this.f != 0.0F || this.g != 0.0F || this.h != 0.0F) {
					bqg.c(this.c * float1, this.d * float1, this.e * float1);
					if (this.h != 0.0F) {
						bqg.b(this.h * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
					}

					if (this.g != 0.0F) {
						bqg.b(this.g * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
					}

					if (this.f != 0.0F) {
						bqg.b(this.f * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
					}
				} else if (this.c != 0.0F || this.d != 0.0F || this.e != 0.0F) {
					bqg.c(this.c * float1, this.d * float1, this.e * float1);
				}
			}
		}
	}

	private void d(float float1) {
		this.u = ber.a(1);
		bqg.f(this.u, 4864);
		bpy bpy3 = bqs.a().c();

		for (int integer4 = 0; integer4 < this.l.size(); integer4++) {
			((bng)this.l.get(integer4)).a(bpy3, float1);
		}

		bqg.K();
		this.t = true;
	}

	public bni b(int integer1, int integer2) {
		this.a = (float)integer1;
		this.b = (float)integer2;
		return this;
	}
}
