//About static keyword
public class Main4 {
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.DoSomething("Hello YouTube");// instance OK but use cls name Ok
		Hello.DoSomething("Hi YouTube");// with cls name directly for static
										// method OK
		hello.DoSomethingElse("Hye YouTube");
		hello.age = 10;// Yellow warning bcoz of static field or variable static
						// fix
		System.out.println(hello.age);
		Hello hello1 = new Hello();// if u define u shd use it ok thts why
									// yellow error
		Hello.age = 50;
		System.out.println(Hello.age);
		// System.out.println(hello1.age);
		System.out
				.println(hello
						.DoSomething("Hello YouTube instance calling static method yellow warning"));
		System.out.println(Hello
				.DoSomething("Hello YouTube cls calling static method fine"));
		System.out
				.println(hello
						.DoSomethingElse("Hello YouTube instance calling non-static method"));
		System.out
				.println(Hello
						.DoSomething("Hello YouTube cls for static but instance for both static and non-static, for only static warning Ok  "));
	}
}
