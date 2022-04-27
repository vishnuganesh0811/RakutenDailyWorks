package Maps

class MapsSize { 
   static void main(String[] args) { 
      def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"] 
      println(mp.size()); 
		
      mp.put("TopicID","1"); 
      println(mp.size()); 
   } 
} 