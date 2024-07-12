import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class bkl implements bkh, bki {
	private static final Ordering<bnr> a = Ordering.from(new Comparator<bnr>() {
		public int compare(bnr bnr1, bnr bnr2) {
			return ComparisonChain.start().compare(bnr1.a().getId(), bnr2.a().getId()).result();
		}
	});
	private final List<bki> b = Lists.newArrayList();

	public bkl() {
		this(a.sortedCopy(bes.z().v().d()));
	}

	public bkl(Collection<bnr> collection) {
		for (bnr bnr4 : a.sortedCopy(collection)) {
			if (bnr4.b() != ajq.SPECTATOR) {
				this.b.add(new bke(bnr4.a()));
			}
		}
	}

	@Override
	public List<bki> a() {
		return this.b;
	}

	@Override
	public fb b() {
		return new fi("spectatorMenu.teleport.prompt");
	}

	@Override
	public void a(bkg bkg) {
		bkg.a(this);
	}

	@Override
	public fb I_() {
		return new fi("spectatorMenu.teleport");
	}

	@Override
	public void a(float float1, int integer) {
		bes.z().N().a(bgh.a);
		bfi.a(0, 0, 0.0F, 0.0F, 16, 16, 256.0F, 256.0F);
	}

	@Override
	public boolean J_() {
		return !this.b.isEmpty();
	}
}
