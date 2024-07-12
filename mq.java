import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class mq extends mx<String, mr> {
	public mq(File file) {
		super(file);
	}

	@Override
	protected mw<String> a(JsonObject jsonObject) {
		return new mr(jsonObject);
	}

	public boolean a(SocketAddress socketAddress) {
		String string3 = this.c(socketAddress);
		return this.d(string3);
	}

	public mr b(SocketAddress socketAddress) {
		String string3 = this.c(socketAddress);
		return this.b(string3);
	}

	private String c(SocketAddress socketAddress) {
		String string3 = socketAddress.toString();
		if (string3.contains("/")) {
			string3 = string3.substring(string3.indexOf(47) + 1);
		}

		if (string3.contains(":")) {
			string3 = string3.substring(0, string3.indexOf(58));
		}

		return string3;
	}
}
