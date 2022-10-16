import java.util.*;

class userInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Sum or difference calculator...");

        while(true) {
            System.out.println("1) Sum");
            System.out.println("2) Difference");
            System.out.println("3) Quit");

            System.out.print("What would you like to choose: ");
            int operation = keyboard.nextInt();
            System.out.println();

            if (operation == 1) {
                System.out.print("First number: ");
                int firstAddition = keyboard.nextInt();
                System.out.print( "Second number: ");
                int secondAddition = keyboard.nextInt();
                sum(firstAddition, secondAddition);

            } else if (operation == 2) {
                System.out.print("First number: ");
                int firstDifference = keyboard.nextInt();
                System.out.print( "Second number: ");
                int secondDifference = keyboard.nextInt();
                difference(firstDifference, secondDifference);
            } else if (operation == 3) {
                quit();

            } break;
        }  
        keyboard.close();
    }

    public static double sum(int firstAddition, int secondAddition) {
        System.out.println();
        int addition = firstAddition + secondAddition;
        System.out.println("The sum of " + firstAddition + " and " + secondAddition + " is " + addition);
        return addition;
    }

    public static double difference(int firstDifference, int secondDifference) {
        System.out.println();
        int difference = firstDifference - secondDifference;
        System.out.println("The difference of " + firstDifference + " and " + secondDifference + " is " + difference);
        return difference;
    }

    public static String quit() {
        System.out.println("Good bye...");
        return null;
    }

}
