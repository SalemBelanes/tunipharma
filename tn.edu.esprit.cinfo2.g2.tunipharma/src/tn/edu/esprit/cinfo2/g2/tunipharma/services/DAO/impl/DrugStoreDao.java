package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Statement;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.*;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces.IDaoGenerique;
import tn.edu.esprit.cinfo2.g2.tunipharma.utilities.MysqlUtilities;


public class DrugStoreDao implements IDaoGenerique<DrugStore> {
	private static DrugStoreDao drugStoreDao;

	public DrugStoreDao() {
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public List<DrugStore> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static DrugStoreDao getInstanceof() {
		if(drugStoreDao== null){
			drugStoreDao = new DrugStoreDao();
			
		}
		
		return drugStoreDao;
	}
	
	private Connection connection;

	private Connection getConnection() {
		if (connection == null) {

			connection = MysqlUtilities.giveMeConnectionConfigured();
		}
		return connection;

	}
	


	@Override
	public boolean add(DrugStore t) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean update(DrugStore t) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public boolean remove(DrugStore t) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public DrugStore findByID(int id) {
		Connection connection = this.getConnection();
		DrugStore drugstore = null;
		try {
			Statement statement = (Statement) connection.createStatement();
			String sql = "select * from  operartor where id = " + id;
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.last();
			if (resultSet.getRow() < 1){
			    return null;
			}else{
				resultSet.first();				
				drugstore = new DrugStore(resultSet);				
			}		

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return drugstore;
	}





}
