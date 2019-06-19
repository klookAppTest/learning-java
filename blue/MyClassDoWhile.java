package lessons;

public class MyClassDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		int b = 1;
		while(a<=100) {
			sum1 += a;
			a++;
		}
		System.out.println(sum1);
		do {
			sum2 += b;
			b++;
		}while(b<=100);
		System.out.println(sum2);
	}

}
