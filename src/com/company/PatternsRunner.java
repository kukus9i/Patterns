package com.company;

public class PatternsRunner {

    public static void main(String[] args) {

        Factory.FactoryBicycle create = Factory.getCreationalType("mtb"); //type "road" or "mtb"
        Factory.Bicyle bike = create.createbike();
        bike.createBicycle();


        AbstractFactory.FactoryFile make = AbstractFactory.getCreationalType("two"); //type "first" or "two"
        AbstractFactory.Document document = make.getDocument();
        AbstractFactory.MusicFile music = make.getMusic();
        AbstractFactory.Pictures pictures = make.getPictures();

        document.createDocument();
        music.createMusic();
        pictures.createPictures();

    }
}




