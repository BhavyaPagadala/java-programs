class Employee{
	int empl_id;
	String name;
	double baseSalary;
	Employee(int id, String n,double salary){
		empl_id=id;
		name=n;
		baseSalary=salary;
	}
		
	void printEmployeeDetails(){
		System.out.println("Employee id:"+empl_id);
		System.out.println("Name :" + name);
		System.out.println("Employee base salary:"+baseSalary);
	}
}
class Manager extends Employee{
	int size;
	String department;
	Manager(int id, String n,double salary,int s, String d){
		super(id,n,salary);
		size=s;
		department=d;
	}
	void printManagerDetails(){
		super.printEmployeeDetails();
		System.out.println("Team size:"+size);
		System.out.println("Department:"+department);
		
	}
}
class SeniorManager extends Manager{
	String region; 
	int yearsOfExperience;
	SeniorManager(int id, String n,double salary,int s, String d,String r,int y){
		super(id,n,salary,s,d);
		region=r;
		yearsOfExperience=y;
	}
	void printSeniorManagerDetails(){
		super.printManagerDetails();
		System.out.println("Region:"+region);
		System.out.println("Experience in Years:"+yearsOfExperience);
	}
}
public class SuperKeyword{
	public static void main(String args[]){
		SeniorManager m = new SeniorManager(425,"Sreeja",1200000,6,"IT","EAST",4);	
		m.printSeniorManagerDetails();
	}
}
	
	
		 
