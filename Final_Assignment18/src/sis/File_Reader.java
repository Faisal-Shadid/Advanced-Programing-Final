package sis;

import java.io.*;


public class File_Reader {
	
	private static File_Reader read = new File_Reader();

	  public static File_Reader getInstance(){
	      return read;
	   }
	  
	  
	 
	  private File_Reader(){
		   
	  }
	
	
	public void readfile(){	

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"UniStudents.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			System.out.println("----------------------------------");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
