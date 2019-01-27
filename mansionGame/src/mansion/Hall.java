package mansion;

import finals.Constant;
import finals.Wait;
import objects.Door;
import objects.Painting;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

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

    private Prompt prompt = new Prompt(System.in, System.out);
    private String[] hallOptions = {"See Doors", "See Paintings", "Suicide"};
    private MenuInputScanner menuInputScanner;

    //TODO CREATE MORE INTERACTIVE OBJECTS
    public void initHall() {
        createDoors();
        createPaintings();
    }

    public void startHallLevel(String playerName) {
        System.out.println(Constant.Good_Luck + playerName);
        Wait.seconds(2);

        int selectedHallOption = getHallOption();

        switch (selectedHallOption) {
            case 1:
                getDoorOptions();
                break;
            case 2:
                getPaintingOptions();
                break;
            case 3:
                System.out.println("YOU FUCKING PUSSY!");
                System.exit(0);
        }

    }

    private void getDoorOptions() {
        menuInputScanner = new MenuInputScanner(doorsName);
        menuInputScanner.setMessage("Which painting you want to check?");
        doors.get(prompt.getUserInput(menuInputScanner) - 1).check();

    }

    private void getPaintingOptions() {
        menuInputScanner = new MenuInputScanner(paintingsName);
        menuInputScanner.setMessage("Which paintings you want to check?");
        paintings.get(prompt.getUserInput(menuInputScanner) - 1).check();

    }

    private int getHallOption() {
        menuInputScanner = new MenuInputScanner(hallOptions);
        menuInputScanner.setMessage("What do you want to do?");
        return prompt.getUserInput(menuInputScanner);

    }

    private void createPaintings() {
        for (String paintName : paintingsName) {
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

    public void showPaintings() {
        System.out.println(paintings);
    }
}
