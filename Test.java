package experiment3; 

import java.util.Scanner;
import java.util.*;
public class Test{
	public static void main(String args[]) {
		String xing="student";
		int tuike;
		Faculty teacher1 =new Faculty(1,"zhang","javaProgramming");
		Faculty teacher2 =new Faculty(2,"chen","linera_algebra");
		Faculty teacher3 =new Faculty(3,"wei","discrete_mathematics");
		Faculty teacher4 =new Faculty(4,"yu","physics");
		Course javaProgramming =new Course(1,"javaProgramming","zhang","7:50","��300");
		Course linera_algebra =new Course(2,"linera_algebra","chen","9:40","��104");
		Course discrete_mathematics =new Course(3,"discrete_mathematics","wei","13��30","��104");
		Course physics =new Course(4,"physics","yu","4:05","��305");
		Student student1 =new Student(1,"Ming"); 
		Student student2 =new Student(2,"Hong"); 
		Student student3 =new Student(3,"Guang"); 
		Student student4 =new Student(4,"Gang"); 
		Student student5 =new Student(5,"Xiao"); 
		Student transtudent =new Student(0,"0"); 
		System.out.println("����ѧ�ţ�");
		Scanner sacn1 = new Scanner(System.in); 
		int stnumber = sacn1.nextInt(); //�������⣬��������
		while (true) {
			System.out.println("����ѡ�����ƣ�");
			Scanner sacn2 = new Scanner(System.in);
			String name1 = sacn2.nextLine(); //�������⣬��������
			transtudent.chooseCourse(name1);
			System.out.println("�Ƿ����ѡ�Σ�");
			Scanner sacn3 = new Scanner(System.in); 
			int panduan1 = sacn3.nextInt(); //�������⣬��������
			if(panduan1==0) {
				break;
			}
		}
		System.out.println("�Ƿ��˿Σ�");
		Scanner sacn4 = new Scanner(System.in); 
		tuike = sacn4.nextInt(); //�������⣬��������
		while(tuike==1) {
			System.out.println("�����˿����ƣ�");
			Scanner sacn5 = new Scanner(System.in);
			String name2 = sacn5.nextLine(); //�������⣬��������
			transtudent.quitCourse(name2);
			System.out.println("�Ƿ�����˿Σ�");
			Scanner sacn6 = new Scanner(System.in); 
			int panduan2 = sacn6.nextInt(); //�������⣬��������
			if(panduan2==0) {
				break;
			}
		}
	    transtudent.transition(student1,student2,student3,student4,student5,transtudent,stnumber);
	    System.out.println(transtudent);		//��ѡ����Ϣ��ӡ
		System.out.println("�Ƿ�鿴�γ���ϸ��Ϣ��");
		Scanner sacn7 = new Scanner(System.in); 
		int xiangxi = sacn7.nextInt();
		while(xiangxi==1) {
			System.out.println("����γ����ƣ�");
			Scanner sacn8 = new Scanner(System.in);
			String coursename = sacn8.nextLine(); //�������⣬��������
			switch(coursename) {
			case "javaProgramming":System.out.println(javaProgramming);
			break;
			case "linera_algebra":System.out.println(linera_algebra);
			break;
			case "discrete_mathematics":System.out.println(discrete_mathematics);
			break;
			case "physics":System.out.println(physics);
			break;
			}
			System.out.println("�Ƿ�����鿴��ϸ��Ϣ��");
			Scanner sacn10 = new Scanner(System.in); 
			int panduan3 = sacn10.nextInt(); //�������⣬��������
			if(panduan3==0) {
				break;
			}
		}
		
	}
}



