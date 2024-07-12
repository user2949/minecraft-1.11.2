import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class ccg extends mt {
	private du f;

	public ccg(cch cch) {
		super(cch);
		this.a(10);
	}

	@Override
	protected void b(ly ly) {
		if (ly.h_().equals(this.b().Q())) {
			this.f = ly.e(new du());
		}

		super.b(ly);
	}

	@Override
	public String a(SocketAddress socketAddress, GameProfile gameProfile) {
		return gameProfile.getName().equalsIgnoreCase(this.b().Q()) && this.a(gameProfile.getName()) != null
			? "That name is already taken."
			: super.a(socketAddress, gameProfile);
	}

	public cch c() {
		return (cch)super.c();
	}

	@Override
	public du t() {
		return this.f;
	}
}
