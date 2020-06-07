package sis;

import java.io.*;
import java.util.Scanner;

public class Student_Finder {

	private static Scanner a;

	public void studentfind(String searchTerm, String filepath) {
		boolean found = false;
		String id = ""; String name=""; String avg="";

		try {
			a = new Scanner(new File(filepath));
			a.useDelimiter("[,\n]");

			while (a.hasNext() && !found) {
				id = a.next();
				name = a.next();
				avg = a.next();

				if (id.equals(searchTerm)) {
					found = true;
				}
			}

			if (found) {
				System.out.println(id + "," + name + "," + avg);
				System.out.println("----------------------------------");
				a.close();
			}
			else {
				System.out.println("No Record Found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
