package in.gadgetshub.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
			if(result==1) {
				status="Product Added Succesfully With Id :: "+product.getProdId();
			}
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
			psmt=con.prepareStatement("Update product set pname=?,ptype=?,pinfo=?,pprice=?,pquantity=?,image=? where pid=?");
			psmt.setString(1, updatedProduct.getProdName());
			psmt.setString(2,updatedProduct.getProdType());
			psmt.setString(3,updatedProduct.getProdInfo());
			psmt.setDouble(4,updatedProduct.getProdPrice());
			psmt.setInt(5,updatedProduct.getProdQuantity());
			psmt.setBlob(6,updatedProduct.getProdImage());
			psmt.setString(7, updatedProduct.getProdId());
			int result=psmt.executeUpdate();
			if(result>0) {
				status="Product Updated Succesfully";
			}
		}catch(SQLException se) {
			System.out.println("Error in update product :: "+se.getMessage());
			se.printStackTrace();
		}
		DBUtil.closeStatement(psmt);
		return status;
	}

	@Override
	public String updateProductPrice(String proId, double updatedPrice) {
		String status="Price Updation Failed ! ";
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		try {
			psmt=con.prepareStatement("update products set pprice=? where pid=?");
			psmt.setDouble(1, updatedPrice);
			psmt.setString(2,proId);
			int count=psmt.executeUpdate();
			if(count==1) {
				status="Product price updated succesfully";
			}
		}catch(SQLException ex) {
			System.out.println("Error :: Update product price "+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeStatement(psmt);
		return status;
	}

	@Override
	public List<ProductPojo> getAllProducts() {
			List<ProductPojo>productList=new ArrayList<>();
			Connection con=DBUtil.provideConnnection();
			Statement stmt=null;
			ResultSet rs=null;
			try {
				stmt=con.createStatement();
				 rs=stmt.executeQuery("select * from products");

				while(rs.next()) {
					ProductPojo prodPojo=new ProductPojo();
					prodPojo.setProdId(rs.getString("pid"));
					prodPojo.setProdName(rs.getString("pname"));
					prodPojo.setProdType(rs.getString("ptype"));
					prodPojo.setProdInfo(rs.getString("pinfo"));
					prodPojo.setProdPrice(rs.getDouble("pprice"));
					prodPojo.setProdQuantity(rs.getInt("pquantity"));
					prodPojo.setProdImage(rs.getBinaryStream("image"));
					productList.add(prodPojo);
				}
			}catch(SQLException se) {
				System.out.println("Error :: Fetch Products "+se.getMessage());
				se.printStackTrace();
			}
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(stmt);
		return productList;
	}

	@Override
	public List<ProductPojo> getAllProductsByType(String type) {
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		type=type.toLowerCase();
		List<ProductPojo>productList=new ArrayList<>();
		try {
			psmt=con.prepareStatement("select * from products where lower(ptype) like ?");
			psmt.setString(1, "%"+type+"%");
			rs=psmt.executeQuery();
			while(rs.next()) {
				ProductPojo prodPojo=new ProductPojo();
				prodPojo.setProdId(rs.getString("pid"));
				prodPojo.setProdName(rs.getString("pname"));
				prodPojo.setProdType(rs.getString("ptype"));
				prodPojo.setProdInfo(rs.getString("pinfo"));
				prodPojo.setProdPrice(rs.getDouble("pprice"));
				prodPojo.setProdQuantity(rs.getInt("pquantity"));
				prodPojo.setProdImage(rs.getBinaryStream("image"));
				productList.add(prodPojo);
			}
		}catch(SQLException ex) {
			System.out.println("Error :: to get product type :: "+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeResultSet(rs);
		DBUtil.closeStatement(psmt);
		return productList;
	}
	@Override
	public List<ProductPojo> searchAllProducts(String search) {
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		search=search.toLowerCase();
		List<ProductPojo>productList=new ArrayList<>();
		try {
			psmt=con.prepareStatement("select * from products where lower(ptype) like ? or lower(pname) like ? or lower(pinfo) like ? ");
			psmt.setString(1, "%"+search+"%");
			psmt.setString(2, "%"+search+"%");
			psmt.setString(3, "%"+search+"%");
			rs=psmt.executeQuery();
			while(rs.next()) {
				ProductPojo prodPojo=new ProductPojo();
				prodPojo.setProdId(rs.getString("pid"));
				prodPojo.setProdName(rs.getString("pname"));
				prodPojo.setProdType(rs.getString("ptype"));
				prodPojo.setProdInfo(rs.getString("pinfo"));
				prodPojo.setProdPrice(rs.getDouble("pprice"));
				prodPojo.setProdQuantity(rs.getInt("pquantity"));
				prodPojo.setProdImage(rs.getBinaryStream("image"));
				productList.add(prodPojo);
			}

		}catch(SQLException ex) {
			System.out.println("Error into searchAllProduct :: "+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeResultSet(rs);
		DBUtil.closeStatement(psmt);
		return productList;

	}

	@Override
	public ProductPojo getProductDetails(String prodId) {
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		ProductPojo product=null;
		try {
			psmt=con.prepareStatement("select 1 from products where pid=?");
			psmt.setString(1, prodId);
			rs=psmt.executeQuery();
			while(rs.next()) {
				product=new ProductPojo();
				product.setProdId(rs.getString("pid"));
				product.setProdName(rs.getString("pname"));
				product.setProdType(rs.getString("ptype"));
				product.setProdInfo(rs.getString("pinfo"));
				product.setProdPrice(rs.getDouble("pprice"));
				product.setProdQuantity(rs.getInt("pquantity"));
				product.setProdImage(rs.getBinaryStream("image"));
			}

		}catch(SQLException ex) {
			System.out.println("Error into searchAllProduct :: "+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeResultSet(rs);
		DBUtil.closeStatement(psmt);
		return product;

	}

	@Override
	public int getProductQuantity(String prodId) {
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		ProductPojo product=null;
		int qty=0;
		try {
			psmt=con.prepareStatement("select 1 from products where pid=?");
			psmt.setString(1, prodId);
			rs=psmt.executeQuery();
			if(rs.next()) {
				qty=rs.getInt("pquantity");
			}

		}catch(SQLException ex) {
			System.out.println("Error into getProductQuantity :: "+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeResultSet(rs);
		DBUtil.closeStatement(psmt);
		return qty;
	}

	@Override
	public String updateProductWithoutImage(String prevProductId, ProductPojo updatedProduct) {
		String status="Updation Falied !";
		int prevQuantity=0;
		if(!prevProductId.equalsIgnoreCase(updatedProduct.getProdId())) {
			status="Product ID's Do Not Match. Updation Failed";
			return status;
		}
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		try {
			prevQuantity =getProductQuantity(prevProductId);
			psmt=con.prepareStatement("Update product set pname=?,ptype=?,pinfo=?,pprice=?,pquantity=?,image=? where pid=?");
			psmt.setString(1, updatedProduct.getProdName());
			psmt.setString(2,updatedProduct.getProdType());
			psmt.setString(3,updatedProduct.getProdInfo());
			psmt.setDouble(4,updatedProduct.getProdPrice());
			psmt.setInt(5,updatedProduct.getProdQuantity());
			psmt.setBlob(6,updatedProduct.getProdImage());
			psmt.setString(7, updatedProduct.getProdId());
			int count=psmt.executeUpdate();
			if(count==1 && prevQuantity <updatedProduct.getProdQuantity()) {
				status="Product updated succesfully and mail send";
				//mail to send
			}else if(count==1) {
				status="Product updated succesfully";
			}
		}catch(SQLException ex) {
			System.out.println("Error into updateProductWithoutImage"+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeStatement(psmt);
		return status;
	}

	@Override
	public double getProductPrice(String prodId) {
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		ResultSet rs=null;
		ProductPojo product=null;
		double price=0.0;
		try {
			psmt=con.prepareStatement("select ppricw from products where pid=?");
			psmt.setString(1, prodId);
			rs=psmt.executeQuery();
			if(rs.next()) {
				price=rs.getInt(1);
			}

		}catch(SQLException ex) {
			System.out.println("Error into getProductPrice :: "+ex.getMessage());
			ex.printStackTrace();
		}
		DBUtil.closeResultSet(rs);
		DBUtil.closeStatement(psmt);
		return price;
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
