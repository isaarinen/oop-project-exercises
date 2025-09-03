public class TestSimulation {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.add(new Event(5, "Event1"));
        eventList.add(new Event(2, "Event2"));
        eventList.add(new Event(7, "Event3"));
        eventList.add(new Event(3, "Event4"));

        System.out.println("Events: " + eventList);

        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next Event: " + nextEvent);
        System.out.println("Remaining events: " + eventList);
    }
}
