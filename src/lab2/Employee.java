package lab2;

import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private Date birthDate;
	private String SSN;
	private double salary;
	private Position position;
	public Employee(){
		
	}
	public Employee(int employeeId, String firstName, String middleInitial, String lastName, Date birthDate, String sSN,
			double salary, Position position) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.position = position;
		this.SSN = sSN;
		this.salary = salary;
		this.position.setEmp(this);
	}
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		
		this.position = position;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void print(){
		System.out.println("Employee [" + employeeId + " " + firstName + " " + middleInitial
				+ " " + lastName + ", " + birthDate + ", " + SSN + ", " + salary + "]");
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", SSN=" + SSN + ", salary=" + salary + "]";
	}

}
