package entities;

import model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount && withdrawLimit >= amount) {
			balance -= amount;
		} else if (balance >= amount && withdrawLimit < amount) {
			throw new DomainException("saque excede o limite diario");

		} else if (this.balance < amount) {
			throw new DomainException("saldo insuficiente ");
		}

	}

}
