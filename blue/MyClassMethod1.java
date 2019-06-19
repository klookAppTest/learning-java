package lessons;

public class MyClassMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello("Blue");
		
		System.out.println(Max(57,89));
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello" + name);
	}
	
	public static int Max(int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}