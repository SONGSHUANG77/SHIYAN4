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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuitSubjects extends JFrame {
	public static void main(String args[]) {
		QuitSubjects demo = new QuitSubjects();
    }
	 public QuitSubjects() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() {
		String[] s2=new String[5];
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=readFile().split("��");
		JList list =new JList(s2);
		JButton btn1=new JButton("�˿�");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String[] s2=readFile().split("��");
				if(list.isSelectionEmpty()){
					JOptionPane.showMessageDialog(null, "��û���˿Σ�");
					return;
				}
				for(int i=0;i<s2.length;i++) {
					if(list.isSelectedIndex(i)) {
						s2[i]=null;
					}
					else {
						s2[i]=s2[i]+"��";
					}
				}
				writeFile(s2);
				JOptionPane.showMessageDialog(null, "�˿γɹ���");
				setVisible(false);
			}
		});
		JButton btn2=new JButton("�˳�");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
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
	public static String readFile() {
		String str="";
        String pathname = "C:\\Users\\jl\\Desktop\\test.txt"; // ����·�������·�������ԣ�д���ļ�ʱ��ʾ���·��,��ȡ����·����input.txt�ļ�
        //��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw;
        //���ر��ļ��ᵼ����Դ��й¶����д�ļ���ͬ��
        //Java7��try-with-resources�������Źر��ļ����쳣ʱ�Զ��ر��ļ�����ϸ���https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
        ) {
            String line;
            //�����Ƽ����Ӽ���д��
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