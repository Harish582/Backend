package com.te.BackendAssessment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee_Leave {
	@Id
	private int Employee_ID;
	@Column(length = 50)
	private String Leave_Date;
	@Column(length = 50)
	private String Leave_Status;

	@Override
	public String toString() {
		return "Employee_info [Employee_ID=" + Employee_ID + ", leave_date=" + Leave_Date + ", leave_status="
				+ Leave_Status + "]";
	}

}
