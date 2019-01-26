package objects;

public class Door implements Object{
    private boolean isOpened = false;
    private String doorName;

    public Door(String doorName, Boolean isOpened){
        this.doorName =  doorName;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    @Override
    public void check(String doorName){

    }

    @Override
    public String toString(){
        return doorName;
    }
}
