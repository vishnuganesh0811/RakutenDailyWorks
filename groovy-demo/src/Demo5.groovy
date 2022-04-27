class Demo5 {
	static void main(String[] args) {
	   def rootFiles = new File("test").listRoots()
	   rootFiles.each {
		  file -> println file.absolutePath
	   }
	}
 }
