import Hotel.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel paradiseSleepy = new Hotel("Paradise Sleepy", 3);
        Client tiago = new Client("Tiago", 28, paradiseSleepy);

        Client palma = new Client("Palma", 29, paradiseSleepy);

        paradiseSleepy.createRooms();
        paradiseSleepy.showRooms();
        tiago.rentRoom(paradiseSleepy);
        tiago.checkout(paradiseSleepy);

        palma.rentRoom(paradiseSleepy);
        palma.checkout(paradiseSleepy);
    }
}
