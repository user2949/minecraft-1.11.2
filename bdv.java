public class bdv {
	public static final bdv a = new bdv(0.0F, 0.0F);
	public static final bdv b = new bdv(1.0F, 1.0F);
	public static final bdv c = new bdv(1.0F, 0.0F);
	public static final bdv d = new bdv(-1.0F, 0.0F);
	public static final bdv e = new bdv(0.0F, 1.0F);
	public static final bdv f = new bdv(0.0F, -1.0F);
	public static final bdv g = new bdv(Float.MAX_VALUE, Float.MAX_VALUE);
	public static final bdv h = new bdv(Float.MIN_VALUE, Float.MIN_VALUE);
	public final float i;
	public final float j;

	public bdv(float float1, float float2) {
		this.i = float1;
		this.j = float2;
	}
}
