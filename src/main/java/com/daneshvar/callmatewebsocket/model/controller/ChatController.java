package com.daneshvar.callmatewebsocket.model.controller;


import com.daneshvar.callmatewebsocket.model.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")       
    public Message broadcastMessage(Message message) {
        return message;
    }
}