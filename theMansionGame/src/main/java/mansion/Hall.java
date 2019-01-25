package mansion;

import objects.Door;
import objects.Key;

import java.util.HashMap;

public class Hall {
    private HashMap<Door, Key> doors = new HashMap<Door, Key>();

    public void initHall(){
        doors.put(new Door(1), new Key(1));
        doors.put(new Door(2), new Key(2));

    }
}
