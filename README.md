# SHIYAN4
综合性实验学生选课系统设计
一、实验目的
分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常

二、实验要求
（一）、系统角色分析及类设计
（二）、要求
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作
2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作
3、针对操作过程中可能出现的各种异常，做异常处理
4、基于输入输出编程，支持学生、课程、教师等数据的读写操作

三、实验步骤
	1、功能描述：
	(1)学生：学号、姓名、性别
	(2)教师：姓名、工号、性别、授课信息
	(3)课程信息：课程号、课程名称、课程地点、课程时间
	(4)选课系统：注册账号、登录账号、选择课程、退课、打印
流程图： 
2、用户登录界面
打开时： 、
输入为空时：  输入错误时： 
3、学生选课界面   
 

四、核心代码
       1、异常处理：
 		try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {       // 一次读入一行数据
            	str=str+line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
2、学生注册：
public static void StuRigistration() throws SQLException{
System.out.println("Please input your ID ");
String ID = console.next();
System.out.println("Please input your Password");
String Password = console.next();

try {
Statement stat = conn.createStatement();
String sql1 = "insert into login(stuID,Password)Values(" + ID + ", " + Password + ")";
//这里密码只能输入数字,问题待解决

int a = stat .executeUpdate(sql1);
System.out.println("成功注册"+ a +"个账号");

StudentMenu1();

}catch(SQLException e) {
// TODO Auto-generated catch block
System.out.println("ID already exists");
}
}

3、文件读写操作
//从文件读入List
	public void load1() {
		File file = new File("students.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			students = (List<Student>) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
五、总结
这次的实验是对所学内容的一次综合练习，包括异常处理、输入输出、GUI窗体、事件模型等，通过这样的设计做出一个选课系统，加强了我对JAVA所学知识的顽固，可以说这也是一个对本学期所学知识的小结。在之后的编程过程中，我也可能会遇到各种问题，希望之后自己能继续将所学知识多加运用达到更好地理解，只有加强练习才能更加熟练掌握。
