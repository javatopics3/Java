package j2se;

public class Students {
	String name;
	int age;
	static int NoOfStudents = 0;// static means no changes OK

	// this member variable can be shared by instances OK
	public int getNoOfStudents() {// call this function in main()
		return NoOfStudents;// remember static field created fix
	}// getNoOfStudents method
		// static field value is incrementing by getNoOfStudents() OK

	// getters and setters here: Encapsulatio indirectly for secure purpose
	// Alt shift s:r=selct all Ok
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void setNoOfStudents(int noOfStudents) {
		NoOfStudents = noOfStudents;
	}

}// class
// Main5.java
