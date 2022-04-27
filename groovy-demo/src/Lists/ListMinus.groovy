package Lists

class ListMinus { 
   static void main(String[] args) { 
      def lst = [11, 12, 13, 14]; 
      def newlst = [];
      
      newlst = lst.minus([12,13]); 
      println(newlst); 
   } 
}