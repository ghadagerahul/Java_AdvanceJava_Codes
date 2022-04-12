package com.serialization.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {

	public static void main(String[] args) {
		
		String path="C:\\Users\\admin\\Desktop\\emp.ser";
	    File f=new File(path);
	    FileInputStream fis=null;
	    ObjectInputStream ois=null;
	    
	        try {
			     fis=new FileInputStream(f);
				    ois= new ObjectInputStream(fis);
				   Employee emp=(Employee) ois.readObject();
				    System.out.println(emp.name);
				    System.out.println(emp.mail);
				    
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
		
				e.printStackTrace();
			}
	        
	        finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
