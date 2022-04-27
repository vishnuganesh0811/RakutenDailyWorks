package Date

class DateBefore {
   static void main(String[] args) { 
      Date olddate = new Date("05/11/2015"); 
      Date newdate = new Date("05/11/2015"); 
      Date latestdate = new Date();
		
      System.out.println(olddate.before(newdate)); 
      System.out.println(olddate.before(latestdate)); 
   } 
}