package in.gadgetshub.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.gadgethub.dao.IUserDao;
import in.gadgethub.pojo.UserPojo;
import in.gadgethub.utility.DBUtil;

public final class UserDAOImpl implements IUserDao  {
	@Override
	public String registerUser(UserPojo user) {
		String status="Registration Failed";
		boolean isUserRegistered=isRegistered(user.getUserEmail());
		if(isUserRegistered) {
			status="Email Already Registered. Try Again";
			return status;
		}
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt=null;
		try {
			psmt=con.prepareStatement("Insert into users values(?,?,?,?,?,?)");
			psmt.setString(1, user.getUserEmail());
			psmt.setString(2, user.getUserName());
			psmt.setString(3, user.getMobile());
			psmt.setString(4, user.getAddress());
			psmt.setInt(5,user.getPinCode());
			psmt.setString(6, user.getPassword());
			int result=psmt.executeUpdate();
			if(result==1) {
				status="Registraction Successful";
			}
		}catch(SQLException se) {
			System.out.println("Error in registerUser :: "+se.getMessage());
			se.printStackTrace();
		}
		DBUtil.closeStatement(psmt);
		return status;
	}
	@Override
	public boolean isRegistered(String emailId) {
		PreparedStatement psmt=null;
		ResultSet rs=null;
		boolean flag=false;
		Connection con=DBUtil.provideConnnection();
		try {
			psmt=con.prepareStatement("select 1 from users where useremail=?");
			psmt.setString(1, emailId);
			rs=psmt.executeQuery();
			if(rs.next()) {
				flag= true;
			}
		}catch(SQLException ex) {
			System.out.println("Error in isRegistered :"+ex.getMessage());
			ex.printStackTrace();
	}
		DBUtil.closeStatement(psmt);
		DBUtil.closeResultSet(rs);
		return flag;
	}
	@Override
	public String isValidCreadentials(String emaiIId,String password) {
		PreparedStatement psmt=null;
		ResultSet rs=null;
		Connection con=DBUtil.provideConnnection();
		String status="Login Denied. Invalid Username or Password";
		try {
			psmt=con.prepareStatement("select 1 from users where email=? and password = ? ");
			psmt.setString(1, emaiIId);
			psmt.setString(2, password);
			rs=psmt.executeQuery();
			if(rs.next()) {
				status="Login Succesful";
			}
		}catch(SQLException ex) {
			status="Error : "+ex.getMessage();
			ex.printStackTrace();
		}
		DBUtil.closeResultSet(rs);
		DBUtil.closeStatement(psmt);
		return status;
	}
	@Override
	public UserPojo getUserDetails(String emailId) {
		UserPojo user=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		Connection conn=DBUtil.provideConnnection();
		try {
			psmt=conn.prepareStatement("select * from user where useremail=?");
			psmt.setString(1, emailId);
			rs=psmt.executeQuery();
			if(rs.next()) {
				user=new UserPojo();
				user.setUserEmail(rs.getString("useremail"));
				user.setUserName(rs.getString("username"));
				user.setMobile(rs.getString("mobile"));
				user.setAddress(rs.getString("address"));
				user.setPinCode(rs.getInt("pincode"));
				user.setPassword(rs.getString("password"));
			}
		}catch(SQLException se) {
			System.out.println("Error in getUserDetails :: "+se.getMessage());
			se.printStackTrace();
		}
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(psmt);
			return user;

	}
	@Override
	public String getUserFirstName(String emailId) {
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String fName=null;
		Connection conn=DBUtil.provideConnnection();
		try {
			psmt=conn.prepareStatement("select username from user where useremail=?");
			psmt.setString(1, emailId);
			rs=psmt.executeQuery();
			if(rs.next()) {
				String fullName=rs.getString(1);
				fName=fullName.split(" ")[0];
			}
		}catch(SQLException se) {
			System.out.println("Error in getUserDetails :: "+se.getMessage());
			se.printStackTrace();
		}
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(psmt);
			return fName;
	}
	@Override
	public String getUserAddr(String emailId) {
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String addrs=null;
		Connection conn=DBUtil.provideConnnection();
		try {
			psmt=conn.prepareStatement("select address from user where useremail=?");
			psmt.setString(1, emailId);
			rs=psmt.executeQuery();
			if(rs.next()) {
				addrs=rs.getString(1);
			}
		}catch(SQLException se) {
			System.out.println("Error in getUserDetails :: "+se.getMessage());
			se.printStackTrace();
		}
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(psmt);
			return addrs;
	}
}
