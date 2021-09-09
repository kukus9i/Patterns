package com.company;


public class PatternsRunner {

    public static void main(String[] args) {

        System.out.println("--FACTORY--");

        // Factory //
        Factory factoryRoadBicycle = new CreateRoadBicycle();
        Bicycle roadBicycle = factoryRoadBicycle.createBicycle();
        System.out.println(roadBicycle.toString());

        Factory factory = FactoryPattern.getCreateType("mtb");
        Bicycle mtbBicycle = factory.createBicycle();
        System.out.println(mtbBicycle.toString());
        //////////////////////////////

        System.out.println("\n--ABSTRACT FACTORY--");

        // Abstract Factory //
        AbstractFactory mageFactory = new FactoryMageCharacter();
        AbstractFactoryPattern mage = new AbstractFactoryPattern(mageFactory);
        mage.showStatsToConsole();

        AbstractFactory warriorFactory = new FactoryWarriorCharacter();
        AbstractFactoryPattern warrior = new AbstractFactoryPattern(warriorFactory);
        warrior.showStatsToConsole();
        //////////////////////////////

        System.out.println("\n--BUILDER--");

        // Builder //
        Builder.Figure figure = new Builder.FigureBuilder()
                .buildForm("triangle")
                .buildFill("fill")
                //        .buildColor("red")
                .build();
        System.out.println(figure);
        //////////////////////////////

        System.out.println("\n--PROTOTYPE--");

        // Prototype //
        Prototype.Book book = new Prototype.Book("Patterns in Java ", "Mark Grand");
        System.out.println(book);

        Prototype.Book cloneBook = (Prototype.Book) book.clone();
        System.out.println(cloneBook);
        //////////////////////////////

        System.out.println("\n--SINGLETON--");

        // Singletone //
        Singletone s = Singletone.getInstance();
        Singletone b = Singletone.getInstance();
        System.out.println(Singletone.counter);
        //////////////////////////////
    }
}




