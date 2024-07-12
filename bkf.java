import com.google.common.collect.Lists;
import java.util.List;

public class bkf implements bkh {
	private final List<bki> a = Lists.newArrayList();

	public bkf() {
		this.a.add(new bkl());
		this.a.add(new bkm());
	}

	@Override
	public List<bki> a() {
		return this.a;
	}

	@Override
	public fb b() {
		return new fi("spectatorMenu.root.prompt");
	}
}
