package com.company;

import java.util.Date;

public class Factory {

    public static FactoryBicycle getCreationalType(String type) {
        if (type.equals("road"))
            return new RoadBikeFactory();
        else if (type.equals("mtb"))
            return new MTBBikeFactory();
        throw new RuntimeException(" not valid type of bicycle");
    }

    interface Bicyle {
        void createBicycle();
    }

    interface FactoryBicycle {
        Bicyle createbike();
    }

    static class MtbBicycle implements Bicyle {
        @Override
        public void createBicycle() {
            System.out.println("MTB bicycle created at");
            System.out.println(new Date());
        }
    }

    static class RoadBicycle implements Bicyle {
        @Override
        public void createBicycle() {
            System.out.println("Road bicycle created at");
            System.out.println(new Date());
        }
    }

    static class MTBBikeFactory implements FactoryBicycle {

        @Override
        public Bicyle createbike() {
            return new MtbBicycle();
        }
    }

    static class RoadBikeFactory implements FactoryBicycle {

        @Override
        public Bicyle createbike() {
            return new RoadBicycle();
        }
    }

}


