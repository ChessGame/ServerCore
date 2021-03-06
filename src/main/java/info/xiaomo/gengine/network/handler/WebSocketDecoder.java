package info.xiaomo.gengine.network.handler;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

/**
 * @Date : 2017/8/21 17:43
 *
 * @desc : Copyright(©) 2017 by xiaomo.
 */
public class WebSocketDecoder extends MessageToMessageDecoder<BinaryWebSocketFrame> {

    @Override
    protected void decode(ChannelHandlerContext ctx, BinaryWebSocketFrame msg, List<Object> out) {
        out.add(msg.content().retain());
    }
}
