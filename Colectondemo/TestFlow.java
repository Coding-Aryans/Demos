package Colectondemo;

public class TestFlow {
	
	 boolean   id;
	boolean Rid;
	int x=1;
	boolean c=true;
	public T2 m1() {
		
		if(x==3) {
			m2();
			System.out.println("under istd loop");
		}
		else if(c==true) {
			System.out.println("under 2nd loop");
			//return new T2();
		}
		return new T2();
		
	}
	
public T2 m2() {
	x=x+1;
	System.out.println("under m2 method");
	m1();
	return new T2();
}
	public static void main(String[] args) {
		
		TestFlow f=new TestFlow();
	System.out.println(f.m1().move());
	}

}
