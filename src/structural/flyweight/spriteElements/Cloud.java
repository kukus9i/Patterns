package structural.flyweight.spriteElements;

import structural.flyweight.Sprites;

public class Cloud implements Sprites {
    private final String type = "cloud";

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw the " + type + " at x." + x + ", y." + y);
    }
}
