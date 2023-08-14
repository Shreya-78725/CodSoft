import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner yes = new Scanner(System.in);
        int balance = 1000, withdraw, deposit, num;

        String userName, password;

        System.out.println("Enter Your Name:");
        userName = yes.nextLine();
        System.out.println("Enter Your Password");
        password = yes.nextLine();

        if (userName.equals("Shreya") && password.equals("12345")) {
            System.out.println(" : Welcome SHREYA : ");
        } else {
            System.out.println(" Its Not SHREYA \n Better Luck For Next Time! ");

            System.exit(0);
        }
        while (true) {

            System.out.println(" Welcome To Your ATM Machine ");

            System.out.println(" 1.Withdraw Money");

            System.out.println(" 2.Deposit Money");

            System.out.println(" 3.Check Balance ");

            System.out.println(" 4.exit ");

            num = yes.nextInt();

            switch (num) {

                case 1:
                    System.out.println("Enter Amount to Withdraw : ");
                    withdraw = yes.nextInt();
                    if (balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Your New Balance : " + balance);
                        System.out.println(" *****  Collect Your Cash *****");
                    }
                    else{
                        System.out.println("Sorry You Dont Have Enough Balance " );
                        System.out.println(" Do anything but Dont forget to Save and Invest Your Money For Future ");
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Enter Amount to Deposit: ");
                    deposit = yes.nextInt();
                    balance = balance+deposit;
                    System.out.println("Your New Balance : " + balance);
                    System.out.println("Amount Deposited Successfully ");
                    System.out.println("You are Saving! \n Nice Work AK");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println(" Your Account Balance :" + balance);
                    System.out.println(" ");
                    break;

                case 4:
                    System.exit(0);
                    System.out.println(" ");
                    break;
            }
        }
    }
}