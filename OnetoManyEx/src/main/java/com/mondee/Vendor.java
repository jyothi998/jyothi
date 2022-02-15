package com.mondee;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Table;
@Entity
@Table(name="vendor")
public class Vendor {
@Id
@Column(name="vendorid")
private int vendorid;

@Column(name="vendorname")
private String vendorname;

@OneToMany(fetch=FetchType.LAZY,targetEntity=Customer.class,cascade=CascadeType.ALL)
@JoinColumn(name="fkvid",referencedColumnName="vendorid")
private Set obj;
public int getVendorid() {
	return vendorid;
}
public void setVendorid(int vendorid) {
	this.vendorid = vendorid;
}
public String getVendorname() {
	return vendorname;
}
public void setVendorname(String vendorname) {
	this.vendorname = vendorname;
}
public Set getObj() {
	return obj;
}
public void setObj(Set obj) {
	this.obj = obj;
}

}
