package player;

import finals.Wait;
import mansion.Hall;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Hero implements PlayerHero {
    private Prompt prompt = new Prompt(System.in, System.out);
    private StringInputScanner inputScanner = new StringInputScanner();
    private Hall hall;

    public Hero(Hall hall){
        this.hall = hall;
    }

    public void promptName() {
        Wait.seconds(5);
        inputScanner.setMessage("Who are you?\n");
        String playerName = prompt.getUserInput(inputScanner);
        hall.startHallLevel(playerName);
    }

    public void open(Object door) {

    }

    public void pick(Object key) {

    }

    public void use(Object key) {

    }
}
