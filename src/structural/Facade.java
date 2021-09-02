package structural;

public class Facade {


    void allertsOn() {
        FacadeAllertOn status = new FacadeAllertOn();
        status.lightEmergency();
        status.openLocks();
        status.powerHood();
        status.sendAllert();
        System.out.println("");
    }

    void allertsOff() {
        FacadeAllertOff status = new FacadeAllertOff();
        status.lightEmergency();
        status.openLocks();
        status.powerHood();
        status.sendAllert();
        System.out.println("");
    }

    interface Allert {
        void lightEmergency();

        void openLocks();

        void powerHood();

        void sendAllert();
    }


    static class FacadeAllertOn implements Allert {
        @Override
        public void lightEmergency() {
            System.out.println("ligt the Emergency light");

        }

        @Override
        public void openLocks() {
            System.out.println("Open all door locks");
        }

        @Override
        public void powerHood() {
            System.out.println("Turn on the hood");
        }

        @Override
        public void sendAllert() {
            System.out.println("Send allert ");
        }


    }

    static class FacadeAllertOff implements Allert {
        @Override
        public void lightEmergency() {
            System.out.println("Turn off the Emergency light");

        }

        @Override
        public void openLocks() {
            System.out.println("Close all door locks");
        }

        @Override
        public void powerHood() {
            System.out.println("Turn off the hood");
        }

        @Override
        public void sendAllert() {
            System.out.println("Send allert completed ");
        }


    }

}
