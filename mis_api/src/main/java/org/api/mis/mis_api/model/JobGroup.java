package org.api.mis.mis_api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobGroup {
	private String id;
	private String name;

	public JobGroup() {

	}

	public JobGroup(String id, String name){
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
