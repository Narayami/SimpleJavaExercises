package mansion;

import objects.Door;
import java.util.LinkedList;
import java.util.List;

public class Hall {
    private List<Door> doors = new LinkedList<>();
    private String[] doorsName = new String[]{
            "Kitchen",
            "Living Room",
            "Bathroom",
            "Gaming Room",
    };

    public void initHall(){
        createDoors();
    }

    private void createDoors() {
        for (String nameDoor : doorsName) {
            doors.add(new Door(nameDoor, false));
        }
    }

    public void showRooms(){
        System.out.println(doors);
    }
}
