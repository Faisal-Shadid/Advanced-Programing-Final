package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Student_Finder_GUI {
	public static void main(String[] args) {
		final JFrame frm = new JFrame("Find Student");

		frm.setSize(600, 500);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton exit = new JButton("Exit");
		final JTextArea studentfound = new JTextArea();
		JButton Find = new JButton("Find");
		JLabel studentid = new JLabel("Enter the ID:");
		final JTextField idtxt = new JTextField();
		exit.setPreferredSize(new Dimension(150, 30));
		Find.setPreferredSize(new Dimension(250, 30));
		studentfound.setPreferredSize(new Dimension(400, 300));
		idtxt.setPreferredSize(new Dimension(150,50));
		exit.setPreferredSize(new Dimension(400,50));
		
		frm.add(Find);
		frm.add(studentid);
		frm.add(idtxt);
		frm.add(studentfound);
		frm.add(exit);

		frm.setVisible(true);

		Find.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String txtID =idtxt.getText();
				
				Scanner s;
					String id = ""; String name=""; String avg="";
					
					try {
						s = new Scanner(new File("UniStudents.txt"));
						s.useDelimiter("[,\n]");

						boolean found = false;
						while (s.hasNext() && !found ) {
							id = s.next();
							name = s.next();
							avg = s.next();
							
							if (id.equals(txtID)) {
								found = true;
							}
						}

						if (found) {
							studentfound.append(id +","+name+","+ avg);
							s.close();
						}
						else {
							frm.setVisible(false);
						}
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			
			}
		});
		
		exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				studentfound.append("");
				frm.setVisible(false);
				Welcome_Page.main(null);
			}
		});
	}

}
