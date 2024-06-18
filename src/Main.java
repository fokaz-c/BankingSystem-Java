import Models.BankAccount;
import customExceptions.InvalidAmountException;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount;

    System.out.println("Welcome To Our Banking System!!");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your Bank Account Number");
    String strAccNo = scanner.nextLine();
    try {
      int accNo = Integer.parseInt(strAccNo);
      bankAccount = new BankAccount(accNo);
      System.out.println("Bank Account Created for " + accNo);

      System.out.println("Enter the Amount you want to Deposit: ");
      try {
        bankAccount.DepositIntoAccount(scanner.nextDouble());
        System.out.println("Deposit Successful");
      } catch (InvalidAmountException e) {
        System.out.println("Deposit failed: " + e.getMessage());
      }

      System.out.println("Enter the Amount You Want to Withdraw: ");
      try {
        bankAccount.WithdrawFromAccount(scanner.nextDouble());
        bankAccount.GetBalance();
      } catch (InvalidAmountException e) {
        System.out.println(e.getMessage());
      }


    } catch (NumberFormatException e) {
      System.out.println("Invalid Bank Account Number");
    } finally {
      System.out.println("Thank You For Using Out Bank!!!");
      scanner.close();
    }
  }

  //TODO: Create a Switch Case statement for choice and a while loop

}