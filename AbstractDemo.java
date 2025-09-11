import java.util.*;
abstract class Figure{
	double length;
	double breadth;
	double area;
	Figure(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	abstract void area();
}
class Rectangle extends Figure{
	Rectangle(double length,double breadth){
		super(length,breadth);
	}
	void area(){
		System.out.println("Area of Rectangle is:"+(length*breadth));
	}
}
class Triangle extends Figure{
	Triangle(double length,double breadth){
		super(length,breadth);
	}
	void area(){
		System.out.println("Area of Triangle is:"+(0.5*length*breadth));
	}
}
class AbstractDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter the length of Rectangle :");
		double l=sc.nextDouble();
		System.out.print("Enter the breadth of Rectangle :");
		double b=sc.nextDouble();
		Rectangle r =new Rectangle(l,b);
		Figure f;
		f=r;
		f.area();
		System.out.print("Enter the length of Triangle :");
		double base=sc.nextDouble();
		System.out.print("Enter the width of Triangle :");
		double height=sc.nextDouble();
		Triangle t =new Triangle(base,height);
		f=t;
		f.area();
	}
}
		
