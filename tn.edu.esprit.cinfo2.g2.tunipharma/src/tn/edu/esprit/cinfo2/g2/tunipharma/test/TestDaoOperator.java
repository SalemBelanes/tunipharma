package tn.edu.esprit.cinfo2.g2.tunipharma.test;

import java.util.List;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.DrugStore;
import tn.edu.esprit.cinfo2.g2.tunipharma.domain.Operator;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl.DrugStoreDao;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl.OperatorDao;

public class TestDaoOperator {

	public TestDaoOperator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		addOperators();
		// updateOperators();
		/*
		 * findAllOperators(); removeOperators(33); findAllOperators();
		 */

	}

	private static void removeOperators(int id) {

		// decalarate DAO for operator store
		OperatorDao operatorDao = new OperatorDao();
		System.out.println("removing operator sotre " + id + ".........");
		Operator findoperator = operatorDao.findByID(id);
		if (findoperator != null) {
			if (operatorDao.remove(findoperator)) {
				System.out.println("success removing.........");
			} else {
				System.out.println("failure removing.........");
			}
		} else {
			System.out.println("Drug store not found .........");
		}

	}

	private static void findAllOperators() {
		// decalarate DAO for operator store
		OperatorDao operatorDao = new OperatorDao();

		List<Operator> operatorsSotreList = operatorDao.findAll();
		System.out.println("List of operators sotre------------>");
		for (Operator operatorsSotre : operatorsSotreList) {
			System.out.println("Operator : " + operatorsSotre.getId());
			System.out.println(operatorsSotre.toString() + "\n");
		}

	}

	private static void addOperators() {

		// fetch Drug store
		// decalarate DAO for drug store
		DrugStoreDao drugStoreDao = new DrugStoreDao();
		DrugStore finddrug = drugStoreDao.findByID(20);

		if (finddrug == null) {
			System.out
					.println("Drug store not found, can't add operators!!!!!");
			return;
		}

		// declarate operator1
		Operator operator1 = new Operator();
		operator1.setId(1);
		operator1.setFirstname("Salem");
		operator1.setLasname("Belanes");
		operator1.setLogin("login.salem");
		operator1.setPassword("scretSalem");
		operator1.setEmail("belanes_salem@yahoo.fr");
		//add drug store to operator
		operator1.setDrugstore(finddrug);

		// declarate operator2
		Operator operator2 = new Operator();
		operator2.setId(1);
		operator2.setFirstname("Ali");
		operator2.setLasname("Ben salah");
		operator2.setLogin("login.ali");
		operator2.setPassword("scretAli");
		operator1.setEmail("benSalah_ali@gmail.com");
		//add drug store to operator
		operator2.setDrugstore(finddrug);
		

		// decalarate DAO for operator store
		OperatorDao operatorDao = new OperatorDao();

		// insert operatorstores
		System.out.println("Start adding operator1------------>");
		operatorDao.add(operator1);
		System.out.println("end adding operator1------------>");
		System.out.println("Start adding operator2------------>");
		operatorDao.add(operator2);
		System.out.println("end adding operator2------------>");

		System.out.println("");
		// Fetch operator store with id 1
		System.out.println("Information for operator operator1------------");
		Operator findoperator1 = operatorDao.findByID(3);
		System.out.println(findoperator1.toString());

		System.out.println("");
		// Fetch operator store with id 2
		System.out.println("Information for operator operator2------------");
		Operator findoperator2 = operatorDao.findByID(4);
		System.out.println(findoperator2.toString());

	}

	private static void updateOperators() {
		// declarate operator1

		// decalarate DAO for operator store
		OperatorDao operatorDao = new OperatorDao();
		// Fetch operator store with id 1
		System.out.println("updating operator store1------------");
		Operator findoperator1 = operatorDao.findByID(20);
		findoperator1.setName("Drugstore Ariana");
		System.out.println("start update for operator store1------------>");
		operatorDao.update(findoperator1);
		System.out.println("end update for operator store1------------>");
		findoperator1 = operatorDao.findByID(20);
		System.out.println("new Information for operator store1------------");
		System.out.println(findoperator1.toString());

		System.out.println("");
		// Fetch operator store with id 2
		System.out.println("updating for operator store2------------");
		Operator findoperator2 = operatorDao.findByID(21);
		findoperator2.setName("Drugstore laouina");
		System.out.println("start update for operator store2------------>");
		operatorDao.update(findoperator2);
		System.out.println("end update for operator store2------------>");
		findoperator2 = operatorDao.findByID(21);
		System.out.println("new Information for operator store1------------");
		System.out.println(findoperator2.toString());

	}

}
