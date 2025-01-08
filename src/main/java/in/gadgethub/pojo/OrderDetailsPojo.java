package in.gadgethub.pojo;

import java.io.InputStream;
import java.sql.Date;

public class OrderDetailsPojo {
	private String orderId;
	private String prodId;
	private String prodName;
	private int quantity;
	public String getOrderId() {
		return orderId;
	}
	public OrderDetailsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetailsPojo(String orderId, String prodId, String prodName, int quantity, double amount, int shipped,
			Date time, InputStream prodImage) {
		super();
		this.orderId = orderId;
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.amount = amount;
		this.shipped = shipped;
		this.time = time;
		this.prodImage = prodImage;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getShipped() {
		return shipped;
	}
	public void setShipped(int shipped) {
		this.shipped = shipped;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public InputStream getProdImage() {
		return prodImage;
	}
	public void setProdImage(InputStream prodImage) {
		this.prodImage = prodImage;
	}
	private double amount;
	private int shipped;
	private Date time;
	private InputStream prodImage;
}
