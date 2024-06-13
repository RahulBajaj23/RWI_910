package firstcode;

class A{
	public A() {
		System.out.println("in A");	
		}
	
	public A(int i) {
		System.out.println("int in A");	
	}
}

class B extends A{
	public B() {
		super(5);
		System.out.println("in B");	
	}
	
	public B(int i) {
		super();
		System.out.println("int in B");	
	}
}

public class superDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj1=new B();

	}

}
