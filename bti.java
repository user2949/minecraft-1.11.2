import java.util.BitSet;
import java.util.Set;

public class bti {
	private static final int a = cv.values().length;
	private final BitSet b = new BitSet(a * a);

	public void a(Set<cv> set) {
		for (cv cv4 : set) {
			for (cv cv6 : set) {
				this.a(cv4, cv6, true);
			}
		}
	}

	public void a(cv cv1, cv cv2, boolean boolean3) {
		this.b.set(cv1.ordinal() + cv2.ordinal() * a, boolean3);
		this.b.set(cv2.ordinal() + cv1.ordinal() * a, boolean3);
	}

	public void a(boolean boolean1) {
		this.b.set(0, this.b.size(), boolean1);
	}

	public boolean a(cv cv1, cv cv2) {
		return this.b.get(cv1.ordinal() + cv2.ordinal() * a);
	}

	public String toString() {
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(' ');

		for (cv cv6 : cv.values()) {
			stringBuilder2.append(' ').append(cv6.toString().toUpperCase().charAt(0));
		}

		stringBuilder2.append('\n');

		for (cv cv6 : cv.values()) {
			stringBuilder2.append(cv6.toString().toUpperCase().charAt(0));

			for (cv cv10 : cv.values()) {
				if (cv6 == cv10) {
					stringBuilder2.append("  ");
				} else {
					boolean boolean11 = this.a(cv6, cv10);
					stringBuilder2.append(' ').append((char)(boolean11 ? 'Y' : 'n'));
				}
			}

			stringBuilder2.append('\n');
		}

		return stringBuilder2.toString();
	}
}
