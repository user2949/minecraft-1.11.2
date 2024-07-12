import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.apache.commons.io.IOUtils;

public class bfg implements bzz {
	private static final kq[] c = new kq[256];
	private final int[] d = new int[256];
	public int a = 9;
	public Random b = new Random();
	private final byte[] e = new byte[65536];
	private final int[] f = new int[32];
	private final kq g;
	private final bza h;
	private float i;
	private float j;
	private boolean k;
	private boolean l;
	private float m;
	private float n;
	private float o;
	private float p;
	private int q;
	private boolean r;
	private boolean s;
	private boolean t;
	private boolean u;
	private boolean v;

	public bfg(beu beu, kq kq, bza bza, boolean boolean4) {
		this.g = kq;
		this.h = bza;
		this.k = boolean4;
		bza.a(this.g);

		for (int integer6 = 0; integer6 < 32; integer6++) {
			int integer7 = (integer6 >> 3 & 1) * 85;
			int integer8 = (integer6 >> 2 & 1) * 170 + integer7;
			int integer9 = (integer6 >> 1 & 1) * 170 + integer7;
			int integer10 = (integer6 >> 0 & 1) * 170 + integer7;
			if (integer6 == 6) {
				integer8 += 85;
			}

			if (beu.f) {
				int integer11 = (integer8 * 30 + integer9 * 59 + integer10 * 11) / 100;
				int integer12 = (integer8 * 30 + integer9 * 70) / 100;
				int integer13 = (integer8 * 30 + integer10 * 70) / 100;
				integer8 = integer11;
				integer9 = integer12;
				integer10 = integer13;
			}

			if (integer6 >= 16) {
				integer8 /= 4;
				integer9 /= 4;
				integer10 /= 4;
			}

			this.f[integer6] = (integer8 & 0xFF) << 16 | (integer9 & 0xFF) << 8 | integer10 & 0xFF;
		}

		this.d();
	}

	@Override
	public void a(bzy bzy) {
		this.c();
		this.d();
	}

	private void c() {
		bzx bzx3 = null;

		BufferedImage bufferedImage2;
		try {
			bzx3 = bes.z().O().a(this.g);
			bufferedImage2 = bzc.a(bzx3.b());
		} catch (IOException var20) {
			throw new RuntimeException(var20);
		} finally {
			IOUtils.closeQuietly(bzx3);
		}

		int integer4 = bufferedImage2.getWidth();
		int integer5 = bufferedImage2.getHeight();
		int[] arr6 = new int[integer4 * integer5];
		bufferedImage2.getRGB(0, 0, integer4, integer5, arr6, 0, integer4);
		int integer7 = integer5 / 16;
		int integer8 = integer4 / 16;
		boolean integer9 = true;
		float float10 = 8.0F / (float)integer8;

		for (int integer11 = 0; integer11 < 256; integer11++) {
			int integer12 = integer11 % 16;
			int integer13 = integer11 / 16;
			if (integer11 == 32) {
				this.d[integer11] = 4;
			}

			int integer14;
			for (integer14 = integer8 - 1; integer14 >= 0; integer14--) {
				int integer15 = integer12 * integer8 + integer14;
				boolean boolean16 = true;

				for (int integer17 = 0; integer17 < integer7 && boolean16; integer17++) {
					int integer18 = (integer13 * integer8 + integer17) * integer4;
					if ((arr6[integer15 + integer18] >> 24 & 0xFF) != 0) {
						boolean16 = false;
					}
				}

				if (!boolean16) {
					break;
				}
			}

			this.d[integer11] = (int)(0.5 + (double)((float)(++integer14) * float10)) + 1;
		}
	}

	private void d() {
		bzx bzx2 = null;

		try {
			bzx2 = bes.z().O().a(new kq("font/glyph_sizes.bin"));
			bzx2.b().read(this.e);
		} catch (IOException var6) {
			throw new RuntimeException(var6);
		} finally {
			IOUtils.closeQuietly(bzx2);
		}
	}

