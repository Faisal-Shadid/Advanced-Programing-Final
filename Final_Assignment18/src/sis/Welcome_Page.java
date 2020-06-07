package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Welcome_Page {

	public static void main(String[] args) {
		final JFrame frm = new JFrame("Welcome");

		frm.setSize(500, 500);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton btnAddStudent = new JButton("Add Student");
		JButton btnRemoveStudent = new JButton("Remove Student");
		JButton btnStudentSearch = new JButton("Student Search");
		JButton btnShowAll = new JButton("Show All Students");
		JButton Quit = new JButton("Exit");
		btnAddStudent.setPreferredSize(new Dimension(300, 100));
		btnRemoveStudent.setPreferredSize(new Dimension(300, 100));
		btnStudentSearch.setPreferredSize(new Dimension(300, 100));
		btnShowAll.setPreferredSize(new Dimension(300, 100));
		Quit.setPreferredSize(new Dimension(300, 100));
		
		frm.add(btnAddStudent);
		frm.add(btnRemoveStudent);
		frm.add(btnStudentSearch);
		frm.add(btnShowAll);
		frm.add(Quit);

		btnAddStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Student_Add_GUI.main(null);
				frm.setVisible(false);
			}
		});
		btnRemoveStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Student_Delete_GUI.main(null);
				frm.setVisible(false);
			}
		});
		btnShowAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Show_All_GUI.main(null);
				frm.setVisible(false);
			}
		});
		btnStudentSearch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Student_Finder_GUI.main(null);
				frm.setVisible(false);
			}
		});
		Quit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frm.setVisible(false);
			}
		});

		frm.setVisible(true);
	}

}
