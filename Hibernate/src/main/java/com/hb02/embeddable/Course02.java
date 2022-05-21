package com.hb02.embeddable;

import javax.persistence.Embeddable;


//@Embeddable annotation� ile bu annotation�n sahip oldu�u instance variablelar�
//ek bir tablo olu�turmadan ba�ka bir tabloya koymaya yarar. 
//G�m�lebilir.
@Embeddable
public class Course02 {

	public String getElective() {
		return elective;
	}
	public void setElective(String elective) {
		this.elective = elective;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	private String elective;
	private String mandatory;
	
	
	@Override
	public String toString() {
		return "Course02 [elective=" + elective + ", mandatory=" + mandatory + "]";
	}

}
