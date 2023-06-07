import javax.swing.JOptionPane;

public class PasswordValidator {

    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final String REQUIRED_CHARACTER_TYPES = ".*[a-z].*[A-Z].*[0-9].*";

    public static boolean isValidPassword(String password) {
        return password.length() >= MIN_PASSWORD_LENGTH && password.matches(REQUIRED_CHARACTER_TYPES);
    }

    public static void setPassword(String password) {
        String validityMessage = isValidPassword(password) ? "valid" : "invalid";
        String message = "Your password is " + validityMessage + ": " + password;

        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a password:");
        setPassword(input);
    }
}




