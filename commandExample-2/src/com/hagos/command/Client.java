package com.hagos.command;

public class Client {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		
		Command  lightOn = new LightOn(light);
		Command  lightOff = new LightOn(light);
		
		remote.setCommand(lightOn);
		remote.pressButton();
		
		
		remote.setCommand(lightOff);
		remote.pressButton();
		

	}

}
