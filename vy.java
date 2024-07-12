import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;

public class vy<T extends sw> extends wc {
	protected final Class<T> a;
	private final int i;
	protected final vy.a b;
	protected final Predicate<? super T> c;
	protected T d;

	public vy(te te, Class<T> class2, boolean boolean3) {
		this(te, class2, boolean3, false);
	}

	public vy(te te, Class<T> class2, boolean boolean3, boolean boolean4) {
		this(te, class2, 10, boolean3, boolean4, null);
	}

	public vy(te te, Class<T> class2, int integer, boolean boolean4, boolean boolean5, @Nullable Predicate<? super T> predicate) {
		super(te, boolean4, boolean5);
		this.a = class2;
		this.i = integer;
		this.b = new vy.a(te);
		this.a(1);
		this.c = new Predicate<T>() {
			public boolean apply(@Nullable T sw) {
				if (sw == null) {
					return false;
				} else if (predicate != null && !predicate.apply(sw)) {
					return false;
				} else {
					return !sr.e.apply(sw) ? false : vy.this.a(sw, false);
				}
			}
		};
	}

	@Override
	public boolean a() {
		// $VF: Couldn't be decompiled
		// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
		//
		// Bytecode:
		// 00: aload 0
		// 01: getfield vy.i I
		// 04: ifle 1a
		// 07: aload 0
		// 08: getfield vy.e Lte;
		// 0b: invokevirtual te.bJ ()Ljava/util/Random;
		// 0e: aload 0
		// 0f: getfield vy.i I
		// 12: invokevirtual java/util/Random.nextInt (I)I
		// 15: ifeq 1a
		// 18: bipush 0
		// 19: ireturn
		// 1a: aload 0
		// 1b: getfield vy.a Ljava/lang/Class;
		// 1e: ldc aay
		// 20: if_acmpeq 2c
		// 23: aload 0
		// 24: getfield vy.a Ljava/lang/Class;
		// 27: ldc ly
		// 29: if_acmpne 79
		// 2c: aload 0
		// 2d: aload 0
		// 2e: getfield vy.e Lte;
		// 31: getfield te.l Lajs;
		// 34: aload 0
		// 35: getfield vy.e Lte;
		// 38: getfield te.p D
		// 3b: aload 0
		// 3c: getfield vy.e Lte;
		// 3f: getfield te.q D
		// 42: aload 0
		// 43: getfield vy.e Lte;
		// 46: invokevirtual te.bq ()F
		// 49: f2d
		// 4a: dadd
		// 4b: aload 0
		// 4c: getfield vy.e Lte;
		// 4f: getfield te.r D
		// 52: aload 0
		// 53: invokevirtual vy.i ()D
		// 56: aload 0
		// 57: invokevirtual vy.i ()D
		// 5a: new vy$2
		// 5d: dup
		// 5e: aload 0
		// 5f: invokespecial vy$2.<init> (Lvy;)V
		// 62: aload 0
		// 63: getfield vy.c Lcom/google/common/base/Predicate;
		// 66: invokevirtual ajs.a (DDDDDLcom/google/common/base/Function;Lcom/google/common/base/Predicate;)Laay;
		// 69: putfield vy.d Lsw;
		// 6c: aload 0
		// 6d: getfield vy.d Lsw;
		// 70: ifnull 77
		// 73: bipush 1
		// 74: goto 78
		// 77: bipush 0
		// 78: ireturn
		// 79: aload 0
		// 7a: getfield vy.e Lte;
		// 7d: getfield te.l Lajs;
		// 80: aload 0
		// 81: getfield vy.a Ljava/lang/Class;
		// 84: aload 0
		// 85: aload 0
		// 86: invokevirtual vy.i ()D
		// 89: invokevirtual vy.a (D)Lbdt;
		// 8c: aload 0
		// 8d: getfield vy.c Lcom/google/common/base/Predicate;
		// 90: invokevirtual ajs.a (Ljava/lang/Class;Lbdt;Lcom/google/common/base/Predicate;)Ljava/util/List;
		// 93: astore 1
		// 94: aload 1
		// 95: invokeinterface java/util/List.isEmpty ()Z 1
		// 9a: ifeq 9f
		// 9d: bipush 0
		// 9e: ireturn
		// 9f: aload 1
		// a0: aload 0
		// a1: getfield vy.b Lvy$a;
		// a4: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
		// a7: aload 0
		// a8: aload 1
		// a9: bipush 0
		// aa: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
		// af: checkcast sw
		// b2: putfield vy.d Lsw;
		// b5: bipush 1
		// b6: ireturn
	}

	protected bdt a(double double1) {
		return this.e.bo().c(double1, 4.0, double1);
	}

	@Override
	public void c() {
		this.e.d(this.d);
		super.c();
	}

	public static class a implements Comparator<sn> {
		private final sn a;

		public a(sn sn) {
			this.a = sn;
		}

		public int compare(sn sn1, sn sn2) {
			double double4 = this.a.h(sn1);
			double double6 = this.a.h(sn2);
			if (double4 < double6) {
				return -1;
			} else {
				return double4 > double6 ? 1 : 0;
			}
		}
	}
}
