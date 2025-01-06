package com.sjitzooi.pocwebsocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String clientMessage = message.getPayload();
        System.out.println("Received: " + clientMessage);

        // Echo the message back to the client
        session.sendMessage(new TextMessage("Server: " + clientMessage));
    }
}
