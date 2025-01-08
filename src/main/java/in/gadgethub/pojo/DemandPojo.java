package in.gadgethub.pojo;

public class DemandPojo {
	private String userEmail;
	private String prodId;
	private int demandQuantity;
	public String getUserEmail() {
		return userEmail;
	}
	public DemandPojo() {
		super();
	}
	public DemandPojo(String userEmail, String prodId, int demandQuantity) {
		super();
		this.userEmail = userEmail;
		this.prodId = prodId;
		this.demandQuantity = demandQuantity;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public int getDemandQuantity() {
		return demandQuantity;
	}
	public void setDemandQuantity(int demandQuantity) {
		this.demandQuantity = demandQuantity;
	}
	@Override
	public String toString() {
		return "DemandPojo [userEmail=" + userEmail + ", prodId=" + prodId + ", demandQuantity=" + demandQuantity + "]";
	}
}
