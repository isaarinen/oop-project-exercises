public class OrientationTask1_6 {

    public static void main(String[] args) {
        System.out.println("--- Running Simulation ---");

        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator();

        generator.generateCustomers(servicePoint, 5);

        servicePoint.serve();

        System.out.println("\n--- Simulation Report ---");
        System.out.printf("Average service time: %.2f ms%n", servicePoint.getAverageServiceTime());
    }
}