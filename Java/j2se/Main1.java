package j2se;

public class Main1 {
	public static void main(String[] args) {
		Student mark = new Student();// mark-object or instance
		/*
		 * mark.id = 1; mark.name = "Raghu"; mark.age = 25;
		 * System.out.println(mark.name + " is " + mark.age + " years old");
		 */

		mark.setId(1);
		mark.setName("Raghu");// String type value in inverted double inverted
								// colons
		mark.setAge(25);
		System.out.println(mark.getName() + " is " + mark.getAge()
				+ " years old");

	}// main
}// class
