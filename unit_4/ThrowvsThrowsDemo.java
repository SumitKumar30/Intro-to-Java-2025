package unit_4;

public class ThrowvsThrowsDemo {
    public static void main(String[] args) {
        try {
            // Example of 'throw' with an unchecked exception (manual validation)
            System.out.println("Validating percentage...");
            validatePercentage(120); // will 'throw' IllegalArgumentException

        } catch (IllegalArgumentException e) {
            System.out.println("Caught validation error: " + e.getMessage());
        }

        try {
            // Example of 'throws' with a checked exception (InterruptedException)
            System.out.println("\nSimulating work (may be interrupted)...");
            doWorkThatMayBeInterrupted(); // declares 'throws InterruptedException'
            System.out.println("Work completed without interruption.");
        } catch (InterruptedException e) {
            System.out.println("Caught thread interruption (checked exception): " + e);
        }
    }

    // Using 'throw' — actively throwing an (unchecked) exception on invalid input
    static void validatePercentage(int p) {
        if (p < 0 || p > 100) {
            // 'throw' creates and throws immediately
            throw new IllegalArgumentException("Percentage must be between 0 and 100. Given: " + p);
        }
        System.out.println("Valid percentage: " + p);
    }

    // Using 'throws' — declaring that this method might pass a checked exception to the caller
    static void doWorkThatMayBeInterrupted() throws InterruptedException {
        // Thread.sleep throws a CHECKED exception → must be declared or caught
        for (int i = 3; i >= 1; i++) {
            System.out.println("Working... " + i);
            Thread.sleep(1000); // may throw InterruptedException
            if( i == 10)
                throw new InterruptedException("Simulated interruption!");
        }
    }
}

