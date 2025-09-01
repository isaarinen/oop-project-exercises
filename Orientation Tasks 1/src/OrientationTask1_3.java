public class OrientationTask1_3 {
    public static void main(String[] args) {
        System.out.println("Testing Customer class...");

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        System.out.println("Created customer with ID: " + customer1.getId());
        System.out.println("Created customer with ID: " + customer2.getId());

        long c1_startTime = System.currentTimeMillis();
        customer1.setStartTime(c1_startTime);
        long c1_endTime = c1_startTime + 2000;
        customer1.setEndTime(c1_endTime);

        System.out.println("Customer " + customer1.getId() + " spent " + customer1.getSpentTime() + "ms in the system.");
    }
}