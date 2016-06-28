package lab2;

import java.util.ArrayList;

public class Position {
	
	private String title;
	private String description;
	public Department dept;
	private Employee emp;
	private Position superior;
	private ArrayList<Position> inferior;
	int c= 1;
	public Position(String title, String description, Department dept) {
		
		this.title = title;
		this.description = description;
		this.dept = dept;
		inferior = new ArrayList();
	}	
	
	public ArrayList<Position> getInferior() {
		return inferior;
	}

	public void setInferior(ArrayList<Position> inferior) {
		this.inferior = inferior;
	}
	
	public void addInferior(Position inferior) {
		inferior.superior = this;
		this.inferior.add(inferior);
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		//emp = new Employee();
		this.emp = emp;
	}

	public void print(){
		if(emp!=null){
			emp.print();
		}
	}
	public double getSalary(){
		if(emp!=null)
			return emp.getSalary();
		return 0.0;
	}
	
	public void printDownLine(int i){
		
		
		if(this.inferior.size()!=0){
			System.out.print(this);
			System.out.println();
			for(int j=0;j<=i;j++){
				System.out.print("\t");
			}				
			i++;
			for(Position inferior:this.inferior){					
				inferior.printDownLine(i);
				if(inferior.inferior.size()==0){
					for(int j=0;j<i;j++){
						System.out.print("\t");
					}
				}
				i=1;
			}			
		}else{			
			System.out.print(this);
			System.out.println();
			
		}
		
	}
	
	public boolean isManager(){
		/*if(this.title.equalsIgnoreCase("Manager")){
			return true;
		}*/
		return (superior==null || !(superior.dept.equals(dept)));
			
		
	}

	@Override
	public String toString() {
		return "Position [" + title + ", " + emp.getFirstName() + "]";
	}
}
