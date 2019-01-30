package mansion;

import finals.Constant;
import objects.Door;
import objects.Painting;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.LinkedList;
import java.util.List;

//TODO - clean/refactor code, make player lose and enemy fights
public class Hall {
    private List<Door> doors = new LinkedList<>();
    private List<Painting> paintings = new LinkedList<>();

    private String[] doorsName = {
            "Kitchen",
            "Living Room",
            "Bathroom",
            "Gaming Room",
    };
    private String[] paintingsName = {
            "The Experiment",
            "Beheading",
            "Slutty Sheila",
            "Inside Out",
    };

    private Prompt prompt = new Prompt(System.in, System.out);
    private MenuInputScanner menuInputScanner;
    private StringInputScanner inputScanner;

    private String[] hallOptions = {"See Doors", "See Paintings", "Suicide"};
    private String[] doorOptions = {"Open", "Check", "Return"};
    private String[] paintingCheckOptions = {"Resolve", "Return"};
    private String[] doorsListSelection = {"Kitchen", "Living Room", "Bathroom", "Gaming Room", "Return"};
    private String[] paintingsOptions = {"The Experiment", "Beheading", "Slutty Sheila", "Inside Out", "Return",};

    private boolean levelSolved = false;

    //TODO CREATE MORE INTERACTIVE OBJECTS
    public void initHall() {
        createDoors();
        createPaintings();
    }

    public void startHallLevel() {
        //Wait.seconds(1);

        int selectedHallOption = getHallOption();
        if (levelSolved){
            System.out.println("testing startHall - levelSolved = true");
        }
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
        if (doorChosen == 5) {
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
                : playerOption == 4 ? Constant.DOOR_FOUR_MESSAGE : Constant.DOOR_INVALID;
    }

    private void getPaintingOptions() {
        menuInputScanner = new MenuInputScanner(paintingsOptions);
        menuInputScanner.setMessage(Constant.PAINTING_TO_SELECT);
        int playerOption = prompt.getUserInput(menuInputScanner);

        if (playerOption == 5) {
            startHallLevel();
        }

        if (!paintings.get(playerOption).getSolved()) {
            System.out.println(Constant.ALREADY_SOLVED);
            startHallLevel();
        }

        paintingRiddleOption(playerOption);

    }

    private void paintingRiddleOption(int playerOption) {


        switch (playerOption) {
            case 1:
                System.out.println(Constant.PAINTING_ONE_RIDDLE);
                break;
            case 2:
                System.out.println(Constant.PAINTING_TWO_RIDDLE);
                break;
            case 3:
                System.out.println(Constant.PAINTING_THREE_RIDDLE);
                break;
            case 4:
                System.out.println(Constant.PAINTING_FOUR_RIDDLE);
                break;
        }

        paintingOption(playerOption);

    }

    private void paintingOption(int playerOption) {

        String tip = getPaintingTip(playerOption);
        System.out.println(tip);

        menuInputScanner = new MenuInputScanner(paintingCheckOptions);
        menuInputScanner.setMessage(Constant.WHAT_TO_DO);
        int playerPaintingOption = prompt.getUserInput(menuInputScanner);
        switch (playerPaintingOption) {
            case 1:
                resolvePaintingRiddle(playerOption);
            case 2:
                getPaintingOptions();
        }
    }

    private void resolvePaintingRiddle(int playerOption) {
        inputScanner = new StringInputScanner();
        inputScanner.setMessage(Constant.WRITE_ANSWER);
        String playerAnswer = prompt.getUserInput(inputScanner);

        if (checkAnswer(playerOption, playerAnswer)) {
            paintings.get(playerOption).setSolved(true);
            levelSolved = checkHallPuzzleStatus();
        }
        System.out.println(Constant.WRONG_ANSWER);
    }

    private boolean checkAnswer(int playerOption, String playerAnswer) {
        if (playerOption == 1 && playerAnswer == Constant.PAINTING_ONE_ANSWER) {
            return true;
        }
        if (playerOption == 2 && playerAnswer == Constant.PAINTING_TWO_ANSWER) {
            return true;
        }
        if (playerOption == 3 && playerAnswer == Constant.PAINTING_THREE_ANSWER) {
            return true;
        }
        if (playerOption == 4 && playerAnswer == Constant.PAINTING_FOUR_ANSWER) {
            return true;
        }

        return false;
    }

    private boolean checkHallPuzzleStatus() {
        for (Painting p: paintings) {
            if (!p.getSolved()){
                return false;
            }
        }
        System.out.println(Constant.HALL_LEVEL_CLEARED);
        return true;
    }

    private String getPaintingTip(int playerOption) {

        switch (playerOption) {
            case 1:
                return Constant.PAINTING_ONE_TIP;
            case 2:
                return Constant.PAINTING_TWO_TIP;
            case 3:
                return Constant.PAINTING_THREE_TIP;
            case 4:
                return Constant.PAINTING_FOUR_TIP;
        }
        return Constant.NOT_VALID;
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
