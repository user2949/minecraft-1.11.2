public class ec {
	public static final ec a = new ec(0L) {
		@Override
		public void a(long long1) {
		}
	};
	private final long b;
	private long c;

	public ec(long long1) {
		this.b = long1;
	}

	public void a(long long1) {
		this.c += long1 / 8L;
		if (this.c > this.b) {
			throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
		}
	}
}
