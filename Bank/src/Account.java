public class Account  {



	private String customerName;

	private int balanceAmount;

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



	public void depositamount(int amount) {

		this.balanceAmount += amount;

	}



	public void withdrawAmount(int amount) {

		if(amount > balanceAmount) throw new IllegalArgumentException("Amount Should Be Lesser than Or Equal To Balance Amount");

		balanceAmount -= amount;

	}



	public int getBalance() {

		return balanceAmount;

	}

}