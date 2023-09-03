/* 	What is the output of the bellow written Java code snippet?
	a) 11
	b) 12
	c) 13
	d) compilation error
*/


public class Puzzle {
	public static void main(String[] args) {
		int a = 5;

		//system.out.println(a);
		//System.out.println(a++);
		//System.out.println(++a);
		
		int b = a++ + ++a;

		System.out.println(b);
	
	}
}
