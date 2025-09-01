import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int servedCustomersCount = 0;

    public void addToQueue(Customer customer) {
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
    }

    public Customer removeFromQueue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeLast();
    }

    public void serve() {
        System.out.println("\nService point starting to serve customers...");
        while (!queue.isEmpty()) {
            Customer customer = queue.removeLast();
            long arrivalTime = customer.getStartTime();
            long serviceStartTime = System.nanoTime();

            long serviceTime = (long) (Math.random() * 2000 + 500);
            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long serviceEndTime = System.nanoTime();
            customer.setEndTime(serviceEndTime);

            long waitingTime = (serviceStartTime - arrivalTime) / 1_000_000;
            long responseTime = (serviceEndTime - arrivalTime) / 1_000_000;

            totalServiceTime += serviceTime;
            servedCustomersCount++;

            System.out.println("----------------------------------------");
            System.out.println("Served Customer ID: " + customer.getId());
            System.out.println("Waiting time in queue: " + waitingTime + " ms");
            System.out.println("Service time: " + serviceTime + " ms");
            System.out.println("Response time (wait + service): " + responseTime + " ms");
        }
        System.out.println("\nAll customers have been served. Queue is empty.");
    }

    public double getAverageServiceTime() {
        if (servedCustomersCount == 0) {
            return 0.0;
        }
        double averageMs = (double) totalServiceTime / servedCustomersCount;
        return averageMs;
    }
}