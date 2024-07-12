public enum aij {
	ALL {
		@Override
		public boolean a(afh afh) {
			for (aij aij6 : aij.values()) {
				if (aij6 != aij.ALL && aij6.a(afh)) {
					return true;
				}
			}

			return false;
		}
	},
	ARMOR {
		@Override
		public boolean a(afh afh) {
			return afh instanceof adp;
		}
	},
	ARMOR_FEET {
		@Override
		public boolean a(afh afh) {
			return afh instanceof adp && ((adp)afh).c == ss.FEET;
		}
	},
	ARMOR_LEGS {
		@Override
		public boolean a(afh afh) {
			return afh instanceof adp && ((adp)afh).c == ss.LEGS;
		}
	},
	ARMOR_CHEST {
		@Override
		public boolean a(afh afh) {
			return afh instanceof adp && ((adp)afh).c == ss.CHEST;
		}
	},
	ARMOR_HEAD {
		@Override
		public boolean a(afh afh) {
			return afh instanceof adp && ((adp)afh).c == ss.HEAD;
		}
	},
	WEAPON {
		@Override
		public boolean a(afh afh) {
			return afh instanceof agr;
		}
	},
	DIGGER {
		@Override
		public boolean a(afh afh) {
			return afh instanceof aek;
		}
	},
	FISHING_ROD {
		@Override
		public boolean a(afh afh) {
			return afh instanceof afb;
		}
	},
	BREAKABLE {
		@Override
		public boolean a(afh afh) {
			return afh.n();
		}
	},
	BOW {
		@Override
		public boolean a(afh afh) {
			return afh instanceof aea;
		}
	},
	WEARABLE {
		@Override
		public boolean a(afh afh) {
			boolean boolean3 = afh instanceof adv && ((adv)afh).d() instanceof apu;
			return afh instanceof adp || afh instanceof aeq || afh instanceof agk || boolean3;
		}
	};

	private aij() {
	}

	public abstract boolean a(afh afh);
}
