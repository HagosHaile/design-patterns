package com.hagos.composite;

public class Client {

	public static void main(String[] args) {
		File file1 = createFile1();
		file1.ls();
		System.out.println("==========================================");
		File file2 = createFile2();
		file2.ls();
		
		System.out.println("==========================================");
		
		file1.addFile(file2);
		file1.ls();
		
		System.out.println("==========================================");

	}

	private static File createFile1() {
		
		File file1 = new BinaryFile("File1", 1000);
		File dir1 = new Directory("Dir1");
		dir1.addFile(file1);
		
		File file2 = new BinaryFile("File2", 2000);
		File dir2 = new Directory("Dir2");
		File dir3 = new Directory("Dire3");
		
		dir2.addFile(file2);
		dir1.addFile(dir2);
		dir1.addFile(dir3);
		
		return dir1;
		
	}
	
	private static File createFile2() {
		File file1 = new BinaryFile("file binary", 4000);
		return file1;
	}
}
