public class Event implements Comparable<Event> {
    private int time;
    private String event;
    private EventType type;
    public Event(int time, String event,  EventType type) {
        this.time = time;
        this.event = event;
        this.type = type;
    }
    public int compareTo(Event other) {
        return Integer.compare(this.time, other.time);
    }
    public String toString() {
        return "(" + event + ", " + time + ", " + type + ")";
    }
}

