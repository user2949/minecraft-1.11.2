import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class bkm implements bkh, bki {
	private final List<bki> a = Lists.newArrayList();

	public bkm() {
		bes bes2 = bes.z();

		for (bdz bdz4 : bes2.f.ad().g()) {
			this.a.add(new bkm.a(bdz4));
		}
	}

	@Override
	public List<bki> a() {
		return this.a;
	}

	@Override
	public fb b() {
		return new fi("spectatorMenu.team_teleport.prompt");
	}

	@Override
	public void a(bkg bkg) {
		bkg.a(this);
	}

	@Override
	public fb I_() {
		return new fi("spectatorMenu.team_teleport");
	}

	@Override
	public void a(float float1, int integer) {
		bes.z().N().a(bgh.a);
		bfi.a(0, 0, 16.0F, 0.0F, 16, 16, 256.0F, 256.0F);
	}

	@Override
	public boolean J_() {
		for (bki bki3 : this.a) {
			if (bki3.J_()) {
				return true;
			}
		}

		return false;
	}

	class a implements bki {
		private final bdz b;
		private final kq c;
		private final List<bnr> d;

		public a(bdz bdz) {
			this.b = bdz;
			this.d = Lists.newArrayList();

			for (String string5 : bdz.d()) {
				bnr bnr6 = bes.z().v().a(string5);
				if (bnr6 != null) {
					this.d.add(bnr6);
				}
			}

			if (this.d.isEmpty()) {
				this.c = bzo.a();
			} else {
				String string4 = ((bnr)this.d.get(new Random().nextInt(this.d.size()))).a().getName();
				this.c = bpp.e(string4);
				bpp.a(this.c, string4);
			}
		}

		@Override
		public void a(bkg bkg) {
			bkg.a(new bkl(this.d));
		}

		@Override
		public fb I_() {
			return new fh(this.b.c());
		}

		@Override
		public void a(float float1, int integer) {
			int integer4 = -1;
			String string5 = bfg.b(this.b.e());
			if (string5.length() >= 2) {
				integer4 = bes.z().k.b(string5.charAt(1));
			}

			if (integer4 >= 0) {
				float float6 = (float)(integer4 >> 16 & 0xFF) / 255.0F;
				float float7 = (float)(integer4 >> 8 & 0xFF) / 255.0F;
				float float8 = (float)(integer4 & 0xFF) / 255.0F;
				bfi.a(1, 1, 15, 15, ot.b(float6 * float1, float7 * float1, float8 * float1) | integer << 24);
			}

			bes.z().N().a(this.c);
			bqg.c(float1, float1, float1, (float)integer / 255.0F);
			bfi.a(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
			bfi.a(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
		}

		@Override
		public boolean J_() {
			return !this.d.isEmpty();
		}
	}
}
