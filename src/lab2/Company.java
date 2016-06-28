package lab2;

import java.util.ArrayList;

public class Company {
	
	private String name;
	
	public ArrayList<Department> depts;
	
	public Company(String name) {
		super();
		this.name = name;
		depts = new ArrayList<Department>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Department> getDepts() {
		return depts;
	}
	public void setDepts(ArrayList<Department> depts) {
		this.depts = depts;
	}
	public void addDepts(Department dept){
		depts.add(dept);
	}
	
	public void print(){
		
		for(Department dept: depts){
			System.out.println(dept);
			dept.print();
		}		
	}
	public double getSalary(){
		double totalSalary=0.0;
		for(Department dept: depts){
			totalSalary+=dept.getSalary();
		}
		return totalSalary;
	}
	public Position getTopExecutive(){
		Position topExecutive = null;
		for(Department dept:depts){
			if(dept.getDeptHead().getSuperior()==null){
				topExecutive = dept.getDeptHead();
				break;
			}
		}
		return topExecutive;
	}
	public void printReportingHierarchu() {
		//Position topExecutive = getTopExecutive();
		//System.out.println(topExecutive);
		for(Department dept:depts){		
				System.out.println(dept.getName());
				dept.printReportingHierarchu();	
				
		}

	}
	

}
