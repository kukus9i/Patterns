package structural.composite;

import structural.flyweight.FacadeSpriteProcessor;

import java.awt.*;

public class CompositeRunner {
    public static void main(String[] args) {
        Composite gameLevel = new Composite();
        Composite gameLevel1 = new Composite();

        FacadeSpriteProcessor compositeSprite = new FacadeSpriteProcessor();
        compositeSprite.createSprite(4, "cloud");
        compositeSprite.createSprite(1, "tree");
        compositeSprite.createSprite(2, "ground");

        gameLevel.addLevel(compositeSprite.getSpriteProc());
        gameLevel.draw(0,10);

        gameLevel.removeLevel(compositeSprite.getSpriteProc());
        gameLevel.draw(0,2);

    }
}
