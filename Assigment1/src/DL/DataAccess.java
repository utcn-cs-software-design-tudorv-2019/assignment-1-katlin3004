package DL;

import java.sql.*;

import Model.User;

public class DataAccess {

	private String url = "jdbc:mysql://localhost:3306/school_db";
	private String user = "root";
	private String pass = "root";
	private Connection connection;

	public DataAccess() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User getUser(String username, String password) throws SQLException {
		User user = new User();
		String query = "SELECT * FROM user WHERE username ='" + username + "' and password ='" + password + "'";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			user.setRole(rs.getString("role"));
		}
		st.close();
		return user;
	}

	public void addUser(User user) {
		String query = "INSERT INTO user(name,cnp,idcard,adress) VALUES('" + user.getName() + "'," + user.getCnp() + ","
				+ user.getIdcard() + ",'" + user.getAdress() + "')";
		System.out.println(query);
		Statement st;
		try {
			st = connection.createStatement();
			st.executeUpdate(query);
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateUser(User user) {
		String query = "UPDATE user set name='" + user.getName() + "',cnp=" + user.getCnp()
		+ ", idcard='" + user.getIdcard() + "', adress='" + user.getAdress()
		+ "' WHERE iduser=" + user.getIduser();
		System.out.println(query);
		Statement st;
		try {
			st = connection.createStatement();
			st.executeUpdate(query);
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
