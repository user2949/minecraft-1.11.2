import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class bbe {
	private final baz a = new baz();
	private final Set<bbb> b = Sets.newHashSet();
	private final bbb[] c = new bbb[32];
	private final bbc d;

	public bbe(bbc bbc) {
		this.d = bbc;
	}

	@Nullable
	public bbd a(ajw ajw, sx sx, sn sn, float float4) {
		return this.a(ajw, sx, sn.p, sn.bo().b, sn.r, float4);
	}

	@Nullable
	public bbd a(ajw ajw, sx sx, co co, float float4) {
		return this.a(ajw, sx, (double)((float)co.p() + 0.5F), (double)((float)co.q() + 0.5F), (double)((float)co.r() + 0.5F), float4);
	}

	@Nullable
	private bbd a(ajw ajw, sx sx, double double3, double double4, double double5, float float6) {
		this.a.a();
		this.d.a(ajw, sx);
		bbb bbb11 = this.d.b();
		bbb bbb12 = this.d.a(double3, double4, double5);
		bbd bbd13 = this.a(bbb11, bbb12, float6);
		this.d.a();
		return bbd13;
	}

	@Nullable
	private bbd a(bbb bbb1, bbb bbb2, float float3) {
		bbb1.e = 0.0F;
		bbb1.f = bbb1.c(bbb2);
		bbb1.g = bbb1.f;
		this.a.a();
		this.b.clear();
		this.a.a(bbb1);
		bbb bbb5 = bbb1;
		int integer6 = 0;

		while (!this.a.e()) {
			if (++integer6 >= 200) {
				break;
			}

			bbb bbb7 = this.a.c();
			if (bbb7.equals(bbb2)) {
				bbb5 = bbb2;
				break;
			}

			if (bbb7.c(bbb2) < bbb5.c(bbb2)) {
				bbb5 = bbb7;
			}

			bbb7.i = true;
			int integer8 = this.d.a(this.c, bbb7, bbb2, float3);

			for (int integer9 = 0; integer9 < integer8; integer9++) {
				bbb bbb10 = this.c[integer9];
				float float11 = bbb7.c(bbb10);
				bbb10.j = bbb7.j + float11;
				bbb10.k = float11 + bbb10.l;
				float float12 = bbb7.e + bbb10.k;
				if (bbb10.j < float3 && (!bbb10.a() || float12 < bbb10.e)) {
					bbb10.h = bbb7;
					bbb10.e = float12;
					bbb10.f = bbb10.c(bbb2) + bbb10.l;
					if (bbb10.a()) {
						this.a.a(bbb10, bbb10.e + bbb10.f);
					} else {
						bbb10.g = bbb10.e + bbb10.f;
						this.a.a(bbb10);
					}
				}
			}
		}

		return bbb5 == bbb1 ? null : this.a(bbb1, bbb5);
	}

	private bbd a(bbb bbb1, bbb bbb2) {
		int integer4 = 1;

		for (bbb bbb5 = bbb2; bbb5.h != null; bbb5 = bbb5.h) {
			integer4++;
		}

		bbb[] arr6 = new bbb[integer4];
		bbb var7 = bbb2;
		integer4--;

		for (arr6[integer4] = bbb2; var7.h != null; arr6[integer4] = var7) {
			var7 = var7.h;
			integer4--;
		}

		return new bbd(arr6);
	}
}
