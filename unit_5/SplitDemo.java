public class SplitDemo {
    public static void main(String[] args) {
        String text  = "North@Cap@University";
        String[] parts = text.split("@", 3); // Limit to 2 parts
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
