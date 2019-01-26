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

    @Override
    public void check(String paintName) {

    }

    @Override
    public String toString(){
        return paintName;
    }
}
