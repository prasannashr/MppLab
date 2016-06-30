package lab5;

public class Paycheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod) {
		
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}
	public void print(){
		
	}
	public double getNetPay(){
		
		return 0;
	}
	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public void setFica(double fica) {
		this.fica = fica;
	}

	public void setState(double state) {
		this.state = state;
	}

	public void setLocal(double local) {
		this.local = local;
	}

	public void setMedicare(double medicare) {
		this.medicare = medicare;
	}

	public void setSocialSecurity(double socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public void setPayPeriod(DateRange payPeriod) {
		this.payPeriod = payPeriod;
	}

}
