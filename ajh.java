import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class ajh implements n {
	private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
	private int b;
	private boolean c = true;
	private fb d;
	private String e = "";
	private String f = "@";
	private final o g = new o();

	public int k() {
		return this.b;
	}

	public void a(int integer) {
		this.b = integer;
	}

	public fb l() {
		return (fb)(this.d == null ? new fh("") : this.d);
	}

	public du a(du du) {
		du.a("Command", this.e);
		du.a("SuccessCount", this.b);
		du.a("CustomName", this.f);
		du.a("TrackOutput", this.c);
		if (this.d != null && this.c) {
			du.a("LastOutput", fb.a.a(this.d));
		}

		this.g.b(du);
		return du;
	}

	public void b(du du) {
		this.e = du.l("Command");
		this.b = du.h("SuccessCount");
		if (du.b("CustomName", 8)) {
			this.f = du.l("CustomName");
		}

		if (du.b("TrackOutput", 1)) {
			this.c = du.p("TrackOutput");
		}

		if (du.b("LastOutput", 8) && this.c) {
			try {
				this.d = fb.a.a(du.l("LastOutput"));
			} catch (Throwable var3) {
				this.d = new fh(var3.getMessage());
			}
		} else {
			this.d = null;
		}

		this.g.a(du);
	}

	@Override
	public boolean a(int integer, String string) {
		return integer <= 2;
	}

	public void a(String string) {
		this.e = string;
		this.b = 0;
	}

	public String m() {
		return this.e;
	}

	public void a(ajs ajs) {
		if (ajs.E) {
			this.b = 0;
		} else if ("Searge".equalsIgnoreCase(this.e)) {
			this.d = new fh("#itzlipofutzli");
			this.b = 1;
		} else {
			MinecraftServer minecraftServer3 = this.B_();
			if (minecraftServer3 != null && minecraftServer3.M() && minecraftServer3.ai()) {
				m m4 = minecraftServer3.N();

				try {
					this.d = null;
					this.b = m4.a(this, this.e);
				} catch (Throwable var7) {
					b b6 = b.a(var7, "Executing command block");
					c c7 = b6.a("Command to be executed");
					c7.a("Command", new d<String>() {
						public String call() throws Exception {
							return ajh.this.m();
						}
					});
					c7.a("Name", new d<String>() {
						public String call() throws Exception {
							return ajh.this.h_();
						}
					});
					throw new f(b6);
				}
			} else {
				this.b = 0;
			}
		}
	}

	@Override
	public String h_() {
		return this.f;
	}

	@Override
	public fb i_() {
		return new fh(this.h_());
	}

	public void b(String string) {
		this.f = string;
	}

	@Override
	public void a(fb fb) {
		if (this.c && this.e() != null && !this.e().E) {
			this.d = new fh("[" + a.format(new Date()) + "] ").a(fb);
			this.i();
		}
	}

	@Override
	public boolean g() {
		MinecraftServer minecraftServer2 = this.B_();
		return minecraftServer2 == null || !minecraftServer2.M() || minecraftServer2.d[0].U().b("commandBlockOutput");
	}

	@Override
	public void a(o.a a, int integer) {
		this.g.a(this.B_(), this, a, integer);
	}

	public abstract void i();

	public abstract int j();

	public abstract void a(ByteBuf byteBuf);

	public void b(@Nullable fb fb) {
		this.d = fb;
	}

	public void a(boolean boolean1) {
		this.c = boolean1;
	}

	public boolean n() {
		return this.c;
	}

	public boolean a(aay aay) {
		if (!aay.dk()) {
			return false;
		} else {
			if (aay.e().E) {
				aay.a(this);
			}

			return true;
		}
	}

	public o o() {
		return this.g;
	}
}
