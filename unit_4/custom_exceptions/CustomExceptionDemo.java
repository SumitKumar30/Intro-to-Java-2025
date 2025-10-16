package unit_4.custom_exceptions;

class AgeValidationException extends Exception { // checked exception
    String msg;
    public AgeValidationException(String message) {
        // super(message);
        this.msg = message;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            registerStudent("Aarav", 14); // will fail business rule
        } catch (AgeValidationException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        try {
            registerStudent("Neha", 19); // will pass
            System.out.println("Registration successful for Neha.");
        } catch (AgeValidationException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    // Declares it may throw our custom CHECKED exception
    static void registerStudent(String name, int age) throws AgeValidationException {
        if (age < 16) {
            // Business rule violation → throw custom checked exception
            throw new AgeValidationException("Minimum age is 16. Given: " + age + " (Student: " + name + ")");
        }
        // proceed with registration...
        System.out.println("Registered: " + name + " (" + age + ")");
    }

}
