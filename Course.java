package experiment3;

public class Course{
	int number;
	String name;
	String teacher;
	String time;
	String location;
	Course(int a,String b,String c,String d,String e){
		number =a;
		name=b;
		teacher=c;
		time=d;
		location=e;
	}
	public String toString() {
		return "课程序号: "+number+"\n课程名："+name+"\n授课老师："+teacher+"\n上课时间："+time+"\n上课地点："+location;
	}
}