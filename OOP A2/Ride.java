import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRider;
    private Employee operator;
    private Queue<Visitor> queue;
    private List<Visitor> history;
    private int numOfCycles;

    public Ride(String rideName, int maxRider) {
        this.rideName = rideName;
        this.maxRider = maxRider;
        this.queue = new LinkedList<>();
        this.history = new LinkedList<>();
        this.numOfCycles = 0;
    }

    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
    }

    public void removeVisitorFromQueue() {
        if (!queue.isEmpty()) {
            queue.poll();
            System.out.println("A visitor has been removed from the queue.");
        } else {
            System.out.println("The queue is empty.");
        }
    }

    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("No visitors in the queue.");
            return;
        }
        System.out.println("Visitors in queue:");
        for (Visitor visitor : queue) {
            System.out.println(visitor.getName() + " - " + visitor.getId());
        }
    }

    public void addVisitorToHistory(Visitor visitor) {
        history.add(visitor);
    }

    public void runOneCycle() {
        int count = 0;
        while (!queue.isEmpty() && count < maxRider) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
            count++;
        }
        numOfCycles++;
    }

    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        for (Visitor visitor : history) {
            System.out.println(visitor.getName() + " - " + visitor.getId());
        }
    }

    public void sortRideHistory() {
        history.sort(Comparator.comparing(Visitor::getName));
    }

    public void exportRideHistory() {
        // Here we can implement file writing functionality
        System.out.println("Exporting ride history to file...");
    }

    public void importRideHistory() {
        // Here we can implement file reading functionality
        System.out.println("Importing ride history from file...");
    }

    public int numberOfVisitors() {
        return history.size();
    }
}
