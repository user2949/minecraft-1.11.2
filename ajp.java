import java.util.Set;
import java.util.TreeMap;

public class ajp {
	private final TreeMap<String, ajp.a> a = new TreeMap();

	public ajp() {
		this.a("doFireTick", "true", ajp.b.BOOLEAN_VALUE);
		this.a("mobGriefing", "true", ajp.b.BOOLEAN_VALUE);
		this.a("keepInventory", "false", ajp.b.BOOLEAN_VALUE);
		this.a("doMobSpawning", "true", ajp.b.BOOLEAN_VALUE);
		this.a("doMobLoot", "true", ajp.b.BOOLEAN_VALUE);
		this.a("doTileDrops", "true", ajp.b.BOOLEAN_VALUE);
		this.a("doEntityDrops", "true", ajp.b.BOOLEAN_VALUE);
		this.a("commandBlockOutput", "true", ajp.b.BOOLEAN_VALUE);
		this.a("naturalRegeneration", "true", ajp.b.BOOLEAN_VALUE);
		this.a("doDaylightCycle", "true", ajp.b.BOOLEAN_VALUE);
		this.a("logAdminCommands", "true", ajp.b.BOOLEAN_VALUE);
		this.a("showDeathMessages", "true", ajp.b.BOOLEAN_VALUE);
		this.a("randomTickSpeed", "3", ajp.b.NUMERICAL_VALUE);
		this.a("sendCommandFeedback", "true", ajp.b.BOOLEAN_VALUE);
		this.a("reducedDebugInfo", "false", ajp.b.BOOLEAN_VALUE);
		this.a("spectatorsGenerateChunks", "true", ajp.b.BOOLEAN_VALUE);
		this.a("spawnRadius", "10", ajp.b.NUMERICAL_VALUE);
		this.a("disableElytraMovementCheck", "false", ajp.b.BOOLEAN_VALUE);
		this.a("maxEntityCramming", "24", ajp.b.NUMERICAL_VALUE);
		this.a("doWeatherCycle", "true", ajp.b.BOOLEAN_VALUE);
	}

	public void a(String string1, String string2, ajp.b b) {
		this.a.put(string1, new ajp.a(string2, b));
	}

	public void a(String string1, String string2) {
		ajp.a a4 = (ajp.a)this.a.get(string1);
		if (a4 != null) {
			a4.a(string2);
		} else {
			this.a(string1, string2, ajp.b.ANY_VALUE);
		}
	}

	public String a(String string) {
		ajp.a a3 = (ajp.a)this.a.get(string);
		return a3 != null ? a3.a() : "";
	}

	public boolean b(String string) {
		ajp.a a3 = (ajp.a)this.a.get(string);
		return a3 != null ? a3.b() : false;
	}

	public int c(String string) {
		ajp.a a3 = (ajp.a)this.a.get(string);
		return a3 != null ? a3.c() : 0;
	}

	public du a() {
		du du2 = new du();

		for (String string4 : this.a.keySet()) {
			ajp.a a5 = (ajp.a)this.a.get(string4);
			du2.a(string4, a5.a());
		}

		return du2;
	}

	public void a(du du) {
		for (String string5 : du.c()) {
			this.a(string5, du.l(string5));
		}
	}

	public String[] b() {
		Set<String> set2 = this.a.keySet();
		return (String[])set2.toArray(new String[set2.size()]);
	}

	public boolean e(String string) {
		return this.a.containsKey(string);
	}

	public boolean a(String string, ajp.b b) {
		ajp.a a4 = (ajp.a)this.a.get(string);
		return a4 != null && (a4.e() == b || b == ajp.b.ANY_VALUE);
	}

	static class a {
		private String a;
		private boolean b;
		private int c;
		private double d;
		private final ajp.b e;

		public a(String string, ajp.b b) {
			this.e = b;
			this.a(string);
		}

		public void a(String string) {
			this.a = string;
			this.b = Boolean.parseBoolean(string);
			this.c = this.b ? 1 : 0;

			try {
				this.c = Integer.parseInt(string);
			} catch (NumberFormatException var4) {
			}

			try {
				this.d = Double.parseDouble(string);
			} catch (NumberFormatException var3) {
			}
		}

		public String a() {
			return this.a;
		}

		public boolean b() {
			return this.b;
		}

		public int c() {
			return this.c;
		}

		public ajp.b e() {
			return this.e;
		}
	}

	public static enum b {
		ANY_VALUE,
		BOOLEAN_VALUE,
		NUMERICAL_VALUE;
	}
}
