import java.util.UUID;

public class qb implements pd {
	@Override
	public int a() {
		return 108;
	}

	@Override
	public du a(du du) {
		if (du.b("UUID", 8)) {
			du.a("UUID", UUID.fromString(du.l("UUID")));
		}

		return du;
	}
}
