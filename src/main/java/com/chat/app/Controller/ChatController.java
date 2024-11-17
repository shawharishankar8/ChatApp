package com.chat.app.Controller;

import com.chat.app.Model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage)
    {
        return  chatMessage;
    }

    @GetMapping("/chat")
    public String chat()
    {
        return "chat";
    }
}
