package com.qspiders.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_To_File {

	public static void main(String[] args) {
		
		String path="C:\\Users\\admin\\Desktop\\Mydata2.txt";
		File f=new File(path);
		
		FileWriter fr=null;
		String text="this is the text";
		
		 try {
			fr=new FileWriter(f);
			fr.write(text);
			fr.flush();
			System.out.println("file data written sucessfuly.....!");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
