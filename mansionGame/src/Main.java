import mansion.Hall;
import player.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.promptName();

        Hall mansionHall = new Hall();
        mansionHall.initHall();



        //Showing results
        mansionHall.showRooms();
        mansionHall.showPaintings();
    }
}
