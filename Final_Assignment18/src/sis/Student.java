package sis;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private double avg;

	private Scanner scan = new Scanner(System.in);
	
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = scan.nextInt();
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = scan.next();
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = scan.nextDouble();
	}

}
