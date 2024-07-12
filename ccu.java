import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ccu implements ccv<cbz> {
	private final List<ccv<cbz>> a = Lists.newArrayList();
	private final Random b = new Random();
	private final kq c;
	private final fb d;

	public ccu(kq kq, @Nullable String string) {
		this.c = kq;
		this.d = string == null ? null : new fi(string);
	}

	@Override
	public int e() {
		int integer2 = 0;

		for (ccv<cbz> ccv4 : this.a) {
			integer2 += ccv4.e();
		}

		return integer2;
	}

	public cbz i() {
		int integer2 = this.e();
		if (!this.a.isEmpty() && integer2 != 0) {
			int integer3 = this.b.nextInt(integer2);

			for (ccv<cbz> ccv5 : this.a) {
				integer3 -= ccv5.e();
				if (integer3 < 0) {
					return ccv5.i();
				}
			}

			return ccs.a;
		} else {
			return ccs.a;
		}
	}

	public void a(ccv<cbz> ccv) {
		this.a.add(ccv);
	}

	public kq b() {
		return this.c;
	}

	@Nullable
	public fb c() {
		return this.d;
	}
}
