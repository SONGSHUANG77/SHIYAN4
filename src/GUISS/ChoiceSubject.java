package GUISS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ChoiceSubject extends JFrame {
	public static void main(String args[]) {
		ChoiceSubject demo = new ChoiceSubject();
    }
	 public ChoiceSubject() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() {
		SystemTest s=new SystemTest();
		String[] s1=s.getSubjects();
		String[] s2=new String[5];
		JFrame frame=new JFrame();
		frame.setTitle("choice");
		JPanel panel2=new JPanel();
		JList list =new JList(s.getSubjects());
		JCheckBox box1=new JCheckBox();
		box1.setText("subject 1");
		JCheckBox box2=new JCheckBox();
		box2.setText("subject 2");
		JCheckBox box3=new JCheckBox();
		box3.setText("subject 3");
		JCheckBox box4=new JCheckBox();
		box4.setText("subject 4");
		JCheckBox box5=new JCheckBox();
		box5.setText("subject 5");
		JButton btn1=new JButton("ȷ��");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if((box1.isSelected()||box2.isSelected()||box3.isSelected()||box4.isSelected()||box5.isSelected())==false){
					JOptionPane.showMessageDialog(null, "��û��ѡ���κ�һ�ſΣ�");
					return;
				}
				if(box1.isSelected()){
					s2[0]=s1[0];
				}
				if(box2.isSelected()){
					s2[1]=s1[1];
				}
				if(box3.isSelected()){
					s2[2]=s1[2];
				}
				if(box4.isSelected()){
					s2[3]=s1[3];
				}
				if(box5.isSelected()){
					s2[4]=s1[4];
				}
				writeFile(s2);
				JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
				setVisible(false);
			}
		});
		JButton btn2=new JButton("�˳�");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.add(box1);
		panel2.add(box2);
		panel2.add(box3);
		panel2.add(box4);
		panel2.add(box5);
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(list);
		this.add(panel2);

	}
	
	public static void writeFile(String[] s) {
        try {
            File writeName = new File("C:\\Users\\jl\\Desktop\\test.txt"); // ���·�������û����Ҫ����һ���µ�output.txt�ļ�
            writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
            	for(int i=0;i<s.length;i++) {
            		if(s[i]!=null) {
            		out.write(s[i]); // \r\n��Ϊ����
            	}
                out.flush(); // �ѻ���������ѹ���ļ�
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}