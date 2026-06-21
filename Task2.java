public class Task2 {
    public static void main(String[] args) {
        // primitives
        byte h = 72;          // ASCII for 'H'
        int three = 3;
        int one = 1;
        int zero = 0;
        short two = 2;
        float f = 2.0f;
        boolean bool = true;
        char space = ' ';
        char w = 'w';
        char r = 'r';
        char d = 'd';

        // build the string
        String output = "" + (char)h + three + one + one + zero + space
                        + w + zero + r + one + d + space
                        + f + space + bool;

        System.out.println(output);
    }
}
