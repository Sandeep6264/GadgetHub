package in.gadgethub.pojo;

import java.sql.Date;

public class TranscationPojo {
	private String transactionId;
	private String userEmail;
	private Date transTime;
	public TranscationPojo(String transactionId, String userEmail, Date transTime, double amount) {
		super();
		this.transactionId = transactionId;
		this.userEmail = userEmail;
		this.transTime = transTime;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TranscationPojo [transactionId=" + transactionId + ", userEmail=" + userEmail + ", transTime="
				+ transTime + ", amount=" + amount + "]";
	}
	public TranscationPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private double amount;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getTransTime() {
		return transTime;
	}
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
