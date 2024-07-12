import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class ku extends IOException {
	private final List<ku.a> a = Lists.newArrayList();
	private final String b;

	public ku(String string) {
		this.a.add(new ku.a());
		this.b = string;
	}

	public ku(String string, Throwable throwable) {
		super(throwable);
		this.a.add(new ku.a());
		this.b = string;
	}

	public void a(String string) {
		((ku.a)this.a.get(0)).a(string);
	}

	public void b(String string) {
		((ku.a)this.a.get(0)).a = string;
		this.a.add(0, new ku.a());
	}

	public String getMessage() {
		return "Invalid " + this.a.get(this.a.size() - 1) + ": " + this.b;
	}

	public static ku a(Exception exception) {
		if (exception instanceof ku) {
			return (ku)exception;
		} else {
			String string2 = exception.getMessage();
			if (exception instanceof FileNotFoundException) {
				string2 = "File not found";
			}

			return new ku(string2, exception);
		}
	}

	public static class a {
		private String a;
		private final List<String> b = Lists.newArrayList();

		private a() {
		}

		private void a(String string) {
			this.b.add(0, string);
		}

		public String b() {
			return StringUtils.join(this.b, "->");
		}

		public String toString() {
			if (this.a != null) {
				return this.b.isEmpty() ? this.a : this.a + " " + this.b();
			} else {
				return this.b.isEmpty() ? "(Unknown file)" : "(Unknown file) " + this.b();
			}
		}
	}
}
