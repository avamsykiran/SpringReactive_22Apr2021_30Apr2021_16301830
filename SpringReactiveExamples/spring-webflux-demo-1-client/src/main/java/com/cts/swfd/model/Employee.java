package com.cts.swfd.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Comparable<Employee>,Serializable{

	private Integer employeeId;
	private String name;
	private Department dept;
	private String mobile;
	private String email;
	private Boolean workingFromHome;
	private LocalDate joinDate;
	private Double salary;
	
	public Employee() {
		
	}

	public Employee(Integer employeeId, String name, Department dept, String mobile, String email,
			Boolean workingFromHome, LocalDate joinDate, Double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.dept = dept;
		this.mobile = mobile;
		this.email = email;
		this.workingFromHome = workingFromHome;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getWorkingFromHome() {
		return workingFromHome;
	}

	public void setWorkingFromHome(Boolean workingFromHome) {
		this.workingFromHome = workingFromHome;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", dept=" + dept + ", mobile=" + mobile
				+ ", email=" + email + ", workingFromHome=" + workingFromHome + ", joinDate=" + joinDate + ", salary="
				+ salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((workingFromHome == null) ? 0 : workingFromHome.hashCode());
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
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (joinDate == null) {
			if (other.joinDate != null)
				return false;
		} else if (!joinDate.equals(other.joinDate))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (workingFromHome == null) {
			if (other.workingFromHome != null)
				return false;
		} else if (!workingFromHome.equals(other.workingFromHome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		return this.employeeId.compareTo(o.employeeId);
	}
	
	
}
