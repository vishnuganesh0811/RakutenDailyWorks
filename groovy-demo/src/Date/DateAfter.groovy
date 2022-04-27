package Date

class DateAfter {
   static void main(String[] args) {
      Date olddate = new  Date("05/11/2015");
      Date newdate = new Date("05/12/2015");
      Date latestdate = new Date();
		
      System.out.println(olddate.after(newdate)); 
      System.out.println(latestdate.after(newdate));
   } 
}