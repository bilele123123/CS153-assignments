public class replaceTester {
    public static void main(String[]args) {
        String original = "Mississippi";
        String modifiedOriginal = original
        .replace("i", "!")
        .replace("s", "$");
        System.out.println("This is the original string: " + original + "\nThis is the new modified string: " + modifiedOriginal);
    }
}
