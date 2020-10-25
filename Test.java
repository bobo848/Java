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
		Course javaProgramming =new Course(1,"javaProgramming","zhang","7:50","教300");
		Course linera_algebra =new Course(2,"linera_algebra","chen","9:40","教104");
		Course discrete_mathematics =new Course(3,"discrete_mathematics","wei","13：30","教104");
		Course physics =new Course(4,"physics","yu","4:05","教305");
		Student student1 =new Student(1,"Ming"); 
		Student student2 =new Student(2,"Hong"); 
		Student student3 =new Student(3,"Guang"); 
		Student student4 =new Student(4,"Gang"); 
		Student student5 =new Student(5,"Xiao"); 
		Student transtudent =new Student(0,"0"); 
		System.out.println("输入学号：");
		Scanner sacn1 = new Scanner(System.in); 
		int stnumber = sacn1.nextInt(); //第三方库，键盘输入
		while (true) {
			System.out.println("输入选课名称：");
			Scanner sacn2 = new Scanner(System.in);
			String name1 = sacn2.nextLine(); //第三方库，键盘输入
			transtudent.chooseCourse(name1);
			System.out.println("是否继续选课：");
			Scanner sacn3 = new Scanner(System.in); 
			int panduan1 = sacn3.nextInt(); //第三方库，键盘输入
			if(panduan1==0) {
				break;
			}
		}
		System.out.println("是否退课：");
		Scanner sacn4 = new Scanner(System.in); 
		tuike = sacn4.nextInt(); //第三方库，键盘输入
		while(tuike==1) {
			System.out.println("输入退课名称：");
			Scanner sacn5 = new Scanner(System.in);
			String name2 = sacn5.nextLine(); //第三方库，键盘输入
			transtudent.quitCourse(name2);
			System.out.println("是否继续退课：");
			Scanner sacn6 = new Scanner(System.in); 
			int panduan2 = sacn6.nextInt(); //第三方库，键盘输入
			if(panduan2==0) {
				break;
			}
		}
	    transtudent.transition(student1,student2,student3,student4,student5,transtudent,stnumber);
	    System.out.println(transtudent);		//简单选课信息打印
		System.out.println("是否查看课程详细信息：");
		Scanner sacn7 = new Scanner(System.in); 
		int xiangxi = sacn7.nextInt();
		while(xiangxi==1) {
			System.out.println("输入课程名称：");
			Scanner sacn8 = new Scanner(System.in);
			String coursename = sacn8.nextLine(); //第三方库，键盘输入
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
			System.out.println("是否继续查看详细信息：");
			Scanner sacn10 = new Scanner(System.in); 
			int panduan3 = sacn10.nextInt(); //第三方库，键盘输入
			if(panduan3==0) {
				break;
			}
		}
		
	}
}



