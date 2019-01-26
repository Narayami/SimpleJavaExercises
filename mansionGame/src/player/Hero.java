package player;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Hero implements PlayerHero {
    private Prompt prompt = new Prompt(System.in, System.out);
    private StringInputScanner inputScanner = new StringInputScanner();
    public void promptName() {
        inputScanner.setMessage("Who are you, stranger?");
        prompt.getUserInput(inputScanner);
        System.out.println();
    }

    public void open(Object door) {

    }

    public void pick(Object key) {

    }

    public void use(Object key) {

    }
}
