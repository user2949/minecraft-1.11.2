import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class eu extends ByteToMessageDecoder {
	private static final Logger a = LogManager.getLogger();
	private static final Marker b = MarkerManager.getMarker("PACKET_RECEIVED", er.b);
	private final fn c;

	public eu(fn fn) {
		this.c = fn;
	}

	protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
		if (byteBuf.readableBytes() != 0) {
			et et5 = new et(byteBuf);
			int integer6 = et5.g();
			fm<?> fm7 = ((es)channelHandlerContext.channel().attr(er.c).get()).a(this.c, integer6);
			if (fm7 == null) {
				throw new IOException("Bad packet id " + integer6);
			} else {
				fm7.a(et5);
				if (et5.readableBytes() > 0) {
					throw new IOException(
						"Packet "
							+ ((es)channelHandlerContext.channel().attr(er.c).get()).a()
							+ "/"
							+ integer6
							+ " ("
							+ fm7.getClass().getSimpleName()
							+ ") was larger than I expected, found "
							+ et5.readableBytes()
							+ " bytes extra whilst reading packet "
							+ integer6
					);
				} else {
					list.add(fm7);
					if (a.isDebugEnabled()) {
						a.debug(b, " IN: [{}:{}] {}", new Object[]{channelHandlerContext.channel().attr(er.c).get(), integer6, fm7.getClass().getName()});
					}
				}
			}
		}
	}
}
