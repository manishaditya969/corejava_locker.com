package com.simplilearn.org;

public class Menu {
	public static void printWelcomeScreen(String appName, String developerName) {
		String companyName = String.format(
				 "Thanks for coming to %s.com. \n" + "** The developer name is %s.\n", appName, developerName);
		String appFunctionalities = "You can use this application to :-\n"
				+ "-- Retrieve all file names \n"
				+ "-- Search, add, or delete files \n";
			
		System.out.println(companyName);

		System.out.println(appFunctionalities);
	}

}
