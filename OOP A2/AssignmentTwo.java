
public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        System.out.println("Part 3 - Queue Interface Demo:");

        Ride ride = new Ride("Roller Coaster", 5);
        Visitor visitor1 = new Visitor("Jennifer", 25, "A001");
        Visitor visitor2 = new Visitor("Alan", 22, "A002");
        Visitor visitor3 = new Visitor("Luke", 30, "A003");
        Visitor visitor4 = new Visitor("Charlie", 28, "A004");
        Visitor visitor5 = new Visitor("Ger", 20, "A005");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.printQueue();

        ride.removeVisitorFromQueue();
        ride.printQueue();
    }

    public void partFourA() {
        System.out.println("Part 4A - Collection Class (LinkedList) Demo:");

        Ride ride = new Ride("Water Slide", 4);
        Visitor visitor1 = new Visitor("Jennifer", 25, "A001");
        Visitor visitor2 = new Visitor("Alan", 22, "A002");
        Visitor visitor3 = new Visitor("Luke", 30, "A003");
        Visitor visitor4 = new Visitor("Charlie", 28, "A004");
        Visitor visitor5 = new Visitor("Ger", 20, "A005");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.runOneCycle();
        ride.printRideHistory();

        System.out.println("Visitor count: " + ride.numberOfVisitors());
    }

    public void partFourB() {
        System.out.println("Part 4B - Sorting the Collection Demo:");

        Ride ride = new Ride("Ferris Wheel", 3);
        Visitor visitor1 = new Visitor("Jennifer", 25, "A001");
        Visitor visitor2 = new Visitor("Alan", 22, "A002");
        Visitor visitor3 = new Visitor("Luke", 30, "A003");
        Visitor visitor4 = new Visitor("Charlie", 28, "A004");
        Visitor visitor5 = new Visitor("Ger", 20, "A005");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.runOneCycle();
        ride.sortRideHistory();
        ride.printRideHistory();
    }

    public void partFive() {
        System.out.println("Part 5 - Run Ride Cycle Demo:");

        Ride ride = new Ride("Roller Coaster", 3);
        Visitor visitor1 = new Visitor("Jennifer", 25, "A001");
        Visitor visitor2 = new Visitor("Alan", 22, "A002");
        Visitor visitor3 = new Visitor("Luke", 30, "A003");
        Visitor visitor4 = new Visitor("Charlie", 28, "A004");
        Visitor visitor5 = new Visitor("Ger", 20, "A005");
        Visitor visitor6 = new Visitor("Frank", 23, "A006");
        Visitor visitor7 = new Visitor("Grace", 26, "A007");
        Visitor visitor8 = new Visitor("Lucas", 27, "A008");
        Visitor visitor9 = new Visitor("Ivy", 29, "A009");
        Visitor visitor10 = new Visitor("Hitman", 32, "A010");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        ride.printQueue();
        ride.runOneCycle();
        ride.printQueue();
        ride.printRideHistory();
    }

    public void partSix() {
        System.out.println("Part 6 - Writing to a File Demo:");

        Ride ride = new Ride("Space Shuttle", 2);
        Visitor visitor1 = new Visitor("Jennifer", 25, "A001");
        Visitor visitor2 = new Visitor("Alan", 22, "A002");
        Visitor visitor3 = new Visitor("Luke", 30, "A003");
        Visitor visitor4 = new Visitor("Charlie", 28, "V004");
        Visitor visitor5 = new Visitor("Ger", 20, "A005");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.runOneCycle();
        ride.exportRideHistory();
    }

    public void partSeven() {
        System.out.println("Part 7 - Reading from a File Demo:");

        Ride ride = new Ride("Roller Coaster", 3);
        ride.importRideHistory();
        ride.printRideHistory();
    }
}
