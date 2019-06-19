package lessons;

public class MyXPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 10;
			x = x + 1;
			System.out.println(x);
			
			int y = 5;
			y++;
			System.out.println(y);
			
			int z = 15;
			//z++ 是z保持不变，然后再自增操作
			System.out.println(z++);
			System.out.println(z);
			
			int m = 15;
			//++m是先自增操作，然后把自增结果赋值给m
			System.out.println(++m);
			System.out.println(m);
			
			int n =3;
			n += 6;//步长为6
			
			System.out.println(n);
			
	}

}
