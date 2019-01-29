package objects;

public class Painting implements Object {
    private String paintName;
    private Boolean solved = false;

    public Painting(String paintName, Boolean solved){
        this.paintName = paintName;
        this.solved = solved;
    }

    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    public boolean getSolved(){
        return this.solved;
    }

    @Override
    public void open(int number) {

    }

    @Override
    public String toString(){
        return paintName;
    }
}
