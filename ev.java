import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ev extends MessageToByteEncoder<fm<?>> {
	private static final Logger a = LogManager.getLogger();
	private static final Marker b = MarkerManager.getMarker("PACKET_SENT", er.b);
	private final fn c;

	public ev(fn fn) {
		this.c = fn;
	}

	protected void encode(ChannelHandlerContext channelHandlerContext, fm<?> fm, ByteBuf byteBuf) throws Exception {
		Integer integer5 = ((es)channelHandlerContext.channel().attr(er.c).get()).a(this.c, fm);
		if (a.isDebugEnabled()) {
			a.debug(b, "OUT: [{}:{}] {}", new Object[]{channelHandlerContext.channel().attr(er.c).get(), integer5, fm.getClass().getName()});
		}

		if (integer5 == null) {
			throw new IOException("Can't serialize unregistered packet");
		} else {
			et et6 = new et(byteBuf);
			et6.d(integer5);

			try {
				fm.b(et6);
			} catch (Throwable var7) {
				a.error(var7);
			}
		}
	}
}
