package com.simplilearn.org;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperationOptions {
	public static void displayFileMenuOptions() {
		String fileMenu = "select your operation \n " + "1 for creating a file \n " 
				+ 	  "2 for deleting a file \n " + "3 for searching a file \n" + " 4 return back  \n";
			

		System.out.println(fileMenu);
	}
	public static void  createFile() throws IOException {
		Scanner userinput = new Scanner(System.in);
		System.out.println("enter file name");
		String name = userinput.nextLine();
		name = name +".txt";
		File myfile = new File(name);
		if(myfile.createNewFile()) {
			System.out.println("file created successfully");
		}
		else {
			System.out.println("file already  exists");
			
		}
		FileWriter writer = new FileWriter(myfile,true);
		writer.write("i am writing text to file.txt");
		System.out.println("data written successfully");
		writer.close();

}
	public static void deleteFile() {
		Scanner userinput = new Scanner(System.in);
		System.out.println("enter file name which you want to delete");
		String name = userinput.nextLine();
		name = name +".txt";
		File myfile = new File(name);
		if(myfile.delete()) {
			System.out.println("file deletd successfully");
		}
			else {
				System.out.println("file not found");
			}
			
		}
	public static void searchFile() {
		System.out.println("enter file name to search");
		
		  Scanner sc = new Scanner(System.in); 
		  String name = sc.nextLine();
		 name = name+ ".txt";
		 String myCurrentDir = System.getProperty("user.dir");
			//System.out.println(myCurrentDir);
		 
		File myDirectory = new File(myCurrentDir);
		String fileNames[] = myDirectory.list();
		int flag = 0;
        if (fileNames == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < fileNames.length; i++) {
                String filename = fileNames[i];
                if (filename.equalsIgnoreCase(name)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }
		
	}

}
