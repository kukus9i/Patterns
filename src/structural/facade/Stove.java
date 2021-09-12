package structural.facade;

public class Stove {
    void toCookFood(String food) {
        System.out.println("\n" + food + " in stove");
        System.out.println("...10 minutes later\n" + food + " is prepared");

    }
}
