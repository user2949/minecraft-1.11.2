import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class fg {
	private fg a;
	private a b;
	private Boolean c;
	private Boolean d;
	private Boolean e;
	private Boolean f;
	private Boolean g;
	private fa h;
	private fd i;
	private String j;
	private static final fg k = new fg() {
		@Nullable
		@Override
		public a a() {
			return null;
		}

		@Override
		public boolean b() {
			return false;
		}

		@Override
		public boolean c() {
			return false;
		}

		@Override
		public boolean d() {
			return false;
		}

		@Override
		public boolean e() {
			return false;
		}

		@Override
		public boolean f() {
			return false;
		}

		@Nullable
		@Override
		public fa h() {
			return null;
		}

		@Nullable
		@Override
		public fd i() {
			return null;
		}

		@Nullable
		@Override
		public String j() {
			return null;
		}

		@Override
		public fg a(a a) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg a(Boolean boolean1) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg b(Boolean boolean1) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg c(Boolean boolean1) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg d(Boolean boolean1) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg e(Boolean boolean1) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg a(fa fa) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg a(fd fd) {
			throw new UnsupportedOperationException();
		}

		@Override
		public fg a(fg fg) {
			throw new UnsupportedOperationException();
		}

		@Override
		public String toString() {
			return "Style.ROOT";
		}

		@Override
		public fg m() {
			return this;
		}

		@Override
		public fg n() {
			return this;
		}

		@Override
		public String k() {
			return "";
		}
	};

	@Nullable
	public a a() {
		return this.b == null ? this.o().a() : this.b;
	}

	public boolean b() {
		return this.c == null ? this.o().b() : this.c;
	}

	public boolean c() {
		return this.d == null ? this.o().c() : this.d;
	}

	public boolean d() {
		return this.f == null ? this.o().d() : this.f;
	}

	public boolean e() {
		return this.e == null ? this.o().e() : this.e;
	}

	public boolean f() {
		return this.g == null ? this.o().f() : this.g;
	}

	public boolean g() {
		return this.c == null
			&& this.d == null
			&& this.f == null
			&& this.e == null
			&& this.g == null
			&& this.b == null
			&& this.h == null
			&& this.i == null
			&& this.j == null;
	}

	@Nullable
	public fa h() {
		return this.h == null ? this.o().h() : this.h;
	}

	@Nullable
	public fd i() {
		return this.i == null ? this.o().i() : this.i;
	}

	@Nullable
	public String j() {
		return this.j == null ? this.o().j() : this.j;
	}

	public fg a(a a) {
		this.b = a;
		return this;
	}

	public fg a(Boolean boolean1) {
		this.c = boolean1;
		return this;
	}

	public fg b(Boolean boolean1) {
		this.d = boolean1;
		return this;
	}

	public fg c(Boolean boolean1) {
		this.f = boolean1;
		return this;
	}

	public fg d(Boolean boolean1) {
		this.e = boolean1;
		return this;
	}

	public fg e(Boolean boolean1) {
		this.g = boolean1;
		return this;
	}

	public fg a(fa fa) {
		this.h = fa;
		return this;
	}

	public fg a(fd fd) {
		this.i = fd;
		return this;
	}

	public fg a(String string) {
		this.j = string;
		return this;
	}

	public fg a(fg fg) {
		this.a = fg;
		return this;
	}

	public String k() {
		if (this.g()) {
			return this.a != null ? this.a.k() : "";
		} else {
			StringBuilder stringBuilder2 = new StringBuilder();
			if (this.a() != null) {
				stringBuilder2.append(this.a());
			}

			if (this.b()) {
				stringBuilder2.append(a.BOLD);
			}

			if (this.c()) {
				stringBuilder2.append(a.ITALIC);
			}

			if (this.e()) {
				stringBuilder2.append(a.UNDERLINE);
			}

			if (this.f()) {
				stringBuilder2.append(a.OBFUSCATED);
			}

			if (this.d()) {
				stringBuilder2.append(a.STRIKETHROUGH);
			}

			return stringBuilder2.toString();
		}
	}

	private fg o() {
		return this.a == null ? k : this.a;
	}

	public String toString() {
		return "Style{hasParent="
			+ (this.a != null)
			+ ", color="
			+ this.b
			+ ", bold="
			+ this.c
			+ ", italic="
			+ this.d
			+ ", underlined="
			+ this.e
			+ ", obfuscated="
			+ this.g
			+ ", clickEvent="
			+ this.h()
			+ ", hoverEvent="
			+ this.i()
			+ ", insertion="
			+ this.j()
			+ '}';
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (!(object instanceof fg)) {
			return false;
		} else {
			fg fg3 = (fg)object;
			return this.b() == fg3.b()
				&& this.a() == fg3.a()
				&& this.c() == fg3.c()
				&& this.f() == fg3.f()
				&& this.d() == fg3.d()
				&& this.e() == fg3.e()
				&& (this.h() != null ? this.h().equals(fg3.h()) : fg3.h() == null)
				&& (this.i() != null ? this.i().equals(fg3.i()) : fg3.i() == null)
				&& (this.j() != null ? this.j().equals(fg3.j()) : fg3.j() == null);
		}
	}

	public int hashCode() {
		int integer2 = this.b.hashCode();
		integer2 = 31 * integer2 + this.c.hashCode();
		integer2 = 31 * integer2 + this.d.hashCode();
		integer2 = 31 * integer2 + this.e.hashCode();
		integer2 = 31 * integer2 + this.f.hashCode();
		integer2 = 31 * integer2 + this.g.hashCode();
		integer2 = 31 * integer2 + this.h.hashCode();
		integer2 = 31 * integer2 + this.i.hashCode();
		return 31 * integer2 + this.j.hashCode();
	}

	public fg m() {
		fg fg2 = new fg();
		fg2.c = this.c;
		fg2.d = this.d;
		fg2.f = this.f;
		fg2.e = this.e;
		fg2.g = this.g;
		fg2.b = this.b;
		fg2.h = this.h;
		fg2.i = this.i;
		fg2.a = this.a;
		fg2.j = this.j;
		return fg2;
	}

	public fg n() {
		fg fg2 = new fg();
		fg2.a(this.b());
		fg2.b(this.c());
		fg2.c(this.d());
		fg2.d(this.e());
		fg2.e(this.f());
		fg2.a(this.a());
		fg2.a(this.h());
		fg2.a(this.i());
		fg2.a(this.j());
		return fg2;
	}

	public static class a implements JsonDeserializer<fg>, JsonSerializer<fg> {
		@Nullable
		public fg deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
			if (jsonElement.isJsonObject()) {
				fg fg5 = new fg();
				JsonObject jsonObject6 = jsonElement.getAsJsonObject();
				if (jsonObject6 == null) {
					return null;
				} else {
					if (jsonObject6.has("bold")) {
						fg5.c = jsonObject6.get("bold").getAsBoolean();
					}

					if (jsonObject6.has("italic")) {
						fg5.d = jsonObject6.get("italic").getAsBoolean();
					}

					if (jsonObject6.has("underlined")) {
						fg5.e = jsonObject6.get("underlined").getAsBoolean();
					}

					if (jsonObject6.has("strikethrough")) {
						fg5.f = jsonObject6.get("strikethrough").getAsBoolean();
					}

					if (jsonObject6.has("obfuscated")) {
						fg5.g = jsonObject6.get("obfuscated").getAsBoolean();
					}

					if (jsonObject6.has("color")) {
						fg5.b = (a)jsonDeserializationContext.deserialize(jsonObject6.get("color"), a.class);
					}

					if (jsonObject6.has("insertion")) {
						fg5.j = jsonObject6.get("insertion").getAsString();
					}

					if (jsonObject6.has("clickEvent")) {
						JsonObject jsonObject7 = jsonObject6.getAsJsonObject("clickEvent");
						if (jsonObject7 != null) {
							JsonPrimitive jsonPrimitive8 = jsonObject7.getAsJsonPrimitive("action");
							fa.a a9 = jsonPrimitive8 == null ? null : fa.a.a(jsonPrimitive8.getAsString());
							JsonPrimitive jsonPrimitive10 = jsonObject7.getAsJsonPrimitive("value");
							String string11 = jsonPrimitive10 == null ? null : jsonPrimitive10.getAsString();
							if (a9 != null && string11 != null && a9.a()) {
								fg5.h = new fa(a9, string11);
							}
						}
					}

					if (jsonObject6.has("hoverEvent")) {
						JsonObject jsonObject7 = jsonObject6.getAsJsonObject("hoverEvent");
						if (jsonObject7 != null) {
							JsonPrimitive jsonPrimitive8 = jsonObject7.getAsJsonPrimitive("action");
							fd.a a9 = jsonPrimitive8 == null ? null : fd.a.a(jsonPrimitive8.getAsString());
							fb fb10 = (fb)jsonDeserializationContext.deserialize(jsonObject7.get("value"), fb.class);
							if (a9 != null && fb10 != null && a9.a()) {
								fg5.i = new fd(a9, fb10);
							}
						}
					}

					return fg5;
				}
			} else {
				return null;
			}
		}

		@Nullable
		public JsonElement serialize(fg fg, Type type, JsonSerializationContext jsonSerializationContext) {
			if (fg.g()) {
				return null;
			} else {
				JsonObject jsonObject5 = new JsonObject();
				if (fg.c != null) {
					jsonObject5.addProperty("bold", fg.c);
				}

				if (fg.d != null) {
					jsonObject5.addProperty("italic", fg.d);
				}

				if (fg.e != null) {
					jsonObject5.addProperty("underlined", fg.e);
				}

				if (fg.f != null) {
					jsonObject5.addProperty("strikethrough", fg.f);
				}

				if (fg.g != null) {
					jsonObject5.addProperty("obfuscated", fg.g);
				}

				if (fg.b != null) {
					jsonObject5.add("color", jsonSerializationContext.serialize(fg.b));
				}

				if (fg.j != null) {
					jsonObject5.add("insertion", jsonSerializationContext.serialize(fg.j));
				}

				if (fg.h != null) {
					JsonObject jsonObject6 = new JsonObject();
					jsonObject6.addProperty("action", fg.h.a().b());
					jsonObject6.addProperty("value", fg.h.b());
					jsonObject5.add("clickEvent", jsonObject6);
				}

				if (fg.i != null) {
					JsonObject jsonObject6 = new JsonObject();
					jsonObject6.addProperty("action", fg.i.a().b());
					jsonObject6.add("value", jsonSerializationContext.serialize(fg.i.b()));
					jsonObject5.add("hoverEvent", jsonObject6);
				}

				return jsonObject5;
			}
		}
	}
}
