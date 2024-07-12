import java.io.IOException;
import javax.annotation.Nullable;

public class ix implements fm<im> {
	private int a;
	private ix.a b;
	private bdw c;
	private ri d;

	public ix() {
	}

	public ix(sn sn) {
		this.a = sn.O();
		this.b = ix.a.ATTACK;
	}

	public ix(sn sn, ri ri) {
		this.a = sn.O();
		this.b = ix.a.INTERACT;
		this.d = ri;
	}

	public ix(sn sn, ri ri, bdw bdw) {
		this.a = sn.O();
		this.b = ix.a.INTERACT_AT;
		this.d = ri;
		this.c = bdw;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.g();
		this.b = et.a(ix.a.class);
		if (this.b == ix.a.INTERACT_AT) {
			this.c = new bdw((double)et.readFloat(), (double)et.readFloat(), (double)et.readFloat());
		}

		if (this.b == ix.a.INTERACT || this.b == ix.a.INTERACT_AT) {
			this.d = et.a(ri.class);
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.d(this.a);
		et.a(this.b);
		if (this.b == ix.a.INTERACT_AT) {
			et.writeFloat((float)this.c.b);
			et.writeFloat((float)this.c.c);
			et.writeFloat((float)this.c.d);
		}

		if (this.b == ix.a.INTERACT || this.b == ix.a.INTERACT_AT) {
			et.a(this.d);
		}
	}

	public void a(im im) {
		im.a(this);
	}

	@Nullable
	public sn a(ajs ajs) {
		return ajs.a(this.a);
	}

	public ix.a a() {
		return this.b;
	}

	public ri b() {
		return this.d;
	}

	public bdw c() {
		return this.c;
	}

	public static enum a {
		INTERACT,
		ATTACK,
		INTERACT_AT;
	}
}
