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
		return "�γ����: "+number+"\n�γ�����"+name+"\n�ڿ���ʦ��"+teacher+"\n�Ͽ�ʱ�䣺"+time+"\n�Ͽεص㣺"+location;
	}
}