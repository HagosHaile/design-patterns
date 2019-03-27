package com.hagos.chainofresponsibility;

public abstract class Employee implements LeaveApprover {

	private String role;
	
	private LeaveApprover successor;
	
	
	public Employee(String role, LeaveApprover successor) {
		this.role = role;
		this.successor = successor;
	}

	@Override
	public void processLeaveApplication(LeaveApplication app) {
		
		if(!processRequest(app) && successor != null) {
			
			successor.processLeaveApplication(app);
		}
		

	}

	public abstract boolean processRequest(LeaveApplication app);
	@Override
	public String getApproverRole() {
		return role;
	}

}
