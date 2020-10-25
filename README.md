# Java2
# 计192刘利波2019311290
# 实验三 学生选课模拟系统
## 一、实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2.掌握面向对象的类设计方法（属性、方法）；  
3.掌握类的继承用法，通过构造方法实例化对象；  
4.学会使用super()，用于实例化子类；  
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二、业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅0.教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
 
 
 
## 三、实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 ）；模拟学生退课操作，再打印课程信息。
3.编写实验报告。
## 四、实验过程
1.根据实验要求，建立父类：人员类,对象属性包含(人员编号，姓名)。  
2.建课程类，包含(课程编号，课程名称，授课老师，上课时间，上课地点)。  
3.建教师类，继承父类，与课程类关联。  
4.建学生类，继承父类，并添加特有属性，所选课程。  
5.创建Test测试类(主类)。  
## 五、流程图





## 六、核心代码
### Personnel
public class Personnel {  
	int number;  
	String name;  
	Personnel(int a,String b){  
		number=a;  
		name=b;  
	}  
}  

### Student
void chooseCourse(String a) {  
		if(course1=="null") {  
			course1=a;  
		}  
		else if(course2=="null") {  
			course2=a;  	
		}  
		else if(course3=="null") {  
			course3=a;  
		}  
		else if(course4=="null") {  
			course4=a;  	
		}  
		else {  
			System.out.println("选课数已达上限");  
		}  
		coursecount++;  
	}  
 
 ### Test
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

## 七、运行结果
### ![运行结果](https://github.com/bobo848/Java2/blob/main/实验三运行截图.JPG)
## 八、实验收获
通过本次实验我懂得了系统的编译和使用  
对于类的继承和重写 父类构造方法调用编写  
深化了找错和改错的进行  
对于构造方法有了更深的理解  

