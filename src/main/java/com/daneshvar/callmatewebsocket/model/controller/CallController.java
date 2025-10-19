package com.daneshvar.callmatewebsocket.model.controller;

import com.daneshvar.callmatewebsocket.model.dto.CallSignal;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class CallController {

    private final SimpMessagingTemplate messagingTemplate;

    public CallController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/call")
    public void handleCall(CallSignal signal) {
        System.out.println("📞 از " + signal.getFromId() + " به " + signal.getToId());
        messagingTemplate.convertAndSend("/topic/call/" + signal.getToId(), signal);
    }
}
