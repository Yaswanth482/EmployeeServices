package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private String published;
	
	@Column(name = "eName")
	private String eName;
	
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "cityName")
	private String cityName;
	
	@Column(name = "mobileNumber")
	private String mobileNumber;

	public Employee() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
				+ ", eName=" + eName + ", cityName=" + cityName + ", mobileNumber=" + mobileNumber + ", geteName()="
				+ geteName() + ", getCityName()=" + getCityName() + ", getMobileNumber()=" + getMobileNumber()
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription()
				+ ", getPublished()=" + getPublished() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
