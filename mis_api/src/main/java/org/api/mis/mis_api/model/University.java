package org.api.mis.mis_api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class University {

  private String name;
  private String country;

public University(){
	
}

public University(String name, String country){
	this.name = name;
	this.country = country;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
