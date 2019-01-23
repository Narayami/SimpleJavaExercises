public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter("ola ola");
        System.out.println(wordCounter.startCharCount());

        System.out.println(wordCounter.startWordCount());

    }
}
