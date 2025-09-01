public class Customer {
    private static int idCounter = 1;

    private final int id;
    private long startTime;
    private long endTime;

    public Customer() {
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getSpentTime() {
        return endTime - startTime;
    }
}