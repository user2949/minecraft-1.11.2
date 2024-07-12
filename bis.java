import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class bis {
	private static final bis a = new bis();
	private final Random b = new Random();
	private final String[] c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale phnglui mglwnafh cthulhu rlyeh wgahnagl fhtagnbaguette"
		.split(" ");

	private bis() {
	}

	public static bis a() {
		return a;
	}

	public String a(bfg bfg, int integer) {
		int integer4 = this.b.nextInt(2) + 3;
		String string5 = "";

		for (int integer6 = 0; integer6 < integer4; integer6++) {
			if (integer6 > 0) {
				string5 = string5 + " ";
			}

			string5 = string5 + this.c[this.b.nextInt(this.c.length)];
		}

		List<String> list6 = bfg.c(string5, integer);
		return StringUtils.join(list6.size() >= 2 ? list6.subList(0, 2) : list6, " ");
	}

	public void a(long long1) {
		this.b.setSeed(long1);
	}
}
