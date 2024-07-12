import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

public class bia extends bho implements bib {
	protected bho a;
	protected String f = "Select world";
	private bia.b g;
	private bia.c h;
	private bia.a i;
	private bia.d r;
	private final ob s;
	private bgd t;
	private boolean u = true;

	public bia(bho bho, ob ob) {
		this.a = bho;
		this.s = ob;
	}

	@Override
	public void b() {
		this.f = cah.a("gui.stats");
		this.u = true;
		this.j.v().a(new iq(iq.a.REQUEST_STATS));
	}

	@Override
	public void k() {
		super.k();
		if (this.t != null) {
			this.t.p();
		}
	}

	public void f() {
		this.g = new bia.b(this.j);
		this.g.d(1, 1);
		this.h = new bia.c(this.j);
		this.h.d(1, 1);
		this.i = new bia.a(this.j);
		this.i.d(1, 1);
		this.r = new bia.d(this.j);
		this.r.d(1, 1);
	}

	public void g() {
		this.n.add(new bfm(0, this.l / 2 + 4, this.m - 28, 150, 20, cah.a("gui.done")));
		this.n.add(new bfm(1, this.l / 2 - 160, this.m - 52, 80, 20, cah.a("stat.generalButton")));
		bfm bfm2 = this.b(new bfm(2, this.l / 2 - 80, this.m - 52, 80, 20, cah.a("stat.blocksButton")));
		bfm bfm3 = this.b(new bfm(3, this.l / 2, this.m - 52, 80, 20, cah.a("stat.itemsButton")));
		bfm bfm4 = this.b(new bfm(4, this.l / 2 + 80, this.m - 52, 80, 20, cah.a("stat.mobsButton")));
		if (this.i.b() == 0) {
			bfm2.l = false;
		}

		if (this.h.b() == 0) {
			bfm3.l = false;
		}

		if (this.r.b() == 0) {
			bfm4.l = false;
		}
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.l) {
			if (bfm.k == 0) {
				this.j.a(this.a);
			} else if (bfm.k == 1) {
				this.t = this.g;
			} else if (bfm.k == 3) {
				this.t = this.h;
			} else if (bfm.k == 2) {
				this.t = this.i;
			} else if (bfm.k == 4) {
				this.t = this.r;
			} else {
				this.t.a(bfm);
			}
		}
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		if (this.u) {
			this.c();
			this.a(this.q, cah.a("multiplayer.downloadingStats"), this.l / 2, this.m / 2, 16777215);
			this.a(this.q, c_[(int)(bes.I() / 150L % (long)c_.length)], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
		} else {
			this.t.a(integer1, integer2, float3);
			this.a(this.q, this.f, this.l / 2, 20, 16777215);
			super.a(integer1, integer2, float3);
		}
	}

	@Override
	public void a() {
		if (this.u) {
			this.f();
			this.g();
			this.t = this.g;
			this.u = false;
		}
	}

	@Override
	public boolean d() {
		return !this.u;
	}

	private void a(int integer1, int integer2, afh afh) {
		this.b(integer1 + 1, integer2 + 1);
		bqg.D();
		beq.c();
		this.k.a(afh.i(), integer1 + 2, integer2 + 2);
		beq.a();
		bqg.E();
	}

	private void b(int integer1, int integer2) {
		this.c(integer1, integer2, 0, 0);
	}

	private void c(int integer1, int integer2, int integer3, int integer4) {
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.j.N().a(c);
		float float6 = 0.0078125F;
		float float7 = 0.0078125F;
		int integer8 = 18;
		int integer9 = 18;
		bqs bqs10 = bqs.a();
		bpy bpy11 = bqs10.c();
		bpy11.a(7, bzh.g);
		bpy11.b((double)(integer1 + 0), (double)(integer2 + 18), (double)this.e)
			.a((double)((float)(integer3 + 0) * 0.0078125F), (double)((float)(integer4 + 18) * 0.0078125F))
			.d();
		bpy11.b((double)(integer1 + 18), (double)(integer2 + 18), (double)this.e)
			.a((double)((float)(integer3 + 18) * 0.0078125F), (double)((float)(integer4 + 18) * 0.0078125F))
			.d();
		bpy11.b((double)(integer1 + 18), (double)(integer2 + 0), (double)this.e)
			.a((double)((float)(integer3 + 18) * 0.0078125F), (double)((float)(integer4 + 0) * 0.0078125F))
			.d();
		bpy11.b((double)(integer1 + 0), (double)(integer2 + 0), (double)this.e)
			.a((double)((float)(integer3 + 0) * 0.0078125F), (double)((float)(integer4 + 0) * 0.0078125F))
			.d();
		bqs10.b();
	}

