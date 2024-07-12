import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Set;
import javax.annotation.Nullable;

public class bcl {
	private final float a;
	private final lw b;
	private final bcn c;
	@Nullable
	private final sn d;
	@Nullable
	private final aay e;
	@Nullable
	private final ry f;
	private final Set<bck> g = Sets.newLinkedHashSet();

	public bcl(float float1, lw lw, bcn bcn, @Nullable sn sn, @Nullable aay aay, @Nullable ry ry) {
		this.a = float1;
		this.b = lw;
		this.c = bcn;
		this.d = sn;
		this.e = aay;
		this.f = ry;
	}

	@Nullable
	public sn a() {
		return this.d;
	}

	@Nullable
	public sn b() {
		return this.e;
	}

	@Nullable
	public sn c() {
		return this.f == null ? null : this.f.j();
	}

	public boolean a(bck bck) {
		return this.g.add(bck);
	}

	public void b(bck bck) {
		this.g.remove(bck);
	}

	public bcn e() {
		return this.c;
	}

	public float f() {
		return this.a;
	}

	@Nullable
	public sn a(bcl.b b) {
		switch (b) {
			case THIS:
				return this.a();
			case KILLER:
				return this.c();
			case KILLER_PLAYER:
				return this.b();
			default:
				return null;
		}
	}

	public static class a {
		private final lw a;
		private float b;
		private sn c;
		private aay d;
		private ry e;

		public a(lw lw) {
			this.a = lw;
		}

		public bcl.a a(float float1) {
			this.b = float1;
			return this;
		}

		public bcl.a a(sn sn) {
			this.c = sn;
			return this;
		}

		public bcl.a a(aay aay) {
			this.d = aay;
			return this;
		}

		public bcl.a a(ry ry) {
			this.e = ry;
			return this;
		}

		public bcl a() {
			return new bcl(this.b, this.a, this.a.ak(), this.c, this.d, this.e);
		}
	}

	public static enum b {
		THIS("this"),
		KILLER("killer"),
		KILLER_PLAYER("killer_player");

		private final String d;

		private b(String string3) {
			this.d = string3;
		}

		public static bcl.b a(String string) {
			for (bcl.b b5 : values()) {
				if (b5.d.equals(string)) {
					return b5;
				}
			}

			throw new IllegalArgumentException("Invalid entity target " + string);
		}

		public static class a extends TypeAdapter<bcl.b> {
			public void write(JsonWriter jsonWriter, bcl.b b) throws IOException {
				jsonWriter.value(b.d);
			}

			public bcl.b read(JsonReader jsonReader) throws IOException {
				return bcl.b.a(jsonReader.nextString());
			}
		}
	}
}
