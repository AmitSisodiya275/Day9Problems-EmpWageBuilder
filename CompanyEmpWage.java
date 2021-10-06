package com.bridgelab.wagebuilder;

public class CompanyEmpWage {

	public String companyName;
	public int perHrWage, maxWorkingHrs, maxWorkingDays, totalEmpWage;

	public CompanyEmpWage(String companyName, int perHrWage, int maxWorkingHrs, int maxWorkingDays) {
		this.companyName = companyName;
		this.perHrWage = perHrWage;
		this.maxWorkingHrs = maxWorkingHrs;
		this.maxWorkingDays = maxWorkingDays;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
}
