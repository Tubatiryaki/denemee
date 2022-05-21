package com.hb02.embeddable;

import javax.persistence.Embeddable;


//@Embeddable annotationý ile bu annotationýn sahip olduðu instance variablelarý
//ek bir tablo oluþturmadan baþka bir tabloya koymaya yarar. 
//Gömülebilir.
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
