class Demo7 {
	static void main(String[] args) {
	   new File("temp").eachFileRecurse() {
		  file -> println file.getAbsolutePath()
	   }
	}
 }

