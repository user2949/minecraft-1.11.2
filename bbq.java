import java.io.File;
import javax.annotation.Nullable;

public class bbq extends bbt {
	public bbq(File file, String string, boolean boolean3, ph ph) {
		super(file, string, boolean3, ph);
	}

	@Override
	public auw a(avf avf) {
		File file3 = this.b();
		if (avf instanceof avh) {
			File file4 = new File(file3, "DIM-1");
			file4.mkdirs();
			return new avd(file4, this.a);
		} else if (avf instanceof avl) {
			File file4 = new File(file3, "DIM1");
			file4.mkdirs();
			return new avd(file4, this.a);
		} else {
			return new avd(file3, this.a);
		}
	}

	@Override
	public void a(bbv bbv, @Nullable du du) {
		bbv.e(19133);
		super.a(bbv, du);
	}

	@Override
	public void a() {
		try {
			bdp.a().b();
		} catch (InterruptedException var2) {
			var2.printStackTrace();
		}

		avc.a();
	}
}
