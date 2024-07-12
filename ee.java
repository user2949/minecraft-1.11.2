import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class ee {
	@Nullable
	public static GameProfile a(du du) {
		String string2 = null;
		String string3 = null;
		if (du.b("Name", 8)) {
			string2 = du.l("Name");
		}

		if (du.b("Id", 8)) {
			string3 = du.l("Id");
		}

		try {
			UUID uUID4;
			try {
				uUID4 = UUID.fromString(string3);
			} catch (Throwable var12) {
				uUID4 = null;
			}

			GameProfile gameProfile5 = new GameProfile(uUID4, string2);
			if (du.b("Properties", 10)) {
				du du6 = du.o("Properties");

				for (String string8 : du6.c()) {
					ea ea9 = du6.c(string8, 10);

					for (int integer10 = 0; integer10 < ea9.c(); integer10++) {
						du du11 = ea9.b(integer10);
						String string12 = du11.l("Value");
						if (du11.b("Signature", 8)) {
							gameProfile5.getProperties().put(string8, new Property(string8, string12, du11.l("Signature")));
						} else {
							gameProfile5.getProperties().put(string8, new Property(string8, string12));
						}
					}
				}
			}

			return gameProfile5;
		} catch (Throwable var13) {
			return null;
		}
	}

	public static du a(du du, GameProfile gameProfile) {
		if (!oy.b(gameProfile.getName())) {
			du.a("Name", gameProfile.getName());
		}

		if (gameProfile.getId() != null) {
			du.a("Id", gameProfile.getId().toString());
		}

		if (!gameProfile.getProperties().isEmpty()) {
			du du3 = new du();

			for (String string5 : gameProfile.getProperties().keySet()) {
				ea ea6 = new ea();

				for (Property property8 : gameProfile.getProperties().get(string5)) {
					du du9 = new du();
					du9.a("Value", property8.getValue());
					if (property8.hasSignature()) {
						du9.a("Signature", property8.getSignature());
					}

					ea6.a(du9);
				}

				du3.a(string5, ea6);
			}

			du.a("Properties", du3);
		}

		return du;
	}

	@VisibleForTesting
	public static boolean a(ei ei1, ei ei2, boolean boolean3) {
		if (ei1 == ei2) {
			return true;
		} else if (ei1 == null) {
			return true;
		} else if (ei2 == null) {
			return false;
		} else if (!ei1.getClass().equals(ei2.getClass())) {
			return false;
		} else if (ei1 instanceof du) {
			du du4 = (du)ei1;
			du du5 = (du)ei2;

			for (String string7 : du4.c()) {
				ei ei8 = du4.c(string7);
				if (!a(ei8, du5.c(string7), boolean3)) {
					return false;
				}
			}

			return true;
		} else if (ei1 instanceof ea && boolean3) {
			ea ea4 = (ea)ei1;
			ea ea5 = (ea)ei2;
			if (ea4.b_()) {
				return ea5.b_();
			} else {
				for (int integer6 = 0; integer6 < ea4.c(); integer6++) {
					ei ei7 = ea4.h(integer6);
					boolean boolean8 = false;

					for (int integer9 = 0; integer9 < ea5.c(); integer9++) {
						if (a(ei7, ea5.h(integer9), boolean3)) {
							boolean8 = true;
							break;
						}
					}

					if (!boolean8) {
						return false;
					}
				}

				return true;
			}
		} else {
			return ei1.equals(ei2);
		}
	}

	public static du a(UUID uUID) {
		du du2 = new du();
		du2.a("M", uUID.getMostSignificantBits());
		du2.a("L", uUID.getLeastSignificantBits());
		return du2;
	}

	public static UUID b(du du) {
		return new UUID(du.i("M"), du.i("L"));
	}

	public static co c(du du) {
		return new co(du.h("X"), du.h("Y"), du.h("Z"));
	}

	public static du a(co co) {
		du du2 = new du();
		du2.a("X", co.p());
		du2.a("Y", co.q());
		du2.a("Z", co.r());
		return du2;
	}

	public static atl d(du du) {
		if (!du.b("Name", 8)) {
			return alv.a.t();
		} else {
			alu alu2 = alu.h.c(new kq(du.l("Name")));
			atl atl3 = alu2.t();
			if (du.b("Properties", 10)) {
				du du4 = du.o("Properties");
				atm atm5 = alu2.s();

				for (String string7 : du4.c()) {
					aub<?> aub8 = atm5.a(string7);
					if (aub8 != null) {
						atl3 = a(atl3, aub8, du4.l(string7));
					}
				}
			}

			return atl3;
		}
	}

	private static <T extends Comparable<T>> atl a(atl atl, aub<T> aub, String string) {
		return atl.a(aub, (Comparable)aub.b(string).get());
	}

	public static du a(du du, atl atl) {
		du.a("Name", alu.h.b(atl.v()).toString());
		if (!atl.u().isEmpty()) {
			du du3 = new du();
			UnmodifiableIterator var3 = atl.u().entrySet().iterator();

			while (var3.hasNext()) {
				Entry<aub<?>, Comparable<?>> entry5 = (Entry<aub<?>, Comparable<?>>)var3.next();
				aub<?> aub6 = (aub<?>)entry5.getKey();
				du3.a(aub6.a(), a(aub6, (Comparable<?>)entry5.getValue()));
			}

			du.a("Properties", du3);
		}

		return du;
	}

	private static <T extends Comparable<T>> String a(aub<T> aub, Comparable<?> comparable) {
		return aub.a((T)comparable);
	}
}
