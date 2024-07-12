import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class bgm extends bho {
	private final RealmsScreen a;

	public bgm(RealmsScreen realmsScreen) {
		this.a = realmsScreen;
		this.n = Collections.synchronizedList(Lists.newArrayList());
	}

	public RealmsScreen a() {
		return this.a;
	}

	@Override
	public void b() {
		this.a.init();
		super.b();
	}

	public void a(String string, int integer2, int integer3, int integer4) {
		super.a(this.q, string, integer2, integer3, integer4);
	}

	public void a(String string, int integer2, int integer3, int integer4, boolean boolean5) {
		if (boolean5) {
			super.c(this.q, string, integer2, integer3, integer4);
		} else {
			this.q.a(string, integer2, integer3, integer4);
		}
	}

	@Override
	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		this.a.blit(integer1, integer2, integer3, integer4, integer5, integer6);
		super.b(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		super.a(integer1, integer2, integer3, integer4, integer5, integer6);
	}

	@Override
	public void c() {
		super.c();
	}

	@Override
	public boolean d() {
		return super.d();
	}

	@Override
	public void d_(int integer) {
		super.d_(integer);
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.a.render(integer1, integer2, float3);
	}

	@Override
	public void a(afj afj, int integer2, int integer3) {
		super.a(afj, integer2, integer3);
	}

	@Override
	public void a(String string, int integer2, int integer3) {
		super.a(string, integer2, integer3);
	}

	@Override
	public void a(List<String> list, int integer2, int integer3) {
		super.a(list, integer2, integer3);
	}

	@Override
	public void e() {
		this.a.tick();
		super.e();
	}

	public int h() {
		return this.q.a;
	}

	public int c(String string) {
		return this.q.a(string);
	}

	public void b(String string, int integer2, int integer3, int integer4) {
		this.q.a(string, (float)integer2, (float)integer3, integer4);
	}

	public List<String> a(String string, int integer) {
		return this.q.c(string, integer);
	}

	@Override
	public final void a(bfm bfm) {
		this.a.buttonClicked(((bgk)bfm).f());
	}

	public void i() {
		this.n.clear();
	}

	public void a(RealmsButton realmsButton) {
		this.n.add(realmsButton.getProxy());
	}

	public List<RealmsButton> j() {
		List<RealmsButton> list2 = Lists.newArrayListWithExpectedSize(this.n.size());

		for (bfm bfm4 : this.n) {
			list2.add(((bgk)bfm4).f());
		}

		return list2;
	}

	public void b(RealmsButton realmsButton) {
		this.n.remove(realmsButton.getProxy());
	}

	@Override
	public void a(int integer1, int integer2, int integer3) {
		this.a.mouseClicked(integer1, integer2, integer3);
		super.a(integer1, integer2, integer3);
	}

	@Override
	public void k() {
		this.a.mouseEvent();
		super.k();
	}

	@Override
	public void l() {
		this.a.keyboardEvent();
		super.l();
	}

	@Override
	public void b(int integer1, int integer2, int integer3) {
		this.a.mouseReleased(integer1, integer2, integer3);
	}

	@Override
	public void a(int integer1, int integer2, int integer3, long long4) {
		this.a.mouseDragged(integer1, integer2, integer3, long4);
	}

	@Override
	public void a(char character, int integer) {
		this.a.keyPressed(character, integer);
	}

	@Override
	public void a(boolean boolean1, int integer) {
		this.a.confirmResult(boolean1, integer);
	}

	@Override
	public void m() {
		this.a.removed();
		super.m();
	}
}
