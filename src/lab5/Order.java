package lab5;

import java.util.Date;

public class Order {

	private int orderNo;
	private Date orderDate;
	private float orderAmount;
	private Employee emp;

	public Order(int orderNo, Date orderDate, float orderAmount, Commissioned emp) {
		
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.emp = emp;
		emp.addOrders(this);
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

}
