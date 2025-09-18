class Person{
	String name;
	int age;
	Person(String n,int a){
		name = n;
		age = a;
	}
	void displayInfo(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	String student_id,course;
	Student(String n,int a,String sid,String c){
		super(n,a);
		student_id=sid;
		course=c;
	}
	void displayInfo(){
		super.displayInfo();
		System.out.println("Student id:"+student_id);
		System.out.println("Course:"+course);
	}
}
class ResearchStudent extends Student{
	String researchTopic,guideName;
	ResearchStudent(String n,int a,String sid,String c,String r,String g){
		super(n,a,sid,c);
		researchTopic=r;
		guideName=g;
	}void displayInfo(){
		super.displayInfo();
		System.out.println("Research Topic:"+researchTopic);
		System.out.println("Guide Name:"+guideName);
	}
}
public class MultilevelInheritance{
	public static void main(String args[]){
		ResearchStudent r= new ResearchStudent("Bhavya",19,"24PA1A05H0","CSE","AI IN HEALTHCARE","Ms.Sree");
		r.displayInfo();
	}
}
		
	