	class a extends bia.e {
		public a(bes bes) {
			super(bes);
			this.w = Lists.newArrayList();

			for (nu nu5 : oa.e) {
				boolean boolean6 = false;
				afh afh7 = nu5.a();
				if (bia.this.s.a(nu5) > 0) {
					boolean6 = true;
				} else if (oa.b(afh7) != null && bia.this.s.a(oa.b(afh7)) > 0) {
					boolean6 = true;
				} else if (oa.a(afh7) != null && bia.this.s.a(oa.a(afh7)) > 0) {
					boolean6 = true;
				} else if (oa.d(afh7) != null && bia.this.s.a(oa.d(afh7)) > 0) {
					boolean6 = true;
				} else if (oa.e(afh7) != null && bia.this.s.a(oa.e(afh7)) > 0) {
					boolean6 = true;
				}

				if (boolean6) {
					this.w.add(nu5);
				}
			}

			this.x = new Comparator<nu>() {
				public int compare(nu nu1, nu nu2) {
					afh afh4 = nu1.a();
					afh afh5 = nu2.a();
					nw nw6 = null;
					nw nw7 = null;
					if (a.this.y == 2) {
						nw6 = oa.a(alu.a(afh4));
						nw7 = oa.a(alu.a(afh5));
					} else if (a.this.y == 0) {
						nw6 = oa.a(afh4);
						nw7 = oa.a(afh5);
					} else if (a.this.y == 1) {
						nw6 = oa.b(afh4);
						nw7 = oa.b(afh5);
					} else if (a.this.y == 3) {
						nw6 = oa.d(afh4);
						nw7 = oa.d(afh5);
					} else if (a.this.y == 4) {
						nw6 = oa.e(afh4);
						nw7 = oa.e(afh5);
					}

					if (nw6 != null || nw7 != null) {
						if (nw6 == null) {
							return 1;
						}

						if (nw7 == null) {
							return -1;
						}

						int integer8 = bia.this.s.a(nw6);
						int integer9 = bia.this.s.a(nw7);
						if (integer8 != integer9) {
							return (integer8 - integer9) * a.this.z;
						}
					}

					return afh.a(afh4) - afh.a(afh5);
				}
			};
		}

		@Override
		protected void a(int integer1, int integer2, bqs bqs) {
			super.a(integer1, integer2, bqs);
			if (this.v == 0) {
				bia.this.c(integer1 + 115 - 18 + 1, integer2 + 1 + 1, 18, 18);
			} else {
				bia.this.c(integer1 + 115 - 18, integer2 + 1, 18, 18);
			}

			if (this.v == 1) {
				bia.this.c(integer1 + 165 - 18 + 1, integer2 + 1 + 1, 36, 18);
			} else {
				bia.this.c(integer1 + 165 - 18, integer2 + 1, 36, 18);
			}

			if (this.v == 2) {
				bia.this.c(integer1 + 215 - 18 + 1, integer2 + 1 + 1, 54, 18);
			} else {
				bia.this.c(integer1 + 215 - 18, integer2 + 1, 54, 18);
			}

			if (this.v == 3) {
				bia.this.c(integer1 + 265 - 18 + 1, integer2 + 1 + 1, 90, 18);
			} else {
				bia.this.c(integer1 + 265 - 18, integer2 + 1, 90, 18);
			}

			if (this.v == 4) {
				bia.this.c(integer1 + 315 - 18 + 1, integer2 + 1 + 1, 108, 18);
			} else {
				bia.this.c(integer1 + 315 - 18, integer2 + 1, 108, 18);
			}
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			nu nu8 = this.c(integer1);
			afh afh9 = nu8.a();
			bia.this.a(integer2 + 40, integer3, afh9);
			this.a(oa.a(afh9), integer2 + 115, integer3, integer1 % 2 == 0);
			this.a(oa.b(afh9), integer2 + 165, integer3, integer1 % 2 == 0);
			this.a(nu8, integer2 + 215, integer3, integer1 % 2 == 0);
			this.a(oa.d(afh9), integer2 + 265, integer3, integer1 % 2 == 0);
			this.a(oa.e(afh9), integer2 + 315, integer3, integer1 % 2 == 0);
		}

		@Override
		protected String b(int integer) {
			if (integer == 0) {
				return "stat.crafted";
			} else if (integer == 1) {
				return "stat.used";
			} else if (integer == 3) {
				return "stat.pickup";
			} else {
				return integer == 4 ? "stat.dropped" : "stat.mined";
			}
		}
	}

