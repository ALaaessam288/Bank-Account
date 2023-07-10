import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Your Data");
        System.out.println("Please Account Number");
        int accountNumber = scanner.nextInt();
        System.out.println("Please Account Balance");
        double accountBalance = Double.parseDouble(reader.readLine());
        System.out.println("Please Customer Name ");
        String cutomerName = scanner.next();
        System.out.println("Please Email");
        String email = scanner.next();
        System.out.println("Please mobile");
        String phonrNumber = scanner.next();
        bankAccount.setAccountNumber(accountNumber);
        bankAccount.setAccountBalance(accountBalance);
        bankAccount.setCutomerName(cutomerName);
        bankAccount.setEmail(email);
        bankAccount.setPhonrNumber(phonrNumber);
        System.out.println("Enter 1 For Deposit\n Enter 2 For Withdrow\n Enter 3 for view info");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Enter Deposite Amount");

            double depositeAmount = scanner.nextDouble();

            bankAccount.deposit(depositeAmount);
        } else if (x == 2) {
            System.out.println("Enter Withdrow Amount");

            double withdrawAmount = scanner.nextDouble();
            bankAccount.withDrow(withdrawAmount);

        } else if (x == 3) {
            System.out.println("Account Number: " + bankAccount.getAccountNumber());
            System.out.println("Account Balance: " + bankAccount.getAccountBalance());
            System.out.println("Customer Name: " + bankAccount.getCutomerName());
            System.out.println("Email: " + bankAccount.getEmail());
            System.out.println("Phone Number: " + bankAccount.getPhonrNumber());
        }


    }
}