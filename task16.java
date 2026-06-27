interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Putting food into the cage.");
            return true;
        } else {
            System.out.println("It is not time to eat yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla: lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla... pet at your own risk.");
    }
}

public class task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        // Test feed()
        System.out.println("Feed (timeToEat = true) : " + gorilla.feed(true));
        System.out.println("Feed (timeToEat = false): " + gorilla.feed(false));

        System.out.println();

        // Test groom()
        gorilla.groom();

        System.out.println();

        // Test pet()
        gorilla.pet();
    }
}