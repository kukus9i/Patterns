package com.company;

public class AbstractFactoryPattern {
}

interface Character {
    String getTypeCharacter();

    int getHealPoint();

    int getManaPoint();

}

interface Equipment {
    String getWeaponType();

    String getArmorType();


}

class MageChar implements Character {
    public String getTypeCharacter() {
        return "mage";
    }

    public int getHealPoint() {
        return 350;
    }

    public int getManaPoint() {
        return 300;
    }
}

class WarriorChar implements Character {
    public String getTypeCharacter() {
        return "warrior";
    }

    public int getHealPoint() {
        return 450;
    }

    public int getManaPoint() {
        return 180;
    }
}

class MageEquip implements Equipment {
    public String getWeaponType() {
        return "Voodoo Doll";
    }

    public String getArmorType() {
        return "Tunic of Devotion";
    }
}

class WarriorEquip implements Equipment {
    public String getWeaponType() {
        return "Long Sword";
    }

    public String getArmorType() {
        return "Wooden Breastplate";
    }
}

abstract class AbstractFactory {
    abstract public Character createCharacter();

    abstract public Equipment createEquipment();
}

class CreateMageCharacter extends AbstractFactory {
    public Character createCharacter() {
        return new MageChar();
    }

    public Equipment createEquipment() {
        return new MageEquip();
    }
}

class CreateWarriorCharacter extends AbstractFactory {
    public Character createCharacter() {
        return new WarriorChar();
    }

    public Equipment createEquipment() {
        return new WarriorEquip();
    }
}