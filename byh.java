import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.lwjgl.util.vector.Matrix4f;

public class byh {
	private final bqr a;
	private final bzy b;
	private final String c;
	private final List<byi> d = Lists.newArrayList();
	private final Map<String, bqr> e = Maps.newHashMap();
	private final List<bqr> f = Lists.newArrayList();
	private Matrix4f g;
	private int h;
	private int i;
	private float j;
	private float k;

	public byh(bza bza, bzy bzy, bqr bqr, kq kq) throws IOException, JsonSyntaxException {
		this.b = bzy;
		this.a = bqr;
		this.j = 0.0F;
		this.k = 0.0F;
		this.h = bqr.c;
		this.i = bqr.d;
		this.c = kq.toString();
		this.c();
		this.a(bza, kq);
	}

	public void a(bza bza, kq kq) throws IOException, JsonSyntaxException {
		JsonParser jsonParser4 = new JsonParser();
		bzx bzx5 = null;

		try {
			bzx5 = this.b.a(kq);
			JsonObject jsonObject6 = jsonParser4.parse(IOUtils.toString(bzx5.b(), Charsets.UTF_8)).getAsJsonObject();
			if (ok.d(jsonObject6, "targets")) {
				JsonArray jsonArray7 = jsonObject6.getAsJsonArray("targets");
				int integer8 = 0;

				for (JsonElement jsonElement10 : jsonArray7) {
					try {
						this.a(jsonElement10);
					} catch (Exception var18) {
						ku ku12 = ku.a(var18);
						ku12.a("targets[" + integer8 + "]");
						throw ku12;
					}

					integer8++;
				}
			}

			if (ok.d(jsonObject6, "passes")) {
				JsonArray jsonArray7 = jsonObject6.getAsJsonArray("passes");
				int integer8 = 0;

				for (JsonElement jsonElement10 : jsonArray7) {
					try {
						this.a(bza, jsonElement10);
					} catch (Exception var17) {
						ku ku12 = ku.a(var17);
						ku12.a("passes[" + integer8 + "]");
						throw ku12;
					}

					integer8++;
				}
			}
		} catch (Exception var19) {
			ku ku7 = ku.a(var19);
			ku7.b(kq.a());
			throw ku7;
		} finally {
			IOUtils.closeQuietly(bzx5);
		}
	}

	private void a(JsonElement jsonElement) throws ku {
		if (ok.a(jsonElement)) {
			this.a(jsonElement.getAsString(), this.h, this.i);
		} else {
			JsonObject jsonObject3 = ok.m(jsonElement, "target");
			String string4 = ok.h(jsonObject3, "name");
			int integer5 = ok.a(jsonObject3, "width", this.h);
			int integer6 = ok.a(jsonObject3, "height", this.i);
			if (this.e.containsKey(string4)) {
				throw new ku(string4 + " is already defined");
			}

			this.a(string4, integer5, integer6);
		}
	}

	private void a(bza bza, JsonElement jsonElement) throws IOException {
		JsonObject jsonObject4 = ok.m(jsonElement, "pass");
		String string5 = ok.h(jsonObject4, "name");
		String string6 = ok.h(jsonObject4, "intarget");
		String string7 = ok.h(jsonObject4, "outtarget");
		bqr bqr8 = this.b(string6);
		bqr bqr9 = this.b(string7);
		if (bqr8 == null) {
			throw new ku("Input target '" + string6 + "' does not exist");
		} else if (bqr9 == null) {
			throw new ku("Output target '" + string7 + "' does not exist");
		} else {
			byi byi10 = this.a(string5, bqr8, bqr9);
			JsonArray jsonArray11 = ok.a(jsonObject4, "auxtargets", null);
			if (jsonArray11 != null) {
				int integer12 = 0;

				for (JsonElement jsonElement14 : jsonArray11) {
					try {
						JsonObject jsonObject15 = ok.m(jsonElement14, "auxtarget");
						String string16 = ok.h(jsonObject15, "name");
						String string17 = ok.h(jsonObject15, "id");
						bqr bqr18 = this.b(string17);
						if (bqr18 == null) {
							kq kq19 = new kq("textures/effect/" + string17 + ".png");
							bzx bzx20 = null;

							try {
								bzx20 = this.b.a(kq19);
							} catch (FileNotFoundException var29) {
								throw new ku("Render target or texture '" + string17 + "' does not exist");
							} finally {
								IOUtils.closeQuietly(bzx20);
							}

							bza.a(kq19);
							bzb bzb21 = bza.b(kq19);
							int integer22 = ok.n(jsonObject15, "width");
							int integer23 = ok.n(jsonObject15, "height");
							boolean boolean24 = ok.j(jsonObject15, "bilinear");
							if (boolean24) {
								bqg.b(3553, 10241, 9729);
								bqg.b(3553, 10240, 9729);
							} else {
								bqg.b(3553, 10241, 9728);
								bqg.b(3553, 10240, 9728);
							}

							byi10.a(string16, bzb21.b(), integer22, integer23);
						} else {
							byi10.a(string16, bqr18, bqr18.a, bqr18.b);
						}
					} catch (Exception var31) {
						ku ku16 = ku.a(var31);
						ku16.a("auxtargets[" + integer12 + "]");
						throw ku16;
					}

					integer12++;
				}
			}

			JsonArray jsonArray12 = ok.a(jsonObject4, "uniforms", null);
			if (jsonArray12 != null) {
				int integer13 = 0;

				for (JsonElement jsonElement15 : jsonArray12) {
					try {
						this.b(jsonElement15);
					} catch (Exception var28) {
						ku ku17 = ku.a(var28);
						ku17.a("uniforms[" + integer13 + "]");
						throw ku17;
					}

					integer13++;
				}
			}
		}
	}

