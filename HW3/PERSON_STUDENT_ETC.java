
/*
Name:Adriana Alva
Class:CS 2336.0U1 
*/
import java.util.Scanner;

public class PERSON_STUDENT_ETC {

	public static void main(String[] args) {
        //create objects of each class and test
		Person person = new Person("Adriana");
		person.setAddress("Home");
		person.setPhoneNumber("000-000-0000");
		person.setEmail("AAA@UTD.ORG");
		
		Student student = new Student("Temoc!","Junior");
		student.setAddress("UTD");
		
		Employee employee = new Employee("Profes");
		employee.setPhoneNumber("000-000-0000");
		employee.setOffice("UTD");
		
		Faculty faculty = new Faculty("Teacher");
		faculty.setRank("Lecturer");
		
		Staff staff = new Staff("Temmiee");
		staff.setTitle("assistant");
        //test toString
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}

class Person {

	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;

	public Person(String name) {
		this.name = name;
	}
    //getter
	public String getName() {
		return name;
	}
   //setter
	public void setName(String name) {
		this.name = name;
	}
    //getter
	public String getAddress() {
		return address;
	}
    //setter
	public void setAddress(String address) {
		this.address = address;
	}
    //getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
    //setter
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    //getter
	public String getEmail() {
		return email;
	}
    //setter
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Name: " + this.name + "  Address: " + this.address + "  Phone: " + this.phoneNumber
				+ "  Email: " + this.email + "  "+getClass();
	}
}
//needed inorder to use MyDate for employee
class MyDate {
	private String date;

	public MyDate(String date) {
		this.date = date;
	}
    //getter for date
	public String getDate() {
		return date;
	}

}

class Employee extends Person {

	protected double salary;
	protected String office;
	protected MyDate dateHired;

	public Employee(String name) {
		this(name, 0, "none", new MyDate(name));
	}

	public Employee(String name, double salary, String office, MyDate dateHired) {
		super(name);
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
    //getter for Salary
	public double getSalary() {
		return salary;
	}
    //setter for Salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
    //getter for office
	public String getOffice() {
		return office;
	}
    //setter for office
	public void setOffice(String office) {
		this.office = office;
	}
    //getter for date hired
	public MyDate getDateHired() {
		return dateHired;
	}
    //setter for date hired
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	public String toString() {
		return "Name: " + this.name + "   Date Hired: "+ this.dateHired + "  "+getClass();
	}
}

class Student extends Person {

	protected String status;

	public Student(String name) {
		super(name);
	}

	public Student(String name, String status) {
		super(name);
		this.status = status;
	}

	public String toString() {
		return "Name: " + this.name +"   Status:"+this.status +"  "+getClass();
	}
}

class Faculty extends Employee {

	protected String officeHours;
	protected String rank;

	public Faculty(String name) {
		this(name, "9-5PM", "Employee");
	}

	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}
    //getter for OfficeHours
	public String getOfficeHours() {
		return officeHours;
	}
    //setter for OfficeHours
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
    //getter for Rank
	public String getRank() {
		return rank;
	}
    //setter for Rank
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		 return "Name: " + this.name +"  Rank:"+this.rank +"  "+ getClass();
	}
}

class Staff extends Employee {

	protected String title;

	public Staff(String name) {
		this(name, "none");

	}

	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}
   //getter for title
	public String getTitle() {
		return title;
	}
   //setter for title
	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "Name: " + this.name + "  Title:"+ this.title +"  "+ getClass();
	}
}