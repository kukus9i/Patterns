package structural.flyweight.spriteElements;

import structural.flyweight.Sprites;

public class Tree implements Sprites {
    private String type = "tree";

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw the " + type + " at x." + x + ", y." + y);
    }
}
