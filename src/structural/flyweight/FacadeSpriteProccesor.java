package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FacadeSpriteProccesor {   //FACADE?

    private SpritesFactory spritesFactory = new SpritesFactory();
    private List<Sprites> spriteCloud = new ArrayList<>();
    private List<Sprites> spriteTree = new ArrayList<>();
    private List<Sprites> spriteGround = new ArrayList<>();

    public void createSprite(int amount, String type) {
        for (int i = 0; i < amount; i++) {
            if (type.equals("cloud")) {
                spriteCloud.add(spritesFactory.getSprite("cloud"));
            }
            if (type.equals("tree")) {
                spriteTree.add(spritesFactory.getSprite("tree"));
            }
            if (type.equals("ground")) {
                spriteGround.add(spritesFactory.getSprite("ground"));
            }
        }
    }

    public void drawSprite(int x, int y, String type) {
        if (type.equals("cloud")) {
            for (int i = 0; i < spriteCloud.size(); i++, x += 30) {
                spriteCloud.get(i).draw(x, y);
            }
        }
        if (type.equals("tree")) {
            for (int i = 0; i < spriteTree.size(); i++, x += 15) {
                spriteTree.get(i).draw(x, y);
            }
        }
        if (type.equals("ground")) {
            for (int i = 0; i < spriteGround.size(); i++, x += 45) {
                spriteGround.get(i).draw(x, y);
            }
        }

    }

}
