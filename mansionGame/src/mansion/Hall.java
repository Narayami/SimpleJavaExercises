package mansion;

import objects.Door;
import objects.Painting;

import java.util.LinkedList;
import java.util.List;

public class Hall {
    private List<Door> doors = new LinkedList<>();
    private List<Painting> paintings = new LinkedList<>();

    private String[] doorsName = new String[]{
            "Kitchen",
            "Living Room",
            "Bathroom",
            "Gaming Room",
    };
    private String[] paintingsName = new String[]{
            "The Experiment",
            "Beheading",
            "Slutty Sheila",
            "Inside Out",
    };

    //TODO CREATE MORE INTERACTIVE OBJECTS
    public void initHall() {
        createDoors();
        createPaintings();
    }

    private void createPaintings() {
        for (String paintName : paintingsName){
            paintings.add(new Painting(paintName, false));
        }
    }

    private void createDoors() {
        for (String nameDoor : doorsName) {
            doors.add(new Door(nameDoor, false));
        }
    }

    public void showRooms() {
        System.out.println(doors);
    }

    public void showPaintings(){
        System.out.println(paintings);
    }
}
