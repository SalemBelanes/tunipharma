package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.DrugStore;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces.IDaoGenerique;
import tn.edu.esprit.cinfo2.g2.tunipharma.utilities.MysqlUtilities;

import com.mysql.jdbc.Statement;

public class DrugStoreDao implements IDaoGenerique<DrugStore> {
	private static DrugStoreDao instansof;

	public DrugStoreDao() {
		// TODO Auto-generated constructor stub
	}

	private Connection connection;

	private Connection getConnection() {
		if (connection == null) {

			connection = MysqlUtilities.giveMeConnectionConfigured();
		}
		return connection;

	}

	@Override
	public boolean add(DrugStore drugstore) {
		Connection connection = this.getConnection();

		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "insert into drug_store (name,sector,region,adress,telephone,email,web_site) values("
					+ "'"
					+ drugstore.getName()
					+ "',"
					+ "'"
					+ drugstore.getSector()
					+ "',"
					+ "'"
					+ drugstore.getRegion()
					+ "',"
					+ "'"
					+ drugstore.getAdress()
					+ "',"
					+ "'"
					+ drugstore.getTelephone()
					+ "',"
					+ "'"
					+ drugstore.getEmail()
					+ "',"
					+ "'"
					+ drugstore.getWeb_site() + "'"

					+ ")";
			statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(DrugStore drugstore) {
		// TODO Auto-generated method stub
		Connection connection = this.getConnection();
		try {

			Statement statement = (Statement) connection.createStatement();
			String sql = "update drug_store set (name,sector,region,adress,telephone,email,web_site) values("
					+ "'"
					+ drugstore.getName()
					+ "',"
					+ "'"
					+ drugstore.getSector()
					+ "',"
					+ "'"
					+ drugstore.getRegion()
					+ "',"
					+ "'"
					+ drugstore.getAdress()
					+ "',"
					+ "'"
					+ drugstore.getTelephone()
					+ "',"
					+ "'"
					+ drugstore.getEmail()
					+ "',"
					+ "'"
					+ drugstore.getWeb_site() + "'"

					+ ")";
			statement.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean remove(DrugStore drugStore) {
		Connection connection = this.getConnection();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "delete from drug_store where id = "
					+ drugStore.getId();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public DrugStore findByID(int id) {
		Connection connection = this.getConnection();
		DrugStore drugstore = null;
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select * from  drug_store where id = " + id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.last();
			if (resultSet.getRow() < 1) {
				return null;
			} else {
				resultSet.first();
				drugstore = new DrugStore(resultSet);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return drugstore;
	}

	@Override
	public List<DrugStore> findAll() {
		Connection connection = this.getConnection();
		List<DrugStore> drugstores = new ArrayList<DrugStore>();
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select * from  drug_store";
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				DrugStore drugstore = new DrugStore(resultSet);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return drugstores;
	}

	public static DrugStoreDao getInstanceof() {
		if (instansof == null) {
			instansof = new DrugStoreDao();

		}

		return instansof;
	}
}
