package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.DrugStore;
import tn.edu.esprit.cinfo2.g2.tunipharma.domain.Operator;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces.IDaoGenerique;
import tn.edu.esprit.cinfo2.g2.tunipharma.utilities.MysqlUtilities;

import com.mysql.jdbc.Statement;

public class OperatorDao implements IDaoGenerique<Operator> {
	public static OperatorDao instansof;

	public OperatorDao() {

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
			String sql = "insert into operator (drug_store_id,firstname,lasname,login,password,email) values("
					+ "'"
					+ operator.getDrug_store().getId()
					+ "',"
					+ "'"
					+ operator.getFirstname()
					+ "',"
					+ "'"
					+ operator.getLasname()
					+ "',"
					+ "'"
					+ operator.getLogin()
					+ "',"
					+ "'"
					+ operator.getPassword()
					+ "',"
					+ "'"
					+ operator.getEmail() + "'" + ")";
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

			Statement statement = (Statement) connection.createStatement();
			String sql = "update user set  firstname = '"
					+ operator.getFirstname() + "'," + "lastname='"
					+ operator.getLasname() + "'," + "login='"
					+ operator.getLogin() + "'," + "password="
					+ operator.getPassword() + "'," + "login='"
					+ operator.getLogin() + "'" + " where id = "
					+ operator.getId() + "";
			statement.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean remove(Operator operator) {
		Connection connection = this.getConnection();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "delete from operartor where id = " + operator.getId();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Operator findByID(int id) {
		Connection connection = this.getConnection();
		Operator operator = null;
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select * from  operator where id = " + id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.last();
			if (resultSet.getRow() < 1) {
				return null;
			} else {
				resultSet.first();
				operator = new Operator(resultSet);
				// decalarate DAO for drug store
				DrugStoreDao drugStoreDao = new DrugStoreDao();
				DrugStore finddrug = drugStoreDao.findByID(resultSet.getInt("drug_store_id"));
				operator.setDrugstore(finddrug);

			}

		} catch (SQLException e) {
			System.out.println("exception");
			e.printStackTrace();
		}

		return operator;
	}

	public static OperatorDao getInstanceof() {

		if (instansof == null) {
			instansof = new OperatorDao();
		}

		return instansof;
	}

	@Override
	public List<Operator> findAll() {
		Connection connection = this.getConnection();
		List<Operator> op = new ArrayList<Operator>();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select * from  operartor ";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				Operator operator = new Operator(resultSet);
				DrugStoreDao drugstordao = DrugStoreDao.getInstanceof();
				DrugStore drugStore = drugstordao.findByID(resultSet
						.getInt("drug_store_id"));
				operator.setDrugstore(drugStore);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return op;
	}

}
