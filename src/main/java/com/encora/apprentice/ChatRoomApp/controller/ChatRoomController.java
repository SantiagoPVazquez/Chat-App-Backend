package com.encora.apprentice.ChatRoomApp.controller;

import com.encora.apprentice.ChatRoomApp.controller.model.ChatRoom;
import com.encora.apprentice.ChatRoomApp.controller.model.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;
@RestController
public class ChatRoomController {
    @Autowired
    private ChatRoomService chatRoomService;

    @GetMapping("/chat-room/{id}")
    @CrossOrigin
    public ChatRoom getRoom(@PathVariable UUID id) {
        return chatRoomService.getChatRoom(id);
    }

    @PostMapping("/create-chat-room")
    @CrossOrigin
    public ChatRoom setChatRoom(@RequestBody ChatRoom chatRoom) {
        return chatRoomService.setChatRoom(chatRoom);
    }
}
