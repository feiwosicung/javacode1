package heibernate_model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Teacher {

	private int id;
	private String name;
	private String title;

	public Teacher() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, String title) {
		// super();
		this.id = id;
		this.name = name;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", title=" + title + "]";
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
