package tn.edu.esprit.cinfo2.g2.tunipharma.domain;

public class Offers {
	
private int id;
private Drug_Store drug_store;
private String subject;
private String content;
private String start_time;


	public Offers() {
		// TODO Auto-generated constructor stub
	}

	public Offers(int id, String subject, String content, String start_time,
			Drug_Store drug_store) {
		super();
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.start_time = start_time;
		this.drug_store = drug_store;
	}

	@Override
	public String toString() {
		return "Offers [id=" + id + ", subject=" + subject + ", content="
				+ content + ", start_time=" + start_time + ", drug_store="
				+ drug_store + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result
				+ ((drug_store == null) ? 0 : drug_store.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((start_time == null) ? 0 : start_time.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Offers other = (Offers) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (drug_store == null) {
			if (other.drug_store != null)
				return false;
		} else if (!drug_store.equals(other.drug_store))
			return false;
		if (id != other.id)
			return false;
		if (start_time == null) {
			if (other.start_time != null)
				return false;
		} else if (!start_time.equals(other.start_time))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public Drug_Store getDrug_store() {
		return drug_store;
	}

	public void setDrug_store(Drug_Store drug_store) {
		this.drug_store = drug_store;
	}



}
