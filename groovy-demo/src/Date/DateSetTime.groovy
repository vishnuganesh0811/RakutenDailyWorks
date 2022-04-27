package Date

class DateSetTime {
   static void main(String[] args) { 
      Date olddate = new Date("05/11/2015"); 
      Date newdate = new Date("05/12/2015"); 
      Date latestdate = new Date();
		
      olddate.setTime(10000); 
      newdate.setTime(10000); 
      latestdate.setTime(10000); 
		
      System.out.println(olddate.toString()); 
      System.out.println(newdate.toString());
      System.out.println(latestdate.toString());  
   } 
}