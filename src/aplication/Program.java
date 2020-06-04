package aplication;

import java.util.Scanner;

import entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		try {
			int number;
			String holder;
			double initialBalance;
			double withDrawLimit;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter account data");
			System.out.print("Number:");
			number = sc.nextInt();
			System.out.print("holder : ");
			holder = sc.nextLine();
			sc.next();
			System.out.print("Initial balance: ");
			initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			withDrawLimit = sc.nextDouble();
			Account acont = new Account(number, holder, initialBalance, withDrawLimit);
			System.out.print("Enter amount for withdraw: ");
			double amount;
			amount= sc.nextDouble();
			acont.withdraw(amount);
			System.out.println("New balance: " + acont.getBalance());
		} catch (DomainException e) {
			System.out.println("erro  " + e.getMessage());

		}catch (RuntimeException e) {

			System.out.println("Unexpected error");

		}

	}

}
