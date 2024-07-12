public final class lb extends RuntimeException {
	public static final lb a = new lb();

	private lb() {
		this.setStackTrace(new StackTraceElement[0]);
	}

	public synchronized Throwable fillInStackTrace() {
		this.setStackTrace(new StackTraceElement[0]);
		return this;
	}
}
