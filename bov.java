import bpd.e;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import javax.annotation.Nullable;

public class bov {
	private static final kq b = new kq("textures/particle/particles.png");
	protected ajs a;
	private final ArrayDeque<bou>[][] c = new ArrayDeque[4][];
	private final Queue<bpl> d = Queues.newArrayDeque();
	private final bza e;
	private final Random f = new Random();
	private final Map<Integer, bow> g = Maps.newHashMap();
	private final Queue<bou> h = Queues.newArrayDeque();

	public bov(ajs ajs, bza bza) {
		this.a = ajs;
		this.e = bza;

		for (int integer4 = 0; integer4 < 4; integer4++) {
			this.c[integer4] = new ArrayDeque[2];

			for (int integer5 = 0; integer5 < 2; integer5++) {
				this.c[integer4][integer5] = Queues.newArrayDeque();
			}
		}

		this.c();
	}

	private void c() {
		this.a(de.EXPLOSION_NORMAL.c(), new boh.a());
		this.a(de.SPIT.c(), new bpe.a());
		this.a(de.WATER_BUBBLE.c(), new bob.a());
		this.a(de.WATER_SPLASH.c(), new bpf.a());
		this.a(de.WATER_WAKE.c(), new bpm.a());
		this.a(de.WATER_DROP.c(), new bpn.a());
		this.a(de.SUSPENDED.c(), new bpg.a());
		this.a(de.SUSPENDED_DEPTH.c(), new bph.b());
		this.a(de.CRIT.c(), new boc.c());
		this.a(de.CRIT_MAGIC.c(), new boc.b());
		this.a(de.SMOKE_NORMAL.c(), new bpb.a());
		this.a(de.SMOKE_LARGE.c(), new boq.a());
		this.a(de.SPELL.c(), new bpd.d());
		this.a(de.SPELL_INSTANT.c(), new bpd.b());
		this.a(de.SPELL_MOB.c(), new bpd.c());
		this.a(de.SPELL_MOB_AMBIENT.c(), new bpd.a());
		this.a(de.SPELL_WITCH.c(), new e());
		this.a(de.DRIP_WATER.c(), new boe.b());
		this.a(de.DRIP_LAVA.c(), new boe.a());
		this.a(de.VILLAGER_ANGRY.c(), new bom.a());
		this.a(de.VILLAGER_HAPPY.c(), new bph.a());
		this.a(de.TOWN_AURA.c(), new bph.b());
		this.a(de.NOTE.c(), new bot.a());
		this.a(de.PORTAL.c(), new boy.a());
		this.a(de.ENCHANTMENT_TABLE.c(), new bof.a());
		this.a(de.FLAME.c(), new bok.a());
		this.a(de.LAVA.c(), new bor.a());
		this.a(de.FOOTSTEP.c(), new bol.a());
		this.a(de.CLOUD.c(), new box.a());
		this.a(de.REDSTONE.c(), new boz.a());
		this.a(de.FALLING_DUST.c(), new boi.a());
		this.a(de.SNOWBALL.c(), new boa.c());
		this.a(de.SNOW_SHOVEL.c(), new bpc.a());
		this.a(de.SLIME.c(), new boa.b());
		this.a(de.HEART.c(), new bom.b());
		this.a(de.BARRIER.c(), new bnz.a());
		this.a(de.ITEM_CRACK.c(), new boa.a());
		this.a(de.BLOCK_CRACK.c(), new bpj.a());
		this.a(de.BLOCK_DUST.c(), new bpi.a());
		this.a(de.EXPLOSION_HUGE.c(), new boo.a());
		this.a(de.EXPLOSION_LARGE.c(), new bon.a());
		this.a(de.FIREWORKS_SPARK.c(), new boj.d());
		this.a(de.MOB_APPEARANCE.c(), new bos.a());
		this.a(de.DRAGON_BREATH.c(), new bod.a());
		this.a(de.END_ROD.c(), new bog.a());
		this.a(de.DAMAGE_INDICATOR.c(), new boc.a());
		this.a(de.SWEEP_ATTACK.c(), new bny.a());
		this.a(de.TOTEM.c(), new bpk.a());
	}

	public void a(int integer, bow bow) {
		this.g.put(integer, bow);
	}

	public void a(sn sn, de de) {
		this.d.add(new bpl(this.a, sn, de));
	}

	public void a(sn sn, de de, int integer) {
		this.d.add(new bpl(this.a, sn, de, integer));
	}

