package GUISS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrintSubjects extends JFrame {
	public static void main(String args[]) {
		PrintSubjects demo = new PrintSubjects();
    }
	 public PrintSubjects() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() { {
		String[] s2=new String[5];
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=readFile().split("��");
		JList list =new JList(s2);
		JButton btn2=new JButton("�˳�");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.add(btn2);
		panel2.add(list);
		this.add(panel2);
	}
}
	public static String readFile() {
		String str="";
        String pathname = "C:\\Users\\ss\\Desktop//GUI.txt"; // ����·�������·�������ԣ�д���ļ�ʱ��ʾ���·��,��ȡ����·����input.txt�ļ�
        //��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw;
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // һ�ζ���һ������
            	str=str+line;
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}