package com.company;


public class PatternsRunner {

    public static void main(String[] args) {

        System.out.println("--FACTORY--");

        // Factory //
        Factory factoryRoadBicycle = new RoadBicycleFactory();
        Bicycle roadBicycle = factoryRoadBicycle.createBicycle();
        System.out.println(roadBicycle.toString());


        Factory factory = FactoryPattern.getCreateType("mtb");
        Bicycle mtbBicycle = factory.createBicycle();
        System.out.println(mtbBicycle.toString());
        //////////////////////////////

        System.out.println("\n--ABSTRACT FACTORY--");

        // Abstract Factory //
        AbstractFactory mageFactory = new MageCharacterFactory();
        AbstractFactoryPattern mage = new AbstractFactoryPattern(mageFactory);
        mage.showStatsToConsole();

        AbstractFactory warriorFactory = new WarriorCharacterFactory();
        AbstractFactoryPattern warrior = new AbstractFactoryPattern(warriorFactory);
        warrior.showStatsToConsole();
        //////////////////////////////

        System.out.println("\n--BUILDER--");

        // Builder //
        Shape triangle = new ShapeBuilder()
                .buildColor("red")
                .buildFill("fill")
                .buildForm("triangle")
                .build();
        System.out.println(triangle);
        //////////////////////////////

        System.out.println("\n--PROTOTYPE--");

        // Prototype //
        Book book = new Book("Patterns in Java ", "Mark Grand");
        System.out.println(book);

        Book cloneBook = (Book) book.clone();
        System.out.println(cloneBook);
        //////////////////////////////

        System.out.println("\n--SINGLETON--");

        // Singleton //
        Singletone s = Singletone.getInstance();
        Singletone b = Singletone.getInstance();
        System.out.println(Singletone.counter);
        //////////////////////////////
    }
}




