package objects;

public class Door {
    private boolean isOpened = false;
    private int number;
    public Door(int number){
        this.number =  number;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
