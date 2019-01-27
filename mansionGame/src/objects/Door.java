package objects;

public class Door implements Object{
    private boolean isOpened = false;
    private String doorName;

    public Door(String doorName, Boolean isOpened){
        this.doorName =  doorName;
    }

    @Override
    public void open(int number){
        switch (number) {
            case 1:

                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
        }

    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public boolean isOpened() {
        return isOpened;
    }

    @Override
    public String toString(){
        return doorName;
    }
}
