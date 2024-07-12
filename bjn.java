import java.util.List;

public abstract class bjn implements bfy.a {
	private static final kq c = new kq("textures/gui/resource_packs.png");
	private static final fb d = new fi("resourcePack.incompatible");
	private static final fb e = new fi("resourcePack.incompatible.old");
	private static final fb f = new fi("resourcePack.incompatible.new");
	protected final bes a;
	protected final bjm b;

	public bjn(bjm bjm) {
		this.b = bjm;
		this.a = bes.z();
	}

	@Override
	public void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, boolean boolean8) {
		int integer10 = this.a();
		if (integer10 != 3) {
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			bfi.a(integer2 - 1, integer3 - 1, integer2 + integer4 - 9, integer3 + integer5 + 1, -8978432);
		}

		this.d();
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		bfi.a(integer2, integer3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
		String string11 = this.c();
		String string12 = this.b();
		if (this.e() && (this.a.u.A || boolean8)) {
			this.a.N().a(c);
			bfi.a(integer2, integer3, integer2 + 32, integer3 + 32, -1601138544);
			bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
			int integer13 = integer6 - integer2;
			int integer14 = integer7 - integer3;
			if (integer10 < 3) {
				string11 = d.d();
				string12 = e.d();
			} else if (integer10 > 3) {
				string11 = d.d();
				string12 = f.d();
			}

			if (this.f()) {
				if (integer13 < 32) {
					bfi.a(integer2, integer3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
				} else {
					bfi.a(integer2, integer3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
				}
			} else {
				if (this.g()) {
					if (integer13 < 16) {
						bfi.a(integer2, integer3, 32.0F, 32.0F, 32, 32, 256.0F, 256.0F);
					} else {
						bfi.a(integer2, integer3, 32.0F, 0.0F, 32, 32, 256.0F, 256.0F);
					}
				}

				if (this.h()) {
					if (integer13 < 32 && integer13 > 16 && integer14 < 16) {
						bfi.a(integer2, integer3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
					} else {
						bfi.a(integer2, integer3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
					}
				}

				if (this.i()) {
					if (integer13 < 32 && integer13 > 16 && integer14 > 16) {
						bfi.a(integer2, integer3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
					} else {
						bfi.a(integer2, integer3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
					}
				}
			}
		}

		int integer13x = this.a.k.a(string11);
		if (integer13x > 157) {
			string11 = this.a.k.a(string11, 157 - this.a.k.a("...")) + "...";
		}

		this.a.k.a(string11, (float)(integer2 + 32 + 2), (float)(integer3 + 1), 16777215);
		List<String> list14 = this.a.k.c(string12, 157);

		for (int integer15 = 0; integer15 < 2 && integer15 < list14.size(); integer15++) {
			this.a.k.a((String)list14.get(integer15), (float)(integer2 + 32 + 2), (float)(integer3 + 12 + 10 * integer15), 8421504);
		}
	}

	protected abstract int a();

	protected abstract String b();

	protected abstract String c();

	protected abstract void d();

	protected boolean e() {
		return true;
	}

	protected boolean f() {
		return !this.b.a(this);
	}

	protected boolean g() {
		return this.b.a(this);
	}

	protected boolean h() {
		List<bjn> list2 = this.b.b(this);
		int integer3 = list2.indexOf(this);
		return integer3 > 0 && ((bjn)list2.get(integer3 - 1)).e();
	}

	protected boolean i() {
		List<bjn> list2 = this.b.b(this);
		int integer3 = list2.indexOf(this);
		return integer3 >= 0 && integer3 < list2.size() - 1 && ((bjn)list2.get(integer3 + 1)).e();
	}

	@Override
	public boolean a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
		if (this.e() && integer5 <= 32) {
			if (this.f()) {
				this.b.g();
				final int integer8 = ((bjn)this.b.f().get(0)).j() ? 1 : 0;
				int integer9 = this.a();
				if (integer9 == 3) {
					this.b.b(this).remove(this);
					this.b.f().add(integer8, this);
				} else {
					String string10 = cah.a("resourcePack.incompatible.confirm.title");
					String string11 = cah.a("resourcePack.incompatible.confirm." + (integer9 > 3 ? "new" : "old"));
					this.a.a(new bgu(new bgt() {
						@Override
						public void a(boolean boolean1, int integer) {
							List<bjn> list4 = bjn.this.b.b(bjn.this);
							bjn.this.a.a(bjn.this.b);
							if (boolean1) {
								list4.remove(bjn.this);
								bjn.this.b.f().add(integer8, bjn.this);
							}
						}
					}, string10, string11, 0));
				}

				return true;
			}

			if (integer5 < 16 && this.g()) {
				this.b.b(this).remove(this);
				this.b.a().add(0, this);
				this.b.g();
				return true;
			}

			if (integer5 > 16 && integer6 < 16 && this.h()) {
				List<bjn> list8 = this.b.b(this);
				int integer9 = list8.indexOf(this);
				list8.remove(this);
				list8.add(integer9 - 1, this);
				this.b.g();
				return true;
			}

			if (integer5 > 16 && integer6 > 16 && this.i()) {
				List<bjn> list8 = this.b.b(this);
				int integer9 = list8.indexOf(this);
				list8.remove(this);
				list8.add(integer9 + 1, this);
				this.b.g();
				return true;
			}
		}

		return false;
	}

	@Override
	public void a(int integer1, int integer2, int integer3) {
	}

	@Override
	public void b(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
	}

	public boolean j() {
		return false;
	}
}
