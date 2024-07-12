package net.minecraft.realms;

import com.google.common.collect.Lists;
import java.util.List;

public class RealmsVertexFormat {
	private bzj v;

	public RealmsVertexFormat(bzj bzj) {
		this.v = bzj;
	}

	public RealmsVertexFormat from(bzj bzj) {
		this.v = bzj;
		return this;
	}

	public bzj getVertexFormat() {
		return this.v;
	}

	public void clear() {
		this.v.a();
	}

	public int getUvOffset(int integer) {
		return this.v.b(integer);
	}

	public int getElementCount() {
		return this.v.i();
	}

	public boolean hasColor() {
		return this.v.d();
	}

	public boolean hasUv(int integer) {
		return this.v.a(integer);
	}

	public RealmsVertexFormatElement getElement(int integer) {
		return new RealmsVertexFormatElement(this.v.c(integer));
	}

	public RealmsVertexFormat addElement(RealmsVertexFormatElement realmsVertexFormatElement) {
		return this.from(this.v.a(realmsVertexFormatElement.getVertexFormatElement()));
	}

	public int getColorOffset() {
		return this.v.e();
	}

	public List<RealmsVertexFormatElement> getElements() {
		List<RealmsVertexFormatElement> list2 = Lists.newArrayList();

		for (bzk bzk4 : this.v.h()) {
			list2.add(new RealmsVertexFormatElement(bzk4));
		}

		return list2;
	}

	public boolean hasNormal() {
		return this.v.b();
	}

	public int getVertexSize() {
		return this.v.g();
	}

	public int getOffset(int integer) {
		return this.v.d(integer);
	}

	public int getNormalOffset() {
		return this.v.c();
	}

	public int getIntegerSize() {
		return this.v.f();
	}

	public boolean equals(Object object) {
		return this.v.equals(object);
	}

	public int hashCode() {
		return this.v.hashCode();
	}

	public String toString() {
		return this.v.toString();
	}
}
