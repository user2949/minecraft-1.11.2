package net.minecraft.realms;

public class RealmsServerAddress {
	private final String host;
	private final int port;

	protected RealmsServerAddress(String string, int integer) {
		this.host = string;
		this.port = integer;
	}

	public String getHost() {
		return this.host;
	}

	public int getPort() {
		return this.port;
	}

	public static RealmsServerAddress parseString(String string) {
		bns bns2 = bns.a(string);
		return new RealmsServerAddress(bns2.a(), bns2.b());
	}
}
