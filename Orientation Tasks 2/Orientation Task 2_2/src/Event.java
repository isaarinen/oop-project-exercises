public class Event implements Comparable<Event> {
    private int time;
    private String event;
    public Event(int time, String event) {
        this.time = time;
        this.event = event;
    }
    public int compareTo(Event other) {
        return Integer.compare(this.time, other.time);
    }
    public String toString() {
        return "(" + event + ", " + time + ")";
    }
}

