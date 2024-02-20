package cl.challenges.threads;

public class ThreadsGame extends Thread {
	
	private static int counter = 0;
	
	public static void main(String[] args) {
		
		
		// Create a new thread
        Thread specificThread = new Thread(() -> {
        	
            // Your code here
            System.out.println("Running in a specific created thread: " + Thread.currentThread().getName());
            
            // Instantiate and run the Main class
            ThreadsGame mainInstance = new ThreadsGame();
            mainInstance.run();
        });

        // Start the specific thread
        specificThread.start();
        
        // Main thread increment value
        for (int i = 0; i < 1000; i++) {
        	counter++;
        }        
        
        // Wait for additional thread to finish
        
        /*
        try {
        	specificThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
		
		
		System.out.println("Running in Main body thread: " + Thread.currentThread().getName());
		System.out.println(counter +" on main method");

	}
	
	
	// Method that contains the logic you want to run in the specific thread
    public void run() {
    	
        // Your code here
        System.out.println("Running in a specific thread (inside run method): " + Thread.currentThread().getName());    	
    	
        // Your code here
        
        for (int i = 0; i < 1000; i++) {
        	counter++;
        }
        
        System.out.println(counter +" on run for thread");
    }

}
