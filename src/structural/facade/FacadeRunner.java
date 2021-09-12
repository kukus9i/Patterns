package structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        Facade kitchen = new Facade();
        kitchen.setCoolFood("apple");
        kitchen.getCollFood();
        kitchen.prepareFood("chicken");
        kitchen.reHeatFood("Sandwich");
    }
}
