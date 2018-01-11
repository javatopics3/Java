package Encapsulation;

/*
 * The variables of the EncapTest class can be accessed 
 * using the following program:−
 */
public class RunEncap {
	public static void main(String[] args) {
		// new is the operator creating instance for EncapTest class OK
		EncapTest encap = new EncapTest();
		encap.setName("Raghu");
		encap.setAge(25);
		encap.setIdNum("12345ms");
		System.out.println("Name : " + encap.getName() + " Age: "
				+ encap.getAge());
	}
}//class
/*
 * Benefits of Encapsulation The fields of a class can be made read-only or
 * write-only.
 * 
 * A class can have total control over what is stored in its fields.
 */