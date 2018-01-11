package Encapsulation;

public class EncapTest {
	private String name;
	private String idNum;
	private int age;

	// Alt shift s:r===sel all
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}//class
/*
 * The public setXXX() and getXXX() methods are the access points of the
 * instance variables of the EncapTest class. Normally, these methods are
 * referred as getters and setters. Therefore, any class that wants to access
 * the variables should access them through these getters and setters.
 */