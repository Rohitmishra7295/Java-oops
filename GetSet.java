





// Java Program to demonstrate
// Java Encapsulation
public class GetSet{ 
	// main function
	public static void main(String[] args)
	{
		// person object created
		Person p1 = new Person();
		p1.setName("John");
		p1.setAge(30);

		// Using methods to get the values from the
		// variables
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());
	}
}
// Person Class
class Person {
	// Encapsulating the name and age
	// only approachable and used using
	// methods defined
	private String name;
	private int age;

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }
}

