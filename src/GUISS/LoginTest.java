package GUISS;
/**
*当输入用户名:2017311475  密码:2017311475 的时候，弹出验证成功
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
		setTitle("用户登录界面");
		setBounds(300, 300, 300, 300);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("输入用户名：");
		jl.setBounds(10, 10, 200, 18);
		final JTextField name=new JTextField(10);
		name.setBounds(80, 10, 150, 18);
		JLabel jl2=new JLabel("输入密码：");
		jl2.setBounds(10, 50, 200, 18);
		final JPasswordField password=new JPasswordField(10);
		password.setBounds(80, 10, 150, 18);
		cp.add(jl);
		cp.add(name);
		cp.add(jl2);
		cp.add(password);
		JButton jb=new JButton("确定");
		jb.addActionListener(new ActionListener(){
			private ChoiceSubject choice;

			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "用户名密码不允许为空！");
					return;
				}
				if(name.getText().trim().equals("2")&&new String(password.getPassword()).trim().equals("2")){
					JOptionPane.showMessageDialog(null, "恭喜您，登录成功");
					setVisible(false);
					choice = new ChoiceSubject();
				}
				else{
					JOptionPane.showMessageDialog(null, "用户名或密码错误");
				}
			}
		});
		jb.setBounds(80, 80, 60, 18);
		cp.add(jb);

		final JButton button = new JButton();
		button.setText("重置");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成方法存根
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