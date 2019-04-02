package com.hagos.command;

//concrete command
public class LightOn implements Command {
	private Light light;
	
	public LightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();

	}

}
