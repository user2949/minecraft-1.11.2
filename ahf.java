import javax.annotation.Nullable;

public class ahf {
	void a(ahp ahp) {
		for (aem aem6 : aem.values()) {
			ahp.a(adt.a(aem6, null), "###", "###", " | ", '#', new afj(alv.L, 1, aem6.a()), '|', afl.B);
		}

		ahp.a(new ahf.b());
		ahp.a(new ahf.a());
	}

	static class a implements aho {
		private a() {
		}

		@Override
		public boolean a(acs acs, ajs ajs) {
			boolean boolean4 = false;

			for (int integer5 = 0; integer5 < acs.v_(); integer5++) {
				afj afj6 = acs.a(integer5);
				if (afj6.c() == afl.cP) {
					if (boolean4) {
						return false;
					}

					if (arz.b(afj6) >= 6) {
						return false;
					}

					boolean4 = true;
				}
			}

			return !boolean4 ? false : this.c(acs) != null;
		}

		@Override
		public afj a(acs acs) {
			afj afj3 = afj.a;

			for (int integer4 = 0; integer4 < acs.v_(); integer4++) {
				afj afj5 = acs.a(integer4);
				if (!afj5.b() && afj5.c() == afl.cP) {
					afj3 = afj5.l();
					afj3.e(1);
					break;
				}
			}

			asa asa4 = this.c(acs);
			if (asa4 != null) {
				int integer5 = 0;

				for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
					afj afj7 = acs.a(integer6);
					if (afj7.c() == afl.be) {
						integer5 = afj7.j();
						break;
					}
				}

				du du6 = afj3.c("BlockEntityTag");
				ea ea7;
				if (du6.b("Patterns", 9)) {
					ea7 = du6.c("Patterns", 10);
				} else {
					ea7 = new ea();
					du6.a("Patterns", ea7);
				}

				du du8 = new du();
				du8.a("Pattern", asa4.b());
				du8.a("Color", integer5);
				ea7.a(du8);
			}

			return afj3;
		}

		@Override
		public int a() {
			return 10;
		}

		@Override
		public afj b() {
			return afj.a;
		}

		@Override
		public dd<afj> b(acs acs) {
			dd<afj> dd3 = dd.a(acs.v_(), afj.a);

			for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
				afj afj5 = acs.a(integer4);
				if (afj5.c().s()) {
					dd3.set(integer4, new afj(afj5.c().r()));
				}
			}

			return dd3;
		}

		@Nullable
		private asa c(acs acs) {
			for (asa asa6 : asa.values()) {
				if (asa6.d()) {
					boolean boolean7 = true;
					if (asa6.e()) {
						boolean boolean8 = false;
						boolean boolean9 = false;

						for (int integer10 = 0; integer10 < acs.v_() && boolean7; integer10++) {
							afj afj11 = acs.a(integer10);
							if (!afj11.b() && afj11.c() != afl.cP) {
								if (afj11.c() == afl.be) {
									if (boolean9) {
										boolean7 = false;
										break;
									}

									boolean9 = true;
								} else {
									if (boolean8 || !afj11.a(asa6.f())) {
										boolean7 = false;
										break;
									}

									boolean8 = true;
								}
							}
						}

						if (!boolean8 || !boolean9) {
							boolean7 = false;
						}
					} else if (acs.v_() == asa6.c().length * asa6.c()[0].length()) {
						int integer8 = -1;

						for (int integer9 = 0; integer9 < acs.v_() && boolean7; integer9++) {
							int integer10x = integer9 / 3;
							int integer11 = integer9 % 3;
							afj afj12 = acs.a(integer9);
							if (!afj12.b() && afj12.c() != afl.cP) {
								if (afj12.c() != afl.be) {
									boolean7 = false;
									break;
								}

								if (integer8 != -1 && integer8 != afj12.j()) {
									boolean7 = false;
									break;
								}

								if (asa6.c()[integer10x].charAt(integer11) == ' ') {
									boolean7 = false;
									break;
								}

								integer8 = afj12.j();
							} else if (asa6.c()[integer10x].charAt(integer11) != ' ') {
								boolean7 = false;
								break;
							}
						}
					} else {
						boolean7 = false;
					}

					if (boolean7) {
						return asa6;
					}
				}
			}

			return null;
		}
	}

	static class b implements aho {
		private b() {
		}

		@Override
		public boolean a(acs acs, ajs ajs) {
			afj afj4 = afj.a;
			afj afj5 = afj.a;

			for (int integer6 = 0; integer6 < acs.v_(); integer6++) {
				afj afj7 = acs.a(integer6);
				if (!afj7.b()) {
					if (afj7.c() != afl.cP) {
						return false;
					}

					if (!afj4.b() && !afj5.b()) {
						return false;
					}

					aem aem8 = adt.c(afj7);
					boolean boolean9 = arz.b(afj7) > 0;
					if (!afj4.b()) {
						if (boolean9) {
							return false;
						}

						if (aem8 != adt.c(afj4)) {
							return false;
						}

						afj5 = afj7;
					} else if (!afj5.b()) {
						if (!boolean9) {
							return false;
						}

						if (aem8 != adt.c(afj5)) {
							return false;
						}

						afj4 = afj7;
					} else if (boolean9) {
						afj4 = afj7;
					} else {
						afj5 = afj7;
					}
				}
			}

			return !afj4.b() && !afj5.b();
		}

		@Override
		public afj a(acs acs) {
			for (int integer3 = 0; integer3 < acs.v_(); integer3++) {
				afj afj4 = acs.a(integer3);
				if (!afj4.b() && arz.b(afj4) > 0) {
					afj afj5 = afj4.l();
					afj5.e(1);
					return afj5;
				}
			}

			return afj.a;
		}

		@Override
		public int a() {
			return 2;
		}

		@Override
		public afj b() {
			return afj.a;
		}

		@Override
		public dd<afj> b(acs acs) {
			dd<afj> dd3 = dd.a(acs.v_(), afj.a);

			for (int integer4 = 0; integer4 < dd3.size(); integer4++) {
				afj afj5 = acs.a(integer4);
				if (!afj5.b()) {
					if (afj5.c().s()) {
						dd3.set(integer4, new afj(afj5.c().r()));
					} else if (afj5.o() && arz.b(afj5) > 0) {
						afj afj6 = afj5.l();
						afj6.e(1);
						dd3.set(integer4, afj6);
					}
				}
			}

			return dd3;
		}
	}
}
