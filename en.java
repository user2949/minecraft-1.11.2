import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class en extends MessageToMessageDecoder<ByteBuf> {
	private final em a;

	public en(Cipher cipher) {
		this.a = new em(cipher);
	}

	protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
		list.add(this.a.a(channelHandlerContext, byteBuf));
	}
}
