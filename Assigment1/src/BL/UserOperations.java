package BL;

import java.sql.SQLException;

import DL.DataAccess;
import Model.User;

public class UserOperations {

	public User login(String username, String password) {
		DataAccess dataAccess = new DataAccess();
		User user;
		try {
			user = dataAccess.getUser(username, password);
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public void addUser(User user) {
		DataAccess dataAccess = new DataAccess();
		dataAccess.addUser(user);
	}
	
	public void updateUser(User user) {
		DataAccess dataAccess = new DataAccess();
		dataAccess.updateUser(user);
	}
}
