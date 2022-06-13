package com.simplilearn.org;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Locker {
	public static void main(String[] args) throws IOException {

		Menu.printWelcomeScreen("LockedMe", "Manish aditya");
		boolean running = true;

		do {
			System.out.println("select your operation\n " + "1 to retrieve all files\n " + "2 for file operations\n "
					+ "3 close application");

			Scanner sc = new Scanner(System.in);
			int useroperationselect = sc.nextInt();

			switch (useroperationselect) {

			case 1:
				retrieveAllFiles();

				break;

			case 2:

				handleFileMenuOpt();

				break;
			case 3:
				System.out.println("Program ended successfully.");
				running = false;
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("please enter only valid options");

			}
		} while (running);
	}

	public static void handleFileMenuOpt() throws IOException {

		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			FileOperationOptions.displayFileMenuOptions();

			int input = sc.nextInt();
			switch (input) {
			case 1:
				// File Add
				FileOperationOptions.createFile();

				break;
			case 2:

				FileOperationOptions.deleteFile();
				break;

			case 3:
				FileOperationOptions.searchFile();
				break;
			default:
				System.out.println("Going back to app welcome screen");
				return;
			}
		} while (running);
	}

	public static void retrieveAllFiles() {
		File fileDir = new File("C:\\\\Users\\\\manis\\\\eclipse-workspace\\\\simplilearn");
		if (fileDir.isDirectory()) {
			List listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for (Object s : listFile) {
				System.out.println(s);
			}
		}
	}

}
