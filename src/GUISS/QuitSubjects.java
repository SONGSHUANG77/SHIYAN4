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
	        this.setTitle("学生选课系统");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() {
		String[] s2=new String[5];
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=readFile().split("。");
		JList list =new JList(s2);
		JButton btn1=new JButton("退课");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String[] s2=readFile().split("。");
				if(list.isSelectionEmpty()){
					JOptionPane.showMessageDialog(null, "您没有退课！");
					return;
				}
				for(int i=0;i<s2.length;i++) {
					if(list.isSelectedIndex(i)) {
						s2[i]=null;
					}
					else {
						s2[i]=s2[i]+"。";
					}
				}
				writeFile(s2);
				JOptionPane.showMessageDialog(null, "退课成功！");
				setVisible(false);
			}
		});
		JButton btn2=new JButton("退出");
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
            File writeName = new File("C:\\Users\\jl\\Desktop\\test.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
            	for(int i=0;i<s.length;i++) {
            		if(s[i]!=null) {
            		out.write(s[i]); // \r\n即为换行
            	}
                out.flush(); // 把缓存区内容压入文件
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static String readFile() {
		String str="";
        String pathname = "C:\\Users\\jl\\Desktop\\test.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
            	str=str+line;
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}