package objects;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Door implements Object{
    private boolean isOpened = false;
    private int number;

    public Door(int number, Boolean isOpened){
        this.number =  number;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    @Override
    public void check() {

    }

    @Override
    public String toString(){
        return "Room: "  + number;
    }
}
