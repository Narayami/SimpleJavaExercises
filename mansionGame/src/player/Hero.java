package player;

import finals.Constant;
import finals.Wait;
import mansion.Hall;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
//TODO - REFACTOR CODE - INTERFACE TO MAKE PLAYER OPEN DOORS AND GRAB ITEMS, ETC
public class Hero {
    private Prompt prompt = new Prompt(System.in, System.out);
    private StringInputScanner inputScanner = new StringInputScanner();
    private Hall hall;

    public Hero(Hall hall) {
        this.hall = hall;
    }

    public void promptName() {
        //Wait.seconds(3);
        inputScanner.setMessage(Constant.WHO_ARE_YOU + "\n");
        prompt.getUserInput(inputScanner);
        hall.startHallLevel();
    }
}
