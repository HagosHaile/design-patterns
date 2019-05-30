package com.hagos.factorymethod;

import com.hagos.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());

	}

	public static void printMessage(MessageCreator creator) {
		
		Message msg = creator.createMessage();
		
		System.out.println(msg);

	}

}
