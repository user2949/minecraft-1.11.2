public abstract class asq extends asc implements ro {
	private rn a;

	public asq() {
		this.a = rn.a;
	}

	@Override
	public void a(du du) {
		super.a(du);
		this.a = rn.b(du);
	}

	@Override
	public du b(du du) {
		super.b(du);
		if (this.a != null) {
			this.a.a(du);
		}

		return du;
	}

	@Override
	public boolean z_() {
		return this.a != null && !this.a.a();
	}

	@Override
	public rn j() {
		return this.a;
	}

	@Override
	public void a(rn rn) {
		this.a = rn;
	}

	@Override
	public fb i_() {
		return (fb)(this.n_() ? new fh(this.h_()) : new fi(this.h_()));
	}
}
