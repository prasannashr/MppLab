package lab1;


public class StaffStudent extends Student {
	
	Staff staff;
	
	public StaffStudent(String name, String phone, int age, double gPA, double salary) {
		super(name, phone, age, gPA);
		staff = new Staff(name, phone, age, salary);
		
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}	
	
	public double getSalary() {
		return staff.getSalary();
	}
}
