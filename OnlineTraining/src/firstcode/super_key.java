package firstcode;

class animal{
	public void eat(){
		System.out.println("i eat food");
	}
}

class dog extends animal{
	public void eat() {
		super.eat();
		System.out.println("eat bone");
	}
	public void bark() {
		System.out.println("Says bhoo bhoo!");
	}
	
}
public class super_key {

	public static void main(String[] args) {
		
		dog labra=new dog();
		labra.eat();
		labra.bark();

		// TODO Auto-generated method stub

	}

}
