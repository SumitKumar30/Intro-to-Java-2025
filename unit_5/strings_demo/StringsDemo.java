package strings_demo;
// Demonstration of Strings in Java
public class StringsDemo {
    
    public static void main(String[] args) {
        // Creating strings using literals
        String str1 = "Hello, World!";
        System.out.println("Printing memory locations:"+str1.hashCode());

        str1 = "Hello, Java!";
        System.out.println("Printing memory locations after modification:"+str1.hashCode());

       // String str20 = str1;
    
        String str2 = "Hello, World!";
        String str15 = new String("Hello, World!");

        System.out.println("Are Str1 and Str2 the same object? " + (str1 == str15));

        // Creating strings using the 'new' keyword
        String str3 = new String("Welcome to Strings in Java");
        String str4 = new String("Strings are immutable");

        // Displaying the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);

        // Demonstrating some common string methods
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Substring of str2 (5 to 11): " + str2.substring(5, 11));
        System.out.println("Concatenation of str1 and str2: " + str1.concat(" " + str2));
        System.out.println("Index of 'Java' in str2: " + str2.indexOf("Java"));
        System.out.println("Replacing 'World' with 'Java' in str1: " + str1.replace("World", "Java"));
        System.out.println("Uppercase str4: " + str4.toUpperCase());
        System.out.println("Lowercase str3: " + str3.toLowerCase());

        // Demonstrating string comparison
        String str5 = "hello, world!";
        System.out.println("str1 equals str5: " + str1.equals(str5));
        System.out.println("str1 equalsIgnoreCase str5: " + str1.equalsIgnoreCase(str5));

        // Demonstrating trimming of whitespace
        String str6 = "   Trim me!   ";
        System.out.println("Before trim: '" + str6 + "'");
        System.out.println("After trim: '" + str6.trim() + "'");

        // Demonstrating splitting a string
        String str7 = "apple,banana,cherry";
        String[] fruits = str7.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Demonstrating StringBuilder for mutable strings
        StringBuilder sb = new StringBuilder("Mutable String");
        sb.append(" Example");
        System.out.println("StringBuilder content: " + sb.toString());

    }


}
