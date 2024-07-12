public class bto {
	public float[][] a = new float[6][4];
	public float[] b = new float[16];
	public float[] c = new float[16];
	public float[] d = new float[16];

	private double a(float[] arr, double double2, double double3, double double4) {
		return (double)arr[0] * double2 + (double)arr[1] * double3 + (double)arr[2] * double4 + (double)arr[3];
	}

	public boolean b(double double1, double double2, double double3, double double4, double double5, double double6) {
		for (int integer14 = 0; integer14 < 6; integer14++) {
			float[] arr15 = this.a[integer14];
			if (!(this.a(arr15, double1, double2, double3) > 0.0)
				&& !(this.a(arr15, double4, double2, double3) > 0.0)
				&& !(this.a(arr15, double1, double5, double3) > 0.0)
				&& !(this.a(arr15, double4, double5, double3) > 0.0)
				&& !(this.a(arr15, double1, double2, double6) > 0.0)
				&& !(this.a(arr15, double4, double2, double6) > 0.0)
				&& !(this.a(arr15, double1, double5, double6) > 0.0)
				&& !(this.a(arr15, double4, double5, double6) > 0.0)) {
				return false;
			}
		}

		return true;
	}
}
