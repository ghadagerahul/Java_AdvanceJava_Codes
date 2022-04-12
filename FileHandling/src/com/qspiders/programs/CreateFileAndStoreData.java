package com.qspiders.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateFileAndStoreData {

	public static void main(String[] args) {
		String path="C:\\Users\\admin\\Desktop\\Mydata1.txt";
		File f=new File(path);
		
		FileReader fr=null;
		long length=f.length();
		
		char []ar=new char[(int) length];
		
		       try {
				fr=new FileReader(f);
				fr.read(ar);
			} catch (FileNotFoundException e) {
		
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		       
		    finally {
				try {
					fr.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		       

	}

}
