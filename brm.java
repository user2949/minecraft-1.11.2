import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.util.vector.Vector3f;

public class brm {
	public static final List<String> a = Lists.newArrayList(new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});

	@Nullable
	public bri a(byy byy, bri bri) {
		Map<String, String> map4 = Maps.newHashMap();
		List<bre> list5 = Lists.newArrayList();

		for (int integer6 = 0; integer6 < a.size(); integer6++) {
			String string7 = (String)a.get(integer6);
			if (!bri.b(string7)) {
				break;
			}

			String string8 = bri.c(string7);
			map4.put(string7, string8);
			byz byz9 = byy.a(new kq(string8).toString());
			list5.addAll(this.a(integer6, string7, byz9));
		}

		if (list5.isEmpty()) {
			return null;
		} else {
			map4.put("particle", bri.b("particle") ? bri.c("particle") : (String)map4.get("layer0"));
			return new bri(null, list5, map4, false, false, bri.j(), bri.f());
		}
	}

	private List<bre> a(int integer, String string, byz byz) {
		Map<cv, brf> map5 = Maps.newHashMap();
		map5.put(cv.SOUTH, new brf(null, integer, string, new brh(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
		map5.put(cv.NORTH, new brf(null, integer, string, new brh(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
		List<bre> list6 = Lists.newArrayList();
		list6.add(new bre(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), map5, null, true));
		list6.addAll(this.a(byz, string, integer));
		return list6;
	}

	private List<bre> a(byz byz, String string, int integer) {
		float float5 = (float)byz.c();
		float float6 = (float)byz.d();
		List<bre> list7 = Lists.newArrayList();

		for (brm.a a9 : this.a(byz)) {
			float float10 = 0.0F;
			float float11 = 0.0F;
			float float12 = 0.0F;
			float float13 = 0.0F;
			float float14 = 0.0F;
			float float15 = 0.0F;
			float float16 = 0.0F;
			float float17 = 0.0F;
			float float18 = 0.0F;
			float float19 = 0.0F;
			float float20 = (float)a9.b();
			float float21 = (float)a9.c();
			float float22 = (float)a9.d();
			brm.b b23 = a9.a();
			switch (b23) {
				case UP:
					float14 = float20;
					float10 = float20;
					float12 = float15 = float21 + 1.0F;
					float16 = float22;
					float11 = float22;
					float17 = float22;
					float13 = float22;
					float18 = 16.0F / float5;
					float19 = 16.0F / (float6 - 1.0F);
					break;
				case DOWN:
					float17 = float22;
					float16 = float22;
					float14 = float20;
					float10 = float20;
					float12 = float15 = float21 + 1.0F;
					float11 = float22 + 1.0F;
					float13 = float22 + 1.0F;
					float18 = 16.0F / float5;
					float19 = 16.0F / (float6 - 1.0F);
					break;
				case LEFT:
					float14 = float22;
					float10 = float22;
					float15 = float22;
					float12 = float22;
					float17 = float20;
					float11 = float20;
					float13 = float16 = float21 + 1.0F;
					float18 = 16.0F / (float5 - 1.0F);
					float19 = 16.0F / float6;
					break;
				case RIGHT:
					float15 = float22;
					float14 = float22;
					float10 = float22 + 1.0F;
					float12 = float22 + 1.0F;
					float17 = float20;
					float11 = float20;
					float13 = float16 = float21 + 1.0F;
					float18 = 16.0F / (float5 - 1.0F);
					float19 = 16.0F / float6;
			}

			float float24 = 16.0F / float5;
			float float25 = 16.0F / float6;
			float10 *= float24;
			float12 *= float24;
			float11 *= float25;
			float13 *= float25;
			float11 = 16.0F - float11;
			float13 = 16.0F - float13;
			float14 *= float18;
			float15 *= float18;
			float16 *= float19;
			float17 *= float19;
			Map<cv, brf> map26 = Maps.newHashMap();
			map26.put(b23.a(), new brf(null, integer, string, new brh(new float[]{float14, float16, float15, float17}, 0)));
			switch (b23) {
				case UP:
					list7.add(new bre(new Vector3f(float10, float11, 7.5F), new Vector3f(float12, float11, 8.5F), map26, null, true));
					break;
				case DOWN:
					list7.add(new bre(new Vector3f(float10, float13, 7.5F), new Vector3f(float12, float13, 8.5F), map26, null, true));
					break;
				case LEFT:
					list7.add(new bre(new Vector3f(float10, float11, 7.5F), new Vector3f(float10, float13, 8.5F), map26, null, true));
					break;
				case RIGHT:
					list7.add(new bre(new Vector3f(float12, float11, 7.5F), new Vector3f(float12, float13, 8.5F), map26, null, true));
			}
		}

		return list7;
	}

	private List<brm.a> a(byz byz) {
		int integer3 = byz.c();
		int integer4 = byz.d();
		List<brm.a> list5 = Lists.newArrayList();

		for (int integer6 = 0; integer6 < byz.k(); integer6++) {
			int[] arr7 = byz.a(integer6)[0];

			for (int integer8 = 0; integer8 < integer4; integer8++) {
				for (int integer9 = 0; integer9 < integer3; integer9++) {
					boolean boolean10 = !this.a(arr7, integer9, integer8, integer3, integer4);
					this.a(brm.b.UP, list5, arr7, integer9, integer8, integer3, integer4, boolean10);
					this.a(brm.b.DOWN, list5, arr7, integer9, integer8, integer3, integer4, boolean10);
					this.a(brm.b.LEFT, list5, arr7, integer9, integer8, integer3, integer4, boolean10);
					this.a(brm.b.RIGHT, list5, arr7, integer9, integer8, integer3, integer4, boolean10);
				}
			}
		}

		return list5;
	}

	private void a(brm.b b, List<brm.a> list, int[] arr, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
		boolean boolean10 = this.a(arr, integer4 + b.b(), integer5 + b.c(), integer6, integer7) && boolean8;
		if (boolean10) {
			this.a(list, b, integer4, integer5);
		}
	}

	private void a(List<brm.a> list, brm.b b, int integer3, int integer4) {
		brm.a a6 = null;

		for (brm.a a8 : list) {
			if (a8.a() == b) {
				int integer9 = b.d() ? integer4 : integer3;
				if (a8.d() == integer9) {
					a6 = a8;
					break;
				}
			}
		}

		int integer7 = b.d() ? integer4 : integer3;
		int integer8 = b.d() ? integer3 : integer4;
		if (a6 == null) {
			list.add(new brm.a(b, integer8, integer7));
		} else {
			a6.a(integer8);
		}
	}

	private boolean a(int[] arr, int integer2, int integer3, int integer4, int integer5) {
		return integer2 >= 0 && integer3 >= 0 && integer2 < integer4 && integer3 < integer5 ? (arr[integer3 * integer4 + integer2] >> 24 & 0xFF) == 0 : true;
	}

	static class a {
		private final brm.b a;
		private int b;
		private int c;
		private final int d;

		public a(brm.b b, int integer2, int integer3) {
			this.a = b;
			this.b = integer2;
			this.c = integer2;
			this.d = integer3;
		}

		public void a(int integer) {
			if (integer < this.b) {
				this.b = integer;
			} else if (integer > this.c) {
				this.c = integer;
			}
		}

		public brm.b a() {
			return this.a;
		}

		public int b() {
			return this.b;
		}

		public int c() {
			return this.c;
		}

		public int d() {
			return this.d;
		}
	}

	static enum b {
		UP(cv.UP, 0, -1),
		DOWN(cv.DOWN, 0, 1),
		LEFT(cv.EAST, -1, 0),
		RIGHT(cv.WEST, 1, 0);

		private final cv e;
		private final int f;
		private final int g;

		private b(cv cv, int integer4, int integer5) {
			this.e = cv;
			this.f = integer4;
			this.g = integer5;
		}

		public cv a() {
			return this.e;
		}

		public int b() {
			return this.f;
		}

		public int c() {
			return this.g;
		}

		private boolean d() {
			return this == DOWN || this == UP;
		}
	}
}
