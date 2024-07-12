import com.google.common.base.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class km {
	private static final oh<kl<?>> n = new oh<>(16);
	public static final kl<Byte> a = new kl<Byte>() {
		public void a(et et, Byte byte2) {
			et.writeByte(byte2);
		}

		public Byte a(et et) {
			return et.readByte();
		}

		@Override
		public kk<Byte> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<Integer> b = new kl<Integer>() {
		public void a(et et, Integer integer) {
			et.d(integer);
		}

		public Integer a(et et) {
			return et.g();
		}

		@Override
		public kk<Integer> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<Float> c = new kl<Float>() {
		public void a(et et, Float float2) {
			et.writeFloat(float2);
		}

		public Float a(et et) {
			return et.readFloat();
		}

		@Override
		public kk<Float> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<String> d = new kl<String>() {
		public void a(et et, String string) {
			et.a(string);
		}

		public String a(et et) {
			return et.e(32767);
		}

		@Override
		public kk<String> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<fb> e = new kl<fb>() {
		public void a(et et, fb fb) {
			et.a(fb);
		}

		public fb a(et et) {
			return et.f();
		}

		@Override
		public kk<fb> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<afj> f = new kl<afj>() {
		public void a(et et, afj afj) {
			et.a(afj);
		}

		public afj a(et et) {
			return et.k();
		}

		@Override
		public kk<afj> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<Optional<atl>> g = new kl<Optional<atl>>() {
		public void a(et et, Optional<atl> optional) {
			if (optional.isPresent()) {
				et.d(alu.j((atl)optional.get()));
			} else {
				et.d(0);
			}
		}

		public Optional<atl> a(et et) {
			int integer3 = et.g();
			return integer3 == 0 ? Optional.absent() : Optional.of(alu.c(integer3));
		}

		@Override
		public kk<Optional<atl>> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<Boolean> h = new kl<Boolean>() {
		public void a(et et, Boolean boolean2) {
			et.writeBoolean(boolean2);
		}

		public Boolean a(et et) {
			return et.readBoolean();
		}

		@Override
		public kk<Boolean> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<di> i = new kl<di>() {
		public void a(et et, di di) {
			et.writeFloat(di.b());
			et.writeFloat(di.c());
			et.writeFloat(di.d());
		}

		public di a(et et) {
			return new di(et.readFloat(), et.readFloat(), et.readFloat());
		}

		@Override
		public kk<di> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<co> j = new kl<co>() {
		public void a(et et, co co) {
			et.a(co);
		}

		public co a(et et) {
			return et.e();
		}

		@Override
		public kk<co> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<Optional<co>> k = new kl<Optional<co>>() {
		public void a(et et, Optional<co> optional) {
			et.writeBoolean(optional.isPresent());
			if (optional.isPresent()) {
				et.a((co)optional.get());
			}
		}

		public Optional<co> a(et et) {
			return !et.readBoolean() ? Optional.absent() : Optional.of(et.e());
		}

		@Override
		public kk<Optional<co>> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<cv> l = new kl<cv>() {
		public void a(et et, cv cv) {
			et.a(cv);
		}

		public cv a(et et) {
			return et.a(cv.class);
		}

		@Override
		public kk<cv> a(int integer) {
			return new kk<>(integer, this);
		}
	};
	public static final kl<Optional<UUID>> m = new kl<Optional<UUID>>() {
		public void a(et et, Optional<UUID> optional) {
			et.writeBoolean(optional.isPresent());
			if (optional.isPresent()) {
				et.a((UUID)optional.get());
			}
		}

		public Optional<UUID> a(et et) {
			return !et.readBoolean() ? Optional.absent() : Optional.of(et.i());
		}

		@Override
		public kk<Optional<UUID>> a(int integer) {
			return new kk<>(integer, this);
		}
	};

	public static void a(kl<?> kl) {
		n.c(kl);
	}

	@Nullable
	public static kl<?> a(int integer) {
		return n.a(integer);
	}

	public static int b(kl<?> kl) {
		return n.a(kl);
	}

	static {
		a(a);
		a(b);
		a(c);
		a(d);
		a(e);
		a(f);
		a(h);
		a(i);
		a(j);
		a(k);
		a(l);
		a(m);
		a(g);
	}
}
