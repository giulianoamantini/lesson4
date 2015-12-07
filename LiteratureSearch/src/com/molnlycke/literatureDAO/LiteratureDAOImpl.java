package com.molnlycke.literatureDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LiteratureDAOImpl implements LiteratureDAO{

	private Connection connection;
	
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException ex){
			System.out.print("mysql driver not found\n");
		}
	}
	
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/TestDB", 
				"root", 
				"welcome");
	}
	
	private void closeConnection(Connection c){
		if (c != null){
			try{
				c.close();
			} catch(SQLException ex){
				System.out.print("close connection failed\n");
			}
		}
	}
	
	@Override
	public List<Literature> searchKeywords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Literature> searchCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Literature> getAllLiterature() {
		List<Literature> all = new ArrayList<Literature>();
		
		try {
			connection = getConnection();
			String sql = "select * from LITERATURE";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while (result.next()){
				Integer id = result.getInt("ID");
				String name = result.getString("NAME");
				String category = result.getString("CATEGORY");
				String keywords = result.getString("KEYWORDS");
				String photoname = result.getString("PHOTONAME");
				Literature l = new Literature(id, name, category, keywords, photoname, 0);
				all.add(l);
			}
		} catch (SQLException ex){
			System.out.print("could not find all\n");
		}
		return all;
	}

}
