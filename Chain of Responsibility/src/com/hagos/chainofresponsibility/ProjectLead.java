package com.hagos.chainofresponsibility;

public class ProjectLead extends Employee {

	
	public  ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}
	@Override
	public boolean processRequest(LeaveApplication app) {
		//type is sick leave and duration <=2 days
		if(app.getType()== LeaveApplication.Type.Sick) {
			if(app.getNoOfDays() <= 2) {
				app.approve(getApproverRole());
				return true;
			}
				
		}
		return false;
	}

}
