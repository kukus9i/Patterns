package structural.facade;

public class Facade {
    private Fridge fridge = new Fridge();
    private Stove stove = new Stove();
    private Microwave microwave = new Microwave();


    void setCoolFood(String food) {
        System.out.println(food + " received for cooling");
        fridge.setFood(food);
    }

    void getCollFood() {
        System.out.println(fridge.getFood());
    }

    void prepareFood(String food) {
        stove.toCookFood(food);
    }

    void reHeatFood(String food) {
        microwave.reHeatFood(food);
    }


}
