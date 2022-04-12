package com.serialization.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation {

	public static void main(String[] args) {
		
		String path="C:\\Users\\admin\\Desktop\\emp.ser";
		    File f=new File(path);
		    try {
				f.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    
		    FileOutputStream fos=null;
		    ObjectOutputStream os=null;
			Employee emp =new Employee("Rahul", "ghadagerahul21@gmail.com");
		    
		      try {
				fos=new FileOutputStream(f);
			     os= new ObjectOutputStream(fos);
			    os.writeObject(emp);
			    System.out.println("objext is the seralised");
			} catch (IOException e) {
				e.printStackTrace();
			}
		      
		     finally {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		     

	}

}
