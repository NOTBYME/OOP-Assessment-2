public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);

    void removeVisitorFromQueue();

    void runOneCycle();

    void printRideHistory();

    void sortRideHistory();

    void exportRideHistory();

    void importRideHistory();

    int numberOfVisitors();
}
