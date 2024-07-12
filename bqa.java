public class bqa {
	private final bpy[] a = new bpy[ajk.values().length];

	public bqa() {
		this.a[ajk.SOLID.ordinal()] = new bpy(2097152);
		this.a[ajk.CUTOUT.ordinal()] = new bpy(131072);
		this.a[ajk.CUTOUT_MIPPED.ordinal()] = new bpy(131072);
		this.a[ajk.TRANSLUCENT.ordinal()] = new bpy(262144);
	}

	public bpy a(ajk ajk) {
		return this.a[ajk.ordinal()];
	}

	public bpy a(int integer) {
		return this.a[integer];
	}
}
