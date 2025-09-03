import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> queue;

    public EventList() {
        queue = new PriorityQueue<>();
    }
    public void add(Event e) {
        queue.add(e);
    }
    public Event getNextEvent() {
        return queue.poll();
    }
    public String toString() {
        return queue.toString();
    }
}