	@Nullable
	public bou a(int integer, double double2, double double3, double double4, double double5, double double6, double double7, int... arr) {
		bow bow16 = (bow)this.g.get(integer);
		if (bow16 != null) {
			bou bou17 = bow16.a(integer, this.a, double2, double3, double4, double5, double6, double7, arr);
			if (bou17 != null) {
				this.a(bou17);
				return bou17;
			}
		}

		return null;
	}

	public void a(bou bou) {
		this.h.add(bou);
	}

	public void a() {
		for (int integer2 = 0; integer2 < 4; integer2++) {
			this.a(integer2);
		}

		if (!this.d.isEmpty()) {
			List<bpl> list2 = Lists.newArrayList();

			for (bpl bpl4 : this.d) {
				bpl4.a();
				if (!bpl4.k()) {
					list2.add(bpl4);
				}
			}

			this.d.removeAll(list2);
		}

		if (!this.h.isEmpty()) {
			for (bou bou2 = (bou)this.h.poll(); bou2 != null; bou2 = (bou)this.h.poll()) {
				int integer3 = bou2.b();
				int integer4 = bou2.c() ? 0 : 1;
				if (this.c[integer3][integer4].size() >= 16384) {
					this.c[integer3][integer4].removeFirst();
				}

				this.c[integer3][integer4].add(bou2);
			}
		}
	}

	private void a(int integer) {
		this.a.C.a(integer + "");

		for (int integer3 = 0; integer3 < 2; integer3++) {
			this.a.C.a(integer3 + "");
			this.a(this.c[integer][integer3]);
			this.a.C.b();
		}

		this.a.C.b();
	}

	private void a(Queue<bou> queue) {
		if (!queue.isEmpty()) {
			Iterator<bou> iterator3 = queue.iterator();

			while (iterator3.hasNext()) {
				bou bou4 = (bou)iterator3.next();
				this.b(bou4);
				if (!bou4.k()) {
					iterator3.remove();
				}
			}
		}
	}

	private void b(bou bou) {
		try {
			bou.a();
		} catch (Throwable var6) {
			b b4 = b.a(var6, "Ticking Particle");
			c c5 = b4.a("Particle being ticked");
			final int integer6 = bou.b();
			c5.a("Particle", new d<String>() {
				public String call() throws Exception {
					return bou.toString();
				}
			});
			c5.a("Particle Type", new d<String>() {
				public String call() throws Exception {
					if (integer6 == 0) {
						return "MISC_TEXTURE";
					} else if (integer6 == 1) {
						return "TERRAIN_TEXTURE";
					} else {
						return integer6 == 3 ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + integer6;
					}
				}
			});
			throw new f(b4);
		}
	}

	public void a(sn sn, float float2) {
		float float4 = ben.b();
		float float5 = ben.d();
		float float6 = ben.e();
		float float7 = ben.f();
		float float8 = ben.c();
		bou.H = sn.M + (sn.p - sn.M) * (double)float2;
		bou.I = sn.N + (sn.q - sn.N) * (double)float2;
		bou.J = sn.O + (sn.r - sn.O) * (double)float2;
		bou.K = sn.f(float2);
		bqg.m();
		bqg.a(bqg.r.SRC_ALPHA, bqg.l.ONE_MINUS_SRC_ALPHA);
		bqg.a(516, 0.003921569F);

		for (final int integer9 = 0; integer9 < 3; integer9++) {
			for (int integer10 = 0; integer10 < 2; integer10++) {
				if (!this.c[integer9][integer10].isEmpty()) {
					switch (integer10) {
						case 0:
							bqg.a(false);
							break;
						case 1:
							bqg.a(true);
					}

					switch (integer9) {
						case 0:
						default:
							this.e.a(b);
							break;
						case 1:
							this.e.a(byy.g);
					}

					bqg.c(1.0F, 1.0F, 1.0F, 1.0F);
					bqs bqs11 = bqs.a();
					bpy bpy12 = bqs11.c();
					bpy12.a(7, bzh.d);

					for (final bou bou14 : this.c[integer9][integer10]) {
						try {
							bou14.a(bpy12, sn, float2, float4, float8, float5, float6, float7);
						} catch (Throwable var18) {
							b b16 = b.a(var18, "Rendering Particle");
							c c17 = b16.a("Particle being rendered");
							c17.a("Particle", new d<String>() {
								public String call() throws Exception {
									return bou14.toString();
								}
							});
							c17.a("Particle Type", new d<String>() {
								public String call() throws Exception {
									if (integer9 == 0) {
										return "MISC_TEXTURE";
									} else if (integer9 == 1) {
										return "TERRAIN_TEXTURE";
									} else {
										return integer9 == 3 ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + integer9;
									}
								}
							});
							throw new f(b16);
						}
					}

					bqs11.b();
				}
			}
		}

		bqg.a(true);
		bqg.l();
		bqg.a(516, 0.1F);
	}

