package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;
        int createEmail = 0;
        do{
            System.out.println("Welcome to the Google's email generator system");
            System.out.println("Would you like to create your company email? Enter 1 for yes, 2 for no.");
            createEmail = scanner.nextInt();

            if(createEmail==1){
                Email email = new Email();
                System.out.println(email.showInfo());
            }

            System.out.println("Would you like to start over? Enter 1 for yes, 2 for no.");
            runAgain = scanner.nextInt();
        }while(runAgain == 1);

    }
}
