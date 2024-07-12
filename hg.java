import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;

public class hg implements fm<fp> {
	private hg.a a;
	private final List<hg.b> b = Lists.newArrayList();

	public hg() {
	}

	public hg(hg.a a, ly... arr) {
		// $VF: Couldn't be decompiled
		// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
		//
		// Bytecode:
		// 00: aload 0
		// 01: invokespecial java/lang/Object.<init> ()V
		// 04: aload 0
		// 05: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
		// 08: putfield hg.b Ljava/util/List;
		// 0b: aload 0
		// 0c: aload 1
		// 0d: putfield hg.a Lhg$a;
		// 10: aload 2
		// 11: astore 3
		// 12: aload 3
		// 13: arraylength
		// 14: istore 4
		// 16: bipush 0
		// 17: istore 5
		// 19: iload 5
		// 1b: iload 4
		// 1d: if_icmpge 55
		// 20: aload 3
		// 21: iload 5
		// 23: aaload
		// 24: astore 6
		// 26: aload 0
		// 27: getfield hg.b Ljava/util/List;
		// 2a: new hg$b
		// 2d: dup
		// 2e: aload 0
		// 2f: aload 6
		// 31: invokevirtual ly.cS ()Lcom/mojang/authlib/GameProfile;
		// 34: aload 6
		// 36: getfield ly.g I
		// 39: aload 6
		// 3b: getfield ly.c Llz;
		// 3e: invokevirtual lz.b ()Lajq;
		// 41: aload 6
		// 43: invokevirtual ly.J ()Lfb;
		// 46: invokespecial hg$b.<init> (Lhg;Lcom/mojang/authlib/GameProfile;ILajq;Lfb;)V
		// 49: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
		// 4e: pop
		// 4f: iinc 5 1
		// 52: goto 19
		// 55: return
	}

	public hg(hg.a a, Iterable<ly> iterable) {
		this.a = a;

		for (ly ly5 : iterable) {
			this.b.add(new hg.b(ly5.cS(), ly5.g, ly5.c.b(), ly5.J()));
		}
	}

	@Override
	public void a(et et) throws IOException {
		this.a = et.a(hg.a.class);
		int integer3 = et.g();

		for (int integer4 = 0; integer4 < integer3; integer4++) {
			GameProfile gameProfile5 = null;
			int integer6 = 0;
			ajq ajq7 = null;
			fb fb8 = null;
			switch (this.a) {
				case ADD_PLAYER:
					gameProfile5 = new GameProfile(et.i(), et.e(16));
					int integer9 = et.g();
					int integer10 = 0;

					for (; integer10 < integer9; integer10++) {
						String string11 = et.e(32767);
						String string12 = et.e(32767);
						if (et.readBoolean()) {
							gameProfile5.getProperties().put(string11, new Property(string11, string12, et.e(32767)));
						} else {
							gameProfile5.getProperties().put(string11, new Property(string11, string12));
						}
					}

					ajq7 = ajq.a(et.g());
					integer6 = et.g();
					if (et.readBoolean()) {
						fb8 = et.f();
					}
					break;
				case UPDATE_GAME_MODE:
					gameProfile5 = new GameProfile(et.i(), null);
					ajq7 = ajq.a(et.g());
					break;
				case UPDATE_LATENCY:
					gameProfile5 = new GameProfile(et.i(), null);
					integer6 = et.g();
					break;
				case UPDATE_DISPLAY_NAME:
					gameProfile5 = new GameProfile(et.i(), null);
					if (et.readBoolean()) {
						fb8 = et.f();
					}
					break;
				case REMOVE_PLAYER:
					gameProfile5 = new GameProfile(et.i(), null);
			}

			this.b.add(new hg.b(gameProfile5, integer6, ajq7, fb8));
		}
	}

	@Override
	public void b(et et) throws IOException {
		et.a(this.a);
		et.d(this.b.size());

		for (hg.b b4 : this.b) {
			switch (this.a) {
				case ADD_PLAYER:
					et.a(b4.a().getId());
					et.a(b4.a().getName());
					et.d(b4.a().getProperties().size());

					for (Property property6 : b4.a().getProperties().values()) {
						et.a(property6.getName());
						et.a(property6.getValue());
						if (property6.hasSignature()) {
							et.writeBoolean(true);
							et.a(property6.getSignature());
						} else {
							et.writeBoolean(false);
						}
					}

					et.d(b4.c().a());
					et.d(b4.b());
					if (b4.d() == null) {
						et.writeBoolean(false);
					} else {
						et.writeBoolean(true);
						et.a(b4.d());
					}
					break;
				case UPDATE_GAME_MODE:
					et.a(b4.a().getId());
					et.d(b4.c().a());
					break;
				case UPDATE_LATENCY:
					et.a(b4.a().getId());
					et.d(b4.b());
					break;
				case UPDATE_DISPLAY_NAME:
					et.a(b4.a().getId());
					if (b4.d() == null) {
						et.writeBoolean(false);
					} else {
						et.writeBoolean(true);
						et.a(b4.d());
					}
					break;
				case REMOVE_PLAYER:
					et.a(b4.a().getId());
			}
		}
	}

	public void a(fp fp) {
		fp.a(this);
	}

	public List<hg.b> a() {
		return this.b;
	}

	public hg.a b() {
		return this.a;
	}

	public String toString() {
		return Objects.toStringHelper(this).add("action", this.a).add("entries", this.b).toString();
	}

	public static enum a {
		ADD_PLAYER,
		UPDATE_GAME_MODE,
		UPDATE_LATENCY,
		UPDATE_DISPLAY_NAME,
		REMOVE_PLAYER;
	}

	public class b {
		private final int b;
		private final ajq c;
		private final GameProfile d;
		private final fb e;

		public b(GameProfile gameProfile, int integer, ajq ajq, @Nullable fb fb) {
			this.d = gameProfile;
			this.b = integer;
			this.c = ajq;
			this.e = fb;
		}

		public GameProfile a() {
			return this.d;
		}

		public int b() {
			return this.b;
		}

		public ajq c() {
			return this.c;
		}

		@Nullable
		public fb d() {
			return this.e;
		}

		public String toString() {
			return Objects.toStringHelper(this)
				.add("latency", this.b)
				.add("gameMode", this.c)
				.add("profile", this.d)
				.add("displayName", this.e == null ? null : fb.a.a(this.e))
				.toString();
		}
	}
}
