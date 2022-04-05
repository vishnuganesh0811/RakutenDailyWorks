package moduleAssignment1;

public class Account extends Utility {
	private static int accountCounter = 10001;

	private enum AccountType {
		SAVINGS, DEMAT, CURRENT;
	}

	private enum AccountStatus {
		ACTIVE, INACTIVE, CLOSED;
	}

	private String customername;
	private int balanceAmount;
	private String accountcreateddate;
	private int accountNumber;
	private String city;
	private String state;
	private String zipCode;
	private String customerPhoneNumber;
	private String houseNumber;
	private String street;
	private AccountType type;
	private AccountStatus status;

	public Account(String name, String createdDate, String city, String state, String zipCode, String phoneNumber,
			String houseNumber, String street, String type, String status) {

		this.customername = name;
		this.balanceAmount = 0;
		this.accountNumber = generateNewAccountNumber();
		this.accountcreateddate = createdDate;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.customerPhoneNumber = phoneNumber;
		this.houseNumber = houseNumber;
		this.street = street;
		this.type = AccountType.valueOf(type.toUpperCase());
		this.status = AccountStatus.valueOf(status.toUpperCase());
	}

	public boolean depositAmount(int amount) {
		Utility.validateDepositAmount(amount);

		this.balanceAmount += amount;
		return true;
	}

	private int generateNewAccountNumber() {
		return accountCounter++;
	}

	public int withdrawAmount(int amount) {
		Utility.validateWithdrawAmount(balanceAmount, amount);
		balanceAmount -= amount;
		return amount;
	}

	public String getDetails() {
		String data = "Name : " + customername + "\n" + "Account Number : " + accountNumber + "\n" + "Account Type : " + type
				+ "\n" + "Mobile Number :" + customerPhoneNumber + "\n" + "House Number : " + houseNumber + "\n" + "Street : "
				+ street + "\n" + "City : " + city + "\n" + "State : " + state + "\n" + "Zip Code : " + zipCode + "\n";

		return data;
	}
	public AccountStatus getStatus() {
		return status;
		
	}
	public AccountType getType() {
		return type;
	}
	public int getBalance() {
		return balanceAmount;
	}
}

