import javax.swing.JOptionPane;

public class Validation {

    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final String REQUIRED_CHARACTER_TYPES = ".*[a-z].*[A-Z].*[0-9].*";
    private static String password;

    public static boolean isValidInput(String s) {
        if (s.length() < MIN_PASSWORD_LENGTH) {
            return false;
        }

        return s.matches(REQUIRED_CHARACTER_TYPES);
    }

    public static void setPassword(String p) {
        StringBuilder message = new StringBuilder();
        if (isValidInput(p)) {
            password = p;
            message.append("Your password is accepted: ").append(p);
        } else {
            password = "";
            message.append("Your password is not accepted: ").append(p);
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a password:");
        setPassword(input);
    }
}




