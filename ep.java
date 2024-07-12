import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;

public class ep extends ByteToMessageDecoder {
	private final Inflater a;
	private int b;

	public ep(int integer) {
		this.b = integer;
		this.a = new Inflater();
	}

	protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
		if (byteBuf.readableBytes() != 0) {
			et et5 = new et(byteBuf);
			int integer6 = et5.g();
			if (integer6 == 0) {
				list.add(et5.readBytes(et5.readableBytes()));
			} else {
				if (integer6 < this.b) {
					throw new DecoderException("Badly compressed packet - size of " + integer6 + " is below server threshold of " + this.b);
				}

				if (integer6 > 2097152) {
					throw new DecoderException("Badly compressed packet - size of " + integer6 + " is larger than protocol maximum of " + 2097152);
				}

				byte[] arr7 = new byte[et5.readableBytes()];
				et5.readBytes(arr7);
				this.a.setInput(arr7);
				byte[] arr8 = new byte[integer6];
				this.a.inflate(arr8);
				list.add(Unpooled.wrappedBuffer(arr8));
				this.a.reset();
			}
		}
	}

	public void a(int integer) {
		this.b = integer;
	}
}
