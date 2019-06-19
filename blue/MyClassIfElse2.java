package lessons;

public class MyClassIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 9;
		int c = 18;
		
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
	}else {
		if(b > c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
}
