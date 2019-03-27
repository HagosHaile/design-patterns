package com.hagos.chainofresponsibility;

public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
		
	}

	@Override
	public boolean processRequest(LeaveApplication app) {
		switch(app.getType()) {
		case Sick:
			app.approve(getApproverRole());
			return true;
		case PTO:
			if(app.getNoOfDays() <= 5) {
				app.approve(getApproverRole());
				return true;
			}
		}
		
		return false;
	}

}
