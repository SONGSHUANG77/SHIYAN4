package GUISS;
/**
*�������û���:2017311475  ����:2017311475 ��ʱ�򣬵�����֤�ɹ�
*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginTest(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("�û���¼����");
		setBounds(300, 300, 300, 300);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("�����û�����");
		jl.setBounds(10, 10, 200, 18);
		final JTextField name=new JTextField(10);
		name.setBounds(80, 10, 150, 18);
		JLabel jl2=new JLabel("�������룺");
		jl2.setBounds(10, 50, 200, 18);
		final JPasswordField password=new JPasswordField(10);
		password.setBounds(80, 10, 150, 18);
		cp.add(jl);
		cp.add(name);
		cp.add(jl2);
		cp.add(password);
		JButton jb=new JButton("ȷ��");
		jb.addActionListener(new ActionListener(){
			private ChoiceSubject choice;

			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "�û������벻����Ϊ�գ�");
					return;
				}
				if(name.getText().trim().equals("2")&&new String(password.getPassword()).trim().equals("2")){
					JOptionPane.showMessageDialog(null, "��ϲ������¼�ɹ�");
					setVisible(false);
					choice = new ChoiceSubject();
				}
				else{
					JOptionPane.showMessageDialog(null, "�û������������");
				}
			}
		});
		jb.setBounds(80, 80, 60, 18);
		cp.add(jb);

		final JButton button = new JButton();
		button.setText("����");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɷ������
				name.setText("");
				password.setText("");
			}
		});
		button.setBounds(150, 80, 60, 18);
		getContentPane().add(button);
	}
	
	public static void main(String[] args) {
		LoginTest l = new LoginTest();
		l.setSize(380, 200);
	}

}