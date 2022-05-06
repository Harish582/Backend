package com.te.BackendAssessment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Employee_ID;
	@Column(length = 50)
	private String Employee_Name;
	private String Employee_Type;
	@Column(length = 100)
	private String Email;
	@Column(length = 50)
	private String Password;

	@Override
	public String toString() {
		return "Employee [Employee_ID=" + Employee_ID + ", Employee_name=" + Employee_Name + ", Employee_type="
				+ Employee_Type + ", Email=" + Email + ", password=" + Password + "]";
	}

}
