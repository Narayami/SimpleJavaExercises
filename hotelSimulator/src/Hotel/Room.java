package Hotel;

public class Room {
    private int number;
    private boolean isOcupied;

    public Room(int number, Boolean isOcupied){
        this.number = number;
        this.isOcupied = isOcupied;
    }

    public void setOcupied(boolean ocupied) {
        isOcupied = ocupied;
    }

    public boolean getIsOcupied(){
        return isOcupied;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString(){
        return "Room: " + number;
    }
}
