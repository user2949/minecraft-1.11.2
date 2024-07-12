import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;

public enum es {
	HANDSHAKING(-1) {
		{
			this.a(fn.SERVERBOUND, jp.class);
		}
	},
	PLAY(0) {
		{
			this.a(fn.CLIENTBOUND, fq.class);
			this.a(fn.CLIENTBOUND, fr.class);
			this.a(fn.CLIENTBOUND, fs.class);
			this.a(fn.CLIENTBOUND, ft.class);
			this.a(fn.CLIENTBOUND, fu.class);
			this.a(fn.CLIENTBOUND, fv.class);
			this.a(fn.CLIENTBOUND, fw.class);
			this.a(fn.CLIENTBOUND, fx.class);
			this.a(fn.CLIENTBOUND, fy.class);
			this.a(fn.CLIENTBOUND, fz.class);
			this.a(fn.CLIENTBOUND, ga.class);
			this.a(fn.CLIENTBOUND, gb.class);
			this.a(fn.CLIENTBOUND, gc.class);
			this.a(fn.CLIENTBOUND, gd.class);
			this.a(fn.CLIENTBOUND, ge.class);
			this.a(fn.CLIENTBOUND, gf.class);
			this.a(fn.CLIENTBOUND, gg.class);
			this.a(fn.CLIENTBOUND, gh.class);
			this.a(fn.CLIENTBOUND, gi.class);
			this.a(fn.CLIENTBOUND, gj.class);
			this.a(fn.CLIENTBOUND, gk.class);
			this.a(fn.CLIENTBOUND, gl.class);
			this.a(fn.CLIENTBOUND, gm.class);
			this.a(fn.CLIENTBOUND, gn.class);
			this.a(fn.CLIENTBOUND, go.class);
			this.a(fn.CLIENTBOUND, gp.class);
			this.a(fn.CLIENTBOUND, gq.class);
			this.a(fn.CLIENTBOUND, gr.class);
			this.a(fn.CLIENTBOUND, gs.class);
			this.a(fn.CLIENTBOUND, gt.class);
			this.a(fn.CLIENTBOUND, gu.class);
			this.a(fn.CLIENTBOUND, gv.class);
			this.a(fn.CLIENTBOUND, gw.class);
			this.a(fn.CLIENTBOUND, gx.class);
			this.a(fn.CLIENTBOUND, gy.class);
			this.a(fn.CLIENTBOUND, gz.class);
			this.a(fn.CLIENTBOUND, ha.class);
			this.a(fn.CLIENTBOUND, hb.a.class);
			this.a(fn.CLIENTBOUND, hb.b.class);
			this.a(fn.CLIENTBOUND, hb.c.class);
			this.a(fn.CLIENTBOUND, hb.class);
			this.a(fn.CLIENTBOUND, hc.class);
			this.a(fn.CLIENTBOUND, hd.class);
			this.a(fn.CLIENTBOUND, he.class);
			this.a(fn.CLIENTBOUND, hf.class);
			this.a(fn.CLIENTBOUND, hg.class);
			this.a(fn.CLIENTBOUND, hh.class);
			this.a(fn.CLIENTBOUND, hi.class);
			this.a(fn.CLIENTBOUND, hj.class);
			this.a(fn.CLIENTBOUND, hk.class);
			this.a(fn.CLIENTBOUND, hl.class);
			this.a(fn.CLIENTBOUND, hm.class);
			this.a(fn.CLIENTBOUND, hn.class);
			this.a(fn.CLIENTBOUND, ho.class);
			this.a(fn.CLIENTBOUND, hp.class);
			this.a(fn.CLIENTBOUND, hq.class);
			this.a(fn.CLIENTBOUND, hr.class);
			this.a(fn.CLIENTBOUND, hs.class);
			this.a(fn.CLIENTBOUND, ht.class);
			this.a(fn.CLIENTBOUND, hu.class);
			this.a(fn.CLIENTBOUND, hv.class);
			this.a(fn.CLIENTBOUND, hw.class);
			this.a(fn.CLIENTBOUND, hx.class);
			this.a(fn.CLIENTBOUND, hy.class);
			this.a(fn.CLIENTBOUND, hz.class);
			this.a(fn.CLIENTBOUND, ia.class);
			this.a(fn.CLIENTBOUND, ib.class);
			this.a(fn.CLIENTBOUND, ic.class);
			this.a(fn.CLIENTBOUND, id.class);
			this.a(fn.CLIENTBOUND, ie.class);
			this.a(fn.CLIENTBOUND, ig.class);
			this.a(fn.CLIENTBOUND, ih.class);
			this.a(fn.CLIENTBOUND, ii.class);
			this.a(fn.CLIENTBOUND, ij.class);
			this.a(fn.CLIENTBOUND, ik.class);
			this.a(fn.CLIENTBOUND, il.class);
			this.a(fn.SERVERBOUND, in.class);
			this.a(fn.SERVERBOUND, io.class);
			this.a(fn.SERVERBOUND, ip.class);
			this.a(fn.SERVERBOUND, iq.class);
			this.a(fn.SERVERBOUND, ir.class);
			this.a(fn.SERVERBOUND, is.class);
			this.a(fn.SERVERBOUND, it.class);
			this.a(fn.SERVERBOUND, iu.class);
			this.a(fn.SERVERBOUND, iv.class);
			this.a(fn.SERVERBOUND, iw.class);
			this.a(fn.SERVERBOUND, ix.class);
			this.a(fn.SERVERBOUND, iy.class);
			this.a(fn.SERVERBOUND, iz.a.class);
			this.a(fn.SERVERBOUND, iz.b.class);
			this.a(fn.SERVERBOUND, iz.c.class);
			this.a(fn.SERVERBOUND, iz.class);
			this.a(fn.SERVERBOUND, ja.class);
			this.a(fn.SERVERBOUND, jb.class);
			this.a(fn.SERVERBOUND, jc.class);
			this.a(fn.SERVERBOUND, jd.class);
			this.a(fn.SERVERBOUND, je.class);
			this.a(fn.SERVERBOUND, jf.class);
			this.a(fn.SERVERBOUND, jg.class);
			this.a(fn.SERVERBOUND, jh.class);
			this.a(fn.SERVERBOUND, ji.class);
			this.a(fn.SERVERBOUND, jj.class);
			this.a(fn.SERVERBOUND, jk.class);
			this.a(fn.SERVERBOUND, jl.class);
			this.a(fn.SERVERBOUND, jm.class);
			this.a(fn.SERVERBOUND, jn.class);
		}
	},
	STATUS(1) {
		{
			this.a(fn.SERVERBOUND, ki.class);
			this.a(fn.CLIENTBOUND, ke.class);
			this.a(fn.SERVERBOUND, kh.class);
			this.a(fn.CLIENTBOUND, kd.class);
		}
	},
	LOGIN(2) {
		{
			this.a(fn.CLIENTBOUND, jw.class);
			this.a(fn.CLIENTBOUND, ju.class);
			this.a(fn.CLIENTBOUND, jt.class);
			this.a(fn.CLIENTBOUND, jv.class);
			this.a(fn.SERVERBOUND, jy.class);
			this.a(fn.SERVERBOUND, jz.class);
		}
	};

