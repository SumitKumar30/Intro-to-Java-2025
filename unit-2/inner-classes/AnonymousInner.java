// Anonymous Inner Class - a class without a name, defined and instantiated in one step
// It can be used to implement interfaces or extend classes on the fly.
// Example - using custom sorting with an anonymous inner class

public class AnonymousInner {
    private String outerField = "Outer Field";

    public void createAnonymousInner() {
        // Anonymous inner class implementing an interface
        Runnable runnable = new Runnable() {
            private String innerField = "Anonymous Inner Field";

            @Override
            public void run() {
                System.out.println("Accessing from Anonymous Inner class:");
                System.out.println("Outer field: " + outerField);
                System.out.println("Inner field: " + innerField);
            }
        };
        runnable.run(); // Invokes the run method of the anonymous inner class
    }

    public static void main(String[] args) {
        AnonymousInner outer = new AnonymousInner();
        outer.createAnonymousInner(); // Invokes the method that creates and uses the anonymous inner class
    }
}
