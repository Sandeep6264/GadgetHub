package in.gadgetshub.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import in.gadgethub.dao.DemandDAO;
import in.gadgethub.pojo.DemandPojo;
import in.gadgethub.utility.DBUtil;

public class DemandDAOImpl implements DemandDAO {

	@Override
	public Boolean addProduct(DemandPojo demandPojo) {
		String UPDATE_SQL="UPDATE USERDEMAND SET QUANTITY=(QUANTITY+?) WHERE USEREMAIL=? AND PRODID=?";
		String INSERT_SQL="INSERT INTO USERDEMAND VALUES(?,?,?)";
		boolean status=false;
		Connection con=DBUtil.provideConnnection();
		PreparedStatement psmt1=null;
		PreparedStatement psmt2=null;
		try {
			psmt1=con.prepareStatement(UPDATE_SQL);
			psmt1.setInt(1, demandPojo.getDemandQuantity());
			psmt1.setString(2, demandPojo.getUserEmail());
			psmt1.setString(3, demandPojo.getProdId());
			int count=psmt1.executeUpdate();
			if(count==0) {
				psmt2=con.prepareStatement(INSERT_SQL);
				psmt2.setString(1, demandPojo.getUserEmail());
				psmt2.setString(2, demandPojo.getProdId());
				psmt2.setInt(3, demandPojo.getDemandQuantity());
				count =psmt2.executeUpdate();
				if(count==1)
					status=true;
				else
					status=false;
			}else
				status=true;
		}catch(SQLException se) {
			System.out.println(""+se.getMessage());
			se.printStackTrace();
		}
		DBUtil.closeStatement(psmt1);
		DBUtil.closeStatement(psmt2);
		return status;
	}

	@Override
	public Boolean remvoeProduct(String userId, String prodId) {
		
		return null;
	}

	@Override
	public List<DemandPojo> haveDemanded(String proId) {
	
		return null;
	}

}
