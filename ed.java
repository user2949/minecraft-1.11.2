import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ed {
	public static du a(InputStream inputStream) throws IOException {
		DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));

		du var2;
		try {
			var2 = a(dataInputStream2, ec.a);
		} finally {
			dataInputStream2.close();
		}

		return var2;
	}

	public static void a(du du, OutputStream outputStream) throws IOException {
		DataOutputStream dataOutputStream3 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));

		try {
			a(du, dataOutputStream3);
		} finally {
			dataOutputStream3.close();
		}
	}

	public static void a(du du, File file) throws IOException {
		File file3 = new File(file.getAbsolutePath() + "_tmp");
		if (file3.exists()) {
			file3.delete();
		}

		b(du, file3);
		if (file.exists()) {
			file.delete();
		}

		if (file.exists()) {
			throw new IOException("Failed to delete " + file);
		} else {
			file3.renameTo(file);
		}
	}

	public static void b(du du, File file) throws IOException {
		DataOutputStream dataOutputStream3 = new DataOutputStream(new FileOutputStream(file));

		try {
			a(du, dataOutputStream3);
		} finally {
			dataOutputStream3.close();
		}
	}

	public static du a(File file) throws IOException {
		if (!file.exists()) {
			return null;
		} else {
			DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));

			du var2;
			try {
				var2 = a(dataInputStream2, ec.a);
			} finally {
				dataInputStream2.close();
			}

			return var2;
		}
	}

	public static du a(DataInputStream dataInputStream) throws IOException {
		return a(dataInputStream, ec.a);
	}

	public static du a(DataInput dataInput, ec ec) throws IOException {
		ei ei3 = a(dataInput, 0, ec);
		if (ei3 instanceof du) {
			return (du)ei3;
		} else {
			throw new IOException("Root tag must be a named compound tag");
		}
	}

	public static void a(du du, DataOutput dataOutput) throws IOException {
		a((ei)du, dataOutput);
	}

	private static void a(ei ei, DataOutput dataOutput) throws IOException {
		dataOutput.writeByte(ei.a());
		if (ei.a() != 0) {
			dataOutput.writeUTF("");
			ei.a(dataOutput);
		}
	}

	private static ei a(DataInput dataInput, int integer, ec ec) throws IOException {
		byte byte4 = dataInput.readByte();
		if (byte4 == 0) {
			return new dw();
		} else {
			dataInput.readUTF();
			ei ei5 = ei.a(byte4);

			try {
				ei5.a(dataInput, integer, ec);
				return ei5;
			} catch (IOException var8) {
				b b7 = b.a(var8, "Loading NBT data");
				c c8 = b7.a("NBT Tag");
				c8.a("Tag name", "[UNNAMED TAG]");
				c8.a("Tag type", byte4);
				throw new f(b7);
			}
		}
	}
}
