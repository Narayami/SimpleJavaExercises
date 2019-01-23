public class Main {
    private static int[] ints = {3,5,8,10};
    private static String[] strings = {"A", "B", "C", "D"};

    public static void main(String[] args) {
        ArrayManipulation arrayManipulation = new ArrayManipulation(ints, strings);
        arrayManipulation.repeatStrings();

    }
}
