import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class ako extends akj {
	private final akf a;

	public ako(akf akf) {
		this.a = akf;
	}

	@Override
	public akf a(co co) {
		return this.a;
	}

	@Override
	public akf[] a(akf[] arr, int integer2, int integer3, int integer4, int integer5) {
		if (arr == null || arr.length < integer4 * integer5) {
			arr = new akf[integer4 * integer5];
		}

		Arrays.fill(arr, 0, integer4 * integer5, this.a);
		return arr;
	}

	@Override
	public akf[] b(@Nullable akf[] arr, int integer2, int integer3, int integer4, int integer5) {
		if (arr == null || arr.length < integer4 * integer5) {
			arr = new akf[integer4 * integer5];
		}

		Arrays.fill(arr, 0, integer4 * integer5, this.a);
		return arr;
	}

	@Override
	public akf[] a(@Nullable akf[] arr, int integer2, int integer3, int integer4, int integer5, boolean boolean6) {
		return this.b(arr, integer2, integer3, integer4, integer5);
	}

	@Nullable
	@Override
	public co a(int integer1, int integer2, int integer3, List<akf> list, Random random) {
		return list.contains(this.a)
			? new co(integer1 - integer3 + random.nextInt(integer3 * 2 + 1), 0, integer2 - integer3 + random.nextInt(integer3 * 2 + 1))
			: null;
	}

	@Override
	public boolean a(int integer1, int integer2, int integer3, List<akf> list) {
		return list.contains(this.a);
	}

	@Override
	public boolean c() {
		return true;
	}

	@Override
	public akf d() {
		return this.a;
	}
}
