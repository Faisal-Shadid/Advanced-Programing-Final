package sis;

import java.io.*;

public class File_Writer {
	
	private static File_Writer write = new File_Writer();

	  public static File_Writer getInstance(){
	      return write;
	   }
	  
	  
	 
	  private File_Writer(){
		   
	  }

	public void writefile(int id, String name, double avg) {
		try {
			FileWriter student = new FileWriter("UniStudents.txt",true);
			BufferedWriter out = new BufferedWriter(student);
			out.write( id+","+ name+","+ avg+ "\n");
			out.close();
		}catch (Exception e) {
			System.out.println("An error occured, Please Contact the Adminstrator");
		
	}
}
}
