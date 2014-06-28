package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl;

import tn.edu.esprit.info2.g2.tunipharma.domaine.User;
import tn.edu.esprit.info2.g2.tunipharma.services.dao.interfaces.IDaoGenerique;

public class UserDao implements IDaoGenerique<User> {
  public static  UserDao instansof;
	
  private UserDao(){
	  System.out.println("salem");
  }
    
    @Override
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static UserDao getInstanceof(){
		
		if(instansof == null){
			instansof = new UserDao();	
		}
	
	return instansof;
	}
	
	

}
