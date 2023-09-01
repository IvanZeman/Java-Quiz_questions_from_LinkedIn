/*
 Predict the output:
 a) 0
 b) 10
 c) 11
 d) runtime exception
 */

public class Main {

	public static void main(String[] args) {
		int j = 0;
		for(int i = 0; i<10; i++) {
			j=j++;
		}
		System.out.println(j);
	}

}
