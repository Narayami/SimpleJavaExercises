package mansion;

import finals.Constant;
import finals.Wait;
import objects.Door;
import objects.Painting;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.LinkedList;
import java.util.List;

//TODO - clean/refactor code
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
    private String[] doorsListSelection = {"Kitchen", "Living Room", "Bathroom", "Gaming Room", "Return"};
    private MenuInputScanner menuInputScanner;

    private boolean levelSolved = false;

    //TODO CREATE MORE INTERACTIVE OBJECTS
    public void initHall() {
        createDoors();
        createPaintings();
    }

    public void startHallLevel() {
        //Wait.seconds(1);

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
                    System.out.println(Constant.YOU_FUCKING_PUSSY);
                    System.exit(0);
                    break;
            }
        }
    }

    private int getHallOption() {
        menuInputScanner = new MenuInputScanner(hallOptions);
        menuInputScanner.setMessage(Constant.WHAT_TO_DO);
        return prompt.getUserInput(menuInputScanner);

    }

    private void getDoorOptions() {
        menuInputScanner = new MenuInputScanner(doorsListSelection);
        menuInputScanner.setMessage(Constant.DOOR_TO_SELECT);
        int doorChosen = prompt.getUserInput(menuInputScanner);
        if (doorChosen == 5){
            startHallLevel();
        }
        doorOption(doorChosen);

    }

    private void doorOption(int doorChosen) {
        menuInputScanner = new MenuInputScanner(doorOptions);
        menuInputScanner.setMessage(Constant.WHAT_TO_DO);
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
    }

    private String doorsCheckMessage(int playerOption) {

        return playerOption == 1 ? Constant.DOOR_ONE_MESSAGE
                : playerOption == 2 ? Constant.DOOR_TWO_MESSAGE
                : playerOption == 3 ? Constant.DOOR_THREE_MESSAGE
                : playerOption == 4 ? Constant.DOOR_FOUR_MESSAGE : "";
    }

    private void getPaintingOptions() {
        menuInputScanner = new MenuInputScanner(paintingsName);
        menuInputScanner.setMessage(Constant.PAINTING_TO_SELECT);
        int playerOption = prompt.getUserInput(menuInputScanner);

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
        //TODO
        System.out.println("testing");
    }

    public void showRooms() {
        System.out.println(doors);
    }

    public void showPaintings() {
        System.out.println(paintings);
    }
}
