

public class LocalInner {
    private String outerField = "Outer Field";

    public void createLocalInner() {
        class LocalInnerClass {
            private String localInnerField = "Local Inner Field";

            public void display() {
                System.out.println("Accessing from Local Inner class:");
                System.out.println("Outer field: " + outerField);
                System.out.println("Local inner field: " + localInnerField);
            }
        }
        // Accessible only within this method
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    public static void main(String[] args) {
        LocalInner outer = new LocalInner();
        outer.createLocalInner(); // Invokes the method that creates and uses the local inner class
    }
}
