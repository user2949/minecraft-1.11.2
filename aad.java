import java.util.Collection;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aad {
	private static final Logger j = LogManager.getLogger();
	public static final tj a = new tq(null, "generic.maxHealth", 20.0, 0.0, 1024.0).a("Max Health").a(true);
	public static final tj b = new tq(null, "generic.followRange", 32.0, 0.0, 2048.0).a("Follow Range");
	public static final tj c = new tq(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).a("Knockback Resistance");
	public static final tj d = new tq(null, "generic.movementSpeed", 0.7F, 0.0, 1024.0).a("Movement Speed").a(true);
	public static final tj e = new tq(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
	public static final tj f = new tq(null, "generic.attackSpeed", 4.0, 0.0, 1024.0).a(true);
	public static final tj g = new tq(null, "generic.armor", 0.0, 0.0, 30.0).a(true);
	public static final tj h = new tq(null, "generic.armorToughness", 0.0, 0.0, 20.0).a(true);
	public static final tj i = new tq(null, "generic.luck", 0.0, -1024.0, 1024.0).a(true);

	public static ea a(tn tn) {
		ea ea2 = new ea();

		for (tk tk4 : tn.a()) {
			ea2.a(a(tk4));
		}

		return ea2;
	}

	private static du a(tk tk) {
		du du2 = new du();
		tj tj3 = tk.a();
		du2.a("Name", tj3.a());
		du2.a("Base", tk.b());
		Collection<tl> collection4 = tk.c();
		if (collection4 != null && !collection4.isEmpty()) {
			ea ea5 = new ea();

			for (tl tl7 : collection4) {
				if (tl7.e()) {
					ea5.a(a(tl7));
				}
			}

			du2.a("Modifiers", ea5);
		}

		return du2;
	}

	public static du a(tl tl) {
		du du2 = new du();
		du2.a("Name", tl.b());
		du2.a("Amount", tl.d());
		du2.a("Operation", tl.c());
		du2.a("UUID", tl.a());
		return du2;
	}

	public static void a(tn tn, ea ea) {
		for (int integer3 = 0; integer3 < ea.c(); integer3++) {
			du du4 = ea.b(integer3);
			tk tk5 = tn.a(du4.l("Name"));
			if (tk5 == null) {
				j.warn("Ignoring unknown attribute '{}'", new Object[]{du4.l("Name")});
			} else {
				a(tk5, du4);
			}
		}
	}

	private static void a(tk tk, du du) {
		tk.a(du.k("Base"));
		if (du.b("Modifiers", 9)) {
			ea ea3 = du.c("Modifiers", 10);

			for (int integer4 = 0; integer4 < ea3.c(); integer4++) {
				tl tl5 = a(ea3.b(integer4));
				if (tl5 != null) {
					tl tl6 = tk.a(tl5.a());
					if (tl6 != null) {
						tk.c(tl6);
					}

					tk.b(tl5);
				}
			}
		}
	}

	@Nullable
	public static tl a(du du) {
		UUID uUID2 = du.a("UUID");

		try {
			return new tl(uUID2, du.l("Name"), du.k("Amount"), du.h("Operation"));
		} catch (Exception var3) {
			j.warn("Unable to create attribute: {}", new Object[]{var3.getMessage()});
			return null;
		}
	}
}
