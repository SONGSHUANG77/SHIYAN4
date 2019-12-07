package GUISS;

public class SystemTest {
	public String[] getSubjects() {
		Teacher teaone=new Teacher("01","李老师","女","毛概");
		Teacher teatwo=new Teacher("02","周老师","男","模电");
		Teacher teathree=new Teacher("03","魏老师","女","离散");
		Teacher teafour=new Teacher("04","王老师","女","Python");
		Teacher teafive=new Teacher("05","张老师","男","JAVA");
		Subject subone=new Subject("1","毛概","图602","09:40",teaone);
		Subject subtwo=new Subject("2","模电","教104","13:30",teatwo);
		Subject subthree=new Subject("3","离散","教105","13:30",teathree);
		Subject subfour=new Subject("4","Python","综0919","07:50",teafour);
		Subject subfive=new Subject("5","JAVA","综0921","09:40",teafive);
		String [] subjects= {subone.toString(),subtwo.toString(),subthree.toString(),subfour.toString(),subfive.toString()};
		return subjects;
		}
}