package sis;

import java.io.*;

public class Line_Delete {

	public void filedelete(String filepath, String a, int positionOfTerm, String delimiter) {
		int position = positionOfTerm -1;
		String tFile= "temp.txt";
		File previousFile = new File(filepath);
		File newFile = new File(tFile);
		
		String currentLine;
		String data[];
		
		try {
			
			FileWriter fileW= new FileWriter(tFile,true);
			BufferedWriter bufferedW = new BufferedWriter(fileW);
			PrintWriter printW= new PrintWriter(bufferedW);
			
			FileReader fileR= new FileReader(filepath);
			BufferedReader bufferedR = new BufferedReader(fileR);
			
			
			
			while ((currentLine = bufferedR.readLine()) !=null) {
				data = currentLine.split(",");
				if (!(data[position].equalsIgnoreCase(a)))
				{
					
					printW.println(currentLine);
				}
				
				
			}
			printW.flush();
			printW.close();
			fileR.close();
			bufferedR.close();
			bufferedW.close();
			fileW.close();
			
			previousFile.delete();
			File update= new File(filepath);
			newFile.renameTo(update);
			
		} catch (Exception e) {
			System.out.println("Please Contact Adminstrator");
		}
	}
}