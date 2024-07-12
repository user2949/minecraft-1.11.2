import java.nio.ByteBuffer;
import java.util.List;

public class bpz {
	public void a(bpy bpy) {
		if (bpy.h() > 0) {
			bzj bzj3 = bpy.g();
			int integer4 = bzj3.g();
			ByteBuffer byteBuffer5 = bpy.f();
			List<bzk> list6 = bzj3.h();

			for (int integer7 = 0; integer7 < list6.size(); integer7++) {
				bzk bzk8 = (bzk)list6.get(integer7);
				bzk.b b9 = bzk8.b();
				int integer10 = bzk8.a().c();
				int integer11 = bzk8.d();
				byteBuffer5.position(bzj3.d(integer7));
				switch (b9) {
					case POSITION:
						bqg.b(bzk8.c(), integer10, integer4, byteBuffer5);
						bqg.q(32884);
						break;
					case UV:
						cdb.l(cdb.q + integer11);
						bqg.a(bzk8.c(), integer10, integer4, byteBuffer5);
						bqg.q(32888);
						cdb.l(cdb.q);
						break;
					case COLOR:
						bqg.c(bzk8.c(), integer10, integer4, byteBuffer5);
						bqg.q(32886);
						break;
					case NORMAL:
						bqg.a(integer10, integer4, byteBuffer5);
						bqg.q(32885);
				}
			}

			bqg.f(bpy.i(), 0, bpy.h());
			int integer7 = 0;

			for (int integer8 = list6.size(); integer7 < integer8; integer7++) {
				bzk bzk9 = (bzk)list6.get(integer7);
				bzk.b b10 = bzk9.b();
				int integer11 = bzk9.d();
				switch (b10) {
					case POSITION:
						bqg.p(32884);
						break;
					case UV:
						cdb.l(cdb.q + integer11);
						bqg.p(32888);
						cdb.l(cdb.q);
						break;
					case COLOR:
						bqg.p(32886);
						bqg.I();
						break;
					case NORMAL:
						bqg.p(32885);
				}
			}
		}

		bpy.b();
	}
}
