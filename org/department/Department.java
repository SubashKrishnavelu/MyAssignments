package org.department;

import org.College.College;

public class Department extends College{
	
	public void deptName() {
		
		System.out.println("Deprtment Name: MCA");
	}
	
	public static void main(String[] args) {
		
		Department dp = new Department();
		dp.collegeCode();
		dp.collegeName();
		dp.collegeRank();
		dp.deptName();
	}

}
