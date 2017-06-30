package Assignment1;

/*
 * In this program I've written a program in Java to show constructor overloading.
 * A constructor doesn't have a return type.
 * The name of the constructor must be the same as the name of the class.The name 
 * of the constructor must be the same as the name of the class.
 */
public class Employee {

	
	public Employee(){ // I ,  default constructor
		System.out.println("Employee1"); 
		
	}
	public Employee(String name){    // II,  parameterized constructor with single parameter.
		System.out.println("Name is : " + name);
	}
	public Employee(String name, int Id){ // III,  parameterized constructor with two parameters.
		System.out.println("Employee name is : " + name+" and Id is:- "+Id );
	}
	 public static void main(String args[])
	  {
	    Employee e1 = new Employee();                 // calls I
	    Employee e2 = new Employee("Mr.Vishwas.");       // calls II
	    Employee e3 = new Employee("Mr.Raju", 101);    // calls III
	  }
	}