	class b extends bgd {
		public b(bes bes) {
			super(bes, bia.this.l, bia.this.m, 32, bia.this.m - 64, 10);
			this.b(false);
		}

		@Override
		protected int b() {
			return oa.c.size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
		}

		@Override
		protected boolean a(int integer) {
			return false;
		}

		@Override
		protected int k() {
			return this.b() * 10;
		}

		@Override
		protected void a() {
			bia.this.c();
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			nw nw8 = (nw)oa.c.get(integer1);
			bia.this.c(bia.this.q, nw8.e().c(), integer2 + 2, integer3 + 1, integer1 % 2 == 0 ? 16777215 : 9474192);
			String string9 = nw8.a(bia.this.s.a(nw8));
			bia.this.c(bia.this.q, string9, integer2 + 2 + 213 - bia.this.q.a(string9), integer3 + 1, integer1 % 2 == 0 ? 16777215 : 9474192);
		}
	}

	class c extends bia.e {
		public c(bes bes) {
			super(bes);
			this.w = Lists.newArrayList();

			for (nu nu5 : oa.d) {
				boolean boolean6 = false;
				afh afh7 = nu5.a();
				if (bia.this.s.a(nu5) > 0) {
					boolean6 = true;
				} else if (oa.c(afh7) != null && bia.this.s.a(oa.c(afh7)) > 0) {
					boolean6 = true;
				} else if (oa.a(afh7) != null && bia.this.s.a(oa.a(afh7)) > 0) {
					boolean6 = true;
				} else if (oa.d(afh7) != null && bia.this.s.a(oa.d(afh7)) > 0) {
					boolean6 = true;
				} else if (oa.e(afh7) != null && bia.this.s.a(oa.e(afh7)) > 0) {
					boolean6 = true;
				}

				if (boolean6) {
					this.w.add(nu5);
				}
			}

			this.x = new Comparator<nu>() {
				public int compare(nu nu1, nu nu2) {
					afh afh4 = nu1.a();
					afh afh5 = nu2.a();
					int integer6 = afh.a(afh4);
					int integer7 = afh.a(afh5);
					nw nw8 = null;
					nw nw9 = null;
					if (c.this.y == 0) {
						nw8 = oa.c(afh4);
						nw9 = oa.c(afh5);
					} else if (c.this.y == 1) {
						nw8 = oa.a(afh4);
						nw9 = oa.a(afh5);
					} else if (c.this.y == 2) {
						nw8 = oa.b(afh4);
						nw9 = oa.b(afh5);
					} else if (c.this.y == 3) {
						nw8 = oa.d(afh4);
						nw9 = oa.d(afh5);
					} else if (c.this.y == 4) {
						nw8 = oa.e(afh4);
						nw9 = oa.e(afh5);
					}

					if (nw8 != null || nw9 != null) {
						if (nw8 == null) {
							return 1;
						}

						if (nw9 == null) {
							return -1;
						}

						int integer10 = bia.this.s.a(nw8);
						int integer11 = bia.this.s.a(nw9);
						if (integer10 != integer11) {
							return (integer10 - integer11) * c.this.z;
						}
					}

					return integer6 - integer7;
				}
			};
		}

		@Override
		protected void a(int integer1, int integer2, bqs bqs) {
			super.a(integer1, integer2, bqs);
			if (this.v == 0) {
				bia.this.c(integer1 + 115 - 18 + 1, integer2 + 1 + 1, 72, 18);
			} else {
				bia.this.c(integer1 + 115 - 18, integer2 + 1, 72, 18);
			}

			if (this.v == 1) {
				bia.this.c(integer1 + 165 - 18 + 1, integer2 + 1 + 1, 18, 18);
			} else {
				bia.this.c(integer1 + 165 - 18, integer2 + 1, 18, 18);
			}

			if (this.v == 2) {
				bia.this.c(integer1 + 215 - 18 + 1, integer2 + 1 + 1, 36, 18);
			} else {
				bia.this.c(integer1 + 215 - 18, integer2 + 1, 36, 18);
			}

			if (this.v == 3) {
				bia.this.c(integer1 + 265 - 18 + 1, integer2 + 1 + 1, 90, 18);
			} else {
				bia.this.c(integer1 + 265 - 18, integer2 + 1, 90, 18);
			}

			if (this.v == 4) {
				bia.this.c(integer1 + 315 - 18 + 1, integer2 + 1 + 1, 108, 18);
			} else {
				bia.this.c(integer1 + 315 - 18, integer2 + 1, 108, 18);
			}
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			nu nu8 = this.c(integer1);
			afh afh9 = nu8.a();
			bia.this.a(integer2 + 40, integer3, afh9);
			this.a(oa.c(afh9), integer2 + 115, integer3, integer1 % 2 == 0);
			this.a(oa.a(afh9), integer2 + 165, integer3, integer1 % 2 == 0);
			this.a(nu8, integer2 + 215, integer3, integer1 % 2 == 0);
			this.a(oa.d(afh9), integer2 + 265, integer3, integer1 % 2 == 0);
			this.a(oa.e(afh9), integer2 + 315, integer3, integer1 % 2 == 0);
		}

