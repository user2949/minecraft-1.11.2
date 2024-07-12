import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bgv extends bho {
	private static final AtomicInteger a = new AtomicInteger(0);
	private static final Logger f = LogManager.getLogger();
	private er g;
	private boolean h;
	private final bho i;

	public bgv(bho bho, bes bes, bnt bnt) {
		this.j = bes;
		this.i = bho;
		bns bns5 = bns.a(bnt.b);
		bes.a(null);
		bes.a(bnt);
		this.a(bns5.a(), bns5.b());
	}

	public bgv(bho bho, bes bes, String string, int integer) {
		this.j = bes;
		this.i = bho;
		bes.a(null);
		this.a(string, integer);
	}

	private void a(String string, int integer) {
		f.info("Connecting to {}, {}", new Object[]{string, integer});
		(new Thread("Server Connector #" + a.incrementAndGet()) {
			public void run() {
				InetAddress inetAddress2 = null;

				try {
					if (bgv.this.h) {
						return;
					}

					inetAddress2 = InetAddress.getByName(string);
					bgv.this.g = er.a(inetAddress2, integer, bgv.this.j.u.f());
					bgv.this.g.a(new bnn(bgv.this.g, bgv.this.j, bgv.this.i));
					bgv.this.g.a(new jp(316, string, integer, es.LOGIN));
					bgv.this.g.a(new jy(bgv.this.j.K().e()));
				} catch (UnknownHostException var5) {
					if (bgv.this.h) {
						return;
					}

					bgv.f.error("Couldn't connect to server", var5);
					bgv.this.j.a(new bhc(bgv.this.i, "connect.failed", new fi("disconnect.genericReason", "Unknown host")));
				} catch (Exception var6) {
					if (bgv.this.h) {
						return;
					}

					bgv.f.error("Couldn't connect to server", var6);
					String string4 = var6.toString();
					if (inetAddress2 != null) {
						String string5 = inetAddress2 + ":" + integer;
						string4 = string4.replaceAll(string5, "");
					}

					bgv.this.j.a(new bhc(bgv.this.i, "connect.failed", new fi("disconnect.genericReason", string4)));
				}
			}
		}).start();
	}

	@Override
	public void e() {
		if (this.g != null) {
			if (this.g.g()) {
				this.g.a();
			} else {
				this.g.l();
			}
		}
	}

	@Override
	protected void a(char character, int integer) {
	}

	@Override
	public void b() {
		this.n.clear();
		this.n.add(new bfm(0, this.l / 2 - 100, this.m / 4 + 120 + 12, cah.a("gui.cancel")));
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0) {
			this.h = true;
			if (this.g != null) {
				this.g.a(new fh("Aborted"));
			}

			this.j.a(this.i);
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		if (this.g == null) {
			this.a(this.q, cah.a("connect.connecting"), this.l / 2, this.m / 2 - 50, 16777215);
		} else {
			this.a(this.q, cah.a("connect.authorizing"), this.l / 2, this.m / 2 - 50, 16777215);
		}

		super.a(integer1, integer2, float3);
	}
}
