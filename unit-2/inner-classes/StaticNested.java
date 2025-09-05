// Static Nested Inner Class - behaves like a static member of the outer class
// It can be instantiated without an instance of the outer class.
public class StaticNested {
    private static String staticOuterField = "Static Outer Field";

    public static class Nested {
        private String nestedField = "Nested Field";

        public void display() {
            System.out.println("Accessing from Nested class:");
            System.out.println("Static outer field: " + staticOuterField);
            System.out.println("Nested field: " + nestedField);
        }
    }

    public static void main(String[] args) {
        StaticNested.Nested nested = new StaticNested.Nested(); // Can create an instance without an outer class instance
        nested.display();
    }
}
