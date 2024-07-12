package net.minecraft.realms;

import java.nio.ByteBuffer;

public class RealmsBufferBuilder {
	private bpy b;

	public RealmsBufferBuilder(bpy bpy) {
		this.b = bpy;
	}

	public RealmsBufferBuilder from(bpy bpy) {
		this.b = bpy;
		return this;
	}

	public void sortQuads(float float1, float float2, float float3) {
		this.b.a(float1, float2, float3);
	}

	public void fixupQuadColor(int integer) {
		this.b.a(integer);
	}

	public ByteBuffer getBuffer() {
		return this.b.f();
	}

	public void postNormal(float float1, float float2, float float3) {
		this.b.b(float1, float2, float3);
	}

	public int getDrawMode() {
		return this.b.i();
	}

	public void offset(double double1, double double2, double double3) {
		this.b.c(double1, double2, double3);
	}

	public void restoreState(bpy.a a) {
		this.b.a(a);
	}

	public void endVertex() {
		this.b.d();
	}

	public RealmsBufferBuilder normal(float float1, float float2, float float3) {
		return this.from(this.b.c(float1, float2, float3));
	}

	public void end() {
		this.b.e();
	}

	public void begin(int integer, bzj bzj) {
		this.b.a(integer, bzj);
	}

	public RealmsBufferBuilder color(int integer1, int integer2, int integer3, int integer4) {
		return this.from(this.b.b(integer1, integer2, integer3, integer4));
	}

	public void faceTex2(int integer1, int integer2, int integer3, int integer4) {
		this.b.a(integer1, integer2, integer3, integer4);
	}

	public void postProcessFacePosition(double double1, double double2, double double3) {
		this.b.a(double1, double2, double3);
	}

	public void fixupVertexColor(float float1, float float2, float float3, int integer) {
		this.b.b(float1, float2, float3, integer);
	}

	public RealmsBufferBuilder color(float float1, float float2, float float3, float float4) {
		return this.from(this.b.a(float1, float2, float3, float4));
	}

	public RealmsVertexFormat getVertexFormat() {
		return new RealmsVertexFormat(this.b.g());
	}

	public void faceTint(float float1, float float2, float float3, int integer) {
		this.b.a(float1, float2, float3, integer);
	}

	public RealmsBufferBuilder tex2(int integer1, int integer2) {
		return this.from(this.b.a(integer1, integer2));
	}

	public void putBulkData(int[] arr) {
		this.b.a(arr);
	}

	public RealmsBufferBuilder tex(double double1, double double2) {
		return this.from(this.b.a(double1, double2));
	}

	public int getVertexCount() {
		return this.b.h();
	}

	public void clear() {
		this.b.b();
	}

	public RealmsBufferBuilder vertex(double double1, double double2, double double3) {
		return this.from(this.b.b(double1, double2, double3));
	}

	public void fixupQuadColor(float float1, float float2, float float3) {
		this.b.d(float1, float2, float3);
	}

	public void noColor() {
		this.b.c();
	}
}
