package firstcode;

class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
}
//single level

class CalcSub extends Calculator{
	public int sub(int a,int b) {
		return a-b;
	}
}

// multilevel

class calAdv extends CalcSub{
	public int multi(int a,int b) {
		return a*b;
	}
	
}



public class Inheritance {

	public static void main(String[] args) {
		calAdv c1=new calAdv();
		int result1=c1.add(5,12);
		int result2=c1.sub(12,5);
		int result3=c1.multi(4,3);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
