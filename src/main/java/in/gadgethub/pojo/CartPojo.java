package in.gadgethub.pojo;

public class CartPojo {
	private String userEmail;
	private String prodId;
	private int quantity;
	public String getUserEmail() {
		return userEmail;
	}
	@Override
	public String toString() {
		return "CartPojo [userEmail=" + userEmail + ", prodId=" + prodId + ", quantity=" + quantity + "]";
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public CartPojo() {
		super();
	}
	public CartPojo(String userEmail, String prodId, int quantity) {
		super();
		this.userEmail = userEmail;
		this.prodId = prodId;
		this.quantity = quantity;
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
}
