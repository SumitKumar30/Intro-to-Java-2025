package unit_4;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            // System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
            // int result = 10 / 0; // This will throw ArithmeticException
            // System.out.println("Result: " + result);
            
            // Uncommenting the line below will throw NullPointerException
            // String str = null;   
            // System.out.println(str.length());
            
            // Uncommenting the line below will throw NumberFormatException
            // int num = Integer.parseInt("abc");
            // System.out.println("Parsed number: " + num);

            // Uncommenting the line below will throw ClassCastException
            Object obj = new Integer(10);
            String str = (String) obj;
            System.out.println("Casted string: " + str);

            // another example of class cast exception
            Object obj = new String("Hello");
            Integer num2 = (Integer) obj; // This will throw ClassCastException
            System.out.println("Casted number: " + num2);

            // Uncommenting the line below will throw IllegalArgumentException
            Thread.sleep(-1000);
            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
