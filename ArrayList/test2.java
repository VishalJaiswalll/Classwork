package june;

public class test2 implements MyMethod {
	
	double r=4,area;
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
	System.out.println("this is circle");
	
	}
	
	@Override
	public void accept() {
	// TODO Auto-generated method stub
	area=3.14*r*r;
	System.out.println("The area of circle is:"+area);
	
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	test2 obj=new test2();
	obj.display();
	obj.accept();
	}
	}