interface Printable{
	void print();
}
interface Showable{
	void show();
}
class Example implements Printable,Showable{
	public void print(){
		System.out.println("printing the interface");
	}
	public void show(){
		System.out.println("showing the interface");
	}
}
public class InterfaceExample{
	public static void main(String []args){
		Example ex= new Example();
		ex.print();
		ex.show();
	}
}
