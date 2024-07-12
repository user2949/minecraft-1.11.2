package net.minecraft.realms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsConnect {
	private static final Logger LOGGER = LogManager.getLogger();
	private final RealmsScreen onlineScreen;
	private volatile boolean aborted;
	private er connection;

	public RealmsConnect(RealmsScreen realmsScreen) {
		this.onlineScreen = realmsScreen;
	}

	public void connect(String string, int integer) {
		Realms.setConnectedToRealms(true);
		(new Thread("Realms-connect-task") {
				public void run() {
					InetAddress inetAddress2 = null;
	
					try {
						inetAddress2 = InetAddress.getByName(string);
						if (RealmsConnect.this.aborted) {
							return;
						}
	
						RealmsConnect.this.connection = er.a(inetAddress2, integer, bes.z().u.f());
						if (RealmsConnect.this.aborted) {
							return;
						}
	
						RealmsConnect.this.connection.a(new bnn(RealmsConnect.this.connection, bes.z(), RealmsConnect.this.onlineScreen.getProxy()));
						if (RealmsConnect.this.aborted) {
							return;
						}
	
						RealmsConnect.this.connection.a(new jp(316, string, integer, es.LOGIN));
						if (RealmsConnect.this.aborted) {
							return;
						}
	
						RealmsConnect.this.connection.a(new jy(bes.z().K().e()));
					} catch (UnknownHostException var5) {
						Realms.clearResourcePack();
						if (RealmsConnect.this.aborted) {
							return;
						}
	
						RealmsConnect.LOGGER.error("Couldn't connect to world", var5);
						Realms.setScreen(
							new DisconnectedRealmsScreen(RealmsConnect.this.onlineScreen, "connect.failed", new fi("disconnect.genericReason", "Unknown host '" + string + "'"))
						);
					} catch (Exception var6) {
						Realms.clearResourcePack();
						if (RealmsConnect.this.aborted) {
							return;
						}
	
						RealmsConnect.LOGGER.error("Couldn't connect to world", var6);
						String string4 = var6.toString();
						if (inetAddress2 != null) {
							String string5 = inetAddress2 + ":" + integer;
							string4 = string4.replaceAll(string5, "");
						}
	
						Realms.setScreen(new DisconnectedRealmsScreen(RealmsConnect.this.onlineScreen, "connect.failed", new fi("disconnect.genericReason", string4)));
					}
				}
			})
			.start();
	}

	public void abort() {
		this.aborted = true;
		if (this.connection != null && this.connection.g()) {
			this.connection.a(new fi("disconnect.genericReason"));
			this.connection.l();
		}
	}

	public void tick() {
		if (this.connection != null) {
			if (this.connection.g()) {
				this.connection.a();
			} else {
				this.connection.l();
			}
		}
	}
}
