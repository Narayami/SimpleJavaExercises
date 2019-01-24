public enum Hand {
    ROCK,
    PAPER,
    SCISSORS;

    public final Hand getRandomHand(){
        Hand[] hands = Hand.values();
        return hands[(int)Math.random()* hands.length];
    }
}
