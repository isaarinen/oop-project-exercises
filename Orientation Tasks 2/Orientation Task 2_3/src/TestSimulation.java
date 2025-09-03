public class TestSimulation {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.add(new Event(5, "Event1", EventType.exit));
        eventList.add(new Event(2, "Event2", EventType.exit));
        eventList.add(new Event(7, "Event3", EventType.arrival));
        eventList.add(new Event(3, "Event4", EventType.exit));

        System.out.println("Events: " + eventList);

        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next Event: " + nextEvent);
        System.out.println("Remaining events: " + eventList);
    }
}
