package tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.interfaces;

public interface IDaoGenerique<obj> {
	
	boolean add(obj t);
	boolean update(obj t);
	boolean remove(obj t);
	obj findByID(int id);

}
