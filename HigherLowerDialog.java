import static javax.swing.JOptionPane.*;
class HigherLowerDialog {
    public static void main(String[] args) {
        try {
            int again;
            do {
                int theNumber = (int) (Math.random() * 100 + 1);
                int guess = 0, numberOfTries = 1;
                while (guess != theNumber) {
                    guess = Integer.parseInt(showInputDialog(null,
                            "Guess a number between 0 and 100:",
                            "Number",
                            QUESTION_MESSAGE));
                    if (guess < theNumber) {
                        showMessageDialog(null,
                                guess + " is lower.",
                                "Result",
                                ERROR_MESSAGE);
                    } else if (guess > theNumber) {
                        showMessageDialog(null,
                                guess + " is higher.",
                                "Result",
                                ERROR_MESSAGE);
                    } else {
                        showMessageDialog(null,
                                guess + " is correct." +
                                        "\nThe number was guessed in " + numberOfTries +" tries.",
                                "Result",
                                INFORMATION_MESSAGE);
                    }
                ++numberOfTries;
                }
                again = showConfirmDialog(null,
                        "New game?",
                        "Question",
                        YES_NO_OPTION);
            } while (again == YES_OPTION);
        } catch (NumberFormatException ex) {
            showMessageDialog(null,
                    "Goodbye :)");
        }
    }
}
