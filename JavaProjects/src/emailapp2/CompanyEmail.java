package emailapp2;

import java.util.Scanner;

public class CompanyEmail implements Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int mailboxCapacity = 1000;
    private String recoveryEmail;
    private int defaultPasswordLength = 10;
    private String companyName;
    private String department;
    private String emailSuffix = ".com";

    @Override
    public void create() {
        System.out.println(showInfo());
    }

    @Override
    public void updatePassword() {
        String newPasword;
        System.out.println("Enter your new password:");
        Scanner scanner = new Scanner(System.in);
        newPasword = scanner.nextLine();
        this.password = newPasword;
    }

    @Override
    public void updateMailboxCapacity() {
        Integer newMailboxCapacity;
        System.out.println("Enter your new mailbox capacity:");
        Scanner scanner = new Scanner(System.in);
        newMailboxCapacity = scanner.nextInt();
        this.mailboxCapacity = newMailboxCapacity;
        System.out.println("Mailbox capacity increased");
    }

    public CompanyEmail() {
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.companyName = setCompanyName();
        this.department = setDepartment();
        this.password = setPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName + emailSuffix;

    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName() {
        System.out.println("Write your first name: ");
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        System.out.println("Write your first name: ");
        Scanner in = new Scanner(System.in);
        String lastName = in.nextLine();
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(int length) {
        String passwordSet = "qwer;tyu:i3opas_dfgh^+[]klzxc1vbnm,.-{}+QW6ERT5YUI7O8PAS4DF9GHJKLZ3XCVBM1234567890?=)(/&%$#";
        char[] password = new char[length];
        for (int i=0; i <length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getRecoveryEmail() {
        return recoveryEmail;
    }

    public void setRecoveryEmail(String recoveryEmail) {
        this.recoveryEmail = recoveryEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String setCompanyName() {
        System.out.print("Write the company name: ");
        Scanner in = new Scanner(System.in);
        String companyName = in.nextLine();
        return companyName;
    }

    public String getDepartment() {
        return department;
    }

    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){return "sales";}
        else if (deptChoice == 2) {return "dev";}
        else if (deptChoice==3) {return "acct";}
        else {return "";}
    }

    public String showInfo() {
        return "*****************************************************" +
                "\n - DISPLAY NAME: " + firstName + " " + lastName +
                "\n - EMAIL: " + email +
                "\n - PASSWORD: " + password +
                "\n - MAILBOX CAPACITY: " + mailboxCapacity + "mb" +
                "\n*****************************************************";
    }
}
