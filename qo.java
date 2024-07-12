import java.util.Locale;

public class qo implements pd {
	@Override
	public int a() {
		return 816;
	}

	@Override
	public du a(du du) {
		if (du.b("lang", 8)) {
			du.a("lang", du.l("lang").toLowerCase(Locale.ROOT));
		}

		return du;
	}
}
