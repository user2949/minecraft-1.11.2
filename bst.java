import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class bst extends bsl<asw> {
	private static final kq d = new kq("textures/entity/skeleton/skeleton.png");
	private static final kq e = new kq("textures/entity/skeleton/wither_skeleton.png");
	private static final kq f = new kq("textures/entity/zombie/zombie.png");
	private static final kq g = new kq("textures/entity/creeper/creeper.png");
	private static final kq h = new kq("textures/entity/enderdragon/dragon.png");
	private final bnc i = new bnc(0.0F);
	public static bst a;
	private final bmk j = new bmk(0, 0, 64, 32);
	private final bmk k = new blm();

	public void a(asw asw, double double2, double double3, double double4, float float5, int integer) {
		cv cv11 = cv.a(asw.v() & 7);
		float float12 = asw.a(float5);
		this.a((float)double2, (float)double3, (float)double4, cv11, (float)(asw.f() * 360) / 16.0F, asw.e(), asw.a(), integer, float12);
	}

	@Override
	public void a(bsk bsk) {
		super.a(bsk);
		a = this;
	}

	public void a(float float1, float float2, float float3, cv cv, float float5, int integer6, @Nullable GameProfile gameProfile, int integer8, float float9) {
		blv blv11 = this.j;
		if (integer8 >= 0) {
			this.a(b[integer8]);
			bqg.n(5890);
			bqg.G();
			bqg.b(4.0F, 2.0F, 1.0F);
			bqg.c(0.0625F, 0.0625F, 0.0625F);
			bqg.n(5888);
		} else {
			switch (integer6) {
				case 0:
				default:
					this.a(d);
					break;
				case 1:
					this.a(e);
					break;
				case 2:
					this.a(f);
					blv11 = this.k;
					break;
				case 3:
					blv11 = this.k;
					kq kq12 = bzo.a();
					if (gameProfile != null) {
						bes bes13 = bes.z();
						Map<Type, MinecraftProfileTexture> map14 = bes13.Y().a(gameProfile);
						if (map14.containsKey(Type.SKIN)) {
							kq12 = bes13.Y().a((MinecraftProfileTexture)map14.get(Type.SKIN), Type.SKIN);
						} else {
							UUID uUID15 = aay.a(gameProfile);
							kq12 = bzo.a(uUID15);
						}
					}

					this.a(kq12);
					break;
				case 4:
					this.a(g);
					break;
				case 5:
					this.a(h);
					blv11 = this.i;
			}
		}

		bqg.G();
		bqg.r();
		if (cv == cv.UP) {
			bqg.c(float1 + 0.5F, float2, float3 + 0.5F);
		} else {
			switch (cv) {
				case NORTH:
					bqg.c(float1 + 0.5F, float2 + 0.25F, float3 + 0.74F);
					break;
				case SOUTH:
					bqg.c(float1 + 0.5F, float2 + 0.25F, float3 + 0.26F);
					float5 = 180.0F;
					break;
				case WEST:
					bqg.c(float1 + 0.74F, float2 + 0.25F, float3 + 0.5F);
					float5 = 270.0F;
					break;
				case EAST:
				default:
					bqg.c(float1 + 0.26F, float2 + 0.25F, float3 + 0.5F);
					float5 = 90.0F;
			}
		}

		float float12 = 0.0625F;
		bqg.D();
		bqg.b(-1.0F, -1.0F, 1.0F);
		bqg.e();
		if (integer6 == 3) {
			bqg.a(bqg.q.PLAYER_SKIN);
		}

		blv11.a(null, float9, 0.0F, 0.0F, float5, 0.0F, 0.0625F);
		bqg.H();
		if (integer8 >= 0) {
			bqg.n(5890);
			bqg.H();
			bqg.n(5888);
		}
	}
}
