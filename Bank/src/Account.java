import java.util.Scanner;

public class Account {

	private String customerName;

	private double balanceAmount;

	private String createdDate;

	private String city;

	private String state;

	private int pin;

	private String phoneNumber;

	private String houseNumber;

	private String street;

	private String type;

	private String status;

	public Account(String name, String createdDate, String city, String state, int pin, String phoneNumber,

			String houseNumber, String street, String type, String status) {

		this.customerName = name;

		this.balanceAmount = 0;

		this.createdDate = createdDate;

		this.city = city;

		this.state = state;

		this.pin = pin;

		this.phoneNumber = phoneNumber;

		this.houseNumber = houseNumber;

		this.street = street;

		this.type = type.toUpperCase();

		this.status = status.toUpperCase();

	}

	public Account() {

	}

	public void depositamount(double amount) {

		this.balanceAmount += amount;

	}

	public void withdrawAmount(double amount) {

		if (amount > balanceAmount)
			throw new IllegalArgumentException("Amount Should Be Lesser than Or Equal To Balance Amount");

		balanceAmount -= amount;

	}

	public double getBalance() {

		return balanceAmount;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr amount to be deposited in your account:\n");
		double addmoney = sc.nextDouble();
		Account accountobject = new Account();
		accountobject.depositamount(addmoney);
		System.out.println("Your Account Balance is:" + accountobject.getBalance());
		System.out.println("Enter the amount to be withsrawn from your account:");
		double removemoney=sc.nextDouble();
		accountobject.withdrawAmount(removemoney);
		System.out.println("Your Account Balance is:" + accountobject.getBalance());
	}

}