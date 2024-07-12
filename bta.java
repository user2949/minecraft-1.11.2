import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bta implements Runnable {
	private static final Logger a = LogManager.getLogger();
	private final bsz b;
	private final bqa c;
	private boolean d = true;

	public bta(bsz bsz) {
		this(bsz, null);
	}

	public bta(bsz bsz, @Nullable bqa bqa) {
		this.b = bsz;
		this.c = bqa;
	}

	public void run() {
		while (this.d) {
			try {
				this.a(this.b.d());
			} catch (InterruptedException var3) {
				a.debug("Stopping chunk worker due to interrupt");
				return;
			} catch (Throwable var4) {
				b b3 = b.a(var4, "Batching chunks");
				bes.z().a(bes.z().b(b3));
				return;
			}
		}
	}

	protected void a(bsy bsy) throws InterruptedException {
		bsy.f().lock();

		try {
			if (bsy.a() != bsy.a.PENDING) {
				if (!bsy.h()) {
					a.warn("Chunk render task was {} when I expected it to be pending; ignoring task", new Object[]{bsy.a()});
				}

				return;
			}

			co co3 = new co(bes.z().h);
			co co4 = bsy.b().k();
			int integer5 = 16;
			int integer6 = 8;
			int integer7 = 24;
			if (co4.a(8, 8, 8).n(co3) > 576.0) {
				ajs ajs8 = bsy.b().p();
				co.a a9 = new co.a(co4);
				if (!this.a(a9.g(co4).c(cv.WEST, 16), ajs8)
					|| !this.a(a9.g(co4).c(cv.NORTH, 16), ajs8)
					|| !this.a(a9.g(co4).c(cv.EAST, 16), ajs8)
					|| !this.a(a9.g(co4).c(cv.SOUTH, 16), ajs8)) {
					return;
				}
			}

			bsy.a(bsy.a.COMPILING);
		} finally {
			bsy.f().unlock();
		}

		sn sn3 = bes.z().aa();
		if (sn3 == null) {
			bsy.e();
		} else {
			bsy.a(this.c());
			float float4 = (float)sn3.p;
			float float5 = (float)sn3.q + sn3.bq();
			float float6 = (float)sn3.r;
			bsy.b b7 = bsy.g();
			if (b7 == bsy.b.REBUILD_CHUNK) {
				bsy.b().b(float4, float5, float6, bsy);
			} else if (b7 == bsy.b.RESORT_TRANSPARENCY) {
				bsy.b().a(float4, float5, float6, bsy);
			}

			bsy.f().lock();

			try {
				if (bsy.a() != bsy.a.COMPILING) {
					if (!bsy.h()) {
						a.warn("Chunk render task was {} when I expected it to be compiling; aborting task", new Object[]{bsy.a()});
					}

					this.b(bsy);
					return;
				}

				bsy.a(bsy.a.UPLOADING);
			} finally {
				bsy.f().unlock();
			}

			final btb var24 = bsy.c();
			ArrayList var25 = Lists.newArrayList();
			if (b7 == bsy.b.REBUILD_CHUNK) {
				for (ajk ajk13 : ajk.values()) {
					if (var24.d(ajk13)) {
						var25.add(this.b.a(ajk13, bsy.d().a(ajk13), bsy.b(), var24, bsy.i()));
					}
				}
			} else if (b7 == bsy.b.RESORT_TRANSPARENCY) {
				var25.add(this.b.a(ajk.TRANSLUCENT, bsy.d().a(ajk.TRANSLUCENT), bsy.b(), var24, bsy.i()));
			}

			final ListenableFuture<List<Object>> listenableFuture10 = Futures.allAsList(var25);
			bsy.a(new Runnable() {
				public void run() {
					listenableFuture10.cancel(false);
				}
			});
			Futures.addCallback(listenableFuture10, new FutureCallback<List<Object>>() {
				public void onSuccess(@Nullable List<Object> list) {
					bta.this.b(bsy);
					bsy.f().lock();

					label43: {
						try {
							if (bsy.a() == bsy.a.UPLOADING) {
								bsy.a(bsy.a.DONE);
								break label43;
							}

							if (!bsy.h()) {
								bta.a.warn("Chunk render task was {} when I expected it to be uploading; aborting task", new Object[]{bsy.a()});
							}
						} finally {
							bsy.f().unlock();
						}

						return;
					}

					bsy.b().a(var24);
				}

				public void onFailure(Throwable throwable) {
					bta.this.b(bsy);
					if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
						bes.z().a(b.a(throwable, "Rendering chunk"));
					}
				}
			});
		}
	}

	private boolean a(co co, ajs ajs) {
		return !ajs.a(co.p() >> 4, co.r() >> 4).f();
	}

	private bqa c() throws InterruptedException {
		return this.c != null ? this.c : this.b.c();
	}

	private void b(bsy bsy) {
		if (this.c == null) {
			this.b.a(bsy.d());
		}
	}

	public void a() {
		this.d = false;
	}
}
