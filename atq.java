import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class atq {
	private static final Joiner a = Joiner.on(",");
	private final List<String[]> b = Lists.newArrayList();
	private final Map<Character, Predicate<ato>> c = Maps.newHashMap();
	private int d;
	private int e;

	private atq() {
		this.c.put(' ', Predicates.alwaysTrue());
	}

	public atq a(String... arr) {
		if (!ArrayUtils.isEmpty(arr) && !StringUtils.isEmpty(arr[0])) {
			if (this.b.isEmpty()) {
				this.d = arr.length;
				this.e = arr[0].length();
			}

			if (arr.length != this.d) {
				throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + arr.length + ")");
			} else {
				for (String string6 : arr) {
					if (string6.length() != this.e) {
						throw new IllegalArgumentException(
							"Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + string6.length() + ")"
						);
					}

					for (char character10 : string6.toCharArray()) {
						if (!this.c.containsKey(character10)) {
							this.c.put(character10, null);
						}
					}
				}

				this.b.add(arr);
				return this;
			}
		} else {
			throw new IllegalArgumentException("Empty pattern for aisle");
		}
	}

	public static atq a() {
		return new atq();
	}

	public atq a(char character, Predicate<ato> predicate) {
		this.c.put(character, predicate);
		return this;
	}

	public atp b() {
		return new atp(this.c());
	}

	private Predicate<ato>[][][] c() {
		this.d();
		Predicate<ato>[][][] arr2 = (Predicate<ato>[][][])Array.newInstance(Predicate.class, new int[]{this.b.size(), this.d, this.e});

		for (int integer3 = 0; integer3 < this.b.size(); integer3++) {
			for (int integer4 = 0; integer4 < this.d; integer4++) {
				for (int integer5 = 0; integer5 < this.e; integer5++) {
					arr2[integer3][integer4][integer5] = (Predicate<ato>)this.c.get(((String[])this.b.get(integer3))[integer4].charAt(integer5));
				}
			}
		}

		return arr2;
	}

	private void d() {
		List<Character> list2 = Lists.newArrayList();

		for (Entry<Character, Predicate<ato>> entry4 : this.c.entrySet()) {
			if (entry4.getValue() == null) {
				list2.add(entry4.getKey());
			}
		}

		if (!list2.isEmpty()) {
			throw new IllegalStateException("Predicates for character(s) " + a.join(list2) + " are missing");
		}
	}
}
