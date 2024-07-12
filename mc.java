import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class mc {
	private static final Predicate<ly> a = new Predicate<ly>() {
		public boolean apply(@Nullable ly ly) {
			return ly != null && !ly.y();
		}
	};
	private static final Predicate<ly> b = new Predicate<ly>() {
		public boolean apply(@Nullable ly ly) {
			return ly != null && (!ly.y() || ly.x().U().b("spectatorsGenerateChunks"));
		}
	};
	private final lw c;
	private final List<ly> d = Lists.newArrayList();
	private final Long2ObjectMap<mb> e = new Long2ObjectOpenHashMap(4096);
	private final Set<mb> f = Sets.newHashSet();
	private final List<mb> g = Lists.newLinkedList();
	private final List<mb> h = Lists.newLinkedList();
	private final List<mb> i = Lists.newArrayList();
	private int j;
	private long k;
	private boolean l = true;
	private boolean m = true;

	public mc(lw lw) {
		this.c = lw;
		this.a(lw.u().am().s());
	}

	public lw a() {
		return this.c;
	}

	public Iterator<auo> b() {
		final Iterator<mb> iterator2 = this.i.iterator();
		return new AbstractIterator<auo>() {
			protected auo computeNext() {
				while (iterator2.hasNext()) {
					mb mb2 = (mb)iterator2.next();
					auo auo3 = mb2.f();
					if (auo3 != null) {
						if (!auo3.v() && auo3.u()) {
							return auo3;
						}

						if (!auo3.j()) {
							return auo3;
						}

						if (mb2.a(128.0, mc.a)) {
							return auo3;
						}
					}
				}

				return (auo)this.endOfData();
			}
		};
	}

	public void c() {
		long long2 = this.c.P();
		if (long2 - this.k > 8000L) {
			this.k = long2;

			for (int integer4 = 0; integer4 < this.i.size(); integer4++) {
				mb mb5 = (mb)this.i.get(integer4);
				mb5.d();
				mb5.c();
			}
		}

		if (!this.f.isEmpty()) {
			for (mb mb5 : this.f) {
				mb5.d();
			}

			this.f.clear();
		}

		if (this.l && long2 % 4L == 0L) {
			this.l = false;
			Collections.sort(this.h, new Comparator<mb>() {
				public int compare(mb mb1, mb mb2) {
					return ComparisonChain.start().compare(mb1.g(), mb2.g()).result();
				}
			});
		}

		if (this.m && long2 % 4L == 2L) {
			this.m = false;
			Collections.sort(this.g, new Comparator<mb>() {
				public int compare(mb mb1, mb mb2) {
					return ComparisonChain.start().compare(mb1.g(), mb2.g()).result();
				}
			});
		}

		if (!this.h.isEmpty()) {
			long long4 = System.nanoTime() + 50000000L;
			int integer6 = 49;
			Iterator<mb> iterator7 = this.h.iterator();

			while (iterator7.hasNext()) {
				mb mb8 = (mb)iterator7.next();
				if (mb8.f() == null) {
					boolean boolean9 = mb8.a(b);
					if (mb8.a(boolean9)) {
						iterator7.remove();
						if (mb8.b()) {
							this.g.remove(mb8);
						}

						if (--integer6 < 0 || System.nanoTime() > long4) {
							break;
						}
					}
				}
			}
		}

		if (!this.g.isEmpty()) {
			int integer4 = 81;
			Iterator<mb> iterator5 = this.g.iterator();

			while (iterator5.hasNext()) {
				mb mb6 = (mb)iterator5.next();
				if (mb6.b()) {
					iterator5.remove();
					if (--integer4 < 0) {
						break;
					}
				}
			}
		}

		if (this.d.isEmpty()) {
			avf avf4 = this.c.s;
			if (!avf4.e()) {
				this.c.r().b();
			}
		}
	}

	public boolean a(int integer1, int integer2) {
		long long4 = d(integer1, integer2);
		return this.e.get(long4) != null;
	}

	@Nullable
	public mb b(int integer1, int integer2) {
		return (mb)this.e.get(d(integer1, integer2));
	}

	private mb c(int integer1, int integer2) {
		long long4 = d(integer1, integer2);
		mb mb6 = (mb)this.e.get(long4);
		if (mb6 == null) {
			mb6 = new mb(this, integer1, integer2);
			this.e.put(long4, mb6);
			this.i.add(mb6);
			if (mb6.f() == null) {
				this.h.add(mb6);
			}

			if (!mb6.b()) {
				this.g.add(mb6);
			}
		}

		return mb6;
	}

	public void a(co co) {
		int integer3 = co.p() >> 4;
		int integer4 = co.r() >> 4;
		mb mb5 = this.b(integer3, integer4);
		if (mb5 != null) {
			mb5.a(co.p() & 15, co.q(), co.r() & 15);
		}
	}

	public void a(ly ly) {
		// $VF: Couldn't be decompiled
		// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
		// java.lang.NullPointerException: Cannot invoke "org.objectweb.asm.Label.put(org.objectweb.asm.ByteVector, int, boolean)" because "label" is null
		//   at org.objectweb.asm.MethodWriter.visitTableSwitchInsn(MethodWriter.java:1342)
		//   at org.objectweb.asm.tree.TableSwitchInsnNode.accept(TableSwitchInsnNode.java:84)
		//   at org.objectweb.asm.tree.InsnList.accept(InsnList.java:144)
		//   at org.objectweb.asm.tree.MethodNode.accept(MethodNode.java:749)
		//   at org.objectweb.asm.tree.MethodNode.accept(MethodNode.java:647)
		//   at org.objectweb.asm.tree.ClassNode.accept(ClassNode.java:468)
		//   at cuchaz.enigma.utils.AsmUtil.nodeToBytes(AsmUtil.java:10)
		//   at cuchaz.enigma.source.vineflower.VineflowerContextSource.getInputStream(VineflowerContextSource.java:79)
		//   at cuchaz.enigma.source.vineflower.VineflowerContextSource$ClasspathSource.getInputStream(VineflowerContextSource.java:124)
		//   at org.jetbrains.java.decompiler.main.extern.IContextSource.getClassBytes(IContextSource.java:67)
		//   at org.jetbrains.java.decompiler.struct.ContextUnit.getClassBytes(ContextUnit.java:92)
		//   at org.jetbrains.java.decompiler.struct.StructContext.tryLoadClass(StructContext.java:110)
		//   at org.jetbrains.java.decompiler.struct.StructContext.lambda$getClass$0(StructContext.java:87)
		//
		// Bytecode:
		// 00: aload 1
		// 01: getfield ly.p D
		// 04: d2i
		// 05: bipush 4
		// 06: ishr
		// 07: istore 2
		// 08: aload 1
		// 09: getfield ly.r D
		// 0c: d2i
		// 0d: bipush 4
		// 0e: ishr
		// 0f: istore 3
		// 10: aload 1
		// 11: aload 1
		// 12: getfield ly.p D
		// 15: putfield ly.d D
		// 18: aload 1
		// 19: aload 1
		// 1a: getfield ly.r D
		// 1d: putfield ly.e D
		// 20: iload 2
		// 21: aload 0
		// 22: getfield mc.j I
		// 25: isub
		// 26: istore 4
		// 28: iload 4
		// 2a: iload 2
		// 2b: aload 0
		// 2c: getfield mc.j I
		// 2f: iadd
		// 30: if_icmpgt 5e
		// 33: iload 3
		// 34: aload 0
		// 35: getfield mc.j I
		// 38: isub
		// 39: istore 5
		// 3b: iload 5
		// 3d: iload 3
		// 3e: aload 0
		// 3f: getfield mc.j I
		// 42: iadd
		// 43: if_icmpgt 58
		// 46: aload 0
		// 47: iload 4
		// 49: iload 5
		// 4b: invokespecial mc.c (II)Lmb;
		// 4e: aload 1
		// 4f: invokevirtual mb.a (Lly;)V
		// 52: iinc 5 1
		// 55: goto 3b
		// 58: iinc 4 1
		// 5b: goto 28
		// 5e: aload 0
		// 5f: getfield mc.d Ljava/util/List;
		// 62: aload 1
		// 63: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
		// 68: pop
		// 69: aload 0
		// 6a: invokespecial mc.e ()V
		// 6d: return
	}

	public void b(ly ly) {
		int integer3 = (int)ly.d >> 4;
		int integer4 = (int)ly.e >> 4;

		for (int integer5 = integer3 - this.j; integer5 <= integer3 + this.j; integer5++) {
			for (int integer6 = integer4 - this.j; integer6 <= integer4 + this.j; integer6++) {
				mb mb7 = this.b(integer5, integer6);
				if (mb7 != null) {
					mb7.b(ly);
				}
			}
		}

		this.d.remove(ly);
		this.e();
	}

	private boolean a(int integer1, int integer2, int integer3, int integer4, int integer5) {
		int integer7 = integer1 - integer3;
		int integer8 = integer2 - integer4;
		return integer7 < -integer5 || integer7 > integer5 ? false : integer8 >= -integer5 && integer8 <= integer5;
	}

	public void c(ly ly) {
		int integer3 = (int)ly.p >> 4;
		int integer4 = (int)ly.r >> 4;
		double double5 = ly.d - ly.p;
		double double7 = ly.e - ly.r;
		double double9 = double5 * double5 + double7 * double7;
		if (!(double9 < 64.0)) {
			int integer11 = (int)ly.d >> 4;
			int integer12 = (int)ly.e >> 4;
			int integer13 = this.j;
			int integer14 = integer3 - integer11;
			int integer15 = integer4 - integer12;
			if (integer14 != 0 || integer15 != 0) {
				for (int integer16 = integer3 - integer13; integer16 <= integer3 + integer13; integer16++) {
					for (int integer17 = integer4 - integer13; integer17 <= integer4 + integer13; integer17++) {
						if (!this.a(integer16, integer17, integer11, integer12, integer13)) {
							this.c(integer16, integer17).a(ly);
						}

						if (!this.a(integer16 - integer14, integer17 - integer15, integer3, integer4, integer13)) {
							mb mb18 = this.b(integer16 - integer14, integer17 - integer15);
							if (mb18 != null) {
								mb18.b(ly);
							}
						}
					}
				}

				ly.d = ly.p;
				ly.e = ly.r;
				this.e();
			}
		}
	}

	public boolean a(ly ly, int integer2, int integer3) {
		mb mb5 = this.b(integer2, integer3);
		return mb5 != null && mb5.d(ly) && mb5.e();
	}

	public void a(int integer) {
		integer = ot.a(integer, 3, 32);
		if (integer != this.j) {
			int integer3 = integer - this.j;

			for (ly ly6 : Lists.newArrayList(this.d)) {
				int integer7 = (int)ly6.p >> 4;
				int integer8 = (int)ly6.r >> 4;
				if (integer3 > 0) {
					for (int integer9 = integer7 - integer; integer9 <= integer7 + integer; integer9++) {
						for (int integer10 = integer8 - integer; integer10 <= integer8 + integer; integer10++) {
							mb mb11 = this.c(integer9, integer10);
							if (!mb11.d(ly6)) {
								mb11.a(ly6);
							}
						}
					}
				} else {
					for (int integer9 = integer7 - this.j; integer9 <= integer7 + this.j; integer9++) {
						for (int integer10x = integer8 - this.j; integer10x <= integer8 + this.j; integer10x++) {
							if (!this.a(integer9, integer10x, integer7, integer8, integer)) {
								this.c(integer9, integer10x).b(ly6);
							}
						}
					}
				}
			}

			this.j = integer;
			this.e();
		}
	}

	private void e() {
		this.l = true;
		this.m = true;
	}

	public static int b(int integer) {
		return integer * 16 - 16;
	}

	private static long d(int integer1, int integer2) {
		return (long)integer1 + 2147483647L | (long)integer2 + 2147483647L << 32;
	}

	public void a(mb mb) {
		this.f.add(mb);
	}

	public void b(mb mb) {
		ajl ajl3 = mb.a();
		long long4 = d(ajl3.a, ajl3.b);
		mb.c();
		this.e.remove(long4);
		this.i.remove(mb);
		this.f.remove(mb);
		this.g.remove(mb);
		this.h.remove(mb);
		auo auo6 = mb.f();
		if (auo6 != null) {
			this.a().r().a(auo6);
		}
	}
}
