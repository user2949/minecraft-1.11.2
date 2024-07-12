import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class byu {
	public final int a;
	public final int b;

	public byu(InputStream inputStream) throws IOException {
		DataInputStream dataInputStream3 = new DataInputStream(inputStream);
		if (dataInputStream3.readLong() != -8552249625308161526L) {
			throw new IOException("Bad PNG Signature");
		} else if (dataInputStream3.readInt() != 13) {
			throw new IOException("Bad length for IHDR chunk!");
		} else if (dataInputStream3.readInt() != 1229472850) {
			throw new IOException("Bad type for IHDR chunk!");
		} else {
			this.a = dataInputStream3.readInt();
			this.b = dataInputStream3.readInt();
			IOUtils.closeQuietly(dataInputStream3);
		}
	}

	public static byu a(bzx bzx) throws IOException {
		byu var1;
		try {
			var1 = new byu(bzx.b());
		} finally {
			IOUtils.closeQuietly(bzx);
		}

		return var1;
	}
}
