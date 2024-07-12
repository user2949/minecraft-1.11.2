public class bra implements bzz {
	private final bqz a;
	private final brc b;
	private final bqy c = new bqy();
	private final brb d;

	public bra(bqz bqz, bfb bfb) {
		this.a = bqz;
		this.b = new brc(bfb);
		this.d = new brb(bfb);
	}

	public bqz a() {
		return this.a;
	}

	public void a(atl atl, co co, byz byz, ajw ajw) {
		if (atl.j() == aqf.MODEL) {
			atl = atl.b(ajw, co);
			cbh cbh6 = this.a.b(atl);
			cbh cbh7 = new cbo.a(atl, cbh6, byz, co).b();
			this.b.a(ajw, cbh7, atl, co, bqs.a().c(), true);
		}
	}

	public boolean a(atl atl, co co, ajw ajw, bpy bpy) {
		try {
			aqf aqf6 = atl.j();
			if (aqf6 == aqf.INVISIBLE) {
				return false;
			} else {
				if (ajw.L() != ajx.g) {
					try {
						atl = atl.b(ajw, co);
					} catch (Exception var8) {
					}
				}

				switch (aqf6) {
					case MODEL:
						return this.b.a(ajw, this.a(atl), atl, co, bpy, true);
					case ENTITYBLOCK_ANIMATED:
						return false;
					case LIQUID:
						return this.d.a(ajw, atl, co, bpy);
					default:
						return false;
				}
			}
		} catch (Throwable var9) {
			b b7 = b.a(var9, "Tesselating block in world");
			c c8 = b7.a("Block being tesselated");
			c.a(c8, co, atl.v(), atl.v().e(atl));
			throw new f(b7);
		}
	}

	public brc b() {
		return this.b;
	}

	public cbh a(atl atl) {
		return this.a.b(atl);
	}

	public void a(atl atl, float float2) {
		aqf aqf4 = atl.j();
		if (aqf4 != aqf.INVISIBLE) {
			switch (aqf4) {
				case MODEL:
					cbh cbh5 = this.a(atl);
					this.b.a(cbh5, atl, float2, true);
					break;
				case ENTITYBLOCK_ANIMATED:
					this.c.a(atl.v(), float2);
				case LIQUID:
			}
		}
	}

	@Override
	public void a(bzy bzy) {
		this.d.a();
	}
}
