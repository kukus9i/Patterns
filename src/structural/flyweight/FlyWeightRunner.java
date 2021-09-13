package structural.flyweight;


public class FlyWeightRunner {
    public static void main(String[] args) {
        FacadeSpriteProcessor proccesor = new FacadeSpriteProcessor();
        proccesor.createSprite(5, "cloud");
        proccesor.createSprite(10, "tree");
        proccesor.createSprite(3, "ground");

        proccesor.drawSprite(0, 20, "cloud");
        proccesor.drawSprite(5, 50, "tree");
        proccesor.drawSprite(0, 60, "ground");


    }
}
