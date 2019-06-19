package lessons;

import java.util.Scanner;

public class MyClassInPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一些整数数字。");
		int user_input_number = scan.nextInt();
		System.out.println("刚刚输入的是：" + user_input_number);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("请输入一些小数。");
		double user_input_decimal = scan.nextDouble();
		System.out.println("刚刚输入的是：" + user_input_decimal);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("请输入一些字符串。");
		String user_input_string = scan2.nextLine();
		System.out.println("刚刚输入的是：" + user_input_string);
	}

}
