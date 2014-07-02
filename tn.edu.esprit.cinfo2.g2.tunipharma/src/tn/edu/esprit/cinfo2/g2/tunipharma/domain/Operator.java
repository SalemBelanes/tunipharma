package tn.edu.esprit.cinfo2.g2.tunipharma.domain;

public class Operator extends User {

	public Operator() {
		super();
	}

	public Operator(String firstname, String lasname, int id, String login,
			String password, String email) {
		super(firstname, lasname, id, login, password, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Operator []";
	}
 
}
