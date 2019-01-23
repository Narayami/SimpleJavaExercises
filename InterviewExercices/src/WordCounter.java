public class WordCounter {

    private String[] wordsToCount;
    private int charCount = 0;
    private int wordCount = 0;
    private String message;

    public WordCounter(String message){
        this.message = message;

    }

    public int startCharCount() {
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' '){
                charCount --;
            }
            charCount ++;
        }
        return charCount;
    }

    public int startWordCount(){
        wordsToCount = message.split(" ");
        return wordsToCount.length;
    }


}
