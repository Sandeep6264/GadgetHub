package in.gadgethub.pojo;

public class OrderPojo {
	private String orderId;
	public OrderPojo() {
		super();
	}
	private String prodId;
	@Override
	public String toString() {
		return "OrderPojo [orderId=" + orderId + ", prodId=" + prodId + ", quantity=" + quantity + ", amount=" + amount
				+ ", shipped=" + shipped + "]";
	}
	public String getOrderId() {
		return orderId;
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
	private int quantity;
	private double amount;
	private int shipped;
	public OrderPojo(String orderId, String prodId, int quantity, double amount, int shipped) {
		super();
		this.orderId = orderId;
		this.prodId = prodId;
		this.quantity = quantity;
		this.amount = amount;
		this.shipped = shipped;
	}
}
