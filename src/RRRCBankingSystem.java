import java.util.Scanner;

public class RRRCBankingSystem {
    public static void main(String[] args) throws InterruptedException {

        String RESET = "\u001B[0m"; // RESET the Color
        String GREEN = "\u001B[32m"; // GREEN Color Accoding to Gemini
        String RED = "\u001B[31m"; // RED Color Accoding to Gemini

        Scanner scanner = new Scanner(System.in);

        System.out.println("TAGO PISO BAnkING SYSTEM");
        System.out.println("------------------------");

        // The Banking Logic
        while (true) {
            String newName = "";
            double balance = 500;
            while (true) {
                System.out.print("Enter Account Name: ");
                newName = scanner.nextLine().trim();

                if (newName.isEmpty()) {
                    System.out.println(RED + "Error: Account name cannot be blank! Please try again." + RESET);
                }

                // "[a-zA-Z ]+" according to Gemini is the input should match all the letters in
                // the Alphabet.
                else if (!newName.matches("[a-zA-Z ]+")) {
                    System.out.println(RED + "Error: Name must contain letters only! Please try again." + RESET);
                } else {
                    break;
                }
            }

            Thread.sleep(10);
            System.out.println(GREEN + "Processing..." + RESET);
            Thread.sleep(3000);

            System.out.println("Welcome " + newName + "!");
            System.out.println("Your Current Balance: " + GREEN + "P" + balance + RESET);
            Thread.sleep(20);
            System.out.println(GREEN + "Showing Menu..." + RESET);
            Thread.sleep(3000);

            int choice = 0;
            while (choice != 4) {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option (1-4): ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    Thread.sleep(20);
                    System.out.println(GREEN + "Showing Current Available Balance..." + RESET);
                    Thread.sleep(1500);
                    System.out.println("_______________________________");
                    System.out.println("Available Balance: " + GREEN + "P" + balance + RESET);
                    System.out.println("_______________________________");
                    Thread.sleep(20);
                    System.out.println(GREEN + "Showing Menu..." + RESET);
                    Thread.sleep(1500);
                } else if (choice == 2) {
                    Thread.sleep(20);
                    System.out.println(GREEN + "Processing..." + RESET);
                    Thread.sleep(1500);
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmmount = scanner.nextDouble();
                    scanner.nextLine();

                    if (depositAmmount > 0) {
                        balance += depositAmmount;
                        Thread.sleep(20);
                        System.out.println(GREEN + "Calculating..." + RESET);
                        Thread.sleep(1900);
                        System.out.println(GREEN + "Checking Current Balance..." + RESET);
                        Thread.sleep(1500);
                        System.out.println(GREEN + "Done!" + RESET);
                        Thread.sleep(9);
                        System.out.println("===============================");
                        System.out.println("Available Balance: " + GREEN + "P" + balance + RESET);
                        System.out.println("Deposit Successful!");
                        System.out.println("_______________________________");
                    } else {
                        System.out.println("Error: Deposit amount must be greater than P0!");

                    }

                    Thread.sleep(20);
                    System.out.println(GREEN + "Showing Menu..." + RESET);
                    Thread.sleep(2500);

                } else if (choice == 3) {
                    Thread.sleep(20);
                    System.out.println(GREEN + "Calculating..." + RESET);
                    Thread.sleep(1500);
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();

                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        Thread.sleep(20);
                        System.out.println(GREEN + "Calculating..." + RESET);
                        Thread.sleep(1900);
                        System.out.println(GREEN + "Checking Current Balance..." + RESET);
                        Thread.sleep(1500);
                        System.out.println(GREEN + "Widthdrawing..." + RESET);
                        Thread.sleep(2000);
                        System.out.println("===============================");
                        System.out.println("Updated Balance " + GREEN + "P" + balance + RESET);
                        System.out.println("Withdrawal Successful!");
                        System.out.println("_______________________________");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("Error: Insufficient Balance");
                        System.out.println("_______________________________");
                        System.out.println("Your Current Available Balance is Only: P" + balance);
                    }
                    Thread.sleep(20);
                    System.out.println(GREEN + "Showing Menu..." + RESET);
                    Thread.sleep(2500);
                } else if (choice == 4) {
                    Thread.sleep(20);
                    System.out.println(GREEN + "Perform Exit in...." + RESET);
                    Thread.sleep(900);
                    System.out.println(GREEN + "3" + RESET);
                    Thread.sleep(900);
                    System.out.println(GREEN + "2" + RESET);
                    Thread.sleep(900);
                    System.out.println(GREEN + "1" + RESET);
                    Thread.sleep(2000);
                    System.out.println(GREEN + "0" + RESET);
                    Thread.sleep(3000);
                    System.out.println(GREEN + "-1" + RESET);
                    Thread.sleep(900);
                    System.out.println("_______________________________");
                    System.out.println("Okay, thank you for using our bank!");
                    System.out.println("_______________________________");
                } else if (choice == 5) {
                    Thread.sleep(100);
                    System.out.println(GREEN + "Easter Egg has been found!" + RESET);
                    Thread.sleep(1100);
                    System.out.println("The Following Are the Devs");
                    Thread.sleep(1000);
                    System.out.println(GREEN + "_Klein Dindin" + RESET);
                    Thread.sleep(1000);
                    System.out.println(GREEN + "_Jhon Carlo Cabrera" + RESET);
                    Thread.sleep(1000);
                    System.out.println(GREEN + "_Ranier Panares" + RESET);
                    Thread.sleep(1000);
                    System.out.println(GREEN + "_Rey Mike B Labrillazo" + RESET);
                    Thread.sleep(2300);
                    System.out.println(GREEN + "_Google Gemini 3.6 Thinking" + RESET);
                    Thread.sleep(1000);
                    System.out.println(GREEN + "These maderpakers are LOCKED!" + RESET);
                    Thread.sleep(2500);
                    Thread.sleep(500);
                    System.out.println(GREEN + "                          " + RESET);
                    System.out.println(GREEN + "_Showing Menu..." + RESET);
                    Thread.sleep(2500);
                    System.out.println("_______________________________");
                }

                else {
                    System.out.println(RED + "Invalid Option: Choose (1-4)" + RESET);

                }

            }

        }

    }
}