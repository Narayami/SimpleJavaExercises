import finals.Story;
import mansion.Hall;
import player.Hero;

public class Main {
    public static void main(String[] args) {
        Hall mansionHall = new Hall();
        mansionHall.initHall();

        Story.awakening();

        Hero hero = new Hero(mansionHall);
        hero.promptName();


        //Showing results
        System.out.println("\n-------------------------------");
        mansionHall.showRooms();
        mansionHall.showPaintings();
    }
}
