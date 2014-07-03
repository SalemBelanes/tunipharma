package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.Operator;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces.IDaoGenerique;
import tn.edu.esprit.cinfo2.g2.tunipharma.utilities.MysqlUtilities;

import com.mysql.jdbc.Statement;

public class OperatorDao implements IDaoGenerique<Operator> {
	public static OperatorDao instansof;

	private OperatorDao() {
		System.out.println("salem");
	}

	private Connection connection;

	private Connection getConnection() {
		if (connection == null) {

			connection = MysqlUtilities.giveMeConnectionConfigured();
		}
		return connection;

	}

	@Override
	public boolean add(Operator operator) {
		Connection connection = this.getConnection();
		
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql= "insert into operator (drug_store_id,firstname,lasname,login,password,email) values("
					+ "'"+ operator.getDrug_store().getId()+ "',"
					+ "'"+ operator.getFirstname() +"',"
					+ "'"+ operator.getLasname()+"',"
					+ "'"+ operator.getLogin() +"',"
					+ "'"+ operator.getPassword() + "',"
					+ "'"+ operator.getEmail() +"'"
				
					+ ")";
			statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Operator operator) {
		// TODO Auto-generated method stub
		Connection connection = this.getConnection();
		try {
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean remove(Operator t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Operator findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static OperatorDao getInstanceof() {

		if (instansof == null) {
			instansof = new OperatorDao();
		}

		return instansof;
	}

	@Override
	public List<Operator> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
