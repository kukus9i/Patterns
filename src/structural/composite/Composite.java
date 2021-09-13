package structural.composite;

import structural.flyweight.FacadeSpriteProcessor;
import structural.flyweight.Sprites;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Sprites {
    private List<FacadeSpriteProcessor> spriteProc = new ArrayList<FacadeSpriteProcessor>();

    void addLevel(FacadeSpriteProcessor spriteProcessor) {
        System.out.println("level created");
        spriteProc.add(spriteProcessor);
    }

    void removeLevel(FacadeSpriteProcessor spriteProc) {
        System.out.println("level deleted");
        this.spriteProc.remove(spriteProc);

    }

    @Override
    public void draw(int x, int y) {
        for (FacadeSpriteProcessor fsp : spriteProc) {
            System.out.println("draw level");
            fsp.drawSprite(x, y, "cloud");
            fsp.drawSprite(x, y+50, "tree");
            fsp.drawSprite(x, y+60, "ground");
        }
    }
}
