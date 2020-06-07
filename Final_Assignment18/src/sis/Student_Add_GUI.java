package sis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Student_Add_GUI {

	public static void main(String[] args) {
		final JFrame frm = new JFrame("Add Student");

		frm.setSize(500, 400);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.setLayout(new FlowLayout());

		JButton btnAddStudent = new JButton("Add Student");
		JButton Exit = new JButton("Exit");
		JLabel id = new JLabel("ID");
		final JTextField idtxt = new JTextField(10);
		final JLabel name = new JLabel("Name");
		final JTextField nametxt = new JTextField(10);
		JLabel avg = new JLabel("Average");
		final JTextField avgtxt = new JTextField(10);
		btnAddStudent.setPreferredSize(new Dimension(400, 25));
		Exit.setPreferredSize(new Dimension(400, 25));

		frm.add(id);
		frm.add(idtxt);
		frm.add(name);
		frm.add(nametxt);
		frm.add(avg);
		frm.add(avgtxt);
		frm.add(btnAddStudent);
		frm.add(Exit);

		frm.setVisible(true);

		btnAddStudent.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String id1 = idtxt.getText();
				int id = Integer.parseUnsignedInt(id1);
				String name1 = nametxt.getText();
				String name2 = name1;
				String avg1 = avgtxt.getText();
				double avg2 = Double.parseDouble(avg1);
				File_Writer filewrite = File_Writer.getInstance();
				filewrite.writefile(id, name2, avg2);
				JOptionPane.showMessageDialog(null, "Done");
				frm.setVisible(false);
				Welcome_Page.main(null);

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
