package in.gadgetshub.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import in.gadgethub.dao.IProductDAO;
import in.gadgethub.pojo.ProductPojo;
import in.gadgethub.utility.DBUtil;
import in.gadgethub.utility.IDutil;

public class ProductDAOImpl implements IProductDAO {

	@Override
	public String addProduct(ProductPojo product) {
		String status="Product Registration Failed ! ";
		if(product.getProdId()==null) {
			product.setProdId(IDutil.generatePordId());
		}
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		try {
			psmt=con.prepareStatement("Insert into products values(?,?,?,?,?,?.?)");
			psmt.setString(1, product.getProdId());
			psmt.setString(2, product.getProdName());
			psmt.setString(3, product.getProdType());
			psmt.setString(4, product.getProdInfo());
			psmt.setDouble(5,product.getProdPrice());
			psmt.setInt(6, product.getProdQuantity());
			psmt.setBlob(7, product.getProdImage());
			int result=psmt.executeUpdate();
			if(result==1)
				status="Product Added Succesfully With Id :: "+product.getProdId();	
		}catch(SQLException se) {
			System.out.println("Error in add product :: "+se.getMessage());
			se.printStackTrace();
		}
		DBUtil.closeStatement(psmt);
		return status;
	}

	@Override
	public String updateProduct(ProductPojo prevProduct, ProductPojo updatedProduct) {
		String status=" Updation Failed";
		if(!prevProduct.getProdId().equalsIgnoreCase(updatedProduct.getProdId()))
		{
			status="Product ID's do not match. Updation Failed";
			return status;
		}
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		try {
			psmt=con.prepareStatement("Update product set pname=?,ptype=?,pinfo=?,pprice=?,pquantity,image=? where pid=?");
			psmt.setString(1, updatedProduct.getProdName());
			psmt.setString(2,updatedProduct.getProdType());
			psmt.setString(3,updatedProduct.getProdInfo());
			psmt.setDouble(4,updatedProduct.getProdPrice());
			psmt.setInt(5,updatedProduct.getProdQuantity());
			psmt.setBlob(6,updatedProduct.getProdImage());
			psmt.setString(7, updatedProduct.getProdId());
			int result=psmt.executeUpdate();
			if(result==1)
				status="Product Updated Succesful";	
		}catch(SQLException se) {
			System.out.println("Error in update product :: "+se.getMessage());
			se.printStackTrace();
		}
		DBUtil.closeStatement(psmt);
		return status;
	}

	@Override
	public String updateProductPrice(String proId, double updatedPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductPojo> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductPojo> getAllProductsByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductPojo> searchAllProducts(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductPojo getProductDetails(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getProductQuantity(String prodId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String updateProductWithoutImage(String prevProductId, ProductPojo updatedProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getProductPrice(String prodId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean sellNProduct(String prodId, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllProductsType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getImage(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProduct(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

}
