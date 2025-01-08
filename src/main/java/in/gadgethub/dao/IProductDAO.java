package in.gadgethub.dao;

import java.util.List;

import in.gadgethub.pojo.ProductPojo;

public interface IProductDAO {
	public String addProduct(ProductPojo product);
	public String  updateProduct(ProductPojo prevProduct,ProductPojo updatedProduct);
	public String updateProductPrice(String proId,double updatedPrice);
	public List<ProductPojo>getAllProducts();
	public List<ProductPojo>getAllProductsByType(String type);
	public List<ProductPojo>searchAllProducts(String search);
	public ProductPojo getProductDetails(String prodId);
	public int getProductQuantity(String prodId);
	public String updateProductWithoutImage(String prevProductId,ProductPojo updatedProduct);
	public double getProductPrice(String prodId);
	public Boolean sellNProduct(String prodId,int n);
	public List<String>getAllProductsType();
	public byte[]getImage(String prodId);
	public String removeProduct(String prodId);
}
