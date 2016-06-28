package lab1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	public String name;
	public ArrayList<Person> persons;
	
	public Department(String name){
		this.name = name;
		persons = new ArrayList<Person>();
	}
	
	public double getTotalSalary(){
		double totalSalary=0.0;
		for(int i = 0; i<persons.size();i++){
			/*totalSalary+=((Faculty)persons.get(i)).getSalary();
			totalSalary+=((Staff)persons.get(i)).getSalary();		*/	
			totalSalary+= persons.get(i).getSalary();
		}		
		return totalSalary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPersons() {
		return persons;
	}
	public void addPerson(Person person){
		persons.add(person);
	}
	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public void showAllMembers(){
		for(int i = 0; i<persons.size();i++){
			System.out.println(persons.get(i));			
		}	
	}
	
	public void unitsPerFaculty(){
		
		for(int i = 0; i<persons.size();i++){
			if(persons.get(i) instanceof Faculty){
				System.out.print((Faculty)persons.get(i)+" :: ");
				System.out.println(((Faculty)persons.get(i)).getTotalUnits());		
			}			
		}			
	}
	public void printStudents(String facultyName){
		for(int i = 0; i<persons.size();i++){
			
			if(persons.get(i) instanceof Faculty){
				
				if(persons.get(i).getName().equals(facultyName)){
					
					ArrayList<Course> courses = ((Faculty)persons.get(i)).getCourses();
					
					for(Course c: courses){
						
						for(Person p :persons){
							if(p instanceof Student){
								if(((Student)p).getCourses().contains(c)){
									System.out.println(p);
								}
							}
										
						}
					}
				}
			}		
		}		
	}

}
