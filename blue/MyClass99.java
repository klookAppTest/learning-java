package lessons;

import java.util.ArrayList;

public class MyClass99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				/*
				if(i*j<10) {
					System.out.print(i + "*" + j + "=" + i*j + "    ");
				}else {
					System.out.print(i + "*" + j + "=" + i*j + "   ");
				}//判断i*j结果为1位数时输出3个空格，2位数时输出2个空格，用以对齐一位数和两位数的结果
				*/
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}