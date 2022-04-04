
enum status {
	ACTIVE, INACTIVE, CLOSED,
}

enum type {
	SAVING, DEMAT, CURRENT

}

public class Customer {

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public String getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(String created_Date) {
		Created_Date = created_Date;
	}

	public double getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(double account_Number) {
		Account_Number = account_Number;
	}

	private String Name;
	private String Address;
	private Double Balance;
	private String Created_Date;
	private double Account_Number;
}
