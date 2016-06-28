package lab1;

public class Staff extends Person {
	public double salary;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", phone=" + phone + ", age=" + age + " salary=" + salary + "]";
	}
	
	
}
