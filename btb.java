import com.google.common.collect.Lists;
import java.util.List;

public class btb {
	public static final btb a = new btb() {
		@Override
		protected void a(ajk ajk) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void c(ajk ajk) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean a(cv cv1, cv cv2) {
			return false;
		}
	};
	private final boolean[] b = new boolean[ajk.values().length];
	private final boolean[] c = new boolean[ajk.values().length];
	private boolean d = true;
	private final List<asc> e = Lists.newArrayList();
	private bti f = new bti();
	private bpy.a g;

	public boolean a() {
		return this.d;
	}

	protected void a(ajk ajk) {
		this.d = false;
		this.b[ajk.ordinal()] = true;
	}

	public boolean b(ajk ajk) {
		return !this.b[ajk.ordinal()];
	}

	public void c(ajk ajk) {
		this.c[ajk.ordinal()] = true;
	}

	public boolean d(ajk ajk) {
		return this.c[ajk.ordinal()];
	}

	public List<asc> b() {
		return this.e;
	}

	public void a(asc asc) {
		this.e.add(asc);
	}

	public boolean a(cv cv1, cv cv2) {
		return this.f.a(cv1, cv2);
	}

	public void a(bti bti) {
		this.f = bti;
	}

	public bpy.a c() {
		return this.g;
	}

	public void a(bpy.a a) {
		this.g = a;
	}
}
