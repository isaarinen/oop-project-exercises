import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String action;

        System.out.println("Customer Queue Management");
        System.out.println("Actions: 'add' to queue a new customer, 'remove' to dequeue a customer, 'exit' to quit.");

        do {
            System.out.print("\nEnter action: ");
            action = scanner.nextLine();

            if (action.equalsIgnoreCase("add")) {
                Customer newCustomer = new Customer();
                newCustomer.setStartTime(System.nanoTime());
                queue.addFirst(newCustomer);
                System.out.println("Customer " + newCustomer.getId() + " has been added to the queue.");
                System.out.println("Current queue size: " + queue.size());
            } else if (action.equalsIgnoreCase("remove")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty. No customer to remove.");
                } else {
                    Customer servedCustomer = queue.removeLast();
                    servedCustomer.setEndTime(System.nanoTime());

                    long timeInQueueNanos = servedCustomer.getSpentTime();
                    long timeInQueueMillis = timeInQueueNanos / 1_000_000;

                    System.out.println("Customer " + servedCustomer.getId() + " has been removed from the queue.");
                    System.out.println("Time spent in queue: " + timeInQueueMillis + " ms.");
                    System.out.println("Current queue size: " + queue.size());
                }
            } else if (!action.equalsIgnoreCase("exit")) {
                System.out.println("Invalid action. Please use 'add', 'remove', or 'exit'.");
            }
        } while (!action.equalsIgnoreCase("exit"));

        System.out.println("Program finished.");
        scanner.close();
    }
}