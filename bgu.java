import com.google.common.collect.Lists;
import java.util.List;

public class bgu extends bho {
	protected bgt a;
	protected String f;
	private final String r;
	private final List<String> s = Lists.newArrayList();
	protected String g;
	protected String h;
	protected int i;
	private int t;

	public bgu(bgt bgt, String string2, String string3, int integer) {
		this.a = bgt;
		this.f = string2;
		this.r = string3;
		this.i = integer;
		this.g = cah.a("gui.yes");
		this.h = cah.a("gui.no");
	}

	public bgu(bgt bgt, String string2, String string3, String string4, String string5, int integer) {
		this.a = bgt;
		this.f = string2;
		this.r = string3;
		this.g = string4;
		this.h = string5;
		this.i = integer;
	}

	@Override
	public void b() {
		this.n.add(new bfz(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
		this.n.add(new bfz(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
		this.s.clear();
		this.s.addAll(this.q.c(this.r, this.l - 50));
	}

	@Override
	protected void a(bfm bfm) {
		this.a.a(bfm.k == 0, this.i);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, this.f, this.l / 2, 70, 16777215);
		int integer5 = 90;

		for (String string7 : this.s) {
			this.a(this.q, string7, this.l / 2, integer5, 16777215);
			integer5 += this.q.a;
		}

		super.a(integer1, integer2, float3);
	}

	public void b(int integer) {
		this.t = integer;

		for (bfm bfm4 : this.n) {
			bfm4.l = false;
		}
	}

	@Override
	public void e() {
		super.e();
		if (--this.t == 0) {
			for (bfm bfm3 : this.n) {
				bfm3.l = true;
			}
		}
	}
}
