public class Game {
    private Player playerOne;
    private Player playerTwo;

    private Hand p1Hand;
    private Hand p2Hand;

    private String winner;

    public void init() {
        playerOne = new Player("Mr.Robot");
        playerTwo = new Player("Jessy");

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
        System.out.println("P1 - " + playerOne + " played " + p1Hand);
        System.out.println("P2 - " + playerTwo + " played " + p2Hand);
        return p2Hand == Hand.PAPER ? "P1 Wins" : p2Hand == Hand.ROCK ? "P2 Wins" : "Draw";
    }

    private String getPaperResult(Hand p1Hand, Hand p2Hand) {
        System.out.println("P1 - " + playerOne + " played " + p1Hand);
        System.out.println("P2 - " + playerTwo + " played " + p2Hand);
        return p2Hand == Hand.ROCK ? "P1 Wins" : p2Hand == Hand.SCISSORS ? "P2 Wins" : "Draw";
    }

    private String getRockResult(Hand p1Hand, Hand p2Hand) {
        System.out.println("P1 - " + playerOne + " played " + p1Hand);
        System.out.println("P2 - " + playerTwo + " played " + p2Hand);
        return p2Hand == Hand.SCISSORS ? "P1 Wins" : p2Hand == Hand.PAPER ? "P2 Wins" : "Draw";
    }

    private Hand getHand() {
        return Hand.getRandomHand();
    }

}
