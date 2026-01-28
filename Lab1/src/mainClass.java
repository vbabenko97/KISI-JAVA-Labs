import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {
    private static final int DIVISOR_THREE = 3;
    private static final int DIVISOR_NINE = 9;

    private static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static List<Integer> readNumbers(Scanner scanner, int count) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(readInt(scanner, "Add number: "));
        }
        return numbers;
    }

    private static void printDivisibleMessages(List<Integer> numbers) {
        for (int number : numbers) {
            if (isDivisibleBy(number, DIVISOR_THREE)) {
                System.out.println(number + ", can be divided by 3");
            }
            if (isDivisibleBy(number, DIVISOR_NINE)) {
                System.out.println(number + ", can be divided by 9");
            }
        }
    }

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello, my friend! This is the first lab");
        int num = readInt(myObj, "For start to working please input num of number you want to put in array: ");
        System.out.println("\nNice! Now, let's create our array:");
        List<Integer> arrayList = readNumbers(myObj, num);
        System.out.println("\nOur array:");
        System.out.println(arrayList);
        System.out.println("\nAnd now let's look which elements can be divided by 3 or 9:");
        printDivisibleMessages(arrayList);
    }
}
