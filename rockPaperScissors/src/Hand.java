public enum Hand {
    ROCK,
    PAPER,
    SCISSORS;

    public static Hand getRandomHand(){
        Hand[] hands = Hand.values();
        return hands[(int)Math.floor(Math.random()* hands.length)];
    }
}
