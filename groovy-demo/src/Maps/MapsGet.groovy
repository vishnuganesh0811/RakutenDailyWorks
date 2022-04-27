package Maps

class MapsGet { 
   static void main(String[] args) { 
      def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"] 
      println(mp.get("TopicName")); 
      println(mp.get("Topic")); 
   } 
}