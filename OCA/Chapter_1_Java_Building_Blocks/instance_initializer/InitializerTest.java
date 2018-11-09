public class InitializerTest {
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
	}
}


class Person {

	public Person() {
		System.out.println("Empty constructor");
	}



	{
		System.out.println("instance initializer called");
	}


	static {
		System.out.println("static initializer called");
	}
}