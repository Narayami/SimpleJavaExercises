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
    private String[] doorOptions = {"Open", "Check", "Return"};
    private MenuInputScanner menuInputScanner;

    private boolean levelSolved = false;

    //TODO CREATE MORE INTERACTIVE OBJECTS
    public void initHall() {
        createDoors();
        createPaintings();
    }

    public void startHallLevel(String playerName) {
        System.out.println(Constant.Good_Luck + playerName);
        Wait.seconds(2);

        int selectedHallOption = getHallOption();

        while (!levelSolved) {
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
                    break;
            }
        }
    }

    private void getDoorOptions() {
        menuInputScanner = new MenuInputScanner(doorsName);
        menuInputScanner.setMessage("Which painting you want to check?");
        int doorChosen = prompt.getUserInput(menuInputScanner);

        doorOption(doorChosen);

    }

    private void doorOption(int doorChosen) {
        menuInputScanner = new MenuInputScanner(doorOptions);
        menuInputScanner.setMessage("What do you want to do?");
        int playerOption = prompt.getUserInput(menuInputScanner);
        switch (playerOption) {
            case 1:
                if (doors.get(doorChosen).isOpened()) {
                    nextLevel();
                } else {
                    System.out.println(Constant.DOOR_IS_CLOSED);
                }
                break;
            case 2:
                System.out.println(doorsCheckMessage(playerOption));
                break;
            case 3:
                getDoorOptions();
        }
        getHallOption();
    }

    private String doorsCheckMessage(int playerOption) {

        return playerOption == 1 ? Constant.DOOR_ONE_MESSAGE
                : playerOption == 2 ? Constant.DOOR_TWO_MESSAGE
                : playerOption == 3 ? Constant.DOOR_THREE_MESSAGE
                : playerOption == 4 ? Constant.DOOR_FOUR_MESSAGE : "";
    }

    private void getPaintingOptions() {
        menuInputScanner = new MenuInputScanner(paintingsName);
        menuInputScanner.setMessage("Which paintings you want to check?");
        int playerOption = prompt.getUserInput(menuInputScanner);

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

    private void nextLevel() {
        System.out.println("testing");
    }

    public void showRooms() {
        System.out.println(doors);
    }

    public void showPaintings() {
        System.out.println(paintings);
    }
}
