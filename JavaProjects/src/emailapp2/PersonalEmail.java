package emailapp2;

import java.util.Scanner;

//PersonalEmail inherits from Email
/*It represents the concrete implementation of the Email interface, which is created by the concrete
* factory (PersonalEmailApp())
*/
public class PersonalEmail implements Email{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int mailboxCapacity = 500;
    private String recoveryEmail;
    private int defaultPasswordLength = 10;
    private String emailSuffix = "google.com";


    @Override
    public void create() {
        System.out.println(showInfo());

    }

    public PersonalEmail() {
        this.firstName = setFirstName();
        this.lastName = setFirstName();
        this.password = setPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + emailSuffix;

    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName() {
        System.out.print("Write your first name: ");
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        System.out.print("Write your first name: ");
        Scanner in = new Scanner(System.in);
        String lastName = in.nextLine();
        return lastName;
    }

    public String getEmail() {
        return email;
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

    public String showInfo() {
        return "*****************************************************" +
                "\n - DISPLAY NAME: " + firstName + " " + lastName +
                "\n - EMAIL: " + email +
                "\n - PASSWORD: " + password +
                "\n - MAILBOX CAPACITY: " + mailboxCapacity + "mb" +
                "\n*****************************************************";
    }

    @Override
    public void updatePassword(){
        String newPasword;
        System.out.println("Enter your new password:");
        Scanner scanner = new Scanner(System.in);
        newPasword = scanner.nextLine();
        this.password = newPasword;
    }

    @Override
    public void updateMailboxCapacity(){
        System.out.println("Mailbox capacity increased");
    }
}
