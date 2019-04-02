package com.hagos.command;

//concrete command
public class LightOff implements Command {
	private Light light;
	
	public LightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		
		light.switchOff();

	}

}
