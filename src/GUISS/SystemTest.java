package GUISS;

public class SystemTest {
	public String[] getSubjects() {
		Teacher teaone=new Teacher("01","����ʦ","Ů","ë��");
		Teacher teatwo=new Teacher("02","����ʦ","��","ģ��");
		Teacher teathree=new Teacher("03","κ��ʦ","Ů","��ɢ");
		Teacher teafour=new Teacher("04","����ʦ","Ů","Python");
		Teacher teafive=new Teacher("05","����ʦ","��","JAVA");
		Subject subone=new Subject("1","ë��","ͼ602","09:40",teaone);
		Subject subtwo=new Subject("2","ģ��","��104","13:30",teatwo);
		Subject subthree=new Subject("3","��ɢ","��105","13:30",teathree);
		Subject subfour=new Subject("4","Python","��0919","07:50",teafour);
		Subject subfive=new Subject("5","JAVA","��0921","09:40",teafive);
		String [] subjects= {subone.toString(),subtwo.toString(),subthree.toString(),subfour.toString(),subfive.toString()};
		return subjects;
		}
}