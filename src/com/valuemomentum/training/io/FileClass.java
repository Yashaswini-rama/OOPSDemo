package com.valuemomentum.training.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		File f=new File("c:/Test/hello.txt");
		try
		{
			
			if(f.createNewFile())
			{
				System.out.println("New file created!");
			}
			else
			{
				System.out.println("The file already exists.");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Name of the file:"+f.getName());
		System.out.println("Path of the file:"+f.getPath());
		System.out.println("File last modified:"+new Date(f.lastModified()));
		System.out.println("Parent directory:"+f.getParent());
		System.out.println("Size of the File:"+f.length()+"Bytes");
		

	}

}
