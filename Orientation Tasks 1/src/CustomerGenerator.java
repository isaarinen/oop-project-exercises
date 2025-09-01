public class CustomerGenerator {

    public void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {
        System.out.println("Generating " + numberOfCustomers + " customers...");
        for (int i = 0; i < numberOfCustomers; i++) {
            servicePoint.addToQueue(new Customer());
        }
    }
}