	private static final es[] e = new es[4];
	private static final Map<Class<? extends fm<?>>, es> f = Maps.newHashMap();
	private final int g;
	private final Map<fn, BiMap<Integer, Class<? extends fm<?>>>> h = Maps.newEnumMap(fn.class);

	private es(int integer3) {
		this.g = integer3;
	}

	protected es a(fn fn, Class<? extends fm<?>> class2) {
		BiMap<Integer, Class<? extends fm<?>>> biMap4 = (BiMap<Integer, Class<? extends fm<?>>>)this.h.get(fn);
		if (biMap4 == null) {
			biMap4 = HashBiMap.create();
			this.h.put(fn, biMap4);
		}

		if (biMap4.containsValue(class2)) {
			String string5 = fn + " packet " + class2 + " is already known to ID " + biMap4.inverse().get(class2);
			LogManager.getLogger().fatal(string5);
			throw new IllegalArgumentException(string5);
		} else {
			biMap4.put(biMap4.size(), class2);
			return this;
		}
	}

	public Integer a(fn fn, fm<?> fm) {
		return (Integer)((BiMap)this.h.get(fn)).inverse().get(fm.getClass());
	}

	@Nullable
	public fm<?> a(fn fn, int integer) throws IllegalAccessException, InstantiationException {
		Class<? extends fm<?>> class4 = (Class<? extends fm<?>>)((BiMap)this.h.get(fn)).get(integer);
		return class4 == null ? null : (fm)class4.newInstance();
	}

	public int a() {
		return this.g;
	}

	public static es a(int integer) {
		return integer >= -1 && integer <= 2 ? e[integer - -1] : null;
	}

	public static es a(fm<?> fm) {
		return (es)f.get(fm.getClass());
	}

	static {
		for (es es4 : values()) {
			int integer5 = es4.a();
			if (integer5 < -1 || integer5 > 2) {
				throw new Error("Invalid protocol ID " + Integer.toString(integer5));
			}

			e[integer5 - -1] = es4;

			for (fn fn7 : es4.h.keySet()) {
				for (Class<? extends fm<?>> class9 : ((BiMap)es4.h.get(fn7)).values()) {
					if (f.containsKey(class9) && f.get(class9) != es4) {
						throw new Error("Packet " + class9 + " is already assigned to protocol " + f.get(class9) + " - can't reassign to " + es4);
					}

					try {
						class9.newInstance();
					} catch (Throwable var10) {
						throw new Error("Packet " + class9 + " fails instantiation checks! " + class9);
					}

					f.put(class9, es4);
				}
			}
		}
	}
}
