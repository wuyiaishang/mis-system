package org.api.mis.mis_api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {
   private String com_id;
   private String com_name;
   private String com_website;
   public Company(){
	   
   }
   public Company(String id, String name, String web){
	   this.com_id = id;
	   this.com_name = name;
	   this.com_website = web;
   }
public String getCom_id() {
	return com_id;
}
public void setCom_id(String com_id) {
	this.com_id = com_id;
}
public String getCom_name() {
	return com_name;
}
public void setCom_name(String com_name) {
	this.com_name = com_name;
}
public String getCom_website() {
	return com_website;
}
public void setCom_website(String com_website) {
	this.com_website = com_website;
}
  
}
