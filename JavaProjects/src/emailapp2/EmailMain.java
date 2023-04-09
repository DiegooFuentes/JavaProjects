package emailapp2;

import java.util.Scanner;

public class EmailMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;
        int createEmail = 0;
        do{
            System.out.println("Welcome to the Google's email generator system");
            System.out.println("Would you like to create your company email? Enter 1 for yes, 2 for no.");
            createEmail = scanner.nextInt();

            if(createEmail==1){
                int emailType = 0;
                System.out.println(" Select an email type: " +
                        "\n Enter 1 for personal email" +
                        "\n Enter 2 for company email" +
                        "\n Enter 3 for Educational email");
                emailType = scanner.nextInt();
                if(emailType==1){
                    EmailAbstractFactory email = new PersonalEmailFactory();
                    Email personalEmail = email.orderEmail();

                    int updatePreferences = 0;
                    do {
                        int option = 0;
                        System.out.println("\n Enter 1 to update password" +
                                "\n Enter 2 to update mailbox capacity" +
                                "\n Enter 3 to exit");
                        option = scanner.nextInt();

                        if(option==1){
                            personalEmail.updatePassword();
                        }else if (option==2){
                            personalEmail.updateMailboxCapacity();
                        }else {
                            break;
                        }

                        System.out.println("\n Would you like to update your data?" +
                                "\n Enter 1 to update " +
                                "\n Enter 2 to exit");
                        updatePreferences = scanner.nextInt();
                    }while (updatePreferences==1);

                } else if (emailType==2) {
                    EmailAbstractFactory email = new CompanyEmailFactory();
                    Email companyEmail = email.orderEmail();
                } else if (emailType==3) {
                    EmailAbstractFactory email = new EducationalEmailFactory();
                    Email educationalEmail = email.orderEmail();
                }
            }
            System.out.println("Would you like to start over? Enter 1 for yes, 2 for no.");
            runAgain = scanner.nextInt();
        }while(runAgain == 1);

    }


}
