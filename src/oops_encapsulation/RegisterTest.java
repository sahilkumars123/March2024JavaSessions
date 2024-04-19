package oops_encapsulation;

public class RegisterTest {

	public static void main(String[] args) {

		// CREATED AN USER -- POST
		Register reg = new Register("sahil", 30, 9876778283L, "chd", true);

		// GETTING THE USER DETAILS --- GET
		System.out.println(reg.getName() + reg.getAge() + reg.getPhoneNumber() + reg.getCity() + reg.isPerm());

		// UPADTE THE USER DETAILS -- PUT
		reg.setAge(31);
		reg.setName("sahil kumar");

		// GETTING THE UPDATED USER DETAILS
		System.out.println(reg.getName() + reg.getAge() + reg.getPhoneNumber() + reg.getCity() + reg.isPerm());

	}

}