		@Override
		protected String b(int integer) {
			if (integer == 1) {
				return "stat.crafted";
			} else if (integer == 2) {
				return "stat.used";
			} else if (integer == 3) {
				return "stat.pickup";
			} else {
				return integer == 4 ? "stat.dropped" : "stat.depleted";
			}
		}
	}

	class d extends bgd {
		private final List<sp.a> v = Lists.newArrayList();

		public d(bes bes) {
			super(bes, bia.this.l, bia.this.m, 32, bia.this.m - 64, bia.this.q.a * 4);
			this.b(false);

			for (sp.a a5 : sp.c.values()) {
				if (bia.this.s.a(a5.d) > 0 || bia.this.s.a(a5.e) > 0) {
					this.v.add(a5);
				}
			}
		}

		@Override
		protected int b() {
			return this.v.size();
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
		}

		@Override
		protected boolean a(int integer) {
			return false;
		}

		@Override
		protected int k() {
			return this.b() * bia.this.q.a * 4;
		}

		@Override
		protected void a() {
			bia.this.c();
		}

		@Override
		protected void a(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6) {
			sp.a a8 = (sp.a)this.v.get(integer1);
			String string9 = cah.a("entity." + sp.a(a8.a) + ".name");
			int integer10 = bia.this.s.a(a8.d);
			int integer11 = bia.this.s.a(a8.e);
			String string12 = cah.a("stat.entityKills", integer10, string9);
			String string13 = cah.a("stat.entityKilledBy", string9, integer11);
			if (integer10 == 0) {
				string12 = cah.a("stat.entityKills.none", string9);
			}

			if (integer11 == 0) {
				string13 = cah.a("stat.entityKilledBy.none", string9);
			}

			bia.this.c(bia.this.q, string9, integer2 + 2 - 10, integer3 + 1, 16777215);
			bia.this.c(bia.this.q, string12, integer2 + 2, integer3 + 1 + bia.this.q.a, integer10 == 0 ? 6316128 : 9474192);
			bia.this.c(bia.this.q, string13, integer2 + 2, integer3 + 1 + bia.this.q.a * 2, integer11 == 0 ? 6316128 : 9474192);
		}
	}

	abstract class e extends bgd {
		protected int v = -1;
		protected List<nu> w;
		protected Comparator<nu> x;
		protected int y = -1;
		protected int z;

		protected e(bes bes) {
			super(bes, bia.this.l, bia.this.m, 32, bia.this.m - 64, 20);
			this.b(false);
			this.a(true, 20);
		}

		@Override
		protected void a(int integer1, boolean boolean2, int integer3, int integer4) {
		}

		@Override
		protected boolean a(int integer) {
			return false;
		}

		@Override
		public int c() {
			return 375;
		}

		@Override
		protected int d() {
			return this.b / 2 + 140;
		}

		@Override
		protected void a() {
			bia.this.c();
		}

		@Override
		protected void a(int integer1, int integer2, bqs bqs) {
			if (!Mouse.isButtonDown(0)) {
				this.v = -1;
			}

			if (this.v == 0) {
				bia.this.c(integer1 + 115 - 18, integer2 + 1, 0, 0);
			} else {
				bia.this.c(integer1 + 115 - 18, integer2 + 1, 0, 18);
			}

			if (this.v == 1) {
				bia.this.c(integer1 + 165 - 18, integer2 + 1, 0, 0);
			} else {
				bia.this.c(integer1 + 165 - 18, integer2 + 1, 0, 18);
			}

			if (this.v == 2) {
				bia.this.c(integer1 + 215 - 18, integer2 + 1, 0, 0);
			} else {
				bia.this.c(integer1 + 215 - 18, integer2 + 1, 0, 18);
			}

			if (this.v == 3) {
				bia.this.c(integer1 + 265 - 18, integer2 + 1, 0, 0);
			} else {
				bia.this.c(integer1 + 265 - 18, integer2 + 1, 0, 18);
			}

			if (this.v == 4) {
				bia.this.c(integer1 + 315 - 18, integer2 + 1, 0, 0);
			} else {
				bia.this.c(integer1 + 315 - 18, integer2 + 1, 0, 18);
			}

			if (this.y != -1) {
				int integer5 = 79;
				int integer6 = 18;
				if (this.y == 1) {
					integer5 = 129;
				} else if (this.y == 2) {
					integer5 = 179;
				} else if (this.y == 3) {
					integer5 = 229;
				} else if (this.y == 4) {
					integer5 = 279;
				}

				if (this.z == 1) {
					integer6 = 36;
				}

				bia.this.c(integer1 + integer5, integer2 + 1, integer6, 0);
			}
		}

