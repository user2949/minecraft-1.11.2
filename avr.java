import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class avr implements aui {
	private static final List<atl> c = Lists.newArrayList();
	private static final int d;
	private static final int e;
	protected static final atl a = alv.a.t();
	protected static final atl b = alv.cv.t();
	private final ajs f;

	public avr(ajs ajs) {
		this.f = ajs;
	}

	@Override
	public auo a(int integer1, int integer2) {
		avp avp4 = new avp();

		for (int integer5 = 0; integer5 < 16; integer5++) {
			for (int integer6 = 0; integer6 < 16; integer6++) {
				int integer7 = integer1 * 16 + integer5;
				int integer8 = integer2 * 16 + integer6;
				avp4.a(integer5, 60, integer6, b);
				atl atl9 = c(integer7, integer8);
				if (atl9 != null) {
					avp4.a(integer5, 70, integer6, atl9);
				}
			}
		}

		auo auo5 = new auo(this.f, avp4, integer1, integer2);
		auo5.b();
		akf[] arr6 = this.f.A().b(null, integer1 * 16, integer2 * 16, 16, 16);
		byte[] arr7 = auo5.l();

		for (int integer8 = 0; integer8 < arr7.length; integer8++) {
			arr7[integer8] = (byte)akf.a(arr6[integer8]);
		}

		auo5.b();
		return auo5;
	}

	public static atl c(int integer1, int integer2) {
		atl atl3 = a;
		if (integer1 > 0 && integer2 > 0 && integer1 % 2 != 0 && integer2 % 2 != 0) {
			integer1 /= 2;
			integer2 /= 2;
			if (integer1 <= d && integer2 <= e) {
				int integer4 = ot.a(integer1 * d + integer2);
				if (integer4 < c.size()) {
					atl3 = (atl)c.get(integer4);
				}
			}
		}

		return atl3;
	}

	@Override
	public void b(int integer1, int integer2) {
	}

	@Override
	public boolean a(auo auo, int integer2, int integer3) {
		return false;
	}

	@Override
	public List<akf.c> a(sy sy, co co) {
		akf akf4 = this.f.b(co);
		return akf4.a(sy);
	}

	@Nullable
	@Override
	public co a(ajs ajs, String string, co co, boolean boolean4) {
		return null;
	}

	@Override
	public void b(auo auo, int integer2, int integer3) {
	}

	static {
		for (alu alu2 : alu.h) {
			c.addAll(alu2.s().a());
		}

		d = ot.f(ot.c((float)c.size()));
		e = ot.f((float)c.size() / (float)d);
	}
}
