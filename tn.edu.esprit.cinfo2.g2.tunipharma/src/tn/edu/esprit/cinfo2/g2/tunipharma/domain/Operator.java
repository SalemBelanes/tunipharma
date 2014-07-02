package tn.edu.esprit.cinfo2.g2.tunipharma.domain;

public class Operator {
	private int id;
	private Drug_Store drug_store;
	private String firstname;
	private String lasname;
	private String login;
	private String password;
	private String email;

	public Operator() {
		// TODO Auto-generated constructor stub
	}

	public String getLasname() {
		return lasname;
	}

	public void setLasname(String lasname) {
		this.lasname = lasname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Operator(int id, Drug_Store drug_store, String firstname,
			String lasname, String login, String password, String email) {
		super();
		this.id = id;
		this.drug_store = drug_store;
		this.firstname = firstname;
		this.lasname = lasname;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Operator [id=" + id + ", drug_store=" + drug_store
				+ ", firstname=" + firstname + ", lasname=" + lasname
				+ ", login=" + login + ", password=" + password + ", email="
				+ email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((drug_store == null) ? 0 : drug_store.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lasname == null) ? 0 : lasname.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operator other = (Operator) obj;
		if (drug_store == null) {
			if (other.drug_store != null)
				return false;
		} else if (!drug_store.equals(other.drug_store))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lasname == null) {
			if (other.lasname != null)
				return false;
		} else if (!lasname.equals(other.lasname))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	public Drug_Store getDrug_store() {
		return drug_store;
	}

	public void setDrug_store(Drug_Store drug_store) {
		this.drug_store = drug_store;
	}

}
