public class PagibigOfficeSystem {
    public static void main(String[] args) {
        CentralQueueSystem queueSystem = CentralQueueSystem.getInstance();

        // Simulate help desks serving customers
        queueSystem.serveNextCustomer("Help Desk 1");
        queueSystem.serveNextCustomer("Help Desk 2");
        queueSystem.serveNextCustomer("Help Desk 3");

        // Display the current queue number for online monitoring
        System.out.println("Current queue number for monitoring: " + queueSystem.getCurrentQueueNumber());

        // Reset the queue number to a specific value
        queueSystem.resetQueueNumber(18);

        // Display the updated queue number after reset
        System.out.println("Updated queue number for monitoring: " + queueSystem.getCurrentQueueNumber());

        // Serve the next customer after resetting the queue
        queueSystem.serveNextCustomer("Help Desk 1");
    }
}