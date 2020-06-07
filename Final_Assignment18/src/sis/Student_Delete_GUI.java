package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Student_Delete_GUI {

	public static void main(String[] args) {
		final JFrame frm = new JFrame("Delete Student");

		frm.setSize(500, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton Exit = new JButton("Exit");
		JButton btnDeleteStudent = new JButton("Delete Student");
		JLabel id = new JLabel("Please enter the ID you want to delete:");
		final JTextField idtxt = new JTextField(10);
		idtxt.setPreferredSize(new Dimension(400, 25));
		Exit.setPreferredSize(new Dimension(400,25));
		btnDeleteStudent.setPreferredSize(new Dimension(400,25));

		frm.add(id);
		frm.add(idtxt);
		frm.add(btnDeleteStudent);
		frm.add(Exit);

		frm.setVisible(true);

		btnDeleteStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String a = idtxt.getText();
				int position = 1 -1;
				String tFile= "temp.txt";
				File oldFile = new File("UniStudents.txt");
				File newFile = new File(tFile);
				
				String currentLine;
				String data[];
				
				try {
					
					FileWriter fileW= new FileWriter(tFile,true);
					BufferedWriter bufferedW = new BufferedWriter(fileW);
					PrintWriter printW= new PrintWriter(bufferedW);
					
					FileReader fileR= new FileReader("UniStudents.txt");
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
					
					oldFile.delete();
					File updated= new File("UniStudents.txt");
					newFile.renameTo(updated);
					
					JOptionPane.showMessageDialog(null, "Done");
					frm.setVisible(false);
					Welcome_Page.main(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		Exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				frm.setVisible(false);
				Welcome_Page.main(null);

			}
		});

	}

}
