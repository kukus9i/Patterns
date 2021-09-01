package com.company;


public class PatternsRunner {

    public static void main(String[] args) {

        System.out.println("--FACTORY--");

        // Factory //
        Factory.FactoryBicycle create = Factory.getCreationalType("mtb"); //type "road" or "mtb"
        Factory.Bicyle bike = create.createbike();
        bike.createBicycle();
        //////////////////////////////

        System.out.println("\n--ABSTRACT FACTORY--");

        // Abstract Factory //
        AbstractFactory.FactoryFile make = AbstractFactory.getCreationalType("two"); //type "first" or "two"
        AbstractFactory.Document document = make.getDocument();
        AbstractFactory.MusicFile music = make.getMusic();
        AbstractFactory.Pictures pictures = make.getPictures();

        document.createDocument();
        music.createMusic();
        pictures.createPictures();
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
        Prototype.Book book = new Prototype.Book("Patterns in Java ","Mark Grand");
        System.out.println(book);

        Prototype.Book cloneBook = (Prototype.Book)book.clone();
        System.out.println(cloneBook);

    }
}




