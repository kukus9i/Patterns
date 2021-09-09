package com.company;

public class AbstractFactoryPattern {
    private Character character;
    private Equipment equipment;

    public AbstractFactoryPattern(AbstractFactory factory) {
        character = factory.createCharacter();
        equipment = factory.createEquipment();
    }

    public void showStatsToConsole() {
        System.out.println(character);
        System.out.println(equipment);
    }

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

class StatsToString {
    public String toStringCharacterStat(Character character) {
        return "\nCharacter created\nType:\t" + character.getTypeCharacter() + "\nHP:\t" +
                character.getHealPoint() + "\nMP:\t" + character.getManaPoint();
    }

    public String toStringEquipStat(Equipment equipment) {
        return "Weapon:\t" + equipment.getWeaponType() +
                "\nArmor:\t" + equipment.getArmorType();
    }
}


class MageChar extends StatsToString implements Character {
    public String getTypeCharacter() {
        return "mage";
    }

    public int getHealPoint() {
        return 350;
    }

    public int getManaPoint() {
        return 300;
    }

    public String toString() {
        return toStringCharacterStat(this);
    }
}

class WarriorChar extends StatsToString implements Character {
    public String getTypeCharacter() {
        return "warrior";
    }

    public int getHealPoint() {
        return 450;
    }

    public int getManaPoint() {
        return 180;
    }

    public String toString() {
        return toStringCharacterStat(this);
    }
}

class MageEquip extends StatsToString implements Equipment {
    public String getWeaponType() {
        return "Voodoo Doll";
    }

    public String getArmorType() {
        return "Tunic of Devotion";
    }

    public String toString() {
        return toStringEquipStat(this);
    }
}

class WarriorEquip extends StatsToString implements Equipment {
    public String getWeaponType() {
        return "Long Sword";
    }

    public String getArmorType() {
        return "Wooden Breastplate";
    }

    public String toString() {
        return toStringEquipStat(this);
    }
}

abstract class AbstractFactory {
    abstract public Character createCharacter();

    abstract public Equipment createEquipment();
}

class FactoryMageCharacter extends AbstractFactory {
    public Character createCharacter() {
        return new MageChar();
    }

    public Equipment createEquipment() {
        return new MageEquip();
    }
}

class FactoryWarriorCharacter extends AbstractFactory {
    public Character createCharacter() {
        return new WarriorChar();
    }

    public Equipment createEquipment() {
        return new WarriorEquip();
    }
}