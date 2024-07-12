import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class aul extends auo {
	public aul(ajs ajs, int integer2, int integer3) {
		super(ajs, integer2, integer3);
	}

	@Override
	public boolean a(int integer1, int integer2) {
		return integer1 == this.b && integer2 == this.c;
	}

	@Override
	public int b(int integer1, int integer2) {
		return 0;
	}

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public atl a(co co) {
		return alv.a.t();
	}

	@Override
	public int b(co co) {
		return 255;
	}

	@Override
	public int a(ajy ajy, co co) {
		return ajy.c;
	}

	@Override
	public void a(ajy ajy, co co, int integer) {
	}

	@Override
	public int a(co co, int integer) {
		return 0;
	}

	@Override
	public void a(sn sn) {
	}

	@Override
	public void b(sn sn) {
	}

	@Override
	public void a(sn sn, int integer) {
	}

	@Override
	public boolean c(co co) {
		return false;
	}

	@Nullable
	@Override
	public asc a(co co, auo.a a) {
		return null;
	}

	@Override
	public void a(asc asc) {
	}

	@Override
	public void a(co co, asc asc) {
	}

	@Override
	public void d(co co) {
	}

	@Override
	public void c() {
	}

	@Override
	public void d() {
	}

	@Override
	public void e() {
	}

	@Override
	public void a(@Nullable sn sn, bdt bdt, List<sn> list, Predicate<? super sn> predicate) {
	}

	@Override
	public <T extends sn> void a(Class<? extends T> class1, bdt bdt, List<T> list, Predicate<? super T> predicate) {
	}

	@Override
	public boolean a(boolean boolean1) {
		return false;
	}

	@Override
	public Random a(long long1) {
		return new Random(
			this.q().O() + (long)(this.b * this.b * 4987142) + (long)(this.b * 5947611) + (long)(this.c * this.c) * 4392871L + (long)(this.c * 389711) ^ long1
		);
	}

	@Override
	public boolean f() {
		return true;
	}

	@Override
	public boolean c(int integer1, int integer2) {
		return true;
	}
}
