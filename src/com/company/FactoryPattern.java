package com.company;


public class FactoryPattern {
    public static Factory getCreateType(String type) {
        if (type.equals("mtb")) return new MtbBicycleFactory();
        if (type.equals("road")) return new RoadBicycleFactory();
        else throw new RuntimeException("not valid creation type" + type);
    }

}

abstract class Factory {
    abstract public Bicycle createBicycle();
}

class MtbBicycleFactory extends Factory {
    public Bicycle createBicycle() {
        return new MtbBicycle();
    }
}

class RoadBicycleFactory extends Factory {
    public Bicycle createBicycle() {
        return new RoadBicycle();
    }
}

interface Bicycle {
    String getTypeBicycle();

    String getEnvironment();

    int getWheelDiameter();

    int getMaxSpeed();

}


class MtbBicycle implements Bicycle {
    private BicycleOptions bicycleStat;

    MtbBicycle() {
        bicycleStat = new BicycleOptions("MTB", "designed for mountains", 29, 50);
    }


    public String getTypeBicycle() {
        return bicycleStat.getOptionsTypeBicycle();
    }

    public String getEnvironment() {
        return this.bicycleStat.getOptionsEnvironment();
    }

    public int getWheelDiameter() {
        return this.bicycleStat.getOptionsWheelDiameter();
    }

    public int getMaxSpeed() {
        return bicycleStat.getOptionsMaxSpeed();
    }

    public String toString() {
        return bicycleStat.toStringOptions();
    }

}

class RoadBicycle implements Bicycle {
    private BicycleOptions bicycleStat;

    RoadBicycle() {
        bicycleStat = new BicycleOptions("Road", "designed for road", 28, 60);
    }


    public String getTypeBicycle() {
        return bicycleStat.getOptionsTypeBicycle();
    }

    public String getEnvironment() {
        return this.bicycleStat.getOptionsEnvironment();
    }

    public int getWheelDiameter() {
        return this.bicycleStat.getOptionsWheelDiameter();
    }

    public int getMaxSpeed() {
        return bicycleStat.getOptionsMaxSpeed();
    }

    public String toString() {
        return bicycleStat.toStringOptions();
    }

}

class BicycleOptions {
    private String typeBicycle;
    private String environment;
    private int wheelDiameter;
    private int maxSpeed;

    BicycleOptions(String typeBicycle, String environment, int wheelDiameter, int maxSpeed) {
        this.typeBicycle = typeBicycle;
        this.environment = environment;
        this.wheelDiameter = wheelDiameter;
        this.maxSpeed = maxSpeed;
    }

    public String toStringOptions() {
        return "Bicycle created\n" + "Bicycle type\t" + typeBicycle + "\nWhell\t" + wheelDiameter +
                " inch\nMax speed\t" + maxSpeed + "\nEnvironment:\t" + environment;
    }

    public int getOptionsMaxSpeed() {
        return this.maxSpeed;
    }


    public String getOptionsEnvironment() {
        return this.environment;
    }

    public int getOptionsWheelDiameter() {
        return this.wheelDiameter;
    }

    public String getOptionsTypeBicycle() {
        return this.typeBicycle;
    }

}
