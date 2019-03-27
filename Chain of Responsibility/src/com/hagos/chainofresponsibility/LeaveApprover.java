package com.hagos.chainofresponsibility;

public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication app);
	
	String getApproverRole();
}
