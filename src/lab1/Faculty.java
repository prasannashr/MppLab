package lab1;

import java.util.ArrayList;

public class Faculty extends Person {
	public double salary;
	
	public ArrayList<Course> courses;
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		courses = new ArrayList<Course>();
	}
	
	public int getTotalUnits(){
		int totalUnits=0;
		for(int i = 0; i<courses.size();i++){
			totalUnits+=courses.get(i).getUnits();
		}
		System.out.println(courses.stream()
									.map(e->e.getUnits())
									.reduce(0,(x,y)->x+y));
		
		return totalUnits;
	}
	
	public void addCourse(Course course){
		courses.add(course);
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void printStudents(ArrayList<Student> student){
		for(int i = 0; i<courses.size();i++){
			courses.get(i).getUnits();
		}
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", phone=" + phone + ", age=" + age +" salary=" + salary + ", courses=" + courses + "]";
	}
}
