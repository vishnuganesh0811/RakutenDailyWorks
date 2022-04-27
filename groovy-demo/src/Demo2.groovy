class Demo2 {
	static void main(String[] args) {
	   def src = new File("Example.txt")
	   def dst = new File("Example1.txt")
	   dst << src.text
	}
 }