	public void b(sn sn, float float2) {
		float float4 = (float) (Math.PI / 180.0);
		float float5 = ot.b(sn.v * (float) (Math.PI / 180.0));
		float float6 = ot.a(sn.v * (float) (Math.PI / 180.0));
		float float7 = -float6 * ot.a(sn.w * (float) (Math.PI / 180.0));
		float float8 = float5 * ot.a(sn.w * (float) (Math.PI / 180.0));
		float float9 = ot.b(sn.w * (float) (Math.PI / 180.0));

		for (int integer10 = 0; integer10 < 2; integer10++) {
			Queue<bou> queue11 = this.c[3][integer10];
			if (!queue11.isEmpty()) {
				bqs bqs12 = bqs.a();
				bpy bpy13 = bqs12.c();

				for (bou bou15 : queue11) {
					bou15.a(bpy13, sn, float2, float5, float9, float6, float7, float8);
				}
			}
		}
	}

	public void a(@Nullable ajs ajs) {
		this.a = ajs;

		for (int integer3 = 0; integer3 < 4; integer3++) {
			for (int integer4 = 0; integer4 < 2; integer4++) {
				this.c[integer3][integer4].clear();
			}
		}

		this.d.clear();
	}

	public void a(co co, atl atl) {
		if (atl.a() != azs.a) {
			atl = atl.b((ajw)this.a, co);
			int integer4 = 4;

			for (int integer5 = 0; integer5 < 4; integer5++) {
				for (int integer6 = 0; integer6 < 4; integer6++) {
					for (int integer7 = 0; integer7 < 4; integer7++) {
						double double8 = ((double)integer5 + 0.5) / 4.0;
						double double10 = ((double)integer6 + 0.5) / 4.0;
						double double12 = ((double)integer7 + 0.5) / 4.0;
						this.a(
							new bpj(this.a, (double)co.p() + double8, (double)co.q() + double10, (double)co.r() + double12, double8 - 0.5, double10 - 0.5, double12 - 0.5, atl)
								.a(co)
						);
					}
				}
			}
		}
	}

	public void a(co co, cv cv) {
		atl atl4 = this.a.o(co);
		if (atl4.j() != aqf.INVISIBLE) {
			int integer5 = co.p();
			int integer6 = co.q();
			int integer7 = co.r();
			float float8 = 0.1F;
			bdt bdt9 = atl4.d(this.a, co);
			double double10 = (double)integer5 + this.f.nextDouble() * (bdt9.d - bdt9.a - 0.2F) + 0.1F + bdt9.a;
			double double12 = (double)integer6 + this.f.nextDouble() * (bdt9.e - bdt9.b - 0.2F) + 0.1F + bdt9.b;
			double double14 = (double)integer7 + this.f.nextDouble() * (bdt9.f - bdt9.c - 0.2F) + 0.1F + bdt9.c;
			if (cv == cv.DOWN) {
				double12 = (double)integer6 + bdt9.b - 0.1F;
			}

			if (cv == cv.UP) {
				double12 = (double)integer6 + bdt9.e + 0.1F;
			}

			if (cv == cv.NORTH) {
				double14 = (double)integer7 + bdt9.c - 0.1F;
			}

			if (cv == cv.SOUTH) {
				double14 = (double)integer7 + bdt9.f + 0.1F;
			}

			if (cv == cv.WEST) {
				double10 = (double)integer5 + bdt9.a - 0.1F;
			}

			if (cv == cv.EAST) {
				double10 = (double)integer5 + bdt9.d + 0.1F;
			}

			this.a(new bpj(this.a, double10, double12, double14, 0.0, 0.0, 0.0, atl4).a(co).c(0.2F).d(0.6F));
		}
	}

	public String b() {
		int integer2 = 0;

		for (int integer3 = 0; integer3 < 4; integer3++) {
			for (int integer4 = 0; integer4 < 2; integer4++) {
				integer2 += this.c[integer3][integer4].size();
			}
		}

		return "" + integer2;
	}
}
