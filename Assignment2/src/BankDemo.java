import java.util.ArrayList;
import java.util.List;


public class BankDemo {
	public static void main(String[] args) {
	
		List<Customer> customers = new ArrayList<>();
		List<Account> accounts = new ArrayList<>();
		
		for(int i=1;i<=3;i++) {
			String name = "Rakuten"+i;
			String address = "Raichur";
			String phone = "9164981719";
			String mail = String.format("%s@rakutensymphony.com", name);
			
			Customer c = new Customer(name, address, phone, mail);
			customers.add(c);
		}
		
		//displaying the customers.
		customers.forEach((Customer cust) -> System.out.println(cust));
		
		for(int i=0;i<2;i++) {
			Customer c = customers.get(i);
			
			long millis=System.currentTimeMillis();
			java.sql.Date mydate = new java.sql.Date(millis);
			String date = String.valueOf(mydate);
			
			double bal = (double) 1000;
			
			Account a = new Account(date, TYPE.SB, bal, c);
			accounts.add(a);
		}
		
		long millise=System.currentTimeMillis();
		java.sql.Date mydates = new java.sql.Date(millise);
		String dates = String.valueOf(mydates);
		
		accounts.add(new Account(dates, TYPE.FD, 10000, customers.get(2)));
		
		accounts.forEach((Account acco) -> System.out.println(acco));
	}
}