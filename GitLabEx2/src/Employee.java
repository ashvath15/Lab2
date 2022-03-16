import java.util.Scanner;

public class Employee {
	
	String name;
	int age;
	
	Employee (String name, int age){
		
		this.name= name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Employee name = " +name);
		System.out.println("Employee age = " +age);
	}
	
	void other() {
		
		System.out.println("display");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("John", 25);
		emp1.display();
	}
}

