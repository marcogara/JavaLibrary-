import java.util.Random;
import java.util.Scanner;

//  https://www.youtube.com/watch?v=U3Ibvu0htNs

public class Email {

    private String mainEmailAddress;
    private String firstNameEmailOwner;
    private String lastNameEmailOwner;
    private String emailPassword;
    private int mailBoxCapacity ;
    private String department;
    private String alternateEmailAddress;

    // Constructor only with first and last name
    public Email(String firstNameEmailOwner,String lastNameEmailOwners) {

        this.firstNameEmailOwner = firstNameEmailOwner;
        this.lastNameEmailOwner = lastNameEmailOwner;
        this.department = setDepartment();

    }

    // Constructor  with more fields ..
    public Email(String mainEmailAddress, String firstNameEmailOwner,String lastNameEmailOwner, int mailBoxCapacity, String alternateEmailAddress) {
        this.mainEmailAddress = mainEmailAddress;
        this.firstNameEmailOwner = firstNameEmailOwner;
        this.lastNameEmailOwner = lastNameEmailOwner;
        this.emailPassword = generateEmailPassword();
        this.mailBoxCapacity = mailBoxCapacity;
        this.alternateEmailAddress = alternateEmailAddress;
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
        return  firstNameEmailOwner + " " + " " +  mainEmailAddress + " " + mainEmailAddress;
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






































