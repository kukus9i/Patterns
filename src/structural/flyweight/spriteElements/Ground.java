package structural.flyweight.spriteElements;

import structural.flyweight.Sprites;

public class Ground implements Sprites {
    private String type = "ground";

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw the " + type + " at x." + x + ", y." + y);
    }
}
