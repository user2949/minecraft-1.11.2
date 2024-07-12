import java.util.UUID;

public class bzo {
	private static final kq a = new kq("textures/entity/steve.png");
	private static final kq b = new kq("textures/entity/alex.png");

	public static kq a() {
		return a;
	}

	public static kq a(UUID uUID) {
		return c(uUID) ? b : a;
	}

	public static String b(UUID uUID) {
		return c(uUID) ? "slim" : "default";
	}

	private static boolean c(UUID uUID) {
		return (uUID.hashCode() & 1) == 1;
	}
}
