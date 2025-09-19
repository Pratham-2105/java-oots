package Assignments;

// File: MountainPartsDemo.java
public class MountainPartsDemo {

    // 1) Static field demo
    static class Counter {
        static int totalParts = 0; // shared by all
    }

    // 2) Static nested class
    static class PartFactory {
        static void makePart(String name) {
            Counter.totalParts++;
            System.out.println("[Factory] Made part: " + name + ". Total parts = " + Counter.totalParts);
        }
    }

    // 5) Interface with constants + methods
    interface MountainParts {
        String TERRAIN = "off-road"; // constant

        void setSuspension(String newValue);

        String getSuspension();

        void setType(String newValue);

        String getType();

        // 6) Nested interface inside an interface
        interface QualityCheck {
            void check();
        }
    }

    // Base class (for demonstrating super keyword)
    static class Vehicle {
        String category = "Generic Vehicle";

        void showCategory() {
            System.out.println("[Vehicle] Category: " + category);
        }
    }

    // 3) & 4) Demonstrate super + this, and implement interface
    static class Bike extends Vehicle implements MountainParts {
        private String suspension;
        private String type;

        Bike(String suspension, String type) {
            this.suspension = suspension;
            this.type = type;
        }

        @Override
        public void setSuspension(String newValue) {
            this.suspension = newValue;
        }

        @Override
        public String getSuspension() {
            return suspension;
        }

        @Override
        public void setType(String newValue) {
            this.type = newValue;
        }

        @Override
        public String getType() {
            return type;
        }

        void printDetails() {
            // using this
            System.out.println("[Bike] Terrain: " + MountainParts.TERRAIN);
            System.out.println("[Bike] Type: " + this.type + ", Suspension: " + this.suspension);

            // using super
            System.out.print("[Bike] Superclass info → ");
            super.showCategory();
        }
    }

    // 7) Nested interface inside a class
    static class Workshop {
        interface Callback {
            void onSuccess(String msg);

            void onError(String reason);
        }

        void repair(Bike bike, Callback cb) {
            if (bike.getSuspension() == null) {
                cb.onError("Suspension missing!");
            } else {
                cb.onSuccess("Repair completed for " + bike.getType());
            }
        }
    }

    // Demo runner
    public static void main(String[] args) {
        System.out.println("=== MountainParts Unified Demo ===");

        // static field + static class
        PartFactory.makePart("Frame");
        PartFactory.makePart("Wheel");

        // bike object
        Bike myBike = new Bike("Hardtail", "Mountain Bike");
        myBike.printDetails();

        // update values using interface methods
        myBike.setSuspension("Full-suspension");
        myBike.setType("Enduro Bike");
        System.out
                .println("[Main] Updated Bike → Type: " + myBike.getType() + ", Suspension: " + myBike.getSuspension());

        // nested interface in interface
        MountainParts.QualityCheck qc = () -> System.out.println("[QC] Bike passed quality check!");
        qc.check();

        // nested interface in class
        Workshop workshop = new Workshop();
        workshop.repair(myBike, new Workshop.Callback() {
            @Override
            public void onSuccess(String msg) {
                System.out.println("[Workshop] SUCCESS → " + msg);
            }

            @Override
            public void onError(String reason) {
                System.out.println("[Workshop] ERROR → " + reason);
            }
        });

        System.out.println("=== Demo Finished ===");
    }
}
