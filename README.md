# Bank Account Management System

This project is an assignment for a Java programming course, focusing on implementing error handling techniques using exceptions.

## Description

The project simulates a basic bank account management system with the following functionalities:
- Creating a bank account with a specified account number.
- Depositing money into the account.
- Withdrawing money from the account.
- Checking the current balance of the account.
- Verifying the account number.

## Classes

### `BankAccount`

This class represents a bank account and includes methods for managing account operations:
- `BankAccount(int accNo)`: Constructor for initializing a bank account with a specified account number.
- `DepositIntoAccount(double amount)`: Deposits a specified amount into the account.
- `WithdrawFromAccount(double amount)`: Withdraws a specified amount from the account.
- `GetBalance()`: Retrieves and prints the current balance of the account.
- `VerifyAccountNumber(int accNo)`: Verifies if a provided account number matches the account number of the instance.

### `ValidAmountChecker` (in `helpers` package)

This utility class validates monetary amounts before processing:
- `IsValidAmount(double amount)`: Checks if the provided amount is valid (greater than zero) and throws `InvalidAmountException` if the amount is invalid.

### `InvalidAmountException` (in `customExceptions` package)

Custom exception class for handling invalid amount scenarios in banking operations.

## Error Handling

The project demonstrates Java's exception handling mechanisms:
- Methods such as `DepositIntoAccount` and `WithdrawFromAccount` throw `InvalidAmountException` when the amount is zero or negative, ensuring robust error handling.
- Catch blocks in the main application (`Main.java`) handle exceptions gracefully to provide user-friendly error messages.

## Usage

To run the project:
1. Compile all Java files.
2. Execute `Main.java` to interact with the bank account management system.
3. Follow the prompts to create a bank account, deposit and withdraw money, and verify operations with error handling in action.

## Note

This project is purely educational and serves to demonstrate proficiency in Java programming, particularly in error handling techniques using exceptions.
