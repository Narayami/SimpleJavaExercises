package mansion;

import objects.Door;

import java.util.LinkedList;
import java.util.List;

public class Hall {
    private List<Door> doors = new LinkedList<>();

    public void initHall(){
        for (int i = 1; i < 5 ; i++) {
            doors.add(new Door(i, false));
        }
    }

    public void showRooms(){
        System.out.println(doors);
    }
}
