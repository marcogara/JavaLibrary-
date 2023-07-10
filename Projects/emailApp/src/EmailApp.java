/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/

public class EmailApp {

        public static void main(String[] args) {

            Email em1 = new Email("John" ,"Smith");

            em1.setEmailPassword("John@kmail.com");

            em1.setMailBoxCapacity(600);

            em1.setAlternateEmailAddress("bla@gmail.com");

            System.out.println(em1.getAllEmailInfo());

        }

    }





