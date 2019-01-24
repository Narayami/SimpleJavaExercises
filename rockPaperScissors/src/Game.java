public class Game {
    private Player playerOne;
    private Player playerTwo;

    private Hand p1Hand;
    private Hand p2Hand;

    private String winner;

    public void init() {
        playerOne = new Player(Constant.PLAYER_ONE_NAME);
        playerTwo = new Player(Constant.PLAYER_TWO_NAME);

    }

    public void start(){
        p1Hand = getHand();
        p2Hand = getHand();

        switch (p1Hand) {
            case ROCK:
                winner = getRockResult(p1Hand, p2Hand);
                break;
            case PAPER:
                winner = getPaperResult(p1Hand, p2Hand);
                break;
            case SCISSORS:
                winner = getScissorsResult(p1Hand, p2Hand);
        }

        System.out.println(winner);

    }

    private String getScissorsResult(Hand p1Hand, Hand p2Hand) {
        System.out.println(Constant.PLAYERONE + playerOne + Constant.PLAYED + p1Hand);
        System.out.println(Constant.PLAYERTWO + playerTwo + Constant.PLAYED + p2Hand);
        return p2Hand == Hand.PAPER ? playerOne.getNickName() + Constant.WINNER
                : p2Hand == Hand.ROCK ? playerTwo.getNickName() + Constant.WINNER : Constant.DRAW;
    }

    private String getPaperResult(Hand p1Hand, Hand p2Hand) {
        System.out.println(Constant.PLAYERONE + playerOne + Constant.PLAYED + p1Hand);
        System.out.println(Constant.PLAYERTWO + playerTwo + Constant.PLAYED + p2Hand);
        return p2Hand == Hand.ROCK ? playerOne.getNickName() + Constant.WINNER
                : p2Hand == Hand.SCISSORS ? playerTwo.getNickName() + Constant.WINNER : Constant.DRAW;
    }

    private String getRockResult(Hand p1Hand, Hand p2Hand) {
        System.out.println(Constant.PLAYERONE + playerOne + Constant.PLAYED + p1Hand);
        System.out.println(Constant.PLAYERTWO + playerTwo + Constant.PLAYED + p2Hand);
        return p2Hand == Hand.SCISSORS ? playerOne.getNickName() + Constant.WINNER
                : p2Hand == Hand.PAPER ? playerTwo + Constant.WINNER : Constant.DRAW;
    }

    private Hand getHand() {
        return Hand.getRandomHand();
    }

}
