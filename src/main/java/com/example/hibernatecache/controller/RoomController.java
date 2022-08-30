package com.example.hibernatecache.controller;

import com.example.hibernatecache.model.Room;
import com.example.hibernatecache.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/get-room/{id}")
    public Room getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }

    @PostMapping("/save-room")
    public Room saveRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }

}
