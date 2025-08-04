class FirstProgram{
   
    public static void main(String args []){
        System.out.println("Hello, World!");
        int number = 54321;
        System.out.println("The number is: " + number);

        // This is a single-line comment explaining the next line of code
        /*
        program to add digits of a five digit number and print the sum
        */ 

        int sum = 0;
        int temp1 = number % 10 ; // Get the last digit 
        int temp2 = (number / 10) % 10; // Get the second last digit
        int temp3 = (number / 100) % 10; // Get the third last digit
        int temp4 = (number / 1000) % 10; // Get the fourth last digit
        int temp5 = (number / 10000) % 10; // Get the fifth last digit
        sum = temp1 + temp2 + temp3 + temp4 + temp5; // Add all digits together
        System.out.println("The sum of the digits is: " + sum);

        // convert the given temperature from Celsius to Fahrenheit
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }
}