public class CentralQueueSystem {
    private static CentralQueueSystem instance;
    private int currentQueueNumber;

    // Private constructor for Singleton Pattern
    private CentralQueueSystem() {
        this.currentQueueNumber = 0; // Queue starts at 0
    }

    // Method to get the single instance of CentralQueueSystem
    public static synchronized CentralQueueSystem getInstance() {
        if (instance == null) {
            instance = new CentralQueueSystem();
        }
        return instance;
    }

    // Method to get the next queue number for a new visitor
    public synchronized int getNextQueueNumber() {
        return ++currentQueueNumber;
    }

    // Method to reset the current queue number based on an inputted number
    public synchronized void resetQueueNumber(int newStartNumber) {
        if (newStartNumber >= 0) {
            currentQueueNumber = newStartNumber;
            System.out.println("Queue number has been reset to: " + currentQueueNumber);
        } else {
            System.out.println("Invalid reset number. Queue number remains at: " + currentQueueNumber);
        }
    }

    // Method to display the current queue number (for monitoring system)
    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    // Simulates a help desk serving the next customer
    public void serveNextCustomer(String helpDeskName) {
        int queueNumber = getNextQueueNumber();
        System.out.println(helpDeskName + " serving customer with queue number: " + queueNumber);
    }
}