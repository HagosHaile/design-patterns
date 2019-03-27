package com.hagos.chainofresponsibility;

import com.hagos.chainofresponsibility.LeaveApplication.Type;

public class Director extends Employee {

	public Director(LeaveApprover successor) {
		super("Director", successor);
	}

	@Override
	public boolean processRequest(LeaveApplication app) {
		
		if(app.getType()==Type.LOP) {
			app.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
