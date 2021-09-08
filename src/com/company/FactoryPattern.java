package com.company;


public class FactoryPattern {
    public static Factory getCreateType(String type) {
        if (type.equals("mtb")) return new CreateMtbBicycle();
        if (type.equals("road")) return new CreateRoadBicycle();
        else throw new RuntimeException("not valid creation type" + type);
    }

}

abstract class Factory {
    abstract public Bicycle createBicycle();
}

class CreateMtbBicycle extends Factory {
    public Bicycle createBicycle() {
        return new MtbBicycle();
    }
}

class CreateRoadBicycle extends Factory {
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

class BicycleStat {
    String typeBicycle;
    String environment;
    int wheelDiameter;
    int maxSpeed;

    public String toString() {
        return "Bicycle created\n" + "Bicycle type\t" + typeBicycle + "\nWhell\t" + wheelDiameter +
                " inch\nMax speed\t" + maxSpeed + "\nEnvironment:\t" + environment;
    }

}

class MtbBicycle extends BicycleStat implements Bicycle {
    MtbBicycle() {
        this.typeBicycle = "MTB";
        this.environment = "designed for mountains";
        this.wheelDiameter = 29;
        this.maxSpeed = 50;
    }

    public String getTypeBicycle() {
        return typeBicycle;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}

class RoadBicycle extends BicycleStat implements Bicycle {
    RoadBicycle() {
        this.typeBicycle = "Road";
        this.environment = "designed for road";
        this.wheelDiameter = 28;
        this.maxSpeed = 60;
    }

    public String getTypeBicycle() {
        return typeBicycle;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}

