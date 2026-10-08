package foriString;

public class Arrutil {
    private Arrutil() {
    }

    public static String arrayToString(int[] array) {

        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str.append(array[i]).append("]");
            } else {
                str.append(array[i]).append(", ");
            }
        }
        return str.toString();
    }

}
