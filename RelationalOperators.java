public class RelationalOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Greater than
        boolean isGreater = a > b;
        System.out.println("a > b = " + isGreater); // Prints false

        // Less than
        boolean isLess = a < b;
        System.out.println("a < b = " + isLess); // Prints true

        // Equal to
        boolean isEqual = a == b;
        System.out.println("a == b = " + isEqual); // Prints false

        // Not equal to
        boolean isNotEqual = a != b;
        System.out.println("a != b = " + isNotEqual); // Prints true

        // Greater than or equal to
        boolean isGreaterOrEqual = a >= b;
        System.out.println("a >= b = " + isGreaterOrEqual); // Prints false

        // Less than or equal to
        boolean isLessOrEqual = a <= b;
        System.out.println("a <= b = " + isLessOrEqual); // Prints true
    }
}