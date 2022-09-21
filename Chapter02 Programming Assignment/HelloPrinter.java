public class HelloPrinter {
    public static void main(String[]args) {
        String original = "Hello, World!";
        System.out.println("This is the original string: " + original);

        System.out.println("This is the modified version of the original string: " + 
        original.replace('o', 'a').replace('e', 'o').replace('a', 'e'));
    }
}
