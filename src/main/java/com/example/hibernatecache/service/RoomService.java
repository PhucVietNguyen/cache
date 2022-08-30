package com.example.hibernatecache.service;

import com.example.hibernatecache.model.Room;

public interface RoomService {

    Room getRoomById(Long id);

    Room saveRoom(Room room);
}
