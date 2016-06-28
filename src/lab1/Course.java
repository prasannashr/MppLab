package lab1;

public class Course {
	private String name;
	private String title;
	private int units;
	public Faculty faculty;
	
	public String getName() {
		return name;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Course(String name, String title, int units, Faculty faculty) {
		
		this.name = name;
		this.title = title;
		this.units = units;
		this.faculty = faculty;
		faculty.addCourse(this);
		
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}

}
