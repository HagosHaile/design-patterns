package com.hagos.composite;

// Component base class for composite design pattern.
// child management methods are defined in Component
public abstract class File {
	
	private String name;

	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract void ls();
	
	public abstract void addFile(File file);
	
	public abstract File[] getFiles();
	
	public abstract boolean removeFiles(File file);
	
}
