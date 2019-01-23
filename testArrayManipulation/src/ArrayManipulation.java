public class ArrayManipulation {

    private int[] ints;
    private String[] strings;

    public ArrayManipulation(int[] ints, String[] strings) {
        this.ints = ints;
        this.strings = strings;
    }

    public void repeatStrings() {
        for (int i = 0, ii = 0; i < ints.length || ii < strings.length; i++, ii++) {
            for (int j = 0; j < ints[i]; j++) {
                System.out.println(strings[ii]);
            }
        }
    }
}
