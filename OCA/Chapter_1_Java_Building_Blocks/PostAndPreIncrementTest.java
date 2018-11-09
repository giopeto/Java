public class PostAndPreIncrementTest {

	public static void main(String[] args) {
		//test();
		testWithWhileLoop();
	}

	public static void testWithWhileLoop() {
		int x = 0;

		while(++x < 5) { // 1 3 5
			System.out.println("Before: " + x); // 1 3
			x += 1;
			System.out.println("After: " + x); // 2 4
		}

		/*
		1 2
		3 4
		5
		*/


		String message = x > 5 ? "X is greater" : "X is lower";
		System.out.println(message + ", "+ x);
	}

	public static void test() {
		int x = 0;
		System.out.println("x " + x);		// 0
		System.out.println("x++ " + x++);	// 0
		System.out.println("x " + x);		// 1
		System.out.println("--x " + --x);	// 0
		System.out.println("x " + x);		// 0
	}	
}