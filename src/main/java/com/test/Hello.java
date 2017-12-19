
package com.test;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hello")
public class Hello {
	
	@Id
	@GeneratedValue
	@Column(name = "hello_id")
	private Long id;
	private String value;
	
	@OneToMany(mappedBy = "hello")
	private Set<Top> topList;

	public Hello() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Set<Top> getTopList() {
		return topList;
	}

	public void setTopList(Set<Top> topList) {
		this.topList = topList;
	}
	
	
	

	
	
	
}
