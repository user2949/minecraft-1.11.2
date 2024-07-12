public class air extends aii {
	protected air(aii.a a, aij aij, ss... arr) {
		super(a, aij, arr);
		if (aij == aij.DIGGER) {
			this.c("lootBonusDigger");
		} else if (aij == aij.FISHING_ROD) {
			this.c("lootBonusFishing");
		} else {
			this.c("lootBonus");
		}
	}

	@Override
	public int a(int integer) {
		return 15 + (integer - 1) * 9;
	}

	@Override
	public int b(int integer) {
		return super.a(integer) + 50;
	}

	@Override
	public int b() {
		return 3;
	}

	@Override
	public boolean a(aii aii) {
		return super.a(aii) && aii != aim.t;
	}
}
