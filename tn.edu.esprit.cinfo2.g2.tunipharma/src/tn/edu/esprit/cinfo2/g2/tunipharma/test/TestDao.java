package tn.edu.esprit.cinfo2.g2.tunipharma.test;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.DrugStore;
import tn.edu.esprit.cinfo2.g2.tunipharma.domain.Operator;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl.DrugStoreDao;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl.OperatorDao;

public class TestDao {

	public TestDao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		OperatorDao OperatorDao = tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl.OperatorDao
				.getInstanceof();

		DrugStore d = new DrugStore();

		d.setId(1);
		d.setAdress("tunis");
		d.setEmail("drugstore@gmail.com");
		d.setName("Drugstore");
		d.setRegion("Ariana");
		d.setSector("day");
		d.setTelephone("712356954");
		d.setWeb_site("www.drugstore.com");

		DrugStoreDao.add(d);

		DrugStore operatorFinded = DrugStoreDao.findByID(1);
		operatorFinded.toString();

		operatorFinded.setSector("night");

		DrugStoreDao.update(d);

		operatorFinded = DrugStoreDao.findByID(1);
		operatorFinded.toString();

		DrugStoreDao.remove(d);

		Operator operator = new Operator("");
		operator.setId(1);
		operator.setFirstname("Salem");
		operator.setLasname("Belanes");
		operator.setEmail("belanes_salem@ahoo.fr");
		operator.setLogin("salem");
		operator.setPassword("secret");

		OperatorDao.add(operator);

		Operator operatorFinded = OperatorDao.findByID(1);
		operatorFinded.toString();

		operatorFinded.setPassword("newSecret");

		OperatorDao.update(operator);

		operatorFinded = OperatorDao.findByID(1);
		operatorFinded.toString();

		OperatorDao.remove(operator);

	}

}
