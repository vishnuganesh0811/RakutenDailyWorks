package Date

class DateToString {
   static void main(String[] args) { 
      Date olddate = new Date("05/11/2015"); 
      Date newdate = new Date("05/11/2015"); 
      Date latestdate = new Date(); 
		
      System.out.println(olddate.toString()); 
      System.out.println(newdate.toString()); 
      System.out.println(latestdate.toString()); 
   } 
}