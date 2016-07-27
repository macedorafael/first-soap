package com.first.soap.test.security;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.first.soap.test.validation.DateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TokenUser {
	
	@XmlElement(required=true)
	private String name;

	@XmlElement(required=true)
	private String token;
	
	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlElement(required=true)
	private Date validationDate;
	
	
	public TokenUser() {
		super();
	}

	public TokenUser(String name, String token, Date validationDate) {
		super();
		this.name = name;
		this.token = token;
		this.validationDate = validationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getValidationDate() {
		return validationDate;
	}

	public void setValidationDate(Date validationDate) {
		this.validationDate = validationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result
				+ ((validationDate == null) ? 0 : validationDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TokenUser other = (TokenUser) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (validationDate == null) {
			if (other.validationDate != null)
				return false;
		} else if (!validationDate.equals(other.validationDate))
			return false;
		return true;
	}

	
	

}
