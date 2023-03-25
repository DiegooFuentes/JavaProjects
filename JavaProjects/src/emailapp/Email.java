package emailapp;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPassLength = 10;
    private String companySuffix = ".google.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department - return the department
        this.department = setDepartment();

        //Call a method that returns a random password
        this.password = randomPassword(defaultPassLength);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        //System.out.println("Your email is: " + email);
        //System.out.println("your password is: " + this.password);
    }

    //Ask for the department method
    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){return "sales";}
        else if (deptChoice == 2) {return "dev";}
        else if (deptChoice==3) {return "acct";}
        else {return "";}
    }

    //Generate a random password method
    private String randomPassword(int length){
        String passwordSet = "qwer;tyu:i3opas_dfgh^+[]klzxc1vbnm,.-{}+QW6ERT5YUI7O8PAS4DF9GHJKLZ3XCVBM1234567890?=)(/&%$#";
        char[] password = new char[length];
        for (int i=0; i <length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }

    //set the mailbox capacity and getter
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    //set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }

    //Change the password
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    //Show all the data
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}
