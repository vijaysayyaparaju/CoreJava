package javaclass;

public class BankTransactions {
	static int AccountBalance = 160000;
	
	void Deposit(String AccountType, int DepositAmount ) {
		switch(AccountType) {
		case "SAVINGS":
			if(DepositAmount <=200000) {
				AccountBalance += DepositAmount;
				System.out.println("Deposit Amount :"+ DepositAmount);
			}else {
				System.out.println("Saving Account limit is 200000");
			}
		break;
		case "CURRENT":
			if(DepositAmount >=500000) {
				AccountBalance += DepositAmount;
				System.out.println("Deposit Amount :"+ DepositAmount);
			}else {
				System.out.println("Saving Account limit is 500000");
			}
		break;
		case "REATAIL":
			if(DepositAmount >=1000000) {
				AccountBalance += DepositAmount;
				System.out.println("Deposit Amount :"+ DepositAmount);
			}else {
				System.out.println("Saving Account limit is 1000000");
			}
		break;
		default:
			System.out.println("Invalid Account Type");
		}
	
	}
	
	void Withdrawl(int WithdrawlAmount) {
		if(WithdrawlAmount < AccountBalance) {
			if (WithdrawlAmount >= 500) {
				AccountBalance -= WithdrawlAmount;
				System.out.println("Withdrawl Amount :" + WithdrawlAmount);	
			}else {
				System.out.println("Enter minimum amount of 500Rs");
			}
		}else {
			System.out.println("Insufficient account balance");
		}
		
	}
	
	void CheckAccountBalance() {
		System.out.println("Account Balance :" + AccountBalance);	
	}

	public static void main(String[] args) {
		BankTransactions SBIBANK = new BankTransactions();
		
		SBIBANK.CheckAccountBalance();
		SBIBANK.Deposit("SAVING",200);
		SBIBANK.CheckAccountBalance();
		
		System.out.println("--------------------------------------------------------");
		
		SBIBANK.CheckAccountBalance();
		SBIBANK.Withdrawl(400);
		SBIBANK.CheckAccountBalance();
		
		System.out.println("--------------------------------------------------------");
		
		BankTransactions ICICI = new BankTransactions();

		ICICI.CheckAccountBalance();
		ICICI.Withdrawl(60000);
		ICICI.CheckAccountBalance();
		
		
		
		
		

	}

}
