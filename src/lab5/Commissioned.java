package lab5;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private float commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(int empId, float commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		orders = new ArrayList();
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double calcGrossPay(DateRange dateRange) {
		float totalOrder =0;
		
		for(Order order: orders){
			if(dateRange.isInRange(order.getOrderDate())){
				totalOrder+=order.getOrderAmount();
			}
		}
		commission = (float) (totalOrder*0.07);
		
		return baseSalary+commission;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public void addOrders(Order order) {
		this.orders.add(order);
	}

}
