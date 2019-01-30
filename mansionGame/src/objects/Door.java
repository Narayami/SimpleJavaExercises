package objects;

public class Door implements Object {
    private boolean isOpened = false;
    private String doorName;

    public Door(String doorName, Boolean isOpened) {
        this.doorName = doorName;
        this.isOpened = isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public boolean isOpened() {
        return isOpened;
    }

    @Override
    public String toString() {
        return doorName;
    }
}
