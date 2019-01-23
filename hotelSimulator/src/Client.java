import Hotel.Hotel;

public class Client {
    private Hotel hotel;
    private String Name;
    private int age;
    private int key = -1;

    public Client(String name, int age, Hotel hotel){
        this.age = age;
        this.Name = name;
        this.hotel = hotel;

    }

    public void rentRoom(Hotel hotel){
        key = hotel.checkVacantRooms();

        if (key == -1) {
            System.out.println("No room available");
        }
        System.out.println(key);
    }

    public void checkout(Hotel hotel){
        if (hotel == null){
            System.out.println("you are trying to checkout from where nigga?");
            return;
        }
        if (key == -1){
            System.out.println("nigga... you dont even have a room");
            return;
        }

        hotel.checkout(key);
    }
}
