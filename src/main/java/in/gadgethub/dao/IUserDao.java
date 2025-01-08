package in.gadgethub.dao;
import in.gadgethub.pojo.UserPojo;
public interface IUserDao {
			String registerUser(UserPojo user);
			boolean isRegistered(String emailId);
			String isValidCreadentials(String emailId,String password);
			UserPojo getUserDetails(String emailId);
			String getUserFirstName(String emailId);
			String getUserAddr(String emailId);
}