	private void b(JsonElement jsonElement) throws ku {
		JsonObject jsonObject3 = ok.m(jsonElement, "uniform");
		String string4 = ok.h(jsonObject3, "name");
		byl byl5 = ((byi)this.d.get(this.d.size() - 1)).c().a(string4);
		if (byl5 == null) {
			throw new ku("Uniform '" + string4 + "' does not exist");
		} else {
			float[] arr6 = new float[4];
			int integer7 = 0;

			for (JsonElement jsonElement10 : ok.u(jsonObject3, "values")) {
				try {
					arr6[integer7] = ok.e(jsonElement10, "value");
				} catch (Exception var12) {
					ku ku12 = ku.a(var12);
					ku12.a("values[" + integer7 + "]");
					throw ku12;
				}

				integer7++;
			}

			switch (integer7) {
				case 0:
				default:
					break;
				case 1:
					byl5.a(arr6[0]);
					break;
				case 2:
					byl5.a(arr6[0], arr6[1]);
					break;
				case 3:
					byl5.a(arr6[0], arr6[1], arr6[2]);
					break;
				case 4:
					byl5.a(arr6[0], arr6[1], arr6[2], arr6[3]);
			}
		}
	}

	public bqr a(String string) {
		return (bqr)this.e.get(string);
	}

	public void a(String string, int integer2, int integer3) {
		bqr bqr5 = new bqr(integer2, integer3, true);
		bqr5.a(0.0F, 0.0F, 0.0F, 0.0F);
		this.e.put(string, bqr5);
		if (integer2 == this.h && integer3 == this.i) {
			this.f.add(bqr5);
		}
	}

	public void a() {
		for (bqr bqr3 : this.e.values()) {
			bqr3.a();
		}

		for (byi byi3 : this.d) {
			byi3.b();
		}

		this.d.clear();
	}

	public byi a(String string, bqr bqr2, bqr bqr3) throws IOException {
		byi byi5 = new byi(this.b, string, bqr2, bqr3);
		this.d.add(this.d.size(), byi5);
		return byi5;
	}

	private void c() {
		this.g = new Matrix4f();
		this.g.setIdentity();
		this.g.m00 = 2.0F / (float)this.a.a;
		this.g.m11 = 2.0F / (float)(-this.a.b);
		this.g.m22 = -0.0020001999F;
		this.g.m33 = 1.0F;
		this.g.m03 = -1.0F;
		this.g.m13 = 1.0F;
		this.g.m23 = -1.0001999F;
	}

	public void a(int integer1, int integer2) {
		this.h = this.a.a;
		this.i = this.a.b;
		this.c();

		for (byi byi5 : this.d) {
			byi5.a(this.g);
		}

		for (bqr bqr5 : this.f) {
			bqr5.a(integer1, integer2);
		}
	}

	public void a(float float1) {
		if (float1 < this.k) {
			this.j = this.j + (1.0F - this.k);
			this.j += float1;
		} else {
			this.j = this.j + (float1 - this.k);
		}

		this.k = float1;

		while (this.j > 20.0F) {
			this.j -= 20.0F;
		}

		for (byi byi4 : this.d) {
			byi4.a(this.j / 20.0F);
		}
	}

	public final String b() {
		return this.c;
	}

	private bqr b(String string) {
		if (string == null) {
			return null;
		} else {
			return string.equals("minecraft:main") ? this.a : (bqr)this.e.get(string);
		}
	}
}
