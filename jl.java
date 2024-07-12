import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

public class jl implements fm<im> {
	private UUID a;

	public jl() {
	}

	public jl(UUID uUID) {
		this.a = uUID;
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.i();
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
	}

	public void a(im im) {
		im.a(this);
	}

	@Nullable
	public sn a(lw lw) {
		return lw.a(this.a);
	}
}
