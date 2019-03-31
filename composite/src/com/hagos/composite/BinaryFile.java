package com.hagos.composite;

public class BinaryFile extends File {

	private long size;
	
	public BinaryFile(String name, long size) {
		super(name);
		this.size = size;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	@Override
	public void ls() {
		System.out.println(getName()+ "\t" + size);

	}

	@Override
	public void addFile(File file) {
		throw new  UnsupportedOperationException(" it is impossible to add file on a leaf node");
	}

	@Override
	public File[] getFiles() {
		throw new  UnsupportedOperationException(" it is impossible to get file on a leaf node");
	}

	@Override
	public boolean removeFiles(File file) {
		throw new  UnsupportedOperationException(" it is impossible to remove file on a leaf node");
	}

}