	private float a(char character, boolean boolean2) {
		if (character == ' ') {
			return 4.0F;
		} else {
			int integer4 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
				.indexOf(character);
			return integer4 != -1 && !this.k ? this.a(integer4, boolean2) : this.b(character, boolean2);
		}
	}

	private float a(int integer, boolean boolean2) {
		int integer4 = integer % 16 * 8;
		int integer5 = integer / 16 * 8;
		int integer6 = boolean2 ? 1 : 0;
		this.h.a(this.g);
		int integer7 = this.d[integer];
		float float8 = (float)integer7 - 0.01F;
		bqg.r(5);
		bqg.b((float)integer4 / 128.0F, (float)integer5 / 128.0F);
		bqg.e(this.i + (float)integer6, this.j, 0.0F);
		bqg.b((float)integer4 / 128.0F, ((float)integer5 + 7.99F) / 128.0F);
		bqg.e(this.i - (float)integer6, this.j + 7.99F, 0.0F);
		bqg.b(((float)integer4 + float8 - 1.0F) / 128.0F, (float)integer5 / 128.0F);
		bqg.e(this.i + float8 - 1.0F + (float)integer6, this.j, 0.0F);
		bqg.b(((float)integer4 + float8 - 1.0F) / 128.0F, ((float)integer5 + 7.99F) / 128.0F);
		bqg.e(this.i + float8 - 1.0F - (float)integer6, this.j + 7.99F, 0.0F);
		bqg.J();
		return (float)integer7;
	}

	private kq a(int integer) {
		if (c[integer] == null) {
			c[integer] = new kq(String.format("textures/font/unicode_page_%02x.png", integer));
		}

		return c[integer];
	}

	private void b(int integer) {
		this.h.a(this.a(integer));
	}

	private float b(char character, boolean boolean2) {
		int integer4 = this.e[character] & 255;
		if (integer4 == 0) {
			return 0.0F;
		} else {
			int integer5 = character / 256;
			this.b(integer5);
			int integer6 = integer4 >>> 4;
			int integer7 = integer4 & 15;
			float float8 = (float)integer6;
			float float9 = (float)(integer7 + 1);
			float float10 = (float)(character % 16 * 16) + float8;
			float float11 = (float)((character & 255) / 16 * 16);
			float float12 = float9 - float8 - 0.02F;
			float float13 = boolean2 ? 1.0F : 0.0F;
			bqg.r(5);
			bqg.b(float10 / 256.0F, float11 / 256.0F);
			bqg.e(this.i + float13, this.j, 0.0F);
			bqg.b(float10 / 256.0F, (float11 + 15.98F) / 256.0F);
			bqg.e(this.i - float13, this.j + 7.99F, 0.0F);
			bqg.b((float10 + float12) / 256.0F, float11 / 256.0F);
			bqg.e(this.i + float12 / 2.0F + float13, this.j, 0.0F);
			bqg.b((float10 + float12) / 256.0F, (float11 + 15.98F) / 256.0F);
			bqg.e(this.i + float12 / 2.0F - float13, this.j + 7.99F, 0.0F);
			bqg.J();
			return (float9 - float8) / 2.0F + 1.0F;
		}
	}

	public int a(String string, float float2, float float3, int integer) {
		return this.a(string, float2, float3, integer, true);
	}

	public int a(String string, int integer2, int integer3, int integer4) {
		return this.a(string, (float)integer2, (float)integer3, integer4, false);
	}

	public int a(String string, float float2, float float3, int integer, boolean boolean5) {
		bqg.e();
		this.e();
		int integer7;
		if (boolean5) {
			integer7 = this.b(string, float2 + 1.0F, float3 + 1.0F, integer, true);
			integer7 = Math.max(integer7, this.b(string, float2, float3, integer, false));
		} else {
			integer7 = this.b(string, float2, float3, integer, false);
		}

		return integer7;
	}

