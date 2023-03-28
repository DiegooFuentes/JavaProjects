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
