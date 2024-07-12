import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class eo extends MessageToByteEncoder<ByteBuf> {
	private final em a;

	public eo(Cipher cipher) {
		this.a = new em(cipher);
	}

	protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf2, ByteBuf byteBuf3) throws Exception {
		this.a.a(byteBuf2, byteBuf3);
	}
}
