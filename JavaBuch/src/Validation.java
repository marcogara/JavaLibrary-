import javax.swing.JOptionPane;

public class Validation {

    private static String password;

    public static boolean isValidInput(String s) {
        if (s.length() <= 8) {
            return false;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasLower && hasUpper && hasDigit;
    }

    public static void setPassword(String p) {
        if (isValidInput(p)) {
            password = p;
            JOptionPane.showMessageDialog(null, "Your password is accepted: " + p);
        } else {
            password = "";
            JOptionPane.showMessageDialog(null, "Your password is not accepted: " + p);
        }
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a password:");
        setPassword(input);
    }
}



