public class Player {
    private String nickName;

    public Player(String nickName){
        this.nickName = nickName;

    }
    @Override
    public String toString(){
        return nickName;
    }

    public String getNickName() {
        return nickName;
    }
}
