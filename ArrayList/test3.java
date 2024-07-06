package june;

public class test3 implements MyMethod1 {
	
	double a=4,area;
	
	@Override
	public void input() {
	// TODO Auto-generated method stub
	System.out.println("this is square");
	
	}
	
	@Override
	public void getdata() {
	// TODO Auto-generated method stub
	area=a*a;
	System.out.println("The area of square is:"+area);
	
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	test3 obj=new test3();
	obj.input();
	obj.getdata();
	}
	}