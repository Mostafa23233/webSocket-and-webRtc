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
        // مثلاً فقط برای ثبت یا لاگ اولیه
        System.out.println("Start call from " + signal.getFromId() + " to " + signal.getToId());

        // بفرست برای کاربر هدف
        messagingTemplate.convertAndSendToUser(signal.getToId(), "/queue/call", signal);
    }
}

