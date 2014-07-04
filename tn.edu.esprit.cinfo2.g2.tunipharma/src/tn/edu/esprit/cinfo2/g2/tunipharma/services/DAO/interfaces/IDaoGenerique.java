package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces;

import java.util.List;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.DrugStore;

public interface IDaoGenerique<obj> {
	
	boolean add(obj t);
	boolean update(obj t);
	boolean remove(obj t);
	obj findByID(int id);
	List<obj> findAll();

}
