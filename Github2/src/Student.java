import java.util.Scanner;

public class Student {
	
	String name;
	
	Student(String name){
		String namee;
		System.out.println("Please enter your name");
		Scanner sc= new Scanner(System.in);
		namee=sc.nextLine();
		
		name=namee;
		System.out.println("The Name you entered:" +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HELLO STUDENT");
		Student s1= new Student();

	}

}
