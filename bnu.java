import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnu {
	private static final Logger a = LogManager.getLogger();
	private final bes b;
	private final List<bnt> c = Lists.newArrayList();

	public bnu(bes bes) {
		this.b = bes;
		this.a();
	}

	public void a() {
		try {
			this.c.clear();
			du du2 = ed.a(new File(this.b.w, "servers.dat"));
			if (du2 == null) {
				return;
			}

			ea ea3 = du2.c("servers", 10);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				this.c.add(bnt.a(ea3.b(integer4)));
			}
		} catch (Exception var4) {
			a.error("Couldn't load server list", var4);
		}
	}

	public void b() {
		try {
			ea ea2 = new ea();

			for (bnt bnt4 : this.c) {
				ea2.a(bnt4.a());
			}

			du du3 = new du();
			du3.a("servers", ea2);
			ed.a(du3, new File(this.b.w, "servers.dat"));
		} catch (Exception var4) {
			a.error("Couldn't save server list", var4);
		}
	}

	public bnt a(int integer) {
		return (bnt)this.c.get(integer);
	}

	public void b(int integer) {
		this.c.remove(integer);
	}

	public void a(bnt bnt) {
		this.c.add(bnt);
	}

	public int c() {
		return this.c.size();
	}

	public void a(int integer1, int integer2) {
		bnt bnt4 = this.a(integer1);
		this.c.set(integer1, this.a(integer2));
		this.c.set(integer2, bnt4);
		this.b();
	}

	public void a(int integer, bnt bnt) {
		this.c.set(integer, bnt);
	}

	public static void b(bnt bnt) {
		bnu bnu2 = new bnu(bes.z());
		bnu2.a();

		for (int integer3 = 0; integer3 < bnu2.c(); integer3++) {
			bnt bnt4 = bnu2.a(integer3);
			if (bnt4.a.equals(bnt.a) && bnt4.b.equals(bnt.b)) {
				bnu2.a(integer3, bnt);
				break;
			}
		}

		bnu2.b();
	}
}
