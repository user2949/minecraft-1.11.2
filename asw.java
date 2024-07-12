import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import javax.annotation.Nullable;

public class asw extends asc implements lf {
	private int a;
	private int f;
	private GameProfile g;
	private int h;
	private boolean i;
	private static mp j;
	private static MinecraftSessionService k;

	public static void a(mp mp) {
		j = mp;
	}

	public static void a(MinecraftSessionService minecraftSessionService) {
		k = minecraftSessionService;
	}

	@Override
	public du b(du du) {
		super.b(du);
		du.a("SkullType", (byte)(this.a & 0xFF));
		du.a("Rot", (byte)(this.f & 0xFF));
		if (this.g != null) {
			du du3 = new du();
			ee.a(du3, this.g);
			du.a("Owner", du3);
		}

		return du;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = du.f("SkullType");
		this.f = du.f("Rot");
		if (this.a == 3) {
			if (du.b("Owner", 10)) {
				this.g = ee.a(du.o("Owner"));
			} else if (du.b("ExtraType", 8)) {
				String string3 = du.l("ExtraType");
				if (!oy.b(string3)) {
					this.g = new GameProfile(null, string3);
					this.h();
				}
			}
		}
	}

	@Override
	public void F_() {
		if (this.a == 5) {
			if (this.b.y(this.c)) {
				this.i = true;
				this.h++;
			} else {
				this.i = false;
			}
		}
	}

	public float a(float float1) {
		return this.i ? (float)this.h + float1 : (float)this.h;
	}

	@Nullable
	public GameProfile a() {
		return this.g;
	}

	@Nullable
	@Override
	public fz c() {
		return new fz(this.c, 4, this.d());
	}

	@Override
	public du d() {
		return this.b(new du());
	}

	public void a(int integer) {
		this.a = integer;
		this.g = null;
	}

	public void a(@Nullable GameProfile gameProfile) {
		this.a = 3;
		this.g = gameProfile;
		this.h();
	}

	private void h() {
		this.g = b(this.g);
		this.x_();
	}

	public static GameProfile b(GameProfile gameProfile) {
		if (gameProfile != null && !oy.b(gameProfile.getName())) {
			if (gameProfile.isComplete() && gameProfile.getProperties().containsKey("textures")) {
				return gameProfile;
			} else if (j != null && k != null) {
				GameProfile gameProfile2 = j.a(gameProfile.getName());
				if (gameProfile2 == null) {
					return gameProfile;
				} else {
					Property property3 = (Property)Iterables.getFirst(gameProfile2.getProperties().get("textures"), null);
					if (property3 == null) {
						gameProfile2 = k.fillProfileProperties(gameProfile2, true);
					}

					return gameProfile2;
				}
			} else {
				return gameProfile;
			}
		} else {
			return gameProfile;
		}
	}

	public int e() {
		return this.a;
	}

	public int f() {
		return this.f;
	}

	public void b(int integer) {
		this.f = integer;
	}

	@Override
	public void a(aou aou) {
		if (this.b != null && this.b.o(this.w()).c(aqp.a) == cv.UP) {
			this.f = aou.a(this.f, 16);
		}
	}

	@Override
	public void a(aqi aqi) {
		if (this.b != null && this.b.o(this.w()).c(aqp.a) == cv.UP) {
			this.f = aqi.a(this.f, 16);
		}
	}
}