	private String c(String string) {
		try {
			Bidi bidi3 = new Bidi(new ArabicShaping(8).shape(string), 127);
			bidi3.setReorderingMode(0);
			return bidi3.writeReordered(2);
		} catch (ArabicShapingException var3) {
			return string;
		}
	}

	private void e() {
		this.r = false;
		this.s = false;
		this.t = false;
		this.u = false;
		this.v = false;
	}

	private void a(String string, boolean boolean2) {
		for (int integer4 = 0; integer4 < string.length(); integer4++) {
			char character5 = string.charAt(integer4);
			if (character5 == 167 && integer4 + 1 < string.length()) {
				int integer6 = "0123456789abcdefklmnor".indexOf(String.valueOf(string.charAt(integer4 + 1)).toLowerCase(Locale.ROOT).charAt(0));
				if (integer6 < 16) {
					this.r = false;
					this.s = false;
					this.v = false;
					this.u = false;
					this.t = false;
					if (integer6 < 0 || integer6 > 15) {
						integer6 = 15;
					}

					if (boolean2) {
						integer6 += 16;
					}

					int integer7 = this.f[integer6];
					this.q = integer7;
					bqg.c((float)(integer7 >> 16) / 255.0F, (float)(integer7 >> 8 & 0xFF) / 255.0F, (float)(integer7 & 0xFF) / 255.0F, this.p);
				} else if (integer6 == 16) {
					this.r = true;
				} else if (integer6 == 17) {
					this.s = true;
				} else if (integer6 == 18) {
					this.v = true;
				} else if (integer6 == 19) {
					this.u = true;
				} else if (integer6 == 20) {
					this.t = true;
				} else if (integer6 == 21) {
					this.r = false;
					this.s = false;
					this.v = false;
					this.u = false;
					this.t = false;
					bqg.c(this.m, this.n, this.o, this.p);
				}

				integer4++;
			} else {
				int integer6 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
					.indexOf(character5);
				if (this.r && integer6 != -1) {
					int integer7 = this.a(character5);

					char character8;
					do {
						integer6 = this.b
							.nextInt(
								"ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
									.length()
							);
						character8 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
							.charAt(integer6);
					} while (integer7 != this.a(character8));

					character5 = character8;
				}

				float float7 = this.k ? 0.5F : 1.0F;
				boolean boolean8 = (character5 == 0 || integer6 == -1 || this.k) && boolean2;
				if (boolean8) {
					this.i -= float7;
					this.j -= float7;
				}

				float float9 = this.a(character5, this.t);
				if (boolean8) {
					this.i += float7;
					this.j += float7;
				}

				if (this.s) {
					this.i += float7;
					if (boolean8) {
						this.i -= float7;
						this.j -= float7;
					}

					this.a(character5, this.t);
					this.i -= float7;
					if (boolean8) {
						this.i += float7;
						this.j += float7;
					}

					float9++;
				}

				if (this.v) {
					bqs bqs10 = bqs.a();
					bpy bpy11 = bqs10.c();
					bqg.z();
					bpy11.a(7, bzh.e);
					bpy11.b((double)this.i, (double)(this.j + (float)(this.a / 2)), 0.0).d();
					bpy11.b((double)(this.i + float9), (double)(this.j + (float)(this.a / 2)), 0.0).d();
					bpy11.b((double)(this.i + float9), (double)(this.j + (float)(this.a / 2) - 1.0F), 0.0).d();
					bpy11.b((double)this.i, (double)(this.j + (float)(this.a / 2) - 1.0F), 0.0).d();
					bqs10.b();
					bqg.y();
				}

				if (this.u) {
					bqs bqs10 = bqs.a();
					bpy bpy11 = bqs10.c();
					bqg.z();
					bpy11.a(7, bzh.e);
					int integer12 = this.u ? -1 : 0;
					bpy11.b((double)(this.i + (float)integer12), (double)(this.j + (float)this.a), 0.0).d();
					bpy11.b((double)(this.i + float9), (double)(this.j + (float)this.a), 0.0).d();
					bpy11.b((double)(this.i + float9), (double)(this.j + (float)this.a - 1.0F), 0.0).d();
					bpy11.b((double)(this.i + (float)integer12), (double)(this.j + (float)this.a - 1.0F), 0.0).d();
					bqs10.b();
					bqg.y();
				}

				this.i += (float)((int)float9);
			}
		}
	}

