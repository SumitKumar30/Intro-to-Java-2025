public class RegularInner {
    private String outerField = "Outer Field";

    public class Inner {
        private String innerField = "Inner Field";

        public void display() {
            System.out.println("Accessing from Inner class:");
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }

    public static void main(String[] args) {
        RegularInner outer = new RegularInner();
        RegularInner.Inner inner = outer.new Inner();       // Needs an instance of the outer class to create its object
        inner.display();
    }
}
