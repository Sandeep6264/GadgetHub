package in.gadgethub.dao;

import java.util.List;

import in.gadgethub.pojo.DemandPojo;

public interface DemandDAO {
	public Boolean addProduct(DemandPojo demandPojo);
	public Boolean remvoeProduct(String userId,String prodId);
	public List<DemandPojo> haveDemanded(String proId);	
}
