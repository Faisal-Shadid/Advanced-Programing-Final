package sis;

import java.util.ArrayList;
import java.util.Scanner;

public class Students_Operation {
	Student stdnt = new Student();
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> student = new ArrayList<>();
	File_Reader fileR = File_Reader.getInstance();
	Line_Delete lineD = new Line_Delete();
	Student_Finder studentF = new Student_Finder();

	public void studentadd() {
		System.out.print("Please Enter Student's ID: ");
		stdnt.setId();
		System.out.print("Please Enter Student's Name: ");
		stdnt.setName();
		System.out.print("Please Enter Student's Average: ");
		stdnt.setAvg();

		File_Writer addstudent = File_Writer.getInstance();
		addstudent.writefile(stdnt.getId(),stdnt.getName(),stdnt.getAvg());

		System.out.println("----------------------------------");

	}

	public void student_finder() {
		System.out.println("Please enter the ID that you are looking for: ");
		String f = scan.nextLine();
		System.out.println("----------------------------------");
		studentF.studentfind(f,"UniStudents.txt");
	}

	public void student_delete() {
		System.out.println("Please enter the ID that you want to Delete: ");
		String d = scan.nextLine();
		System.out.println("----------------------------------");
		lineD.filedelete("UniStudents.txt", d, 1,",");
	}

	public void showstudent() {
		fileR.readfile();
	}
}
