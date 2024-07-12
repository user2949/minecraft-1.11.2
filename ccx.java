import org.lwjgl.util.vector.Matrix4f;

public class ccx extends Matrix4f {
	public ccx(float[] arr) {
		this.m00 = arr[0];
		this.m01 = arr[1];
		this.m02 = arr[2];
		this.m03 = arr[3];
		this.m10 = arr[4];
		this.m11 = arr[5];
		this.m12 = arr[6];
		this.m13 = arr[7];
		this.m20 = arr[8];
		this.m21 = arr[9];
		this.m22 = arr[10];
		this.m23 = arr[11];
		this.m30 = arr[12];
		this.m31 = arr[13];
		this.m32 = arr[14];
		this.m33 = arr[15];
	}

	public ccx() {
		this.m00 = 0.0F;
		this.m01 = 0.0F;
		this.m02 = 0.0F;
		this.m03 = 0.0F;
		this.m10 = 0.0F;
		this.m11 = 0.0F;
		this.m12 = 0.0F;
		this.m13 = 0.0F;
		this.m20 = 0.0F;
		this.m21 = 0.0F;
		this.m22 = 0.0F;
		this.m23 = 0.0F;
		this.m30 = 0.0F;
		this.m31 = 0.0F;
		this.m32 = 0.0F;
		this.m33 = 0.0F;
	}
}
