package com.dong.controller.common;

import com.dong.form.Session;
import com.dong.form.InputMoney;

public class Utils {

	
	public static InputMoney getValueFromSession(Session session) {
		
		InputMoney inputM=new InputMoney();
		
		inputM.setMicroNumber(session.getMicroNumber());
		inputM.setMicroNumber(session.getMicroNumber());
		inputM.setMicroNumber(session.getMicroNumber());
		inputM.setMicroNumber(session.getMicroNumber());
		inputM.setMicroNumber(session.getMicroNumber());
		
		return inputM;
		
	}
}
