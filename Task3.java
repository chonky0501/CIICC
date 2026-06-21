public class Task3 {
    public static void main(String[] args) {
        String a = "Wow";       // interned string
        String b = "Wow";       // same interned reference
        String c = "NotWow";    // different content
        String d = "Wow!";      // matches b + '!'

        boolean b1 = a == b;                // true (same interned reference)
        boolean b2 = d.equals(b + '!');     // true ("Wow!" equals "Wow" + '!')
        boolean b3 = !c.equals(a);          // true ("NotWow" != "Wow")

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
