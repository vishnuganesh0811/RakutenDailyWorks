package Lists

class ListPlus { 
   static void main(String[] args) { 
      def lst = [11, 12, 13, 14]; 
      def newlst = []; 
      
      newlst = lst.plus([15,16]); 
      println(newlst); 
   } 
}