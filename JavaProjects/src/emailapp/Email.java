package emailapp;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = ".google.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + firstName + " " + lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Email set");

        //Call a method that returns a random password

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Your email is: " + email);
    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){return "sales";}
        else if (deptChoice == 2) {return "dev";}
        else if (deptChoice==3) {return "acct";}
        else {return "";}
    }

    //Generate a random password


    //set the mailbox capacity



    //set the alternate email

    //Change the password

}
