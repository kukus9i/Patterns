package structural.facade;

public class Fridge {
    private String food;

    void setFood(String food) {
        this.food = food;
    }

    String getFood() {
        return "cooling " + this.food;

    }
}
