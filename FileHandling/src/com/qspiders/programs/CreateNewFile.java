package com.qspiders.programs;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		
		String path="C:\\Users\\admin\\Desktop\\Mydata.txt";
		File f=new File(path);
		
		if(f.exists()) {
			System.out.println("file is already present");
		}
		else
		{
			try {
				f.createNewFile();
				System.out.println("file created sucessfully...!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
