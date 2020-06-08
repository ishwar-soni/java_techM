package com.upGrad;
class Account {
	synchronized public void doAccountTransactions() {
		System.out.println("Clerk started transaction.");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Clerk Finished transaction.");
	}
}

class Clerk extends Thread {
	Account account;

	Clerk(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.doAccountTransactions();
	}
}

public class MethodSynchronizationExercise {
	public static void main(String[] args) {
		Account account = new Account();
		// we are creating two threads which share same Object.
		Clerk clerk1 = new Clerk(account);
		Clerk clerk2 = new Clerk(account);
		// both threads start executing .
		clerk1.start();
		clerk2.start();
	}
}
