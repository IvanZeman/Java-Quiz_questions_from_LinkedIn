/*Can you predict the correct output of the bellow written Java code snippet?
a) true true
b) false true
c) false false
d true false
*/

public class Puzzle {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Programming";
		String c = a+b;
		String d = "JavaProgramming";
		
		System.out.println(c==d);
		System.out.println(c.equals(d));

	}

}
