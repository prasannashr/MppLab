package lab2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Company javraSoftware = new Company("Javra Software");
		
		Department nodeJs = new Department("NodeJs","First F90loor",javraSoftware);
		Department marketing = new Department("Marketing","Second Floor",javraSoftware);
		Department administrative = new Department("Administrative","Top Floor",javraSoftware);
		
		Position ceo = new Position("CEO", "CEO of Javra Software", nodeJs);
		administrative.addPosition(ceo);
		
		Position manager = new Position("Manager", "Manager of NodeJs", nodeJs);
		Position seniorDeveloper = new Position("Senior Developer", "Developer of NodeJs", nodeJs);
		Position juniorDeveloper = new Position("Junior Developer", "Developer of NodeJs", nodeJs);
		Position designer = new Position("Designer", "Designer of NodeJs", nodeJs);
		
		nodeJs.addPosition(manager);
		nodeJs.addPosition(seniorDeveloper);
		nodeJs.addPosition(juniorDeveloper);
		nodeJs.addPosition(designer);
		
		manager.addInferior(seniorDeveloper);
		seniorDeveloper.addInferior(juniorDeveloper);
		seniorDeveloper.addInferior(designer);
		ceo.addInferior(manager);
		
		Position manager2 = new Position("Manager", "Manager of Marketing", marketing);
		Position salesPerson = new Position("SalesMan", "Developer of Marketing", marketing);
		Position rnd = new Position("RnD", "RnD of Marketing", marketing);
		
		marketing.addPosition(manager2);
		marketing.addPosition(salesPerson);
		marketing.addPosition(rnd);
		
		manager2.addInferior(salesPerson);
		salesPerson.addInferior(rnd);
		ceo.addInferior(manager2);
		
		Employee Frank = new Employee(001, "Frank", "", "Shrestha", new Date(), "23432-243-43", 100000.00,ceo);
		Employee prasanna = new Employee(001, "Prasanna", "", "Shrestha", new Date(), "23432-243-43", 100000.00,manager);		
		Employee bishal = new Employee(002, "Bishal", "", "Shrestha", new Date(), "23432-243-43", 80000.00,seniorDeveloper);		
		Employee sanjeev = new Employee(003, "Sanjeev", "", "Shrestha", new Date(), "23432-243-43", 70000.00,designer);		
		Employee arun = new Employee(004, "Arun", "", "Shrestha", new Date(), "23432-243-43", 80000.00,designer);
		Employee sunil = new Employee(004, "Sunil", "", "Shrestha", new Date(), "23432-243-43", 80000.00,juniorDeveloper);
		Employee sujan = new Employee(004, "Sujan", "", "Shrestha", new Date(), "23432-243-43", 80000.00,manager2);
		Employee hari = new Employee(004, "Hari", "", "Shrestha", new Date(), "23432-243-43", 80000.00,salesPerson);
		Employee bandeshower = new Employee(004, "Bandeshor", "", "Shrestha", new Date(), "23432-243-43", 80000.00,rnd);
		
		
		
		/*manager.setEmp(prasanna);
		developer.setEmp(bishal);
		designer.setEmp(sanjeev);
		
		manager2.setEmp(arun);*/
		
		//javraSoftware.print();
		//System.out.println(javraSoftware.getSalary());
		
		
		//manager.printDownLine();
		javraSoftware.printReportingHierarchu();
		

	}
	

}