	private int a(String string, int integer2, int integer3, int integer4, int integer5, boolean boolean6) {
		if (this.l) {
			int integer8 = this.a(this.c(string));
			integer2 = integer2 + integer4 - integer8;
		}

		return this.b(string, (float)integer2, (float)integer3, integer5, boolean6);
	}

	private int b(String string, float float2, float float3, int integer, boolean boolean5) {
		if (string == null) {
			return 0;
		} else {
			if (this.l) {
				string = this.c(string);
			}

			if ((integer & -67108864) == 0) {
				integer |= -16777216;
			}

			if (boolean5) {
				integer = (integer & 16579836) >> 2 | integer & 0xFF000000;
			}

			this.m = (float)(integer >> 16 & 0xFF) / 255.0F;
			this.n = (float)(integer >> 8 & 0xFF) / 255.0F;
			this.o = (float)(integer & 0xFF) / 255.0F;
			this.p = (float)(integer >> 24 & 0xFF) / 255.0F;
			bqg.c(this.m, this.n, this.o, this.p);
			this.i = float2;
			this.j = float3;
			this.a(string, boolean5);
			return (int)this.i;
		}
	}

	public int a(String string) {
		if (string == null) {
			return 0;
		} else {
			int integer3 = 0;
			boolean boolean4 = false;

			for (int integer5 = 0; integer5 < string.length(); integer5++) {
				char character6 = string.charAt(integer5);
				int integer7 = this.a(character6);
				if (integer7 < 0 && integer5 < string.length() - 1) {
					character6 = string.charAt(++integer5);
					if (character6 == 'l' || character6 == 'L') {
						boolean4 = true;
					} else if (character6 == 'r' || character6 == 'R') {
						boolean4 = false;
					}

					integer7 = 0;
				}

				integer3 += integer7;
				if (boolean4 && integer7 > 0) {
					integer3++;
				}
			}

			return integer3;
		}
	}

	public int a(char character) {
		if (character == 167) {
			return -1;
		} else if (character == ' ') {
			return 4;
		} else {
			int integer3 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
				.indexOf(character);
			if (character > 0 && integer3 != -1 && !this.k) {
				return this.d[integer3];
			} else if (this.e[character] != 0) {
				int integer4 = this.e[character] & 255;
				int integer5 = integer4 >>> 4;
				int integer6 = integer4 & 15;
				integer6++;
				return (integer6 - integer5) / 2 + 1;
			} else {
				return 0;
			}
		}
	}

	public String a(String string, int integer) {
		return this.a(string, integer, false);
	}

	public String a(String string, int integer, boolean boolean3) {
		StringBuilder stringBuilder5 = new StringBuilder();
		int integer6 = 0;
		int integer7 = boolean3 ? string.length() - 1 : 0;
		int integer8 = boolean3 ? -1 : 1;
		boolean boolean9 = false;
		boolean boolean10 = false;

		for (int integer11 = integer7; integer11 >= 0 && integer11 < string.length() && integer6 < integer; integer11 += integer8) {
			char character12 = string.charAt(integer11);
			int integer13 = this.a(character12);
			if (boolean9) {
				boolean9 = false;
				if (character12 == 'l' || character12 == 'L') {
					boolean10 = true;
				} else if (character12 == 'r' || character12 == 'R') {
					boolean10 = false;
				}
			} else if (integer13 < 0) {
				boolean9 = true;
			} else {
				integer6 += integer13;
				if (boolean10) {
					integer6++;
				}
			}

			if (integer6 > integer) {
				break;
			}

			if (boolean3) {
				stringBuilder5.insert(0, character12);
			} else {
				stringBuilder5.append(character12);
			}
		}

		return stringBuilder5.toString();
	}

