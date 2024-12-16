public class Visitor extends Person {
    private String ticketType;
    private boolean hasFastPass;

    public Visitor() {
    }

    public Visitor(String name, int age, String id) {
        super(name, age, id);
        this.ticketType = "Regular";
        this.hasFastPass = false;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean hasFastPass() {
        return hasFastPass;
    }

    public void setHasFastPass(boolean hasFastPass) {
        this.hasFastPass = hasFastPass;
    }
}
