package Date

class DateGetTime {
		static void main(String[] args) {
		   Date olddate = new Date("05/11/2015");
		   Date newdate = new Date("05/11/2015");
		   Date latestdate = new Date();
			 
		   System.out.println(olddate.getTime());
		   System.out.println(newdate.getTime());
		   System.out.println(latestdate.getTime());
		}
	 }