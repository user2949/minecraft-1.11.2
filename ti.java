import com.google.common.base.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ti extends ww implements td {
	protected static final kk<Byte> bw = kn.a(ti.class, km.a);
	protected static final kk<Optional<UUID>> bx = kn.a(ti.class, km.m);
	protected vl by;

	public ti(ajs ajs) {
		super(ajs);
		this.di();
	}

	@Override
	protected void i() {
		super.i();
		this.Y.a(bw, (byte)0);
		this.Y.a(bx, Optional.absent());
	}

	@Override
	public void b(du du) {
		super.b(du);
		if (this.b() == null) {
			du.a("OwnerUUID", "");
		} else {
			du.a("OwnerUUID", this.b().toString());
		}

		du.a("Sitting", this.dj());
	}

	@Override
	public void a(du du) {
		super.a(du);
		String string3;
		if (du.b("OwnerUUID", 8)) {
			string3 = du.l("OwnerUUID");
		} else {
			String string4 = du.l("Owner");
			string3 = ms.a(this.B_(), string4);
		}

		if (!string3.isEmpty()) {
			try {
				this.b(UUID.fromString(string3));
				this.q(true);
			} catch (Throwable var4) {
				this.q(false);
			}
		}

		if (this.by != null) {
			this.by.a(du.p("Sitting"));
		}

		this.r(du.p("Sitting"));
	}

	@Override
	public boolean a(aay aay) {
		return !this.cW();
	}

	protected void p(boolean boolean1) {
		de de3 = de.HEART;
		if (!boolean1) {
			de3 = de.SMOKE_NORMAL;
		}

		for (int integer4 = 0; integer4 < 7; integer4++) {
			double double5 = this.S.nextGaussian() * 0.02;
			double double7 = this.S.nextGaussian() * 0.02;
			double double9 = this.S.nextGaussian() * 0.02;
			this.l
				.a(
					de3,
					this.p + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					this.q + 0.5 + (double)(this.S.nextFloat() * this.H),
					this.r + (double)(this.S.nextFloat() * this.G * 2.0F) - (double)this.G,
					double5,
					double7,
					double9
				);
		}
	}

	@Override
	public void a(byte byte1) {
		if (byte1 == 7) {
			this.p(true);
		} else if (byte1 == 6) {
			this.p(false);
		} else {
			super.a(byte1);
		}
	}

	public boolean dh() {
		return (this.Y.a(bw) & 4) != 0;
	}

	public void q(boolean boolean1) {
		byte byte3 = this.Y.a(bw);
		if (boolean1) {
			this.Y.b(bw, (byte)(byte3 | 4));
		} else {
			this.Y.b(bw, (byte)(byte3 & -5));
		}

		this.di();
	}

	protected void di() {
	}

	public boolean dj() {
		return (this.Y.a(bw) & 1) != 0;
	}

	public void r(boolean boolean1) {
		byte byte3 = this.Y.a(bw);
		if (boolean1) {
			this.Y.b(bw, (byte)(byte3 | 1));
		} else {
			this.Y.b(bw, (byte)(byte3 & -2));
		}
	}

	@Nullable
	@Override
	public UUID b() {
		return (UUID)this.Y.a(bx).orNull();
	}

	public void b(@Nullable UUID uUID) {
		this.Y.b(bx, Optional.fromNullable(uUID));
	}

	@Nullable
	public sw p_() {
		try {
			UUID uUID2 = this.b();
			return uUID2 == null ? null : this.l.b(uUID2);
		} catch (IllegalArgumentException var2) {
			return null;
		}
	}

	public boolean e(sw sw) {
		return sw == this.dk();
	}

	public vl dl() {
		return this.by;
	}

	public boolean a(sw sw1, sw sw2) {
		return true;
	}

	@Override
	public bee aQ() {
		if (this.dh()) {
			sw sw2 = this.dk();
			if (sw2 != null) {
				return sw2.aQ();
			}
		}

		return super.aQ();
	}

	@Override
	public boolean r(sn sn) {
		if (this.dh()) {
			sw sw3 = this.dk();
			if (sn == sw3) {
				return true;
			}

			if (sw3 != null) {
				return sw3.r(sn);
			}
		}

		return super.r(sn);
	}

	@Override
	public void a(ry ry) {
		if (!this.l.E && this.l.U().b("showDeathMessages") && this.dk() instanceof ly) {
			this.dk().a(this.bZ().b());
		}

		super.a(ry);
	}
}
