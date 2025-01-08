package in.gadgethub.pojo;

import java.io.InputStream;

public class ProductPojo {
	private String prodId;
	private String prodName;
	private String prodType;
	private String productInfo;
	private double prodPrice;
	private int prodQuantity;
	private InputStream prodImage;
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
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdInfo() {
		return productInfo;
	}
	public void setProdInfo(String prodIngo) {
		this.productInfo = prodIngo;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public InputStream getProdImage() {
		return prodImage;
	}
	public void setProdImage(InputStream prodImage) {
		this.prodImage = prodImage;
	}

	public ProductPojo(String prodId, String prodName, String prodType, String prodInfo, double prodPrice,
			int prodQuantity, InputStream prodImage) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodType = prodType;
		this.productInfo = prodInfo;
		this.prodPrice = prodPrice;
		this.prodQuantity = prodQuantity;
		this.prodImage = prodImage;
	}
	public ProductPojo() {
	}
	
}
