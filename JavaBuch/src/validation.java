import javax.swing.JOptionPane;

    public class validation {

        static String password;

        public static boolean IsValidInput(String s) {

            boolean status = false;
            char [] array = s.toCharArray();
            int lower=0, upper=0, digits=0;

            if (s.length() > 8)
                status = true;

            for ( int i = 0;  i < array.length; i++) {
                if(Character.isDigit(array[i]))
                    digits++;
                if(Character.isLowerCase(array[i]))
                    lower++;
                if(Character.isUpperCase(array[i]))
                    upper++;
            }

            if ( !(lower  > 0 ))
                status = false;

            if ( !(upper  > 0 ))
                status = false;

            if ( !(digits > 0 ))
                status = false;

            return status;
        }

        public static void  setPassword(String p) {
            if (IsValidInput(p)) {
                password = p;
                JOptionPane.showMessageDialog( null, " Your Password is accepted -" + p);
            }

            else {
                password ="";
                JOptionPane.showMessageDialog( null, " Your  Password is  not accepted -" + p);
            }
        }

    }


