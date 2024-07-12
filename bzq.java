import java.io.File;

public class bzq extends bzn {
	private final File a;

	public bzq(File file) {
		this.a = file;
	}

	@Override
	public File a(kq kq) {
		return new File(this.a, kq.toString().replace(':', '/'));
	}

	@Override
	public File a() {
		return new File(this.a, "pack.mcmeta");
	}
}
