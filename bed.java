import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bed extends bbl {
	private static final Logger b = LogManager.getLogger();
	private bec c;
	private du d;

	public bed() {
		this("scoreboard");
	}

	public bed(String string) {
		super(string);
	}

	public void a(bec bec) {
		this.c = bec;
		if (this.d != null) {
			this.a(this.d);
		}
	}

	@Override
	public void a(du du) {
		if (this.c == null) {
			this.d = du;
		} else {
			this.b(du.c("Objectives", 10));
			this.c(du.c("PlayerScores", 10));
			if (du.b("DisplaySlots", 10)) {
				this.c(du.o("DisplaySlots"));
			}

			if (du.b("Teams", 9)) {
				this.a(du.c("Teams", 10));
			}
		}
	}

	protected void a(ea ea) {
		for (int integer3 = 0; integer3 < ea.c(); integer3++) {
			du du4 = ea.b(integer3);
			String string5 = du4.l("Name");
			if (string5.length() > 16) {
				string5 = string5.substring(0, 16);
			}

			bdz bdz6 = this.c.e(string5);
			String string7 = du4.l("DisplayName");
			if (string7.length() > 32) {
				string7 = string7.substring(0, 32);
			}

			bdz6.a(string7);
			if (du4.b("TeamColor", 8)) {
				bdz6.a(a.b(du4.l("TeamColor")));
			}

			bdz6.b(du4.l("Prefix"));
			bdz6.c(du4.l("Suffix"));
			if (du4.b("AllowFriendlyFire", 99)) {
				bdz6.a(du4.p("AllowFriendlyFire"));
			}

			if (du4.b("SeeFriendlyInvisibles", 99)) {
				bdz6.b(du4.p("SeeFriendlyInvisibles"));
			}

			if (du4.b("NameTagVisibility", 8)) {
				bee.b b8 = bee.b.a(du4.l("NameTagVisibility"));
				if (b8 != null) {
					bdz6.a(b8);
				}
			}

			if (du4.b("DeathMessageVisibility", 8)) {
				bee.b b8 = bee.b.a(du4.l("DeathMessageVisibility"));
				if (b8 != null) {
					bdz6.b(b8);
				}
			}

			if (du4.b("CollisionRule", 8)) {
				bee.a a8 = bee.a.a(du4.l("CollisionRule"));
				if (a8 != null) {
					bdz6.a(a8);
				}
			}

			this.a(bdz6, du4.c("Players", 8));
		}
	}

	protected void a(bdz bdz, ea ea) {
		for (int integer4 = 0; integer4 < ea.c(); integer4++) {
			this.c.a(ea.g(integer4), bdz.b());
		}
	}

	protected void c(du du) {
		for (int integer3 = 0; integer3 < 19; integer3++) {
			if (du.b("slot_" + integer3, 8)) {
				String string4 = du.l("slot_" + integer3);
				bdy bdy5 = this.c.b(string4);
				this.c.a(integer3, bdy5);
			}
		}
	}

	protected void b(ea ea) {
		for (int integer3 = 0; integer3 < ea.c(); integer3++) {
			du du4 = ea.b(integer3);
			bei bei5 = (bei)bei.a.get(du4.l("CriteriaName"));
			if (bei5 != null) {
				String string6 = du4.l("Name");
				if (string6.length() > 16) {
					string6 = string6.substring(0, 16);
				}

				bdy bdy7 = this.c.a(string6, bei5);
				bdy7.a(du4.l("DisplayName"));
				bdy7.a(bei.a.a(du4.l("RenderType")));
			}
		}
	}

	protected void c(ea ea) {
		for (int integer3 = 0; integer3 < ea.c(); integer3++) {
			du du4 = ea.b(integer3);
			bdy bdy5 = this.c.b(du4.l("Objective"));
			String string6 = du4.l("Name");
			if (string6.length() > 40) {
				string6 = string6.substring(0, 40);
			}

			bea bea7 = this.c.c(string6, bdy5);
			bea7.c(du4.h("Score"));
			if (du4.e("Locked")) {
				bea7.a(du4.p("Locked"));
			}
		}
	}

	@Override
	public du b(du du) {
		if (this.c == null) {
			b.warn("Tried to save scoreboard without having a scoreboard...");
			return du;
		} else {
			du.a("Objectives", this.b());
			du.a("PlayerScores", this.e());
			du.a("Teams", this.a());
			this.d(du);
			return du;
		}
	}

	protected ea a() {
		ea ea2 = new ea();

		for (bdz bdz5 : this.c.g()) {
			du du6 = new du();
			du6.a("Name", bdz5.b());
			du6.a("DisplayName", bdz5.c());
			if (bdz5.m().b() >= 0) {
				du6.a("TeamColor", bdz5.m().e());
			}

			du6.a("Prefix", bdz5.e());
			du6.a("Suffix", bdz5.f());
			du6.a("AllowFriendlyFire", bdz5.g());
			du6.a("SeeFriendlyInvisibles", bdz5.h());
			du6.a("NameTagVisibility", bdz5.i().e);
			du6.a("DeathMessageVisibility", bdz5.j().e);
			du6.a("CollisionRule", bdz5.k().e);
			ea ea7 = new ea();

			for (String string9 : bdz5.d()) {
				ea7.a(new eh(string9));
			}

			du6.a("Players", ea7);
			ea2.a(du6);
		}

		return ea2;
	}

	protected void d(du du) {
		du du3 = new du();
		boolean boolean4 = false;

		for (int integer5 = 0; integer5 < 19; integer5++) {
			bdy bdy6 = this.c.a(integer5);
			if (bdy6 != null) {
				du3.a("slot_" + integer5, bdy6.b());
				boolean4 = true;
			}
		}

		if (boolean4) {
			du.a("DisplaySlots", du3);
		}
	}

	protected ea b() {
		ea ea2 = new ea();

		for (bdy bdy5 : this.c.c()) {
			if (bdy5.c() != null) {
				du du6 = new du();
				du6.a("Name", bdy5.b());
				du6.a("CriteriaName", bdy5.c().a());
				du6.a("DisplayName", bdy5.d());
				du6.a("RenderType", bdy5.e().a());
				ea2.a(du6);
			}
		}

		return ea2;
	}

	protected ea e() {
		ea ea2 = new ea();

		for (bea bea5 : this.c.e()) {
			if (bea5.d() != null) {
				du du6 = new du();
				du6.a("Name", bea5.e());
				du6.a("Objective", bea5.d().b());
				du6.a("Score", bea5.c());
				du6.a("Locked", bea5.g());
				ea2.a(du6);
			}
		}

		return ea2;
	}
}
