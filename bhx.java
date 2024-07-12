import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bhx extends bho {
	private static final Logger a = LogManager.getLogger();
	private static final kq f = new kq("textures/gui/title/minecraft.png");
	private static final kq g = new kq("textures/misc/vignette.png");
	private int h;
	private List<String> i;
	private int r;
	private final float s = 0.5F;

	@Override
	public void e() {
		ccp ccp2 = this.j.s();
		ccs ccs3 = this.j.U();
		if (this.h == 0) {
			ccp2.a();
			ccp2.a(ccp.a.CREDITS);
			ccs3.d();
		}

		ccs3.F_();
		this.h++;
		float float4 = (float)(this.r + this.m + this.m + 24) / 0.5F;
		if ((float)this.h > float4) {
			this.a();
		}
	}

	@Override
	protected void a(char character, int integer) {
		if (integer == 1) {
			this.a();
		}
	}

	private void a() {
		this.j.h.d.a(new iq(iq.a.PERFORM_RESPAWN));
		this.j.a(null);
	}

	@Override
	public boolean d() {
		return true;
	}

	@Override
	public void b() {
		if (this.i == null) {
			this.i = Lists.newArrayList();
			bzx bzx2 = null;

			try {
				String string3 = "" + a.WHITE + a.OBFUSCATED + a.GREEN + a.AQUA;
				int integer4 = 274;
				bzx2 = this.j.O().a(new kq("texts/end.txt"));
				InputStream inputStream5 = bzx2.b();
				BufferedReader bufferedReader6 = new BufferedReader(new InputStreamReader(inputStream5, Charsets.UTF_8));
				Random random7 = new Random(8124371L);

				String string8;
				while ((string8 = bufferedReader6.readLine()) != null) {
					string8 = string8.replaceAll("PLAYERNAME", this.j.K().c());

					while (string8.contains(string3)) {
						int integer9 = string8.indexOf(string3);
						String string10 = string8.substring(0, integer9);
						String string11 = string8.substring(integer9 + string3.length());
						string8 = string10 + a.WHITE + a.OBFUSCATED + "XXXXXXXX".substring(0, random7.nextInt(4) + 3) + string11;
					}

					this.i.addAll(this.j.k.c(string8, 274));
					this.i.add("");
				}

				inputStream5.close();

				for (int integer9 = 0; integer9 < 8; integer9++) {
					this.i.add("");
				}

				inputStream5 = this.j.O().a(new kq("texts/credits.txt")).b();
				bufferedReader6 = new BufferedReader(new InputStreamReader(inputStream5, Charsets.UTF_8));

				while ((string8 = bufferedReader6.readLine()) != null) {
					string8 = string8.replaceAll("PLAYERNAME", this.j.K().c());
					string8 = string8.replaceAll("\t", "    ");
					this.i.addAll(this.j.k.c(string8, 274));
					this.i.add("");
				}

				inputStream5.close();
				this.r = this.i.size() * 12;
			} catch (Exception var14) {
				a.error("Couldn't load credits", var14);
			} finally {
				IOUtils.closeQuietly(bzx2);
			}
		}
	}

	private void b(int integer1, int integer2, float float3) {
		bqs bqs5 = bqs.a();
		bpy bpy6 = bqs5.c();
		this.j.N().a(bfi.b);
		bpy6.a(7, bzh.i);
		int integer7 = this.l;
		float float8 = 0.0F - ((float)this.h + float3) * 0.5F * 0.5F;
		float float9 = (float)this.m - ((float)this.h + float3) * 0.5F * 0.5F;
		float float10 = 0.015625F;
		float float11 = ((float)this.h + float3 - 0.0F) * 0.02F;
		float float12 = (float)(this.r + this.m + this.m + 24) / 0.5F;
		float float13 = (float12 - 20.0F - ((float)this.h + float3)) * 0.005F;
		if (float13 < float11) {
			float11 = float13;
		}

		if (float11 > 1.0F) {
			float11 = 1.0F;
		}

		float11 *= float11;
		float11 = float11 * 96.0F / 255.0F;
		bpy6.b(0.0, (double)this.m, (double)this.e).a(0.0, (double)(float8 * 0.015625F)).a(float11, float11, float11, 1.0F).d();
		bpy6.b((double)integer7, (double)this.m, (double)this.e)
			.a((double)((float)integer7 * 0.015625F), (double)(float8 * 0.015625F))
			.a(float11, float11, float11, 1.0F)
			.d();
		bpy6.b((double)integer7, 0.0, (double)this.e).a((double)((float)integer7 * 0.015625F), (double)(float9 * 0.015625F)).a(float11, float11, float11, 1.0F).d();
		bpy6.b(0.0, 0.0, (double)this.e).a(0.0, (double)(float9 * 0.015625F)).a(float11, float11, float11, 1.0F).d();
		bqs5.b();
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.b(integer1, integer2, float3);
		bqs bqs5 = bqs.a();
		bpy bpy6 = bqs5.c();
		int integer7 = 274;
		int integer8 = this.l / 2 - 137;
		int integer9 = this.m + 50;
		float float10 = -((float)this.h + float3) * 0.5F;
		bqg.G();
		bqg.c(0.0F, float10, 0.0F);
		this.j.N().a(f);
		bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
		this.b(integer8, integer9, 0, 0, 155, 44);
		this.b(integer8 + 155, integer9, 0, 45, 155, 44);
		int integer11 = integer9 + 200;

		for (int integer12 = 0; integer12 < this.i.size(); integer12++) {
			if (integer12 == this.i.size() - 1) {
				float float13 = (float)integer11 + float10 - (float)(this.m / 2 - 6);
				if (float13 < 0.0F) {
					bqg.c(0.0F, -float13, 0.0F);
				}
			}

			if ((float)integer11 + float10 + 12.0F + 8.0F > 0.0F && (float)integer11 + float10 < (float)this.m) {
				String string13 = (String)this.i.get(integer12);
				if (string13.startsWith("[C]")) {
					this.q.a(string13.substring(3), (float)(integer8 + (274 - this.q.a(string13.substring(3))) / 2), (float)integer11, 16777215);
				} else {
					this.q.b.setSeed((long)integer12 * 4238972211L + (long)(this.h / 4));
					this.q.a(string13, (float)integer8, (float)integer11, 16777215);
				}
			}

			integer11 += 12;
		}

		bqg.H();
		this.j.N().a(g);
		bqg.m();
		bqg.a(bqg.r.ZERO, bqg.l.ONE_MINUS_SRC_COLOR);
		int integer12 = this.l;
		int integer13 = this.m;
		bpy6.a(7, bzh.i);
		bpy6.b(0.0, (double)integer13, (double)this.e).a(0.0, 1.0).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bpy6.b((double)integer12, (double)integer13, (double)this.e).a(1.0, 1.0).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bpy6.b((double)integer12, 0.0, (double)this.e).a(1.0, 0.0).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bpy6.b(0.0, 0.0, (double)this.e).a(0.0, 0.0).a(1.0F, 1.0F, 1.0F, 1.0F).d();
		bqs5.b();
		bqg.l();
		super.a(integer1, integer2, float3);
	}
}
