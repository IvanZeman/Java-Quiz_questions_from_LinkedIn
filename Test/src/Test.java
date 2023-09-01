//What is the output of above Code Snippet ?

public class Test{

	public static int x = 5;

	public static void main(String[] args){
		int x=10;
		System.out.print(x+ " ");
		functionCall();
		System.out.print(x+ " ");
	}

	public static void functionCall() {
		x=15;
	}
}