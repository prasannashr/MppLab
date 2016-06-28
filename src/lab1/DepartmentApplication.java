package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepartmentApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Department dept = new Department("ComputerScience");
		// Create faculty objects
		Person frankMoore = new Faculty("Frank Moore","472-5921",43,10000.0);	
		Person samHoward = new Faculty("Sam Howard","472-7222",55,9500.0);
		Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600.0);
		dept.addPerson(frankMoore);
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);	
		
		
		// Create staff objects
		Person frankGore = new Staff("Frank Gore","472-3321",33,4050);
		Person adamDavis = new Staff("Adam Davis","472-7552",50,5500);
		Person davidHeck = new Staff("David Heck","472-8890",29,3600);
		dept.addPerson(frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);
		
		// Create course objects	
		
		Course cs201 = new Course("cs201","programming",4, (Faculty)johnDoodle);
		Course cs360 = new Course("cs360","database",3, (Faculty)samHoward);
		Course cs404 = new Course("cs404","compiler",4, (Faculty)johnDoodle);
		Course cs240 = new Course("cs240","datastructure",2, (Faculty)johnDoodle);
		Course cs301 = new Course("cs301","Software engg",3, (Faculty)samHoward);
		Course cs450 = new Course("cs450","Advanced architecture",5,(Faculty)frankMoore);
		
		// Create student objects
		Person johnDoe = new Student("John Doe","472-1121",22,4.0);
		Person maryJones = new Student("Mary Jones","472-7322",32,3.80);
		Person leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);
		dept.addPerson(johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);
		
		((Student)johnDoe).addCourse(cs201);
		((Student)maryJones).addCourse(cs360);
		((Student)leeJohnson).addCourse(cs404);
		
		// Create staff objects
		Person prasanna = new StaffStudent("Prasanna Shrestha","472-3321",33,3.4,4050);
		Person hari = new StaffStudent("Hari Davis","472-7552",50,4.0,5500);
		Person madav = new StaffStudent("Madav Heck","472-8890",29,3.5,3600);
		dept.addPerson(prasanna);
		dept.addPerson(hari);
		dept.addPerson(madav);
		
		/*((Faculty)johnDoodle).addCourse(cs201);
		((Faculty)samHoward).addCourse(cs360);
		((Faculty)johnDoodle).addCourse(cs404);
		((Faculty)johnDoodle).addCourse(cs240);
		((Faculty)samHoward).addCourse(cs301);
		((Faculty)frankMoore).addCourse(cs450);*/
		
		/*
		 * The above course objects will go inside either
		 * a faculty object, or a student object.  Not all of the course
		 *  objects go into the same object.
		 * 
		 *  You would have code that looks something like :
		 *  frankMoore.addCourse(cs450);
		 * 
		 *  The addCourse method would have to be written in
		 *  the faculty class.  Something similar would be done 
		 *  for students.
		 */
      
      /********************************************************/
		      
		      
		      double totsalary = 0;

		      while(true)
		         {
		         putText("Enter first letter of ");
		         putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
		         int choice = getChar();
		         switch(choice)
		            {
		            case 'g':
		               totsalary=dept.getTotalSalary();
		               putText("Total sum of all salaries is:");
		               putText(String.valueOf(totsalary)+"\n");              
		               break;
		            case 's':
		               dept.showAllMembers();
		               break;
		            case 'u':
		               dept.unitsPerFaculty();
		               break;
		            case 'f':
		            	putText("Enter Name of Faculty: ");
		            	String facultyName = getString();
			            dept.printStudents(facultyName);
			            break;
		            case 'q': return;
		            default:
		               putText("Invalid entry\n");
		            }  // end switch
		         }  // end while
		      }  // end main()
		// -------------------------------------------------------------
		   public static void putText(String s) //writes string s to the screen
		      {
		      System.out.println(s);
		      }
		// -------------------------------------------------------------
		   public static String getString() throws IOException  //reads a string from the keyboard input
		      {
		      InputStreamReader isr = new InputStreamReader(System.in);
		      BufferedReader br = new BufferedReader(isr);
		      String s = br.readLine();
		      return s;
		      }
		// -------------------------------------------------------------
		   public static char getChar() throws IOException //reads a character from the keyboard input
		      {
		      String s = getString();
		      return s.charAt(0);
		      }

		//-------------------------------------------------------------
		   public static int getInt() throws IOException // reads an integers from the keyboard input
		      {
		      String s = getString();
		      return Integer.parseInt(s);
		      }




	

}
