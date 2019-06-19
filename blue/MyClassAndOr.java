package lessons;

public class MyClassAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 55;
		int b = 67;
		
		if((a >= 35) && (b >= 35)) {
			System.out.println("条件为真");
		}else {
			System.out.println("条件为假");
		}
		
		if((a >= 35) || (b >= 85)) {
			System.out.println("条件为真");
		}else {
			System.out.println("条件为假");
		}
	}

}
