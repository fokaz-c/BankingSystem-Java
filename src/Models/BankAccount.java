package Models;

import customExceptions.InvalidAmountException;
import helpers.ValidAmountChecker;

/**
 * Represents a bank account with basic operations such as deposit, withdrawal, and balance inquiry.
 */
public class BankAccount {
  private final int _accNo;  // Account number
  private double _balance;  // Current balance of the account

  /**
   * Constructs a bank account with a specified account number and initializes the balance to zero.
   *
   * @param accNo The account number of the bank account.
   */
  public BankAccount(int accNo) {
    this._accNo = accNo;
    this._balance = 0;
  }

  /**
   * Deposits a specified amount into the bank account.
   *
   * @param amount The amount to be deposited.
   * @throws InvalidAmountException If the specified amount is zero or negative.
   */
  public void DepositIntoAccount(double amount) throws InvalidAmountException {
    double deposited = ValidAmountChecker.IsValidAmount(amount);
    _balance += deposited;
    System.out.println("Deposited Amount: " + deposited);
    System.out.println("Current Balance: " + _balance);
  }

  /**
   * Withdraws a specified amount from the bank account.
   *
   * @param amount The amount to be withdrawn.
   * @throws InvalidAmountException If the specified amount is zero or negative,
   *                                or if the account balance is insufficient.
   */
  public void WithdrawFromAccount(double amount) throws InvalidAmountException {
    double withdrawAmount = ValidAmountChecker.IsValidAmount(amount);
    if (withdrawAmount > _balance) {
      throw new InvalidAmountException("Insufficient Balance");
    }
    _balance -= withdrawAmount;
    System.out.println("Successfully Withdrawn " + withdrawAmount);
  }

  /**
   * Retrieves and prints the current balance of the bank account.
   */
  public void GetBalance() {
    System.out.println("Current Balance: " + _balance);
  }

  /**
   * Verifies if a given account number matches the account number of this bank account.
   *
   * @param accNo The account number to be verified.
   * @return true if the provided account number matches the account number of this bank account, false otherwise.
   */
  public boolean VerifyAccountNumber(int accNo) {
    return this._accNo == accNo;
  }
}
