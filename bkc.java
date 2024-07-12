import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bkc extends bfy {
	private static final Logger u = LogManager.getLogger();
	private final bka v;
	private final List<bkb> w = Lists.newArrayList();
	private int x = -1;

	public bkc(bka bka, bes bes, int integer3, int integer4, int integer5, int integer6, int integer7) {
		super(bes, integer3, integer4, integer5, integer6, integer7);
		this.v = bka;
		this.e();
	}

	public void e() {
		bby bby2 = this.a.g();

		List<bbz> list3;
		try {
			list3 = bby2.b();
		} catch (bbx var5) {
			u.error("Couldn't load level list", var5);
			this.a.a(new bhe(cah.a("selectWorld.unable_to_load"), var5.getMessage()));
			return;
		}

		Collections.sort(list3);

		for (bbz bbz5 : list3) {
			this.w.add(new bkb(this, bbz5, this.a.g()));
		}
	}

	public bkb b(int integer) {
		return (bkb)this.w.get(integer);
	}

	@Override
	protected int b() {
		return this.w.size();
	}

	@Override
	protected int d() {
		return super.d() + 20;
	}

	@Override
	public int c() {
		return super.c() + 50;
	}

	public void d(int integer) {
		this.x = integer;
		this.v.a(this.f());
	}

	@Override
	protected boolean a(int integer) {
		return integer == this.x;
	}

	@Nullable
	public bkb f() {
		return this.x >= 0 && this.x < this.b() ? this.c(this.x) : null;
	}

	public bka g() {
		return this.v;
	}
}
