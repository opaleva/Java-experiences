import java.util.*;
import static javax.swing.JOptionPane.*;

class FibonacciRecursion {
    static int a = 1, b = 1, i = 0;
    static List<Integer> numbers = new ArrayList<>();

    static void sequence(int number) {
        if (number > 0) {
            i = a + b;
            a = b;
            b = i;
            numbers.add(i);
            sequence(number - 1);
        }
    }

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(showInputDialog(null,
                    "Count of numbers: ",
                    "Fibonacci sequence",
                    QUESTION_MESSAGE));
            numbers.add(a);
            numbers.add(b);
            sequence(number - 2);
            showMessageDialog(null,
                        numbers);
        } catch (NumberFormatException ex) {
            showMessageDialog(null,
                    "Goodbye :)");
        }
    }
}
