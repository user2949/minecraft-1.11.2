package net.minecraft.realms;

public class RealmsVertexFormatElement {
	private final bzk v;

	public RealmsVertexFormatElement(bzk bzk) {
		this.v = bzk;
	}

	public bzk getVertexFormatElement() {
		return this.v;
	}

	public boolean isPosition() {
		return this.v.f();
	}

	public int getIndex() {
		return this.v.d();
	}

	public int getByteSize() {
		return this.v.e();
	}

	public int getCount() {
		return this.v.c();
	}

	public int hashCode() {
		return this.v.hashCode();
	}

	public boolean equals(Object object) {
		return this.v.equals(object);
	}

	public String toString() {
		return this.v.toString();
	}
}
