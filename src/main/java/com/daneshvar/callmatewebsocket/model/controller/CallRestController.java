package com.daneshvar.callmatewebsocket.model.controller;


import com.daneshvar.callmatewebsocket.model.dto.CallSignal;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/call")
public class CallRestController {

    private final SimpMessagingTemplate messagingTemplate;

    public CallRestController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @PostMapping("/start")
    public void startCall(@RequestBody CallSignal signal) {
       
        System.out.println("Start call from " + signal.getFromId() + " to " + signal.getToId());

        
        messagingTemplate.convertAndSendToUser(signal.getToId(), "/queue/call", signal);
    }
}

