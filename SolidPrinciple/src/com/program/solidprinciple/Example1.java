package com.program.solidprinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example1 {

	public static void main(String[] args) {
		
		String path="C:\\Users\\admin\\Desktop\\Bookdata.ser";
		File f=new File(path);
		FileOutputStream fis=null;
		ObjectOutputStream os=null;
		Book b=new Book(12,250);
		
		  
		        try {
					fis=new FileOutputStream(f);
					os=new ObjectOutputStream(fis);
					os.writeObject(b);
					System.out.println("ibject is serialized");
					
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				} catch (IOException e) {

					
					e.printStackTrace();
				}
		     
		     finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		         

	}

}
