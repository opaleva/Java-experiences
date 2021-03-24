import java.util.*;
import static javax.swing.JOptionPane.*;

class Fibonacci {
    public static void main(String[] args) {
        try {
            int count, a = 1, b = 1, i;
            List<Integer> numbers = new ArrayList<>();
            numbers.add(a);
            numbers.add(b);
            count = Integer.parseInt(showInputDialog(null,
                    "Count of numbers: ",
                    "Fibonacci sequence",
                    QUESTION_MESSAGE));
            for (i = 3; i <= count; i++) {
                b = a + b;
                a = b - a;
                numbers.add(b);
            }
            showMessageDialog(null,
                    "Fibonacci numbers are:\n" + numbers);
        } catch (NumberFormatException ex) {
            showMessageDialog(null,
                    "Goodbye :)");
        }
    }
}
