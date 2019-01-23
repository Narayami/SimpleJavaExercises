package Hotel;

import java.util.LinkedList;
import java.util.List;

public class Hotel {
    private String name;
    private int roomsLimit;
    private List<Room> rooms = new LinkedList<>();

    public Hotel(String name, int roomsLimit) {
        this.name = name;
        this.roomsLimit = roomsLimit;

    }

    public void createRooms() {
        for (int i = 0; i < roomsLimit; i++) {
            rooms.add(new Room(i, false));
        }
    }

    public void showRooms() {
        System.out.println(rooms);
    }

    public int checkVacantRooms() {
        for (Room room : rooms) {
            if (!room.getIsOcupied()){
                room.setOcupied(true);
                return room.getNumber();
            }
        }

        return -1;
    }

    public void checkout(int key) {
        rooms.get(key).setOcupied(false);
        System.out.println("Room key returned");
    }
}
