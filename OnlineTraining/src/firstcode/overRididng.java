package firstcode;

class AB{
	public void show() {
		System.out.println("in AB");
	}
}

class BA extends AB{
	public void show() {
		super.show();
		System.out.println("in BA");
	}
	public void showDynamicDispatch() {
		System.out.println("in A");
	}
}

class CA extends AB{
	public void show() {
		System.out.println("in C");
	}
}

public class overRididng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB obj1=new BA();//runtime polymorphism
		obj1.show();
		
		
		obj1=new CA();//dynamic
		obj1.show();
		

	}

}