		@Override
		protected void a(int integer1, int integer2) {
			this.v = -1;
			if (integer1 >= 79 && integer1 < 115) {
				this.v = 0;
			} else if (integer1 >= 129 && integer1 < 165) {
				this.v = 1;
			} else if (integer1 >= 179 && integer1 < 215) {
				this.v = 2;
			} else if (integer1 >= 229 && integer1 < 265) {
				this.v = 3;
			} else if (integer1 >= 279 && integer1 < 315) {
				this.v = 4;
			}

			if (this.v >= 0) {
				this.d(this.v);
				this.a.U().a(cby.a(nn.hb, 1.0F));
			}
		}

		@Override
		protected final int b() {
			return this.w.size();
		}

		protected final nu c(int integer) {
			return (nu)this.w.get(integer);
		}

		protected abstract String b(int integer);

		protected void a(nw nw, int integer2, int integer3, boolean boolean4) {
			if (nw != null) {
				String string6 = nw.a(bia.this.s.a(nw));
				bia.this.c(bia.this.q, string6, integer2 - bia.this.q.a(string6), integer3 + 5, boolean4 ? 16777215 : 9474192);
			} else {
				String string6 = "-";
				bia.this.c(bia.this.q, "-", integer2 - bia.this.q.a("-"), integer3 + 5, boolean4 ? 16777215 : 9474192);
			}
		}

		@Override
		protected void b(int integer1, int integer2) {
			if (integer2 >= this.d && integer2 <= this.e) {
				int integer4 = this.c(integer1, integer2);
				int integer5 = (this.b - this.c()) / 2;
				if (integer4 >= 0) {
					if (integer1 < integer5 + 40 || integer1 > integer5 + 40 + 20) {
						return;
					}

					nu nu6 = this.c(integer4);
					this.a(nu6, integer1, integer2);
				} else {
					String string6;
					if (integer1 >= integer5 + 115 - 18 && integer1 <= integer5 + 115) {
						string6 = this.b(0);
					} else if (integer1 >= integer5 + 165 - 18 && integer1 <= integer5 + 165) {
						string6 = this.b(1);
					} else if (integer1 >= integer5 + 215 - 18 && integer1 <= integer5 + 215) {
						string6 = this.b(2);
					} else if (integer1 >= integer5 + 265 - 18 && integer1 <= integer5 + 265) {
						string6 = this.b(3);
					} else {
						if (integer1 < integer5 + 315 - 18 || integer1 > integer5 + 315) {
							return;
						}

						string6 = this.b(4);
					}

					string6 = ("" + cah.a(string6)).trim();
					if (!string6.isEmpty()) {
						int integer7 = integer1 + 12;
						int integer8 = integer2 - 12;
						int integer9 = bia.this.q.a(string6);
						bia.this.a(integer7 - 3, integer8 - 3, integer7 + integer9 + 3, integer8 + 8 + 3, -1073741824, -1073741824);
						bia.this.q.a(string6, (float)integer7, (float)integer8, -1);
					}
				}
			}
		}

		protected void a(nu nu, int integer2, int integer3) {
			if (nu != null) {
				afh afh5 = nu.a();
				afj afj6 = new afj(afh5);
				String string7 = afj6.a();
				String string8 = ("" + cah.a(string7 + ".name")).trim();
				if (!string8.isEmpty()) {
					int integer9 = integer2 + 12;
					int integer10 = integer3 - 12;
					int integer11 = bia.this.q.a(string8);
					bia.this.a(integer9 - 3, integer10 - 3, integer9 + integer11 + 3, integer10 + 8 + 3, -1073741824, -1073741824);
					bia.this.q.a(string8, (float)integer9, (float)integer10, -1);
				}
			}
		}

		protected void d(int integer) {
			if (integer != this.y) {
				this.y = integer;
				this.z = -1;
			} else if (this.z == -1) {
				this.z = 1;
			} else {
				this.y = -1;
				this.z = 0;
			}

			Collections.sort(this.w, this.x);
		}
	}
}
