package lab2;

import java.util.ArrayList;

public class Department {

	private String name;
	private String location;
	public Company company;
	public ArrayList<Position> positions;

	public Department(String name, String location, Company company) {
		super();
		this.name = name;
		this.location = location;
		this.company = company;
		positions = new ArrayList<Position>();
		company.addDepts(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void addPosition(Position position) {
		positions.add(position);
	}

	public void print() {
		for (Position p : positions) {
			System.out.println(p);
			p.print();
		}
	}

	public double getSalary() {
		double totalSalary = 0.0;
		for (Position p : positions) {
			totalSalary += p.getSalary();
		}

		return totalSalary;
	}

	public void printReportingHierarchu() {
		Position deptHead = getDeptHead();
		if(deptHead!=null){
			deptHead.printDownLine(0);
		}
		

	}

	public Position getDeptHead() {
		Position deptHead = null;
		for (Position p : positions) {
			if(p.isManager()){
				deptHead = p;
				break;
			}
		}
		return deptHead;
	}

	@Override
	public String toString() {
		return "Department [" + name + ", " + location + ", " + company.getName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((positions == null) ? 0 : positions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (positions == null) {
			if (other.positions != null)
				return false;
		} else if (!positions.equals(other.positions))
			return false;
		return true;
	}

	

}
