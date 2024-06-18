package helpers;

import customExceptions.InvalidAmountException;

/**
 * Utility class to validate monetary amounts.
 */
public class ValidAmountChecker {

  /**
   * Checks if the provided amount is valid (greater than zero).
   *
   * @param amount The amount to be validated.
   * @return The validated amount if valid.
   * @throws InvalidAmountException If the provided amount is zero or negative.
   */
  public static double IsValidAmount(double amount) throws InvalidAmountException {
    if (amount <= 0) {
      throw new InvalidAmountException("Invalid Amount Provided.");
    }
    return amount;
  }
}
