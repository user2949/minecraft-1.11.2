import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import javax.annotation.Nullable;

public class bnr {
	private final GameProfile b;
	Map<Type, kq> a = Maps.newEnumMap(Type.class);
	private ajq c;
	private int d;
	private boolean e;
	private String f;
	private fb g;
	private int h;
	private int i;
	private long j;
	private long k;
	private long l;

	public bnr(GameProfile gameProfile) {
		this.b = gameProfile;
	}

	public bnr(hg.b b) {
		this.b = b.a();
		this.c = b.c();
		this.d = b.b();
		this.g = b.d();
	}

	public GameProfile a() {
		return this.b;
	}

	public ajq b() {
		return this.c;
	}

	protected void a(ajq ajq) {
		this.c = ajq;
	}

	public int c() {
		return this.d;
	}

	protected void a(int integer) {
		this.d = integer;
	}

	public boolean e() {
		return this.g() != null;
	}

	public String f() {
		return this.f == null ? bzo.b(this.b.getId()) : this.f;
	}

	public kq g() {
		this.k();
		return (kq)Objects.firstNonNull(this.a.get(Type.SKIN), bzo.a(this.b.getId()));
	}

	@Nullable
	public kq h() {
		this.k();
		return (kq)this.a.get(Type.CAPE);
	}

	@Nullable
	public kq i() {
		this.k();
		return (kq)this.a.get(Type.ELYTRA);
	}

	@Nullable
	public bdz j() {
		return bes.z().f.ad().g(this.a().getName());
	}

	protected void k() {
		synchronized (this) {
			if (!this.e) {
				this.e = true;
				bes.z().Y().a(this.b, new cag.a() {
					@Override
					public void a(Type type, kq kq, MinecraftProfileTexture minecraftProfileTexture) {
						switch (type) {
							case SKIN:
								bnr.this.a.put(Type.SKIN, kq);
								bnr.this.f = minecraftProfileTexture.getMetadata("model");
								if (bnr.this.f == null) {
									bnr.this.f = "default";
								}
								break;
							case CAPE:
								bnr.this.a.put(Type.CAPE, kq);
								break;
							case ELYTRA:
								bnr.this.a.put(Type.ELYTRA, kq);
						}
					}
				}, true);
			}
		}
	}

	public void a(@Nullable fb fb) {
		this.g = fb;
	}

	@Nullable
	public fb l() {
		return this.g;
	}

	public int m() {
		return this.h;
	}

	public void b(int integer) {
		this.h = integer;
	}

	public int n() {
		return this.i;
	}

	public void c(int integer) {
		this.i = integer;
	}

	public long o() {
		return this.j;
	}

	public void a(long long1) {
		this.j = long1;
	}

	public long p() {
		return this.k;
	}

	public void b(long long1) {
		this.k = long1;
	}

	public long q() {
		return this.l;
	}

	public void c(long long1) {
		this.l = long1;
	}
}
