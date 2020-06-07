package sis;


import java.util.Scanner;
import java.util.*;
import java.lang.*;

@SuppressWarnings("unused")
public class Main_System_SIS {
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		Students_Operation studentop = new Students_Operation();

		int k = 0;
		while (k == 0) {
			System.out.println("Main menu.");
			System.out.println("----------------------------------");
			System.out.println("1. Add student.");
			System.out.println("2. Find student.");
			System.out.println("3. Remove student.");
			System.out.println("4. Show all student.");
			System.out.println("5. Exit.");
			System.out.println("----------------------------------");
			System.out.println("Please enter your choice: ");
			int choice = scan.nextInt();

			System.out.println("----------------------------------");
			Student student = new Student();

			switch (choice) {

			case (1): {
				studentop.studentadd();
				break;

			}
			case (2): {
				studentop.student_finder();
				break;

			}

			case (3): {

				studentop.student_delete();
				break;
			}
			case (4): {
				studentop.showstudent();
				break;
			}
			case (5): {
				System.out.println("Done.");
				k++;
				break;
			}

			}

		}

	}
}