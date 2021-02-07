package model;
// Generated 2021�~2��7�� �W��11:53:06 by Hibernate Tools 5.4.21.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Suppliers generated by hbm2java
 */
public class Suppliers implements java.io.Serializable {

	private int supId;
	private String supName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private Set coffeeses = new HashSet(0);

	public Suppliers() {
	}

	public Suppliers(int supId, String supName, String street, String city, String state) {
		this.supId = supId;
		this.supName = supName;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Suppliers(int supId, String supName, String street, String city, String state, String zip, Set coffeeses) {
		this.supId = supId;
		this.supName = supName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.coffeeses = coffeeses;
	}

	public int getSupId() {
		return this.supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return this.supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Set getCoffeeses() {
		return this.coffeeses;
	}

	public void setCoffeeses(Set coffeeses) {
		this.coffeeses = coffeeses;
	}

}