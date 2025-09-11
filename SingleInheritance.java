class Employee{
	int empl_id;
	String name;
	void displayDetails(){
		System.out.println("Employee id:"+empl_id);
		System.out.println("Name :" + name);
	}
}
class Teacher extends Employee{
	String subject;
	void setDetails(int id,String n,String sub){
		empl_id=id;
		name=n;
		subject=sub;
	}
	void displayTeacherDetails(){
		displayDetails();
		System.out.println("Subject:"+subject);
	}
}
public class SingleInheritance{
	public static void main(String args[]){
		Teacher t = new Teacher();
		t.setDetails(328,"suma","psychology");
		t.displayTeacherDetails();
	}
}
		 
