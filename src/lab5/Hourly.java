package lab5;

public class Hourly extends Employee {
	private double hourlyWage;
	private float hoursPerWeek;

	public Hourly(int empId, double hourlyWage, float hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public float getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(float hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay(DateRange dateRange) {
		// TODO Auto-generated method stub
		return 4*this.hourlyWage*this.hoursPerWeek;
	}

}
