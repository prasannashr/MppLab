package lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class ProcessingEmployees
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo2", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing"),
         new Employee("Wendy2", "Brown2", 4236.4, "Marketing"),
         new Employee("Prasanna", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);
      
      // Predicate that returns true for salaries in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

      // Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.printf(
         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
      list.stream()
          .filter(fourToSixThousand)
          .sorted(Comparator.comparing(Employee::getSalary))
          .forEach(System.out::println);

      // Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());

      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;

      // Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFirst = 
         Comparator.comparing(byLastName).thenComparing(byFirstName);

      // sort employees by last name, then first name 
      System.out.printf(
         "%nEmployees in ascending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst)
          .forEach(System.out::println);

      // sort employees in descending order by last name, then first name
      System.out.printf(
         "%nEmployees in descending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst.reversed())
          .forEach(System.out::println);

      // display unique employee last names sorted
      System.out.printf("%nUnique employee last names:%n");
      list.stream()
          .map(Employee::getLastName)
          .distinct()
          .sorted()
          .forEach(System.out::println);

      // display only first and last names
      System.out.printf(
         "%nEmployee names in order by last name then first name:%n"); 
      list.stream()
          .sorted(lastThenFirst)
          .map(Employee::getName)
          .forEach(System.out::println);

      // group Employees by department
      System.out.printf("%nEmployees by department:%n"); 
      Map<String, List<Employee>> groupedByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));
      
      groupedByDepartment.forEach(
         (department, employeesInDepartment) -> 
         {
            System.out.println(department);
            employeesInDepartment.forEach(
               employee -> System.out.printf("   %s%n", employee));
         }
      );

      // count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n"); 
      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));
      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));

      // sum of Employee salaries with DoubleStream sum method
      System.out.printf(
         "%nSum of Employees' salaries (via sum method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .sum());

      // calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
         "Sum of Employees' salaries (via reduce method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .reduce(0, (value1, value2) -> value1 + value2));  

      // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .average()
             .getAsDouble());   
      System.out.printf("1) Count the number of last names that begin with the letter  ‘B’: %d%n",
    		 
    	 list.stream()
    	     .filter(e -> (e.getLastName()).startsWith("B")) 
    	     .count());    
      System.out.println("2) Print out all of the Employee objects whose last name begins with the letter ‘B’ "
      		+ "in sorted order.");
     
      list.stream()
     	     	.filter(e -> (e.getLastName()).startsWith("B"))
     	     	.sorted((e1,e2) -> e1.getLastName().compareTo(e2.getLastName()))
     	     	.forEach(e -> System.out.println(e.getLastName()));
      System.out.println("3)  Print out all of the Employee objects whose last name begins with the letter  ‘B’  "
      		+ "and change their first name and last name to be All capital letters.");
      
      List<Employee> beginWithB = list.stream()
    	.filter(e -> (e.getLastName()).startsWith("B")).collect(Collectors.toList());
      
      List<Employee> beginWithBColne =  new ArrayList<Employee>();
      //beginWithBColne = Super.clone();
      if(beginWithB!=null){
	      for(Employee emp : beginWithB){
	    	  beginWithBColne.add((Employee) emp.clone());
	      }
      }
      beginWithBColne.stream()
	      .forEach(e -> {
	    	  e.setFirstName(e.getFirstName().toUpperCase());
	    	  e.setLastName(e.getLastName().toUpperCase());
	    	  System.out.println(e.getFirstName()+" "+e.getLastName());
	      });
      
      System.out.println("4)  Print out All of the employee objects, but if the last name begins with the letter  "
      		+ "‘B’,  then capitalize all the letters in the last name.");
      
      list.stream()
      		.forEach(e -> {
      			if(e.getLastName().startsWith("B")){
      				System.out.println(e.getFirstName()+" "+e.getLastName().toUpperCase());
      			}else{
      				System.out.println(e.getFirstName()+" "+e.getLastName());
      			}
      		});
      
      System.out.println("5)  Print out all of the Employee objects’ last names, whose last name begins with the"
      		+ " letter ‘I’  in sorted order, and get rid of all the duplicates.  Print out only the last names.");	
      
      list.stream()
      	.filter(e -> (e.getLastName()).startsWith("I"))
      	.map(e1->e1.getLastName())
      	.distinct()
    	.sorted()    	
    	.forEach(System.out::println);
      
      System.out.println("6)  Print out the average of all the salaries.");
      System.out.println(
    		  list.stream()
    		  	.mapToDouble(Employee::getSalary).average().getAsDouble());
      
      System.out.println("7)  Use the  ‘reduce’  method to print out the total salary of all employees.");
      System.out.println(list.stream()
    		  .mapToDouble(Employee::getSalary)
    		  .reduce(0,(x,e)->x+e));
      System.out.println("8)  Print out only the first names of all the employees.  Use the  ‘map’  "
      		+ "method to accomplish this.");
      
      list.stream()
      	.map(e->e.getFirstName())
      	.forEach(System.out::println);
      
      System.out.println("9)  Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print "
      		+ "out only the first 20 even numbers from this stream.");
      
      IntStream.iterate(0, val->val+2)      
      .limit(22)
      .forEach(System.out::println);
      
      System.out.println("Get Max salary for each Department :: Extra credit");
      groupedByDepartment.forEach((dept,empList)->{
    		  System.out.println("Max Salary : "+ dept+ " : "+empList.stream()
    		  													.mapToDouble(e->e.getSalary())
    		  													.max().getAsDouble());
      });
      
      System.out.println("Get Average salary for each Department :: Extra credit");
      groupedByDepartment.forEach((dept,empList)->{
    		  System.out.println("Average Salary : "+ dept+ " : "+empList.stream()
    		  													.mapToDouble(e->e.getSalary())
    		  													.average().getAsDouble());
      });   
      
      
      
      
   } // end main
} // end class ProcessingEmployees

