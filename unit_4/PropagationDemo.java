// Exception propagation demo file
package unit_4;

public class PropagationDemo {
    static void level1() { level2(); }
    static void level2() { level3(); }
    static void level3() {
        int x = 10/0; // ArithmeticException
    }
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e.getClass().getSimpleName());
            e.printStackTrace(); // show stack trace --> where exception occurred
        }
    }
}
