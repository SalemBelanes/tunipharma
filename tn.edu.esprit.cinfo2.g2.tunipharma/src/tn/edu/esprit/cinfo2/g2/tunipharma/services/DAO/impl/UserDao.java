package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl;

import java.util.List;


import tn.edu.esprit.cinfo2.g2.tunipharma.domain.Operator;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces.IDaoGenerique;

public class UserDao implements IDaoGenerique<Operator> {
  public static  UserDao instansof;
	
  private UserDao(){
	  System.out.println("salem");
  }
    
    @Override
	public boolean add(Operator t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Operator t) {
		// TODO Auto-generated method stub
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
	
	public static UserDao getInstanceof(){
		
		if(instansof == null){
			instansof = new UserDao();	
		}
	
	return instansof;
	}

	@Override
	public List<Operator> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