	private String d(String string) {
		while (string != null && string.endsWith("\n")) {
			string = string.substring(0, string.length() - 1);
		}

		return string;
	}

	public void a(String string, int integer2, int integer3, int integer4, int integer5) {
		this.e();
		this.q = integer5;
		string = this.d(string);
		this.a(string, integer2, integer3, integer4, false);
	}

	private void a(String string, int integer2, int integer3, int integer4, boolean boolean5) {
		for (String string9 : this.c(string, integer4)) {
			this.a(string9, integer2, integer3, integer4, this.q, boolean5);
			integer3 += this.a;
		}
	}

	public int b(String string, int integer) {
		return this.a * this.c(string, integer).size();
	}

	public void a(boolean boolean1) {
		this.k = boolean1;
	}

	public boolean a() {
		return this.k;
	}

	public void b(boolean boolean1) {
		this.l = boolean1;
	}

	public List<String> c(String string, int integer) {
		return Arrays.asList(this.d(string, integer).split("\n"));
	}

	String d(String string, int integer) {
		int integer4 = this.e(string, integer);
		if (string.length() <= integer4) {
			return string;
		} else {
			String string5 = string.substring(0, integer4);
			char character6 = string.charAt(integer4);
			boolean boolean7 = character6 == ' ' || character6 == '\n';
			String string8 = b(string5) + string.substring(integer4 + (boolean7 ? 1 : 0));
			return string5 + "\n" + this.d(string8, integer);
		}
	}

	private int e(String string, int integer) {
		int integer4 = string.length();
		int integer5 = 0;
		int integer6 = 0;
		int integer7 = -1;

		for (boolean boolean8 = false; integer6 < integer4; integer6++) {
			char character9 = string.charAt(integer6);
			switch (character9) {
				case '\n':
					integer6--;
					break;
				case ' ':
					integer7 = integer6;
				default:
					integer5 += this.a(character9);
					if (boolean8) {
						integer5++;
					}
					break;
				case '§':
					if (integer6 < integer4 - 1) {
						char character10 = string.charAt(++integer6);
						if (character10 == 'l' || character10 == 'L') {
							boolean8 = true;
						} else if (character10 == 'r' || character10 == 'R' || c(character10)) {
							boolean8 = false;
						}
					}
			}

			if (character9 == '\n') {
				integer7 = ++integer6;
				break;
			}

			if (integer5 > integer) {
				break;
			}
		}

		return integer6 != integer4 && integer7 != -1 && integer7 < integer6 ? integer7 : integer6;
	}

	private static boolean c(char character) {
		return character >= '0' && character <= '9' || character >= 'a' && character <= 'f' || character >= 'A' && character <= 'F';
	}

	private static boolean d(char character) {
		return character >= 'k' && character <= 'o' || character >= 'K' && character <= 'O' || character == 'r' || character == 'R';
	}

	public static String b(String string) {
		String string2 = "";
		int integer3 = -1;
		int integer4 = string.length();

		while ((integer3 = string.indexOf(167, integer3 + 1)) != -1) {
			if (integer3 < integer4 - 1) {
				char character5 = string.charAt(integer3 + 1);
				if (c(character5)) {
					string2 = "§" + character5;
				} else if (d(character5)) {
					string2 = string2 + "§" + character5;
				}
			}
		}

		return string2;
	}

	public boolean b() {
		return this.l;
	}

	public int b(char character) {
		int integer3 = "0123456789abcdef".indexOf(character);
		return integer3 >= 0 && integer3 < this.f.length ? this.f[integer3] : -1;
	}
}
