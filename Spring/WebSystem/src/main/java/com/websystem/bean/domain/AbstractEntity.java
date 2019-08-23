package com.websystem.bean.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;


@MappedSuperclass
@XmlType(name = "abstractEntity")
public abstract class AbstractEntity implements IDomainObject {
	
	private static final long serialVersionUID = 7015952395900117998L;

	protected long id;
	
	@Column(name = "id", nullable = false)
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	   	
}