package com.example.reservationsystem.service;




import com.example.reservationsystem.entity.Room;
import com.example.reservationsystem.repository.RoomRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class RoomServiceTest {

@Mock
    private RoomRepository roomRepository;
 @InjectMocks
    private RoomService roomService;
@Test
void checkifdeleteroomdeleteroombyid(){
    Room room=new Room();
    when(roomRepository.existsById(1L)).thenReturn(true);
    roomService.deleteRoom(1L);
    verify(roomRepository,times(1)).deleteById(1L);
}

@Test
    void getuserbyidshouldthrowexception(){
    assertThrows(IllegalArgumentException.class, ()->roomService.getRoomById(null));
}


}
