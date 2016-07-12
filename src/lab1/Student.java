package lab1;

import java.util.ArrayList;

public class Student extends Person {
	
	public double GPA;
	public ArrayList<Course> courses;
	
	public Student(String name, String phone, int age, double gPA) {
		super(name, phone, age);
		GPA = gPA;
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
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void addCourse(Course course){
		courses.add(course);
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public double getSalary() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", age=" + age + " GPA=" + GPA + ", courses=" + courses + "]";
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
