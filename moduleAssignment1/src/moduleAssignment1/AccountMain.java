package moduleAssignment1;

public class AccountMain {

	public static void main(String[] args) {
		Account ac=new Account("Ganesh", "05-4-2022", "Raichur", "Karnataka", "584103", "9164981719", "6-2-139/286", "ITIcollegeRoad", "SAVINGS", "ACTIVE");
		System.out.println(ac.getDetails());
		ac.depositAmount(5000);
		System.out.println(ac.getBalance());
		ac.withdrawAmount(500);
		System.out.println(ac.getBalance());
		
		
		
	}

}
