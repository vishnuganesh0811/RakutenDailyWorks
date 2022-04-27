import java.io.File
class Demo3 {
   static void main(String[] args) {
	  new File('Example2.txt').withWriter('utf-8') {
		 writer -> writer.writeLine 'Hello World'
	  }
   }
}
