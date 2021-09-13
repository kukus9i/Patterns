package structural.flyweight;

import structural.flyweight.spriteElements.Cloud;
import structural.flyweight.spriteElements.Ground;
import structural.flyweight.spriteElements.Tree;

import java.util.HashMap;
import java.util.Map;

public class SpritesFactory {
    private static final Map<String, Sprites> spritesMap = new HashMap<>();

    public Sprites getSprite(String spriteType) {
        Sprites sprites = spritesMap.get(spriteType);
        if (sprites == null) {
            switch (spriteType) {
                case "cloud":
                    System.out.println("Create cloud");
                    sprites = new Cloud();
                    break;
                case "tree":
                    System.out.println("Create tree");
                    sprites = new Tree();
                    break;
                case "ground":
                    System.out.println("Create ground");
                    sprites = new Ground();
                    break;
            }
            spritesMap.put(spriteType,sprites);
        }
        return sprites;
    }
}
