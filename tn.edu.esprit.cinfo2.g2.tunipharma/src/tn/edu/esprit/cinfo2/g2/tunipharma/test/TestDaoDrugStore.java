package tn.edu.esprit.cinfo2.g2.tunipharma.test;

import java.util.List;

import tn.edu.esprit.cinfo2.g2.tunipharma.domain.DrugStore;
import tn.edu.esprit.cinfo2.g2.tunipharma.services.DAO.impl.DrugStoreDao;

public class TestDaoDrugStore {

	public TestDaoDrugStore() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		addDrugStores();
		 updateDrugStores();
		findAllDrugStores();
		removeDrugStores(33);
		findAllDrugStores();

	}

	private static void removeDrugStores(int id) {

		// decalarate DAO for drug store
		DrugStoreDao drugStoreDao = new DrugStoreDao();
		System.out.println("removing drug sotre " + id + ".........");
		DrugStore finddrug = drugStoreDao.findByID(id);
		if (finddrug != null) {
			if (drugStoreDao.remove(finddrug)) {
				System.out.println("success removing.........");
			} else {
				System.out.println("failure removing.........");
			}
		} else {
			System.out.println("Drug store not found .........");
		}

	}

	private static void findAllDrugStores() {
		// decalarate DAO for drug store
		DrugStoreDao drugStoreDao = new DrugStoreDao();

		List<DrugStore> drugsSotreList = drugStoreDao.findAll();
		System.out.println("List of drugs sotre------------>");
		for (DrugStore drugsSotre : drugsSotreList) {
			System.out.println("DrugStore : " + drugsSotre.getId());
			System.out.println(drugsSotre.toString() + "\n");
		}

	}

	private static void addDrugStores() {
		// declarate durg sotre1
		DrugStore drugStore1 = new DrugStore();
		drugStore1.setId(1);
		drugStore1.setAdress("tunis");
		drugStore1.setEmail("drugstore_tunisis@gmail.com");
		drugStore1.setName("Drugstore");
		drugStore1.setRegion("Ariana");
		drugStore1.setSector("day");
		drugStore1.setTelephone("712356954");
		drugStore1.setWeb_site("www.drugstore_arian.com");

		// declarate durg sotre2
		DrugStore drugStore2 = new DrugStore();
		drugStore2.setId(2);
		drugStore2.setAdress("Rue ezzoouhour Laouina");
		drugStore2.setEmail("drugstore_laouina@gmail.com");
		drugStore2.setName("Drugstore");
		drugStore2.setRegion("Laouina");
		drugStore2.setSector("night");
		drugStore2.setTelephone("71548975");
		drugStore2.setWeb_site("www.drugstore_laouina.com");

		// decalarate DAO for drug store
		DrugStoreDao drugStoreDao = new DrugStoreDao();

		// insert drugstores
		System.out.println("Start adding durgsotre1------------>");
		drugStoreDao.add(drugStore1);
		System.out.println("end adding durgsotre1------------>");
		System.out.println("Start adding durgsotre2------------>");
		drugStoreDao.add(drugStore2);
		System.out.println("end adding durgsotre2------------>");

		System.out.println("");
		// Fetch drug store with id 1
		System.out.println("Information for drug store1------------");
		DrugStore finddrug1 = drugStoreDao.findByID(20);
		System.out.println(finddrug1.toString());

		System.out.println("");
		// Fetch drug store with id 2
		System.out.println("Information for drug store2------------");
		DrugStore finddrug2 = drugStoreDao.findByID(21);
		System.out.println(finddrug2.toString());

	}

	private static void updateDrugStores() {
		// declarate durg sotre1

		// decalarate DAO for drug store
		DrugStoreDao drugStoreDao = new DrugStoreDao();
		// Fetch drug store with id 1
		System.out.println("updating drug store1------------");
		DrugStore finddrug1 = drugStoreDao.findByID(20);
		finddrug1.setName("Drugstore Ariana");
		System.out.println("start update for drug store1------------>");
		drugStoreDao.update(finddrug1);
		System.out.println("end update for drug store1------------>");
		finddrug1 = drugStoreDao.findByID(20);
		System.out.println("new Information for drug store1------------");
		System.out.println(finddrug1.toString());

		System.out.println("");
		// Fetch drug store with id 2
		System.out.println("updating for drug store2------------");
		DrugStore finddrug2 = drugStoreDao.findByID(21);
		finddrug2.setName("Drugstore laouina");
		System.out.println("start update for drug store2------------>");
		drugStoreDao.update(finddrug2);
		System.out.println("end update for drug store2------------>");
		finddrug2 = drugStoreDao.findByID(21);
		System.out.println("new Information for drug store1------------");
		System.out.println(finddrug2.toString());

	}

}
