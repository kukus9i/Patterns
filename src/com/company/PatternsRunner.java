package com.company;

public class PatternsRunner {

    public static void main(String[] args) {

        Factory.FactoryBicycle create = Factory.getCreationalType("mtb"); //type "road" or "mtb"
        Factory.Bicyle bike = create.createbike();
        bike.createBicycle();

    }
}




