package GUISS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class IndexTest {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setTitle("ѧ��ѡ��ϵͳ");
		JButton btn1=new JButton("ѧ��ѡ��");
		btn1.setBounds(10, 10, 20, 20);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			ChoiceSubject choice=new ChoiceSubject();
			}
		});
		JButton btn2=new JButton("ѧ���˿�");
		btn2.setBounds(40, 10, 20, 20);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			QuitSubjects quit=new QuitSubjects();
			}
		});
		JButton btn3=new JButton("�γ̴�ӡ");
		btn1.setBounds(80, 10, 20, 20);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			PrintSubjects print=new PrintSubjects();
			}
		});
	    panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400, 150);
	}
}