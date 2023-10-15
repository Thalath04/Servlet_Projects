package servlet_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")
public class StudentDto {
@Id
	private int id;
	private String name;
	private long number;
	private String mail;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
