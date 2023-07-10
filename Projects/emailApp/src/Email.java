/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Email{

    private String mainEmailAddress;
    private String firstNameEmailOwner;
    private String lastNameEmailOwner;
    private String emailPassword;
    private int mailBoxCapacity = 500 ;
    private String department;
    private String alternateEmailAddress;

    private String companySuffix = "bestcompany.com";

    public Email(String firstNameEmailOwner,String lastNameEmailOwner) {

        this.firstNameEmailOwner = firstNameEmailOwner;

        this.lastNameEmailOwner = lastNameEmailOwner;

        this.department = setDepartment();

        // Call a method that return the Password
        this.emailPassword = generateEmailPassword();

        // Combine Elements to generate Email
        mainEmailAddress = firstNameEmailOwner.toLowerCase(Locale.ROOT) + "." + lastNameEmailOwner +"@"+department.toLowerCase(Locale.ROOT) +"."+ companySuffix;
        System.out.println("Email address is : " + mainEmailAddress);

    }

    private String setDepartment()
    {
        System.out.println("Enter the department\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice==1) return "sales";
        else if (depChoice==2) return "development";
        else if (depChoice==3) return  "accounting";
        else return "";

    }
    public void setEmailPassword(String emailPassword)
    {
        this.emailPassword = emailPassword;
    }

    public int getMailBoxCapacity()
    {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(int mailBoxCapacity)
    {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getAlternateEmailAddress()
    {
        return alternateEmailAddress;
    }

    public void setAlternateEmailAddress(String alternateEmailAddress)
    {
        this.alternateEmailAddress = alternateEmailAddress;
    }

    public String getAllEmailInfo()
    {
        return  firstNameEmailOwner + " " + " " +  mainEmailAddress + " " + alternateEmailAddress + " " + mailBoxCapacity ;
    }

    // generate password ...
    private String generateEmailPassword()
    {
        int passwordLenght= 10;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder emailPassword = new StringBuilder();
        Random rand = new Random();

        for (int i=0; i< passwordLenght;i++)
        {
            int index = rand.nextInt(chars.length());
            char c = chars.charAt(index);
            emailPassword.append(c);
        }

        return String.valueOf(emailPassword);
    }
}

