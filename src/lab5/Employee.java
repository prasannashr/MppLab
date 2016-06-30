package lab5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Employee {
	
	private int empId;
	private ArrayList<Paycheck> payChecks;
	
	public Employee(int empId) {
		
		this.empId = empId;
	}
	public Paycheck calcCompensation(int month, int year){
		
		Calendar startDate = new GregorianCalendar(year, month-1,1);
		Date d = startDate.getTime();
		Calendar endDate = new GregorianCalendar(year, month-1,DateRange.getLastDayOfMonth(d));
		DateRange dateRange = new DateRange(startDate,endDate);
		double grossPay = this.calcGrossPay(dateRange);
		double fica = 0.23*grossPay;
		double state = 0.23*grossPay;
		double local  = 0.23*grossPay;
		double medicare = 0.23*grossPay;
		double socialSecurity = 0.23*grossPay;
		Paycheck payCheck = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity, dateRange);
		
		return payCheck;
	}
	public abstract double calcGrossPay(DateRange dateRange);

}
