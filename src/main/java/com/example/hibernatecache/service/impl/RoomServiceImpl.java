package com.example.hibernatecache.service.impl;

import com.example.hibernatecache.model.Room;
import com.example.hibernatecache.repository.RoomRepository;
import com.example.hibernatecache.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).get();
    }

    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }
}
