public class bbk implements Runnable {
	private final bbl a;

	public bbk(bbl bbl) {
		this.a = bbl;
	}

	public void run() {
		this.a.c();
	}
}
