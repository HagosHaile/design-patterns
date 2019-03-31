package com.hagos.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
	
	private List<File> children = new ArrayList<>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public void ls() {
		System.out.println(getName());
		children.forEach(File::ls);

	}

	@Override
	public void addFile(File file) {
		children.add(file);

	}

	@Override
	public File[] getFiles() {
		
		return children.toArray(new File[children.size()]);
	}

	@Override
	public boolean removeFiles(File file) {
		return children.remove(file);
	}

}
