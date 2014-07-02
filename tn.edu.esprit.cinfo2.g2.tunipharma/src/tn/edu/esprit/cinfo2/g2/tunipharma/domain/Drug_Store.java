package tn.edu.esprit.cinfo2.g2.tunipharma.domain;

public class Drug_Store {
	
	private int id;
	private String name;
	private String Sector;
	private String region;
	private String adress;
	private String telephone;
	private String email;
	private String web_site;
	private Operator operator;
	
	
	@Override
	public String toString() {
		return "Drug_Store [id=" + id + ", name=" + name + ", Sector=" + Sector
				+ ", region=" + region + ", adress=" + adress + ", telephone="
				+ telephone + ", email=" + email + ", web_site=" + web_site
				+ ", operator=" + operator + "]";
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Drug_Store() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb_site() {
		return web_site;
	}

	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}
 

	public Drug_Store(int id, String name, String sector, String region,
			String adress, String telephone, String email, String web_site,
			Operator operator) {
		super();
		this.id = id;
		this.name = name;
		Sector = sector;
		this.region = region;
		this.adress = adress;
		this.telephone = telephone;
		this.email = email;
		this.web_site = web_site;
		this.operator = operator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Sector == null) ? 0 : Sector.hashCode());
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result
				+ ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result
				+ ((web_site == null) ? 0 : web_site.hashCode());
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
		Drug_Store other = (Drug_Store) obj;
		if (Sector == null) {
			if (other.Sector != null)
				return false;
		} else if (!Sector.equals(other.Sector))
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (web_site == null) {
			if (other.web_site != null)
				return false;
		} else if (!web_site.equals(other.web_site))
			return false;
		return true;
	}

}
