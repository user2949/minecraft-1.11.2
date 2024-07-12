import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ayi {
	public static void a() {
		ayo.a(ayi.h.class, "OMB");
		ayo.a(ayi.j.class, "OMCR");
		ayo.a(ayi.k.class, "OMDXR");
		ayo.a(ayi.l.class, "OMDXYR");
		ayo.a(ayi.m.class, "OMDYR");
		ayo.a(ayi.n.class, "OMDYZR");
		ayo.a(ayi.o.class, "OMDZR");
		ayo.a(ayi.p.class, "OMEntry");
		ayo.a(ayi.q.class, "OMPenthouse");
		ayo.a(ayi.s.class, "OMSimple");
		ayo.a(ayi.t.class, "OMSimpleT");
	}

	static class a implements ayi.i {
		private a() {
		}

		@Override
		public boolean a(ayi.v v) {
			return v.c[cv.EAST.a()] && !v.b[cv.EAST.a()].d;
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			v.d = true;
			v.b[cv.EAST.a()].d = true;
			return new ayi.k(cv, v, random);
		}
	}

	static class b implements ayi.i {
		private b() {
		}

		@Override
		public boolean a(ayi.v v) {
			if (v.c[cv.EAST.a()] && !v.b[cv.EAST.a()].d && v.c[cv.UP.a()] && !v.b[cv.UP.a()].d) {
				ayi.v v3 = v.b[cv.EAST.a()];
				return v3.c[cv.UP.a()] && !v3.b[cv.UP.a()].d;
			} else {
				return false;
			}
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			v.d = true;
			v.b[cv.EAST.a()].d = true;
			v.b[cv.UP.a()].d = true;
			v.b[cv.EAST.a()].b[cv.UP.a()].d = true;
			return new ayi.l(cv, v, random);
		}
	}

	static class c implements ayi.i {
		private c() {
		}

		@Override
		public boolean a(ayi.v v) {
			return v.c[cv.UP.a()] && !v.b[cv.UP.a()].d;
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			v.d = true;
			v.b[cv.UP.a()].d = true;
			return new ayi.m(cv, v, random);
		}
	}

	static class d implements ayi.i {
		private d() {
		}

		@Override
		public boolean a(ayi.v v) {
			if (v.c[cv.NORTH.a()] && !v.b[cv.NORTH.a()].d && v.c[cv.UP.a()] && !v.b[cv.UP.a()].d) {
				ayi.v v3 = v.b[cv.NORTH.a()];
				return v3.c[cv.UP.a()] && !v3.b[cv.UP.a()].d;
			} else {
				return false;
			}
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			v.d = true;
			v.b[cv.NORTH.a()].d = true;
			v.b[cv.UP.a()].d = true;
			v.b[cv.NORTH.a()].b[cv.UP.a()].d = true;
			return new ayi.n(cv, v, random);
		}
	}

	static class e implements ayi.i {
		private e() {
		}

		@Override
		public boolean a(ayi.v v) {
			return v.c[cv.NORTH.a()] && !v.b[cv.NORTH.a()].d;
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			ayi.v v5 = v;
			if (!v.c[cv.NORTH.a()] || v.b[cv.NORTH.a()].d) {
				v5 = v.b[cv.SOUTH.a()];
			}

			v5.d = true;
			v5.b[cv.NORTH.a()].d = true;
			return new ayi.o(cv, v5, random);
		}
	}

	static class f implements ayi.i {
		private f() {
		}

		@Override
		public boolean a(ayi.v v) {
			return true;
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			v.d = true;
			return new ayi.s(cv, v, random);
		}
	}

	static class g implements ayi.i {
		private g() {
		}

		@Override
		public boolean a(ayi.v v) {
			return !v.c[cv.WEST.a()] && !v.c[cv.EAST.a()] && !v.c[cv.NORTH.a()] && !v.c[cv.SOUTH.a()] && !v.c[cv.UP.a()];
		}

		@Override
		public ayi.r a(cv cv, ayi.v v, Random random) {
			v.d = true;
			return new ayi.t(cv, v, random);
		}
	}

	public static class h extends ayi.r {
		private ayi.v n;
		private ayi.v o;
		private final List<ayi.r> p = Lists.newArrayList();

		public h() {
		}

		public h(Random random, int integer2, int integer3, cv cv) {
			super(0);
			this.a(cv);
			cv cv6 = this.f();
			if (cv6.k() == cv.a.Z) {
				this.l = new axz(integer2, 39, integer3, integer2 + 58 - 1, 61, integer3 + 58 - 1);
			} else {
				this.l = new axz(integer2, 39, integer3, integer2 + 58 - 1, 61, integer3 + 58 - 1);
			}

			List<ayi.v> list7 = this.a(random);
			this.n.d = true;
			this.p.add(new ayi.p(cv6, this.n));
			this.p.add(new ayi.j(cv6, this.o, random));
			List<ayi.i> list8 = Lists.newArrayList();
			list8.add(new ayi.b());
			list8.add(new ayi.d());
			list8.add(new ayi.e());
			list8.add(new ayi.a());
			list8.add(new ayi.c());
			list8.add(new ayi.g());
			list8.add(new ayi.f());

			for (ayi.v v10 : list7) {
				if (!v10.d && !v10.b()) {
					for (ayi.i i12 : list8) {
						if (i12.a(v10)) {
							this.p.add(i12.a(cv6, v10, random));
							break;
						}
					}
				}
			}

			int integer9 = this.l.b;
			int integer10 = this.a(9, 22);
			int integer11 = this.b(9, 22);

			for (ayi.r r13 : this.p) {
				r13.d().a(integer10, integer9, integer11);
			}

			axz axz12 = axz.a(this.a(1, 1), this.d(1), this.b(1, 1), this.a(23, 21), this.d(8), this.b(23, 21));
			axz axz13 = axz.a(this.a(34, 1), this.d(1), this.b(34, 1), this.a(56, 21), this.d(8), this.b(56, 21));
			axz axz14 = axz.a(this.a(22, 22), this.d(13), this.b(22, 22), this.a(35, 35), this.d(17), this.b(35, 35));
			int integer15 = random.nextInt();
			this.p.add(new ayi.u(cv6, axz12, integer15++));
			this.p.add(new ayi.u(cv6, axz13, integer15++));
			this.p.add(new ayi.q(cv6, axz14));
		}

		private List<ayi.v> a(Random random) {
			ayi.v[] arr3 = new ayi.v[75];

			for (int integer4 = 0; integer4 < 5; integer4++) {
				for (int integer5 = 0; integer5 < 4; integer5++) {
					int integer6 = 0;
					int integer7 = b(integer4, 0, integer5);
					arr3[integer7] = new ayi.v(integer7);
				}
			}

			for (int integer4 = 0; integer4 < 5; integer4++) {
				for (int integer5 = 0; integer5 < 4; integer5++) {
					int integer6 = 1;
					int integer7 = b(integer4, 1, integer5);
					arr3[integer7] = new ayi.v(integer7);
				}
			}

			for (int integer4 = 1; integer4 < 4; integer4++) {
				for (int integer5 = 0; integer5 < 2; integer5++) {
					int integer6 = 2;
					int integer7 = b(integer4, 2, integer5);
					arr3[integer7] = new ayi.v(integer7);
				}
			}

			this.n = arr3[g];

			for (int integer4 = 0; integer4 < 5; integer4++) {
				for (int integer5 = 0; integer5 < 5; integer5++) {
					for (int integer6 = 0; integer6 < 3; integer6++) {
						int integer7 = b(integer4, integer6, integer5);
						if (arr3[integer7] != null) {
							for (cv cv11 : cv.values()) {
								int integer12 = integer4 + cv11.g();
								int integer13 = integer6 + cv11.h();
								int integer14 = integer5 + cv11.i();
								if (integer12 >= 0 && integer12 < 5 && integer14 >= 0 && integer14 < 5 && integer13 >= 0 && integer13 < 3) {
									int integer15 = b(integer12, integer13, integer14);
									if (arr3[integer15] != null) {
										if (integer14 == integer5) {
											arr3[integer7].a(cv11, arr3[integer15]);
										} else {
											arr3[integer7].a(cv11.d(), arr3[integer15]);
										}
									}
								}
							}
						}
					}
				}
			}

			ayi.v v4 = new ayi.v(1003);
			ayi.v v5 = new ayi.v(1001);
			ayi.v v6 = new ayi.v(1002);
			arr3[h].a(cv.UP, v4);
			arr3[i].a(cv.SOUTH, v5);
			arr3[j].a(cv.SOUTH, v6);
			v4.d = true;
			v5.d = true;
			v6.d = true;
			this.n.e = true;
			this.o = arr3[b(random.nextInt(4), 0, 2)];
			this.o.d = true;
			this.o.b[cv.EAST.a()].d = true;
			this.o.b[cv.NORTH.a()].d = true;
			this.o.b[cv.EAST.a()].b[cv.NORTH.a()].d = true;
			this.o.b[cv.UP.a()].d = true;
			this.o.b[cv.EAST.a()].b[cv.UP.a()].d = true;
			this.o.b[cv.NORTH.a()].b[cv.UP.a()].d = true;
			this.o.b[cv.EAST.a()].b[cv.NORTH.a()].b[cv.UP.a()].d = true;
			List<ayi.v> list7 = Lists.newArrayList();

			for (ayi.v v11 : arr3) {
				if (v11 != null) {
					v11.a();
					list7.add(v11);
				}
			}

			v4.a();
			Collections.shuffle(list7, random);
			int integer8 = 1;

			for (ayi.v v10 : list7) {
				int integer11 = 0;
				int integer12 = 0;

				while (integer11 < 2 && integer12 < 5) {
					integer12++;
					int integer13 = random.nextInt(6);
					if (v10.c[integer13]) {
						int integer14 = cv.a(integer13).d().a();
						v10.c[integer13] = false;
						v10.b[integer13].c[integer14] = false;
						if (v10.a(integer8++) && v10.b[integer13].a(integer8++)) {
							integer11++;
						} else {
							v10.c[integer13] = true;
							v10.b[integer13].c[integer14] = true;
						}
					}
				}
			}

			list7.add(v4);
			list7.add(v5);
			list7.add(v6);
			return list7;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			int integer5 = Math.max(ajs.K(), 64) - this.l.b;
			this.a(ajs, axz, 0, 0, 0, 58, integer5, 58, false);
			this.a(false, 0, ajs, random, axz);
			this.a(true, 33, ajs, random, axz);
			this.b(ajs, random, axz);
			this.c(ajs, random, axz);
			this.d(ajs, random, axz);
			this.e(ajs, random, axz);
			this.f(ajs, random, axz);
			this.g(ajs, random, axz);

			for (int integer6 = 0; integer6 < 7; integer6++) {
				int integer7 = 0;

				while (integer7 < 7) {
					if (integer7 == 0 && integer6 == 3) {
						integer7 = 6;
					}

					int integer8 = integer6 * 9;
					int integer9 = integer7 * 9;

					for (int integer10 = 0; integer10 < 4; integer10++) {
						for (int integer11 = 0; integer11 < 4; integer11++) {
							this.a(ajs, b, integer8 + integer10, 0, integer9 + integer11, axz);
							this.b(ajs, b, integer8 + integer10, -1, integer9 + integer11, axz);
						}
					}

					if (integer6 != 0 && integer6 != 6) {
						integer7 += 6;
					} else {
						integer7++;
					}
				}
			}

			for (int integer6 = 0; integer6 < 5; integer6++) {
				this.a(ajs, axz, -1 - integer6, 0 + integer6 * 2, -1 - integer6, -1 - integer6, 23, 58 + integer6, false);
				this.a(ajs, axz, 58 + integer6, 0 + integer6 * 2, -1 - integer6, 58 + integer6, 23, 58 + integer6, false);
				this.a(ajs, axz, 0 - integer6, 0 + integer6 * 2, -1 - integer6, 57 + integer6, 23, -1 - integer6, false);
				this.a(ajs, axz, 0 - integer6, 0 + integer6 * 2, 58 + integer6, 57 + integer6, 23, 58 + integer6, false);
			}

			for (ayi.r r7 : this.p) {
				if (r7.d().a(axz)) {
					r7.a(ajs, random, axz);
				}
			}

			return true;
		}

		private void a(boolean boolean1, int integer, ajs ajs, Random random, axz axz) {
			int integer7 = 24;
			if (this.a(axz, integer, 0, integer + 23, 20)) {
				this.a(ajs, axz, integer + 0, 0, 0, integer + 24, 0, 20, a, a, false);
				this.a(ajs, axz, integer + 0, 1, 0, integer + 24, 10, 20, false);

				for (int integer8 = 0; integer8 < 4; integer8++) {
					this.a(ajs, axz, integer + integer8, integer8 + 1, integer8, integer + integer8, integer8 + 1, 20, b, b, false);
					this.a(ajs, axz, integer + integer8 + 7, integer8 + 5, integer8 + 7, integer + integer8 + 7, integer8 + 5, 20, b, b, false);
					this.a(ajs, axz, integer + 17 - integer8, integer8 + 5, integer8 + 7, integer + 17 - integer8, integer8 + 5, 20, b, b, false);
					this.a(ajs, axz, integer + 24 - integer8, integer8 + 1, integer8, integer + 24 - integer8, integer8 + 1, 20, b, b, false);
					this.a(ajs, axz, integer + integer8 + 1, integer8 + 1, integer8, integer + 23 - integer8, integer8 + 1, integer8, b, b, false);
					this.a(ajs, axz, integer + integer8 + 8, integer8 + 5, integer8 + 7, integer + 16 - integer8, integer8 + 5, integer8 + 7, b, b, false);
				}

				this.a(ajs, axz, integer + 4, 4, 4, integer + 6, 4, 20, a, a, false);
				this.a(ajs, axz, integer + 7, 4, 4, integer + 17, 4, 6, a, a, false);
				this.a(ajs, axz, integer + 18, 4, 4, integer + 20, 4, 20, a, a, false);
				this.a(ajs, axz, integer + 11, 8, 11, integer + 13, 8, 20, a, a, false);
				this.a(ajs, d, integer + 12, 9, 12, axz);
				this.a(ajs, d, integer + 12, 9, 15, axz);
				this.a(ajs, d, integer + 12, 9, 18, axz);
				int integer8 = integer + (boolean1 ? 19 : 5);
				int integer9 = integer + (boolean1 ? 5 : 19);

				for (int integer10 = 20; integer10 >= 5; integer10 -= 3) {
					this.a(ajs, d, integer8, 5, integer10, axz);
				}

				for (int integer10 = 19; integer10 >= 7; integer10 -= 3) {
					this.a(ajs, d, integer9, 5, integer10, axz);
				}

				for (int integer10 = 0; integer10 < 4; integer10++) {
					int integer11 = boolean1 ? integer + (24 - (17 - integer10 * 3)) : integer + 17 - integer10 * 3;
					this.a(ajs, d, integer11, 5, 5, axz);
				}

				this.a(ajs, d, integer9, 5, 5, axz);
				this.a(ajs, axz, integer + 11, 1, 12, integer + 13, 7, 12, a, a, false);
				this.a(ajs, axz, integer + 12, 1, 11, integer + 12, 7, 13, a, a, false);
			}
		}

		private void b(ajs ajs, Random random, axz axz) {
			if (this.a(axz, 22, 5, 35, 17)) {
				this.a(ajs, axz, 25, 0, 0, 32, 8, 20, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 24, 2, 5 + integer5 * 4, 24, 4, 5 + integer5 * 4, b, b, false);
					this.a(ajs, axz, 22, 4, 5 + integer5 * 4, 23, 4, 5 + integer5 * 4, b, b, false);
					this.a(ajs, b, 25, 5, 5 + integer5 * 4, axz);
					this.a(ajs, b, 26, 6, 5 + integer5 * 4, axz);
					this.a(ajs, e, 26, 5, 5 + integer5 * 4, axz);
					this.a(ajs, axz, 33, 2, 5 + integer5 * 4, 33, 4, 5 + integer5 * 4, b, b, false);
					this.a(ajs, axz, 34, 4, 5 + integer5 * 4, 35, 4, 5 + integer5 * 4, b, b, false);
					this.a(ajs, b, 32, 5, 5 + integer5 * 4, axz);
					this.a(ajs, b, 31, 6, 5 + integer5 * 4, axz);
					this.a(ajs, e, 31, 5, 5 + integer5 * 4, axz);
					this.a(ajs, axz, 27, 6, 5 + integer5 * 4, 30, 6, 5 + integer5 * 4, a, a, false);
				}
			}
		}

		private void c(ajs ajs, Random random, axz axz) {
			if (this.a(axz, 15, 20, 42, 21)) {
				this.a(ajs, axz, 15, 0, 21, 42, 0, 21, a, a, false);
				this.a(ajs, axz, 26, 1, 21, 31, 3, 21, false);
				this.a(ajs, axz, 21, 12, 21, 36, 12, 21, a, a, false);
				this.a(ajs, axz, 17, 11, 21, 40, 11, 21, a, a, false);
				this.a(ajs, axz, 16, 10, 21, 41, 10, 21, a, a, false);
				this.a(ajs, axz, 15, 7, 21, 42, 9, 21, a, a, false);
				this.a(ajs, axz, 16, 6, 21, 41, 6, 21, a, a, false);
				this.a(ajs, axz, 17, 5, 21, 40, 5, 21, a, a, false);
				this.a(ajs, axz, 21, 4, 21, 36, 4, 21, a, a, false);
				this.a(ajs, axz, 22, 3, 21, 26, 3, 21, a, a, false);
				this.a(ajs, axz, 31, 3, 21, 35, 3, 21, a, a, false);
				this.a(ajs, axz, 23, 2, 21, 25, 2, 21, a, a, false);
				this.a(ajs, axz, 32, 2, 21, 34, 2, 21, a, a, false);
				this.a(ajs, axz, 28, 4, 20, 29, 4, 21, b, b, false);
				this.a(ajs, b, 27, 3, 21, axz);
				this.a(ajs, b, 30, 3, 21, axz);
				this.a(ajs, b, 26, 2, 21, axz);
				this.a(ajs, b, 31, 2, 21, axz);
				this.a(ajs, b, 25, 1, 21, axz);
				this.a(ajs, b, 32, 1, 21, axz);

				for (int integer5 = 0; integer5 < 7; integer5++) {
					this.a(ajs, c, 28 - integer5, 6 + integer5, 21, axz);
					this.a(ajs, c, 29 + integer5, 6 + integer5, 21, axz);
				}

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, c, 28 - integer5, 9 + integer5, 21, axz);
					this.a(ajs, c, 29 + integer5, 9 + integer5, 21, axz);
				}

				this.a(ajs, c, 28, 12, 21, axz);
				this.a(ajs, c, 29, 12, 21, axz);

				for (int integer5 = 0; integer5 < 3; integer5++) {
					this.a(ajs, c, 22 - integer5 * 2, 8, 21, axz);
					this.a(ajs, c, 22 - integer5 * 2, 9, 21, axz);
					this.a(ajs, c, 35 + integer5 * 2, 8, 21, axz);
					this.a(ajs, c, 35 + integer5 * 2, 9, 21, axz);
				}

				this.a(ajs, axz, 15, 13, 21, 42, 15, 21, false);
				this.a(ajs, axz, 15, 1, 21, 15, 6, 21, false);
				this.a(ajs, axz, 16, 1, 21, 16, 5, 21, false);
				this.a(ajs, axz, 17, 1, 21, 20, 4, 21, false);
				this.a(ajs, axz, 21, 1, 21, 21, 3, 21, false);
				this.a(ajs, axz, 22, 1, 21, 22, 2, 21, false);
				this.a(ajs, axz, 23, 1, 21, 24, 1, 21, false);
				this.a(ajs, axz, 42, 1, 21, 42, 6, 21, false);
				this.a(ajs, axz, 41, 1, 21, 41, 5, 21, false);
				this.a(ajs, axz, 37, 1, 21, 40, 4, 21, false);
				this.a(ajs, axz, 36, 1, 21, 36, 3, 21, false);
				this.a(ajs, axz, 33, 1, 21, 34, 1, 21, false);
				this.a(ajs, axz, 35, 1, 21, 35, 2, 21, false);
			}
		}

		private void d(ajs ajs, Random random, axz axz) {
			if (this.a(axz, 21, 21, 36, 36)) {
				this.a(ajs, axz, 21, 0, 22, 36, 0, 36, a, a, false);
				this.a(ajs, axz, 21, 1, 22, 36, 23, 36, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 21 + integer5, 13 + integer5, 21 + integer5, 36 - integer5, 13 + integer5, 21 + integer5, b, b, false);
					this.a(ajs, axz, 21 + integer5, 13 + integer5, 36 - integer5, 36 - integer5, 13 + integer5, 36 - integer5, b, b, false);
					this.a(ajs, axz, 21 + integer5, 13 + integer5, 22 + integer5, 21 + integer5, 13 + integer5, 35 - integer5, b, b, false);
					this.a(ajs, axz, 36 - integer5, 13 + integer5, 22 + integer5, 36 - integer5, 13 + integer5, 35 - integer5, b, b, false);
				}

				this.a(ajs, axz, 25, 16, 25, 32, 16, 32, a, a, false);
				this.a(ajs, axz, 25, 17, 25, 25, 19, 25, b, b, false);
				this.a(ajs, axz, 32, 17, 25, 32, 19, 25, b, b, false);
				this.a(ajs, axz, 25, 17, 32, 25, 19, 32, b, b, false);
				this.a(ajs, axz, 32, 17, 32, 32, 19, 32, b, b, false);
				this.a(ajs, b, 26, 20, 26, axz);
				this.a(ajs, b, 27, 21, 27, axz);
				this.a(ajs, e, 27, 20, 27, axz);
				this.a(ajs, b, 26, 20, 31, axz);
				this.a(ajs, b, 27, 21, 30, axz);
				this.a(ajs, e, 27, 20, 30, axz);
				this.a(ajs, b, 31, 20, 31, axz);
				this.a(ajs, b, 30, 21, 30, axz);
				this.a(ajs, e, 30, 20, 30, axz);
				this.a(ajs, b, 31, 20, 26, axz);
				this.a(ajs, b, 30, 21, 27, axz);
				this.a(ajs, e, 30, 20, 27, axz);
				this.a(ajs, axz, 28, 21, 27, 29, 21, 27, a, a, false);
				this.a(ajs, axz, 27, 21, 28, 27, 21, 29, a, a, false);
				this.a(ajs, axz, 28, 21, 30, 29, 21, 30, a, a, false);
				this.a(ajs, axz, 30, 21, 28, 30, 21, 29, a, a, false);
			}
		}

		private void e(ajs ajs, Random random, axz axz) {
			if (this.a(axz, 0, 21, 6, 58)) {
				this.a(ajs, axz, 0, 0, 21, 6, 0, 57, a, a, false);
				this.a(ajs, axz, 0, 1, 21, 6, 7, 57, false);
				this.a(ajs, axz, 4, 4, 21, 6, 4, 53, a, a, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, integer5, integer5 + 1, 21, integer5, integer5 + 1, 57 - integer5, b, b, false);
				}

				for (int integer5 = 23; integer5 < 53; integer5 += 3) {
					this.a(ajs, d, 5, 5, integer5, axz);
				}

				this.a(ajs, d, 5, 5, 52, axz);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, integer5, integer5 + 1, 21, integer5, integer5 + 1, 57 - integer5, b, b, false);
				}

				this.a(ajs, axz, 4, 1, 52, 6, 3, 52, a, a, false);
				this.a(ajs, axz, 5, 1, 51, 5, 3, 53, a, a, false);
			}

			if (this.a(axz, 51, 21, 58, 58)) {
				this.a(ajs, axz, 51, 0, 21, 57, 0, 57, a, a, false);
				this.a(ajs, axz, 51, 1, 21, 57, 7, 57, false);
				this.a(ajs, axz, 51, 4, 21, 53, 4, 53, a, a, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 57 - integer5, integer5 + 1, 21, 57 - integer5, integer5 + 1, 57 - integer5, b, b, false);
				}

				for (int integer5 = 23; integer5 < 53; integer5 += 3) {
					this.a(ajs, d, 52, 5, integer5, axz);
				}

				this.a(ajs, d, 52, 5, 52, axz);
				this.a(ajs, axz, 51, 1, 52, 53, 3, 52, a, a, false);
				this.a(ajs, axz, 52, 1, 51, 52, 3, 53, a, a, false);
			}

			if (this.a(axz, 0, 51, 57, 57)) {
				this.a(ajs, axz, 7, 0, 51, 50, 0, 57, a, a, false);
				this.a(ajs, axz, 7, 1, 51, 50, 10, 57, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, integer5 + 1, integer5 + 1, 57 - integer5, 56 - integer5, integer5 + 1, 57 - integer5, b, b, false);
				}
			}
		}

		private void f(ajs ajs, Random random, axz axz) {
			if (this.a(axz, 7, 21, 13, 50)) {
				this.a(ajs, axz, 7, 0, 21, 13, 0, 50, a, a, false);
				this.a(ajs, axz, 7, 1, 21, 13, 10, 50, false);
				this.a(ajs, axz, 11, 8, 21, 13, 8, 53, a, a, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, integer5 + 7, integer5 + 5, 21, integer5 + 7, integer5 + 5, 54, b, b, false);
				}

				for (int integer5 = 21; integer5 <= 45; integer5 += 3) {
					this.a(ajs, d, 12, 9, integer5, axz);
				}
			}

			if (this.a(axz, 44, 21, 50, 54)) {
				this.a(ajs, axz, 44, 0, 21, 50, 0, 50, a, a, false);
				this.a(ajs, axz, 44, 1, 21, 50, 10, 50, false);
				this.a(ajs, axz, 44, 8, 21, 46, 8, 53, a, a, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 50 - integer5, integer5 + 5, 21, 50 - integer5, integer5 + 5, 54, b, b, false);
				}

				for (int integer5 = 21; integer5 <= 45; integer5 += 3) {
					this.a(ajs, d, 45, 9, integer5, axz);
				}
			}

			if (this.a(axz, 8, 44, 49, 54)) {
				this.a(ajs, axz, 14, 0, 44, 43, 0, 50, a, a, false);
				this.a(ajs, axz, 14, 1, 44, 43, 10, 50, false);

				for (int integer5 = 12; integer5 <= 45; integer5 += 3) {
					this.a(ajs, d, integer5, 9, 45, axz);
					this.a(ajs, d, integer5, 9, 52, axz);
					if (integer5 == 12 || integer5 == 18 || integer5 == 24 || integer5 == 33 || integer5 == 39 || integer5 == 45) {
						this.a(ajs, d, integer5, 9, 47, axz);
						this.a(ajs, d, integer5, 9, 50, axz);
						this.a(ajs, d, integer5, 10, 45, axz);
						this.a(ajs, d, integer5, 10, 46, axz);
						this.a(ajs, d, integer5, 10, 51, axz);
						this.a(ajs, d, integer5, 10, 52, axz);
						this.a(ajs, d, integer5, 11, 47, axz);
						this.a(ajs, d, integer5, 11, 50, axz);
						this.a(ajs, d, integer5, 12, 48, axz);
						this.a(ajs, d, integer5, 12, 49, axz);
					}
				}

				for (int integer5x = 0; integer5x < 3; integer5x++) {
					this.a(ajs, axz, 8 + integer5x, 5 + integer5x, 54, 49 - integer5x, 5 + integer5x, 54, a, a, false);
				}

				this.a(ajs, axz, 11, 8, 54, 46, 8, 54, b, b, false);
				this.a(ajs, axz, 14, 8, 44, 43, 8, 53, a, a, false);
			}
		}

		private void g(ajs ajs, Random random, axz axz) {
			if (this.a(axz, 14, 21, 20, 43)) {
				this.a(ajs, axz, 14, 0, 21, 20, 0, 43, a, a, false);
				this.a(ajs, axz, 14, 1, 22, 20, 14, 43, false);
				this.a(ajs, axz, 18, 12, 22, 20, 12, 39, a, a, false);
				this.a(ajs, axz, 18, 12, 21, 20, 12, 21, b, b, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, integer5 + 14, integer5 + 9, 21, integer5 + 14, integer5 + 9, 43 - integer5, b, b, false);
				}

				for (int integer5 = 23; integer5 <= 39; integer5 += 3) {
					this.a(ajs, d, 19, 13, integer5, axz);
				}
			}

			if (this.a(axz, 37, 21, 43, 43)) {
				this.a(ajs, axz, 37, 0, 21, 43, 0, 43, a, a, false);
				this.a(ajs, axz, 37, 1, 22, 43, 14, 43, false);
				this.a(ajs, axz, 37, 12, 22, 39, 12, 39, a, a, false);
				this.a(ajs, axz, 37, 12, 21, 39, 12, 21, b, b, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 43 - integer5, integer5 + 9, 21, 43 - integer5, integer5 + 9, 43 - integer5, b, b, false);
				}

				for (int integer5 = 23; integer5 <= 39; integer5 += 3) {
					this.a(ajs, d, 38, 13, integer5, axz);
				}
			}

			if (this.a(axz, 15, 37, 42, 43)) {
				this.a(ajs, axz, 21, 0, 37, 36, 0, 43, a, a, false);
				this.a(ajs, axz, 21, 1, 37, 36, 14, 43, false);
				this.a(ajs, axz, 21, 12, 37, 36, 12, 39, a, a, false);

				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 15 + integer5, integer5 + 9, 43 - integer5, 42 - integer5, integer5 + 9, 43 - integer5, b, b, false);
				}

				for (int integer5 = 21; integer5 <= 36; integer5 += 3) {
					this.a(ajs, d, integer5, 13, 38, axz);
				}
			}
		}
	}

	interface i {
		boolean a(ayi.v v);

		ayi.r a(cv cv, ayi.v v, Random random);
	}

	public static class j extends ayi.r {
		public j() {
		}

		public j(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 2, 2, 2);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 1, 8, 0, 14, 8, 14, a);
			int integer5 = 7;
			atl atl6 = b;
			this.a(ajs, axz, 0, 7, 0, 0, 7, 15, atl6, atl6, false);
			this.a(ajs, axz, 15, 7, 0, 15, 7, 15, atl6, atl6, false);
			this.a(ajs, axz, 1, 7, 0, 15, 7, 0, atl6, atl6, false);
			this.a(ajs, axz, 1, 7, 15, 14, 7, 15, atl6, atl6, false);

			for (int integer5x = 1; integer5x <= 6; integer5x++) {
				atl6 = b;
				if (integer5x == 2 || integer5x == 6) {
					atl6 = a;
				}

				for (int integer7 = 0; integer7 <= 15; integer7 += 15) {
					this.a(ajs, axz, integer7, integer5x, 0, integer7, integer5x, 1, atl6, atl6, false);
					this.a(ajs, axz, integer7, integer5x, 6, integer7, integer5x, 9, atl6, atl6, false);
					this.a(ajs, axz, integer7, integer5x, 14, integer7, integer5x, 15, atl6, atl6, false);
				}

				this.a(ajs, axz, 1, integer5x, 0, 1, integer5x, 0, atl6, atl6, false);
				this.a(ajs, axz, 6, integer5x, 0, 9, integer5x, 0, atl6, atl6, false);
				this.a(ajs, axz, 14, integer5x, 0, 14, integer5x, 0, atl6, atl6, false);
				this.a(ajs, axz, 1, integer5x, 15, 14, integer5x, 15, atl6, atl6, false);
			}

			this.a(ajs, axz, 6, 3, 6, 9, 6, 9, c, c, false);
			this.a(ajs, axz, 7, 4, 7, 8, 5, 8, alv.R.t(), alv.R.t(), false);

			for (int integer5x = 3; integer5x <= 6; integer5x += 3) {
				for (int integer6 = 6; integer6 <= 9; integer6 += 3) {
					this.a(ajs, e, integer6, integer5x, 6, axz);
					this.a(ajs, e, integer6, integer5x, 9, axz);
				}
			}

			this.a(ajs, axz, 5, 1, 6, 5, 2, 6, b, b, false);
			this.a(ajs, axz, 5, 1, 9, 5, 2, 9, b, b, false);
			this.a(ajs, axz, 10, 1, 6, 10, 2, 6, b, b, false);
			this.a(ajs, axz, 10, 1, 9, 10, 2, 9, b, b, false);
			this.a(ajs, axz, 6, 1, 5, 6, 2, 5, b, b, false);
			this.a(ajs, axz, 9, 1, 5, 9, 2, 5, b, b, false);
			this.a(ajs, axz, 6, 1, 10, 6, 2, 10, b, b, false);
			this.a(ajs, axz, 9, 1, 10, 9, 2, 10, b, b, false);
			this.a(ajs, axz, 5, 2, 5, 5, 6, 5, b, b, false);
			this.a(ajs, axz, 5, 2, 10, 5, 6, 10, b, b, false);
			this.a(ajs, axz, 10, 2, 5, 10, 6, 5, b, b, false);
			this.a(ajs, axz, 10, 2, 10, 10, 6, 10, b, b, false);
			this.a(ajs, axz, 5, 7, 1, 5, 7, 6, b, b, false);
			this.a(ajs, axz, 10, 7, 1, 10, 7, 6, b, b, false);
			this.a(ajs, axz, 5, 7, 9, 5, 7, 14, b, b, false);
			this.a(ajs, axz, 10, 7, 9, 10, 7, 14, b, b, false);
			this.a(ajs, axz, 1, 7, 5, 6, 7, 5, b, b, false);
			this.a(ajs, axz, 1, 7, 10, 6, 7, 10, b, b, false);
			this.a(ajs, axz, 9, 7, 5, 14, 7, 5, b, b, false);
			this.a(ajs, axz, 9, 7, 10, 14, 7, 10, b, b, false);
			this.a(ajs, axz, 2, 1, 2, 2, 1, 3, b, b, false);
			this.a(ajs, axz, 3, 1, 2, 3, 1, 2, b, b, false);
			this.a(ajs, axz, 13, 1, 2, 13, 1, 3, b, b, false);
			this.a(ajs, axz, 12, 1, 2, 12, 1, 2, b, b, false);
			this.a(ajs, axz, 2, 1, 12, 2, 1, 13, b, b, false);
			this.a(ajs, axz, 3, 1, 13, 3, 1, 13, b, b, false);
			this.a(ajs, axz, 13, 1, 12, 13, 1, 13, b, b, false);
			this.a(ajs, axz, 12, 1, 13, 12, 1, 13, b, b, false);
			return true;
		}
	}

	public static class k extends ayi.r {
		public k() {
		}

		public k(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 2, 1, 1);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			ayi.v v5 = this.k.b[cv.EAST.a()];
			ayi.v v6 = this.k;
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 8, 0, v5.c[cv.DOWN.a()]);
				this.a(ajs, axz, 0, 0, v6.c[cv.DOWN.a()]);
			}

			if (v6.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 4, 1, 7, 4, 6, a);
			}

			if (v5.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 8, 4, 1, 14, 4, 6, a);
			}

			this.a(ajs, axz, 0, 3, 0, 0, 3, 7, b, b, false);
			this.a(ajs, axz, 15, 3, 0, 15, 3, 7, b, b, false);
			this.a(ajs, axz, 1, 3, 0, 15, 3, 0, b, b, false);
			this.a(ajs, axz, 1, 3, 7, 14, 3, 7, b, b, false);
			this.a(ajs, axz, 0, 2, 0, 0, 2, 7, a, a, false);
			this.a(ajs, axz, 15, 2, 0, 15, 2, 7, a, a, false);
			this.a(ajs, axz, 1, 2, 0, 15, 2, 0, a, a, false);
			this.a(ajs, axz, 1, 2, 7, 14, 2, 7, a, a, false);
			this.a(ajs, axz, 0, 1, 0, 0, 1, 7, b, b, false);
			this.a(ajs, axz, 15, 1, 0, 15, 1, 7, b, b, false);
			this.a(ajs, axz, 1, 1, 0, 15, 1, 0, b, b, false);
			this.a(ajs, axz, 1, 1, 7, 14, 1, 7, b, b, false);
			this.a(ajs, axz, 5, 1, 0, 10, 1, 4, b, b, false);
			this.a(ajs, axz, 6, 2, 0, 9, 2, 3, a, a, false);
			this.a(ajs, axz, 5, 3, 0, 10, 3, 4, b, b, false);
			this.a(ajs, e, 6, 2, 3, axz);
			this.a(ajs, e, 9, 2, 3, axz);
			if (v6.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 1, 0, 4, 2, 0, false);
			}

			if (v6.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 1, 7, 4, 2, 7, false);
			}

			if (v6.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 3, 0, 2, 4, false);
			}

			if (v5.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 11, 1, 0, 12, 2, 0, false);
			}

			if (v5.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 11, 1, 7, 12, 2, 7, false);
			}

			if (v5.c[cv.EAST.a()]) {
				this.a(ajs, axz, 15, 1, 3, 15, 2, 4, false);
			}

			return true;
		}
	}

	public static class l extends ayi.r {
		public l() {
		}

		public l(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 2, 2, 1);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			ayi.v v5 = this.k.b[cv.EAST.a()];
			ayi.v v6 = this.k;
			ayi.v v7 = v6.b[cv.UP.a()];
			ayi.v v8 = v5.b[cv.UP.a()];
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 8, 0, v5.c[cv.DOWN.a()]);
				this.a(ajs, axz, 0, 0, v6.c[cv.DOWN.a()]);
			}

			if (v7.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 8, 1, 7, 8, 6, a);
			}

			if (v8.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 8, 8, 1, 14, 8, 6, a);
			}

			for (int integer9 = 1; integer9 <= 7; integer9++) {
				atl atl10 = b;
				if (integer9 == 2 || integer9 == 6) {
					atl10 = a;
				}

				this.a(ajs, axz, 0, integer9, 0, 0, integer9, 7, atl10, atl10, false);
				this.a(ajs, axz, 15, integer9, 0, 15, integer9, 7, atl10, atl10, false);
				this.a(ajs, axz, 1, integer9, 0, 15, integer9, 0, atl10, atl10, false);
				this.a(ajs, axz, 1, integer9, 7, 14, integer9, 7, atl10, atl10, false);
			}

			this.a(ajs, axz, 2, 1, 3, 2, 7, 4, b, b, false);
			this.a(ajs, axz, 3, 1, 2, 4, 7, 2, b, b, false);
			this.a(ajs, axz, 3, 1, 5, 4, 7, 5, b, b, false);
			this.a(ajs, axz, 13, 1, 3, 13, 7, 4, b, b, false);
			this.a(ajs, axz, 11, 1, 2, 12, 7, 2, b, b, false);
			this.a(ajs, axz, 11, 1, 5, 12, 7, 5, b, b, false);
			this.a(ajs, axz, 5, 1, 3, 5, 3, 4, b, b, false);
			this.a(ajs, axz, 10, 1, 3, 10, 3, 4, b, b, false);
			this.a(ajs, axz, 5, 7, 2, 10, 7, 5, b, b, false);
			this.a(ajs, axz, 5, 5, 2, 5, 7, 2, b, b, false);
			this.a(ajs, axz, 10, 5, 2, 10, 7, 2, b, b, false);
			this.a(ajs, axz, 5, 5, 5, 5, 7, 5, b, b, false);
			this.a(ajs, axz, 10, 5, 5, 10, 7, 5, b, b, false);
			this.a(ajs, b, 6, 6, 2, axz);
			this.a(ajs, b, 9, 6, 2, axz);
			this.a(ajs, b, 6, 6, 5, axz);
			this.a(ajs, b, 9, 6, 5, axz);
			this.a(ajs, axz, 5, 4, 3, 6, 4, 4, b, b, false);
			this.a(ajs, axz, 9, 4, 3, 10, 4, 4, b, b, false);
			this.a(ajs, e, 5, 4, 2, axz);
			this.a(ajs, e, 5, 4, 5, axz);
			this.a(ajs, e, 10, 4, 2, axz);
			this.a(ajs, e, 10, 4, 5, axz);
			if (v6.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 1, 0, 4, 2, 0, false);
			}

			if (v6.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 1, 7, 4, 2, 7, false);
			}

			if (v6.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 3, 0, 2, 4, false);
			}

			if (v5.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 11, 1, 0, 12, 2, 0, false);
			}

			if (v5.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 11, 1, 7, 12, 2, 7, false);
			}

			if (v5.c[cv.EAST.a()]) {
				this.a(ajs, axz, 15, 1, 3, 15, 2, 4, false);
			}

			if (v7.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 5, 0, 4, 6, 0, false);
			}

			if (v7.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 5, 7, 4, 6, 7, false);
			}

			if (v7.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 5, 3, 0, 6, 4, false);
			}

			if (v8.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 11, 5, 0, 12, 6, 0, false);
			}

			if (v8.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 11, 5, 7, 12, 6, 7, false);
			}

			if (v8.c[cv.EAST.a()]) {
				this.a(ajs, axz, 15, 5, 3, 15, 6, 4, false);
			}

			return true;
		}
	}

	public static class m extends ayi.r {
		public m() {
		}

		public m(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 1, 2, 1);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 0, 0, this.k.c[cv.DOWN.a()]);
			}

			ayi.v v5 = this.k.b[cv.UP.a()];
			if (v5.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 8, 1, 6, 8, 6, a);
			}

			this.a(ajs, axz, 0, 4, 0, 0, 4, 7, b, b, false);
			this.a(ajs, axz, 7, 4, 0, 7, 4, 7, b, b, false);
			this.a(ajs, axz, 1, 4, 0, 6, 4, 0, b, b, false);
			this.a(ajs, axz, 1, 4, 7, 6, 4, 7, b, b, false);
			this.a(ajs, axz, 2, 4, 1, 2, 4, 2, b, b, false);
			this.a(ajs, axz, 1, 4, 2, 1, 4, 2, b, b, false);
			this.a(ajs, axz, 5, 4, 1, 5, 4, 2, b, b, false);
			this.a(ajs, axz, 6, 4, 2, 6, 4, 2, b, b, false);
			this.a(ajs, axz, 2, 4, 5, 2, 4, 6, b, b, false);
			this.a(ajs, axz, 1, 4, 5, 1, 4, 5, b, b, false);
			this.a(ajs, axz, 5, 4, 5, 5, 4, 6, b, b, false);
			this.a(ajs, axz, 6, 4, 5, 6, 4, 5, b, b, false);
			ayi.v v6 = this.k;

			for (int integer7 = 1; integer7 <= 5; integer7 += 4) {
				int integer8 = 0;
				if (v6.c[cv.SOUTH.a()]) {
					this.a(ajs, axz, 2, integer7, integer8, 2, integer7 + 2, integer8, b, b, false);
					this.a(ajs, axz, 5, integer7, integer8, 5, integer7 + 2, integer8, b, b, false);
					this.a(ajs, axz, 3, integer7 + 2, integer8, 4, integer7 + 2, integer8, b, b, false);
				} else {
					this.a(ajs, axz, 0, integer7, integer8, 7, integer7 + 2, integer8, b, b, false);
					this.a(ajs, axz, 0, integer7 + 1, integer8, 7, integer7 + 1, integer8, a, a, false);
				}

				int var9 = 7;
				if (v6.c[cv.NORTH.a()]) {
					this.a(ajs, axz, 2, integer7, var9, 2, integer7 + 2, var9, b, b, false);
					this.a(ajs, axz, 5, integer7, var9, 5, integer7 + 2, var9, b, b, false);
					this.a(ajs, axz, 3, integer7 + 2, var9, 4, integer7 + 2, var9, b, b, false);
				} else {
					this.a(ajs, axz, 0, integer7, var9, 7, integer7 + 2, var9, b, b, false);
					this.a(ajs, axz, 0, integer7 + 1, var9, 7, integer7 + 1, var9, a, a, false);
				}

				int integer9 = 0;
				if (v6.c[cv.WEST.a()]) {
					this.a(ajs, axz, integer9, integer7, 2, integer9, integer7 + 2, 2, b, b, false);
					this.a(ajs, axz, integer9, integer7, 5, integer9, integer7 + 2, 5, b, b, false);
					this.a(ajs, axz, integer9, integer7 + 2, 3, integer9, integer7 + 2, 4, b, b, false);
				} else {
					this.a(ajs, axz, integer9, integer7, 0, integer9, integer7 + 2, 7, b, b, false);
					this.a(ajs, axz, integer9, integer7 + 1, 0, integer9, integer7 + 1, 7, a, a, false);
				}

				int var10 = 7;
				if (v6.c[cv.EAST.a()]) {
					this.a(ajs, axz, var10, integer7, 2, var10, integer7 + 2, 2, b, b, false);
					this.a(ajs, axz, var10, integer7, 5, var10, integer7 + 2, 5, b, b, false);
					this.a(ajs, axz, var10, integer7 + 2, 3, var10, integer7 + 2, 4, b, b, false);
				} else {
					this.a(ajs, axz, var10, integer7, 0, var10, integer7 + 2, 7, b, b, false);
					this.a(ajs, axz, var10, integer7 + 1, 0, var10, integer7 + 1, 7, a, a, false);
				}

				v6 = v5;
			}

			return true;
		}
	}

	public static class n extends ayi.r {
		public n() {
		}

		public n(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 1, 2, 2);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			ayi.v v5 = this.k.b[cv.NORTH.a()];
			ayi.v v6 = this.k;
			ayi.v v7 = v5.b[cv.UP.a()];
			ayi.v v8 = v6.b[cv.UP.a()];
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 0, 8, v5.c[cv.DOWN.a()]);
				this.a(ajs, axz, 0, 0, v6.c[cv.DOWN.a()]);
			}

			if (v8.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 8, 1, 6, 8, 7, a);
			}

			if (v7.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 8, 8, 6, 8, 14, a);
			}

			for (int integer9 = 1; integer9 <= 7; integer9++) {
				atl atl10 = b;
				if (integer9 == 2 || integer9 == 6) {
					atl10 = a;
				}

				this.a(ajs, axz, 0, integer9, 0, 0, integer9, 15, atl10, atl10, false);
				this.a(ajs, axz, 7, integer9, 0, 7, integer9, 15, atl10, atl10, false);
				this.a(ajs, axz, 1, integer9, 0, 6, integer9, 0, atl10, atl10, false);
				this.a(ajs, axz, 1, integer9, 15, 6, integer9, 15, atl10, atl10, false);
			}

			for (int integer9 = 1; integer9 <= 7; integer9++) {
				atl atl10 = c;
				if (integer9 == 2 || integer9 == 6) {
					atl10 = e;
				}

				this.a(ajs, axz, 3, integer9, 7, 4, integer9, 8, atl10, atl10, false);
			}

			if (v6.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 1, 0, 4, 2, 0, false);
			}

			if (v6.c[cv.EAST.a()]) {
				this.a(ajs, axz, 7, 1, 3, 7, 2, 4, false);
			}

			if (v6.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 3, 0, 2, 4, false);
			}

			if (v5.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 1, 15, 4, 2, 15, false);
			}

			if (v5.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 11, 0, 2, 12, false);
			}

			if (v5.c[cv.EAST.a()]) {
				this.a(ajs, axz, 7, 1, 11, 7, 2, 12, false);
			}

			if (v8.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 5, 0, 4, 6, 0, false);
			}

			if (v8.c[cv.EAST.a()]) {
				this.a(ajs, axz, 7, 5, 3, 7, 6, 4, false);
				this.a(ajs, axz, 5, 4, 2, 6, 4, 5, b, b, false);
				this.a(ajs, axz, 6, 1, 2, 6, 3, 2, b, b, false);
				this.a(ajs, axz, 6, 1, 5, 6, 3, 5, b, b, false);
			}

			if (v8.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 5, 3, 0, 6, 4, false);
				this.a(ajs, axz, 1, 4, 2, 2, 4, 5, b, b, false);
				this.a(ajs, axz, 1, 1, 2, 1, 3, 2, b, b, false);
				this.a(ajs, axz, 1, 1, 5, 1, 3, 5, b, b, false);
			}

			if (v7.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 5, 15, 4, 6, 15, false);
			}

			if (v7.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 5, 11, 0, 6, 12, false);
				this.a(ajs, axz, 1, 4, 10, 2, 4, 13, b, b, false);
				this.a(ajs, axz, 1, 1, 10, 1, 3, 10, b, b, false);
				this.a(ajs, axz, 1, 1, 13, 1, 3, 13, b, b, false);
			}

			if (v7.c[cv.EAST.a()]) {
				this.a(ajs, axz, 7, 5, 11, 7, 6, 12, false);
				this.a(ajs, axz, 5, 4, 10, 6, 4, 13, b, b, false);
				this.a(ajs, axz, 6, 1, 10, 6, 3, 10, b, b, false);
				this.a(ajs, axz, 6, 1, 13, 6, 3, 13, b, b, false);
			}

			return true;
		}
	}

	public static class o extends ayi.r {
		public o() {
		}

		public o(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 1, 1, 2);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			ayi.v v5 = this.k.b[cv.NORTH.a()];
			ayi.v v6 = this.k;
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 0, 8, v5.c[cv.DOWN.a()]);
				this.a(ajs, axz, 0, 0, v6.c[cv.DOWN.a()]);
			}

			if (v6.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 4, 1, 6, 4, 7, a);
			}

			if (v5.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 4, 8, 6, 4, 14, a);
			}

			this.a(ajs, axz, 0, 3, 0, 0, 3, 15, b, b, false);
			this.a(ajs, axz, 7, 3, 0, 7, 3, 15, b, b, false);
			this.a(ajs, axz, 1, 3, 0, 7, 3, 0, b, b, false);
			this.a(ajs, axz, 1, 3, 15, 6, 3, 15, b, b, false);
			this.a(ajs, axz, 0, 2, 0, 0, 2, 15, a, a, false);
			this.a(ajs, axz, 7, 2, 0, 7, 2, 15, a, a, false);
			this.a(ajs, axz, 1, 2, 0, 7, 2, 0, a, a, false);
			this.a(ajs, axz, 1, 2, 15, 6, 2, 15, a, a, false);
			this.a(ajs, axz, 0, 1, 0, 0, 1, 15, b, b, false);
			this.a(ajs, axz, 7, 1, 0, 7, 1, 15, b, b, false);
			this.a(ajs, axz, 1, 1, 0, 7, 1, 0, b, b, false);
			this.a(ajs, axz, 1, 1, 15, 6, 1, 15, b, b, false);
			this.a(ajs, axz, 1, 1, 1, 1, 1, 2, b, b, false);
			this.a(ajs, axz, 6, 1, 1, 6, 1, 2, b, b, false);
			this.a(ajs, axz, 1, 3, 1, 1, 3, 2, b, b, false);
			this.a(ajs, axz, 6, 3, 1, 6, 3, 2, b, b, false);
			this.a(ajs, axz, 1, 1, 13, 1, 1, 14, b, b, false);
			this.a(ajs, axz, 6, 1, 13, 6, 1, 14, b, b, false);
			this.a(ajs, axz, 1, 3, 13, 1, 3, 14, b, b, false);
			this.a(ajs, axz, 6, 3, 13, 6, 3, 14, b, b, false);
			this.a(ajs, axz, 2, 1, 6, 2, 3, 6, b, b, false);
			this.a(ajs, axz, 5, 1, 6, 5, 3, 6, b, b, false);
			this.a(ajs, axz, 2, 1, 9, 2, 3, 9, b, b, false);
			this.a(ajs, axz, 5, 1, 9, 5, 3, 9, b, b, false);
			this.a(ajs, axz, 3, 2, 6, 4, 2, 6, b, b, false);
			this.a(ajs, axz, 3, 2, 9, 4, 2, 9, b, b, false);
			this.a(ajs, axz, 2, 2, 7, 2, 2, 8, b, b, false);
			this.a(ajs, axz, 5, 2, 7, 5, 2, 8, b, b, false);
			this.a(ajs, e, 2, 2, 5, axz);
			this.a(ajs, e, 5, 2, 5, axz);
			this.a(ajs, e, 2, 2, 10, axz);
			this.a(ajs, e, 5, 2, 10, axz);
			this.a(ajs, b, 2, 3, 5, axz);
			this.a(ajs, b, 5, 3, 5, axz);
			this.a(ajs, b, 2, 3, 10, axz);
			this.a(ajs, b, 5, 3, 10, axz);
			if (v6.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 1, 0, 4, 2, 0, false);
			}

			if (v6.c[cv.EAST.a()]) {
				this.a(ajs, axz, 7, 1, 3, 7, 2, 4, false);
			}

			if (v6.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 3, 0, 2, 4, false);
			}

			if (v5.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 1, 15, 4, 2, 15, false);
			}

			if (v5.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 11, 0, 2, 12, false);
			}

			if (v5.c[cv.EAST.a()]) {
				this.a(ajs, axz, 7, 1, 11, 7, 2, 12, false);
			}

			return true;
		}
	}

	public static class p extends ayi.r {
		public p() {
		}

		public p(cv cv, ayi.v v) {
			super(1, cv, v, 1, 1, 1);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 0, 3, 0, 2, 3, 7, b, b, false);
			this.a(ajs, axz, 5, 3, 0, 7, 3, 7, b, b, false);
			this.a(ajs, axz, 0, 2, 0, 1, 2, 7, b, b, false);
			this.a(ajs, axz, 6, 2, 0, 7, 2, 7, b, b, false);
			this.a(ajs, axz, 0, 1, 0, 0, 1, 7, b, b, false);
			this.a(ajs, axz, 7, 1, 0, 7, 1, 7, b, b, false);
			this.a(ajs, axz, 0, 1, 7, 7, 3, 7, b, b, false);
			this.a(ajs, axz, 1, 1, 0, 2, 3, 0, b, b, false);
			this.a(ajs, axz, 5, 1, 0, 6, 3, 0, b, b, false);
			if (this.k.c[cv.NORTH.a()]) {
				this.a(ajs, axz, 3, 1, 7, 4, 2, 7, false);
			}

			if (this.k.c[cv.WEST.a()]) {
				this.a(ajs, axz, 0, 1, 3, 1, 2, 4, false);
			}

			if (this.k.c[cv.EAST.a()]) {
				this.a(ajs, axz, 6, 1, 3, 7, 2, 4, false);
			}

			return true;
		}
	}

	public static class q extends ayi.r {
		public q() {
		}

		public q(cv cv, axz axz) {
			super(cv, axz);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			this.a(ajs, axz, 2, -1, 2, 11, -1, 11, b, b, false);
			this.a(ajs, axz, 0, -1, 0, 1, -1, 11, a, a, false);
			this.a(ajs, axz, 12, -1, 0, 13, -1, 11, a, a, false);
			this.a(ajs, axz, 2, -1, 0, 11, -1, 1, a, a, false);
			this.a(ajs, axz, 2, -1, 12, 11, -1, 13, a, a, false);
			this.a(ajs, axz, 0, 0, 0, 0, 0, 13, b, b, false);
			this.a(ajs, axz, 13, 0, 0, 13, 0, 13, b, b, false);
			this.a(ajs, axz, 1, 0, 0, 12, 0, 0, b, b, false);
			this.a(ajs, axz, 1, 0, 13, 12, 0, 13, b, b, false);

			for (int integer5 = 2; integer5 <= 11; integer5 += 3) {
				this.a(ajs, e, 0, 0, integer5, axz);
				this.a(ajs, e, 13, 0, integer5, axz);
				this.a(ajs, e, integer5, 0, 0, axz);
			}

			this.a(ajs, axz, 2, 0, 3, 4, 0, 9, b, b, false);
			this.a(ajs, axz, 9, 0, 3, 11, 0, 9, b, b, false);
			this.a(ajs, axz, 4, 0, 9, 9, 0, 11, b, b, false);
			this.a(ajs, b, 5, 0, 8, axz);
			this.a(ajs, b, 8, 0, 8, axz);
			this.a(ajs, b, 10, 0, 10, axz);
			this.a(ajs, b, 3, 0, 10, axz);
			this.a(ajs, axz, 3, 0, 3, 3, 0, 7, c, c, false);
			this.a(ajs, axz, 10, 0, 3, 10, 0, 7, c, c, false);
			this.a(ajs, axz, 6, 0, 10, 7, 0, 10, c, c, false);
			int integer5 = 3;

			for (int integer6 = 0; integer6 < 2; integer6++) {
				for (int integer7 = 2; integer7 <= 8; integer7 += 3) {
					this.a(ajs, axz, integer5, 0, integer7, integer5, 2, integer7, b, b, false);
				}

				integer5 = 10;
			}

			this.a(ajs, axz, 5, 0, 10, 5, 2, 10, b, b, false);
			this.a(ajs, axz, 8, 0, 10, 8, 2, 10, b, b, false);
			this.a(ajs, axz, 6, -1, 7, 7, -1, 8, c, c, false);
			this.a(ajs, axz, 6, -1, 3, 7, -1, 4, false);
			this.a(ajs, axz, 6, 1, 6);
			return true;
		}
	}

	public abstract static class r extends ayq {
		protected static final atl a = alv.cI.a(apt.b);
		protected static final atl b = alv.cI.a(apt.c);
		protected static final atl c = alv.cI.a(apt.d);
		protected static final atl d = b;
		protected static final atl e = alv.cJ.t();
		protected static final atl f = alv.j.t();
		protected static final int g = b(2, 0, 0);
		protected static final int h = b(2, 2, 0);
		protected static final int i = b(0, 1, 0);
		protected static final int j = b(4, 1, 0);
		protected ayi.v k;

		protected static final int b(int integer1, int integer2, int integer3) {
			return integer2 * 25 + integer3 * 5 + integer1;
		}

		public r() {
			super(0);
		}

		public r(int integer) {
			super(integer);
		}

		public r(cv cv, axz axz) {
			super(1);
			this.a(cv);
			this.l = axz;
		}

		protected r(int integer1, cv cv, ayi.v v, int integer4, int integer5, int integer6) {
			super(integer1);
			this.a(cv);
			this.k = v;
			int integer8 = v.a;
			int integer9 = integer8 % 5;
			int integer10 = integer8 / 5 % 5;
			int integer11 = integer8 / 25;
			if (cv != cv.NORTH && cv != cv.SOUTH) {
				this.l = new axz(0, 0, 0, integer6 * 8 - 1, integer5 * 4 - 1, integer4 * 8 - 1);
			} else {
				this.l = new axz(0, 0, 0, integer4 * 8 - 1, integer5 * 4 - 1, integer6 * 8 - 1);
			}

			switch (cv) {
				case NORTH:
					this.l.a(integer9 * 8, integer11 * 4, -(integer10 + integer6) * 8 + 1);
					break;
				case SOUTH:
					this.l.a(integer9 * 8, integer11 * 4, integer10 * 8);
					break;
				case WEST:
					this.l.a(-(integer10 + integer6) * 8 + 1, integer11 * 4, integer9 * 8);
					break;
				default:
					this.l.a(integer10 * 8, integer11 * 4, integer9 * 8);
			}
		}

		@Override
		protected void a(du du) {
		}

		@Override
		protected void a(du du, ayz ayz) {
		}

		protected void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, boolean boolean9) {
			for (int integer11 = integer4; integer11 <= integer7; integer11++) {
				for (int integer12 = integer3; integer12 <= integer6; integer12++) {
					for (int integer13 = integer5; integer13 <= integer8; integer13++) {
						if (!boolean9 || this.a(ajs, integer12, integer11, integer13, axz).a() != azs.a) {
							if (this.d(integer11) >= ajs.K()) {
								this.a(ajs, alv.a.t(), integer12, integer11, integer13, axz);
							} else {
								this.a(ajs, f, integer12, integer11, integer13, axz);
							}
						}
					}
				}
			}
		}

		protected void a(ajs ajs, axz axz, int integer3, int integer4, boolean boolean5) {
			if (boolean5) {
				this.a(ajs, axz, integer3 + 0, 0, integer4 + 0, integer3 + 2, 0, integer4 + 8 - 1, a, a, false);
				this.a(ajs, axz, integer3 + 5, 0, integer4 + 0, integer3 + 8 - 1, 0, integer4 + 8 - 1, a, a, false);
				this.a(ajs, axz, integer3 + 3, 0, integer4 + 0, integer3 + 4, 0, integer4 + 2, a, a, false);
				this.a(ajs, axz, integer3 + 3, 0, integer4 + 5, integer3 + 4, 0, integer4 + 8 - 1, a, a, false);
				this.a(ajs, axz, integer3 + 3, 0, integer4 + 2, integer3 + 4, 0, integer4 + 2, b, b, false);
				this.a(ajs, axz, integer3 + 3, 0, integer4 + 5, integer3 + 4, 0, integer4 + 5, b, b, false);
				this.a(ajs, axz, integer3 + 2, 0, integer4 + 3, integer3 + 2, 0, integer4 + 4, b, b, false);
				this.a(ajs, axz, integer3 + 5, 0, integer4 + 3, integer3 + 5, 0, integer4 + 4, b, b, false);
			} else {
				this.a(ajs, axz, integer3 + 0, 0, integer4 + 0, integer3 + 8 - 1, 0, integer4 + 8 - 1, a, a, false);
			}
		}

		protected void a(ajs ajs, axz axz, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, atl atl) {
			for (int integer11 = integer4; integer11 <= integer7; integer11++) {
				for (int integer12 = integer3; integer12 <= integer6; integer12++) {
					for (int integer13 = integer5; integer13 <= integer8; integer13++) {
						if (this.a(ajs, integer12, integer11, integer13, axz) == f) {
							this.a(ajs, atl, integer12, integer11, integer13, axz);
						}
					}
				}
			}
		}

		protected boolean a(axz axz, int integer2, int integer3, int integer4, int integer5) {
			int integer7 = this.a(integer2, integer3);
			int integer8 = this.b(integer2, integer3);
			int integer9 = this.a(integer4, integer5);
			int integer10 = this.b(integer4, integer5);
			return axz.a(Math.min(integer7, integer9), Math.min(integer8, integer10), Math.max(integer7, integer9), Math.max(integer8, integer10));
		}

		protected boolean a(ajs ajs, axz axz, int integer3, int integer4, int integer5) {
			int integer7 = this.a(integer3, integer5);
			int integer8 = this.d(integer4);
			int integer9 = this.b(integer3, integer5);
			if (axz.b(new co(integer7, integer8, integer9))) {
				zq zq10 = new zq(ajs);
				zq10.b(zq10.cb());
				zq10.b((double)integer7 + 0.5, (double)integer8, (double)integer9 + 0.5, 0.0F, 0.0F);
				zq10.a(ajs.D(new co(zq10)), null);
				ajs.a(zq10);
				return true;
			} else {
				return false;
			}
		}
	}

	public static class s extends ayi.r {
		private int n;

		public s() {
		}

		public s(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 1, 1, 1);
			this.n = random.nextInt(3);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 0, 0, this.k.c[cv.DOWN.a()]);
			}

			if (this.k.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 4, 1, 6, 4, 6, a);
			}

			boolean boolean5 = this.n != 0 && random.nextBoolean() && !this.k.c[cv.DOWN.a()] && !this.k.c[cv.UP.a()] && this.k.c() > 1;
			if (this.n == 0) {
				this.a(ajs, axz, 0, 1, 0, 2, 1, 2, b, b, false);
				this.a(ajs, axz, 0, 3, 0, 2, 3, 2, b, b, false);
				this.a(ajs, axz, 0, 2, 0, 0, 2, 2, a, a, false);
				this.a(ajs, axz, 1, 2, 0, 2, 2, 0, a, a, false);
				this.a(ajs, e, 1, 2, 1, axz);
				this.a(ajs, axz, 5, 1, 0, 7, 1, 2, b, b, false);
				this.a(ajs, axz, 5, 3, 0, 7, 3, 2, b, b, false);
				this.a(ajs, axz, 7, 2, 0, 7, 2, 2, a, a, false);
				this.a(ajs, axz, 5, 2, 0, 6, 2, 0, a, a, false);
				this.a(ajs, e, 6, 2, 1, axz);
				this.a(ajs, axz, 0, 1, 5, 2, 1, 7, b, b, false);
				this.a(ajs, axz, 0, 3, 5, 2, 3, 7, b, b, false);
				this.a(ajs, axz, 0, 2, 5, 0, 2, 7, a, a, false);
				this.a(ajs, axz, 1, 2, 7, 2, 2, 7, a, a, false);
				this.a(ajs, e, 1, 2, 6, axz);
				this.a(ajs, axz, 5, 1, 5, 7, 1, 7, b, b, false);
				this.a(ajs, axz, 5, 3, 5, 7, 3, 7, b, b, false);
				this.a(ajs, axz, 7, 2, 5, 7, 2, 7, a, a, false);
				this.a(ajs, axz, 5, 2, 7, 6, 2, 7, a, a, false);
				this.a(ajs, e, 6, 2, 6, axz);
				if (this.k.c[cv.SOUTH.a()]) {
					this.a(ajs, axz, 3, 3, 0, 4, 3, 0, b, b, false);
				} else {
					this.a(ajs, axz, 3, 3, 0, 4, 3, 1, b, b, false);
					this.a(ajs, axz, 3, 2, 0, 4, 2, 0, a, a, false);
					this.a(ajs, axz, 3, 1, 0, 4, 1, 1, b, b, false);
				}

				if (this.k.c[cv.NORTH.a()]) {
					this.a(ajs, axz, 3, 3, 7, 4, 3, 7, b, b, false);
				} else {
					this.a(ajs, axz, 3, 3, 6, 4, 3, 7, b, b, false);
					this.a(ajs, axz, 3, 2, 7, 4, 2, 7, a, a, false);
					this.a(ajs, axz, 3, 1, 6, 4, 1, 7, b, b, false);
				}

				if (this.k.c[cv.WEST.a()]) {
					this.a(ajs, axz, 0, 3, 3, 0, 3, 4, b, b, false);
				} else {
					this.a(ajs, axz, 0, 3, 3, 1, 3, 4, b, b, false);
					this.a(ajs, axz, 0, 2, 3, 0, 2, 4, a, a, false);
					this.a(ajs, axz, 0, 1, 3, 1, 1, 4, b, b, false);
				}

				if (this.k.c[cv.EAST.a()]) {
					this.a(ajs, axz, 7, 3, 3, 7, 3, 4, b, b, false);
				} else {
					this.a(ajs, axz, 6, 3, 3, 7, 3, 4, b, b, false);
					this.a(ajs, axz, 7, 2, 3, 7, 2, 4, a, a, false);
					this.a(ajs, axz, 6, 1, 3, 7, 1, 4, b, b, false);
				}
			} else if (this.n == 1) {
				this.a(ajs, axz, 2, 1, 2, 2, 3, 2, b, b, false);
				this.a(ajs, axz, 2, 1, 5, 2, 3, 5, b, b, false);
				this.a(ajs, axz, 5, 1, 5, 5, 3, 5, b, b, false);
				this.a(ajs, axz, 5, 1, 2, 5, 3, 2, b, b, false);
				this.a(ajs, e, 2, 2, 2, axz);
				this.a(ajs, e, 2, 2, 5, axz);
				this.a(ajs, e, 5, 2, 5, axz);
				this.a(ajs, e, 5, 2, 2, axz);
				this.a(ajs, axz, 0, 1, 0, 1, 3, 0, b, b, false);
				this.a(ajs, axz, 0, 1, 1, 0, 3, 1, b, b, false);
				this.a(ajs, axz, 0, 1, 7, 1, 3, 7, b, b, false);
				this.a(ajs, axz, 0, 1, 6, 0, 3, 6, b, b, false);
				this.a(ajs, axz, 6, 1, 7, 7, 3, 7, b, b, false);
				this.a(ajs, axz, 7, 1, 6, 7, 3, 6, b, b, false);
				this.a(ajs, axz, 6, 1, 0, 7, 3, 0, b, b, false);
				this.a(ajs, axz, 7, 1, 1, 7, 3, 1, b, b, false);
				this.a(ajs, a, 1, 2, 0, axz);
				this.a(ajs, a, 0, 2, 1, axz);
				this.a(ajs, a, 1, 2, 7, axz);
				this.a(ajs, a, 0, 2, 6, axz);
				this.a(ajs, a, 6, 2, 7, axz);
				this.a(ajs, a, 7, 2, 6, axz);
				this.a(ajs, a, 6, 2, 0, axz);
				this.a(ajs, a, 7, 2, 1, axz);
				if (!this.k.c[cv.SOUTH.a()]) {
					this.a(ajs, axz, 1, 3, 0, 6, 3, 0, b, b, false);
					this.a(ajs, axz, 1, 2, 0, 6, 2, 0, a, a, false);
					this.a(ajs, axz, 1, 1, 0, 6, 1, 0, b, b, false);
				}

				if (!this.k.c[cv.NORTH.a()]) {
					this.a(ajs, axz, 1, 3, 7, 6, 3, 7, b, b, false);
					this.a(ajs, axz, 1, 2, 7, 6, 2, 7, a, a, false);
					this.a(ajs, axz, 1, 1, 7, 6, 1, 7, b, b, false);
				}

				if (!this.k.c[cv.WEST.a()]) {
					this.a(ajs, axz, 0, 3, 1, 0, 3, 6, b, b, false);
					this.a(ajs, axz, 0, 2, 1, 0, 2, 6, a, a, false);
					this.a(ajs, axz, 0, 1, 1, 0, 1, 6, b, b, false);
				}

				if (!this.k.c[cv.EAST.a()]) {
					this.a(ajs, axz, 7, 3, 1, 7, 3, 6, b, b, false);
					this.a(ajs, axz, 7, 2, 1, 7, 2, 6, a, a, false);
					this.a(ajs, axz, 7, 1, 1, 7, 1, 6, b, b, false);
				}
			} else if (this.n == 2) {
				this.a(ajs, axz, 0, 1, 0, 0, 1, 7, b, b, false);
				this.a(ajs, axz, 7, 1, 0, 7, 1, 7, b, b, false);
				this.a(ajs, axz, 1, 1, 0, 6, 1, 0, b, b, false);
				this.a(ajs, axz, 1, 1, 7, 6, 1, 7, b, b, false);
				this.a(ajs, axz, 0, 2, 0, 0, 2, 7, c, c, false);
				this.a(ajs, axz, 7, 2, 0, 7, 2, 7, c, c, false);
				this.a(ajs, axz, 1, 2, 0, 6, 2, 0, c, c, false);
				this.a(ajs, axz, 1, 2, 7, 6, 2, 7, c, c, false);
				this.a(ajs, axz, 0, 3, 0, 0, 3, 7, b, b, false);
				this.a(ajs, axz, 7, 3, 0, 7, 3, 7, b, b, false);
				this.a(ajs, axz, 1, 3, 0, 6, 3, 0, b, b, false);
				this.a(ajs, axz, 1, 3, 7, 6, 3, 7, b, b, false);
				this.a(ajs, axz, 0, 1, 3, 0, 2, 4, c, c, false);
				this.a(ajs, axz, 7, 1, 3, 7, 2, 4, c, c, false);
				this.a(ajs, axz, 3, 1, 0, 4, 2, 0, c, c, false);
				this.a(ajs, axz, 3, 1, 7, 4, 2, 7, c, c, false);
				if (this.k.c[cv.SOUTH.a()]) {
					this.a(ajs, axz, 3, 1, 0, 4, 2, 0, false);
				}

				if (this.k.c[cv.NORTH.a()]) {
					this.a(ajs, axz, 3, 1, 7, 4, 2, 7, false);
				}

				if (this.k.c[cv.WEST.a()]) {
					this.a(ajs, axz, 0, 1, 3, 0, 2, 4, false);
				}

				if (this.k.c[cv.EAST.a()]) {
					this.a(ajs, axz, 7, 1, 3, 7, 2, 4, false);
				}
			}

			if (boolean5) {
				this.a(ajs, axz, 3, 1, 3, 4, 1, 4, b, b, false);
				this.a(ajs, axz, 3, 2, 3, 4, 2, 4, a, a, false);
				this.a(ajs, axz, 3, 3, 3, 4, 3, 4, b, b, false);
			}

			return true;
		}
	}

	public static class t extends ayi.r {
		public t() {
		}

		public t(cv cv, ayi.v v, Random random) {
			super(1, cv, v, 1, 1, 1);
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.k.a / 25 > 0) {
				this.a(ajs, axz, 0, 0, this.k.c[cv.DOWN.a()]);
			}

			if (this.k.b[cv.UP.a()] == null) {
				this.a(ajs, axz, 1, 4, 1, 6, 4, 6, a);
			}

			for (int integer5 = 1; integer5 <= 6; integer5++) {
				for (int integer6 = 1; integer6 <= 6; integer6++) {
					if (random.nextInt(3) != 0) {
						int integer7 = 2 + (random.nextInt(4) == 0 ? 0 : 1);
						this.a(ajs, axz, integer5, integer7, integer6, integer5, 3, integer6, alv.v.a(1), alv.v.a(1), false);
					}
				}
			}

			this.a(ajs, axz, 0, 1, 0, 0, 1, 7, b, b, false);
			this.a(ajs, axz, 7, 1, 0, 7, 1, 7, b, b, false);
			this.a(ajs, axz, 1, 1, 0, 6, 1, 0, b, b, false);
			this.a(ajs, axz, 1, 1, 7, 6, 1, 7, b, b, false);
			this.a(ajs, axz, 0, 2, 0, 0, 2, 7, c, c, false);
			this.a(ajs, axz, 7, 2, 0, 7, 2, 7, c, c, false);
			this.a(ajs, axz, 1, 2, 0, 6, 2, 0, c, c, false);
			this.a(ajs, axz, 1, 2, 7, 6, 2, 7, c, c, false);
			this.a(ajs, axz, 0, 3, 0, 0, 3, 7, b, b, false);
			this.a(ajs, axz, 7, 3, 0, 7, 3, 7, b, b, false);
			this.a(ajs, axz, 1, 3, 0, 6, 3, 0, b, b, false);
			this.a(ajs, axz, 1, 3, 7, 6, 3, 7, b, b, false);
			this.a(ajs, axz, 0, 1, 3, 0, 2, 4, c, c, false);
			this.a(ajs, axz, 7, 1, 3, 7, 2, 4, c, c, false);
			this.a(ajs, axz, 3, 1, 0, 4, 2, 0, c, c, false);
			this.a(ajs, axz, 3, 1, 7, 4, 2, 7, c, c, false);
			if (this.k.c[cv.SOUTH.a()]) {
				this.a(ajs, axz, 3, 1, 0, 4, 2, 0, false);
			}

			return true;
		}
	}

	public static class u extends ayi.r {
		private int n;

		public u() {
		}

		public u(cv cv, axz axz, int integer) {
			super(cv, axz);
			this.n = integer & 1;
		}

		@Override
		public boolean a(ajs ajs, Random random, axz axz) {
			if (this.n == 0) {
				for (int integer5 = 0; integer5 < 4; integer5++) {
					this.a(ajs, axz, 10 - integer5, 3 - integer5, 20 - integer5, 12 + integer5, 3 - integer5, 20, b, b, false);
				}

				this.a(ajs, axz, 7, 0, 6, 15, 0, 16, b, b, false);
				this.a(ajs, axz, 6, 0, 6, 6, 3, 20, b, b, false);
				this.a(ajs, axz, 16, 0, 6, 16, 3, 20, b, b, false);
				this.a(ajs, axz, 7, 1, 7, 7, 1, 20, b, b, false);
				this.a(ajs, axz, 15, 1, 7, 15, 1, 20, b, b, false);
				this.a(ajs, axz, 7, 1, 6, 9, 3, 6, b, b, false);
				this.a(ajs, axz, 13, 1, 6, 15, 3, 6, b, b, false);
				this.a(ajs, axz, 8, 1, 7, 9, 1, 7, b, b, false);
				this.a(ajs, axz, 13, 1, 7, 14, 1, 7, b, b, false);
				this.a(ajs, axz, 9, 0, 5, 13, 0, 5, b, b, false);
				this.a(ajs, axz, 10, 0, 7, 12, 0, 7, c, c, false);
				this.a(ajs, axz, 8, 0, 10, 8, 0, 12, c, c, false);
				this.a(ajs, axz, 14, 0, 10, 14, 0, 12, c, c, false);

				for (int integer5 = 18; integer5 >= 7; integer5 -= 3) {
					this.a(ajs, e, 6, 3, integer5, axz);
					this.a(ajs, e, 16, 3, integer5, axz);
				}

				this.a(ajs, e, 10, 0, 10, axz);
				this.a(ajs, e, 12, 0, 10, axz);
				this.a(ajs, e, 10, 0, 12, axz);
				this.a(ajs, e, 12, 0, 12, axz);
				this.a(ajs, e, 8, 3, 6, axz);
				this.a(ajs, e, 14, 3, 6, axz);
				this.a(ajs, b, 4, 2, 4, axz);
				this.a(ajs, e, 4, 1, 4, axz);
				this.a(ajs, b, 4, 0, 4, axz);
				this.a(ajs, b, 18, 2, 4, axz);
				this.a(ajs, e, 18, 1, 4, axz);
				this.a(ajs, b, 18, 0, 4, axz);
				this.a(ajs, b, 4, 2, 18, axz);
				this.a(ajs, e, 4, 1, 18, axz);
				this.a(ajs, b, 4, 0, 18, axz);
				this.a(ajs, b, 18, 2, 18, axz);
				this.a(ajs, e, 18, 1, 18, axz);
				this.a(ajs, b, 18, 0, 18, axz);
				this.a(ajs, b, 9, 7, 20, axz);
				this.a(ajs, b, 13, 7, 20, axz);
				this.a(ajs, axz, 6, 0, 21, 7, 4, 21, b, b, false);
				this.a(ajs, axz, 15, 0, 21, 16, 4, 21, b, b, false);
				this.a(ajs, axz, 11, 2, 16);
			} else if (this.n == 1) {
				this.a(ajs, axz, 9, 3, 18, 13, 3, 20, b, b, false);
				this.a(ajs, axz, 9, 0, 18, 9, 2, 18, b, b, false);
				this.a(ajs, axz, 13, 0, 18, 13, 2, 18, b, b, false);
				int integer5 = 9;
				int integer6 = 20;
				int integer7 = 5;

				for (int integer8 = 0; integer8 < 2; integer8++) {
					this.a(ajs, b, integer5, 6, 20, axz);
					this.a(ajs, e, integer5, 5, 20, axz);
					this.a(ajs, b, integer5, 4, 20, axz);
					integer5 = 13;
				}

				this.a(ajs, axz, 7, 3, 7, 15, 3, 14, b, b, false);
				int var10 = 10;

				for (int integer8 = 0; integer8 < 2; integer8++) {
					this.a(ajs, axz, var10, 0, 10, var10, 6, 10, b, b, false);
					this.a(ajs, axz, var10, 0, 12, var10, 6, 12, b, b, false);
					this.a(ajs, e, var10, 0, 10, axz);
					this.a(ajs, e, var10, 0, 12, axz);
					this.a(ajs, e, var10, 4, 10, axz);
					this.a(ajs, e, var10, 4, 12, axz);
					var10 = 12;
				}

				var10 = 8;

				for (int integer8 = 0; integer8 < 2; integer8++) {
					this.a(ajs, axz, var10, 0, 7, var10, 2, 7, b, b, false);
					this.a(ajs, axz, var10, 0, 14, var10, 2, 14, b, b, false);
					var10 = 14;
				}

				this.a(ajs, axz, 8, 3, 8, 8, 3, 13, c, c, false);
				this.a(ajs, axz, 14, 3, 8, 14, 3, 13, c, c, false);
				this.a(ajs, axz, 11, 5, 13);
			}

			return true;
		}
	}

	static class v {
		int a;
		ayi.v[] b = new ayi.v[6];
		boolean[] c = new boolean[6];
		boolean d;
		boolean e;
		int f;

		public v(int integer) {
			this.a = integer;
		}

		public void a(cv cv, ayi.v v) {
			this.b[cv.a()] = v;
			v.b[cv.d().a()] = this;
		}

		public void a() {
			for (int integer2 = 0; integer2 < 6; integer2++) {
				this.c[integer2] = this.b[integer2] != null;
			}
		}

		public boolean a(int integer) {
			if (this.e) {
				return true;
			} else {
				this.f = integer;

				for (int integer3 = 0; integer3 < 6; integer3++) {
					if (this.b[integer3] != null && this.c[integer3] && this.b[integer3].f != integer && this.b[integer3].a(integer)) {
						return true;
					}
				}

				return false;
			}
		}

		public boolean b() {
			return this.a >= 75;
		}

		public int c() {
			int integer2 = 0;

			for (int integer3 = 0; integer3 < 6; integer3++) {
				if (this.c[integer3]) {
					integer2++;
				}
			}

			return integer2;
		}
	}
}
