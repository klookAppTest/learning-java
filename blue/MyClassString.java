package lessons;

public class MyClassString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "Hello a world abc";
		System.out.println(myString.length());//字符串长度
		System.out.println(myString.toLowerCase());//字符串转化小写 
		System.out.println(myString.toUpperCase());//字符串转化大写
		String str1 = "Hello";
		String str2 = "world";
		System.out.println(str1+str2);//字符串用加号链接
		System.out.println(myString.replace("a", "Y"));//替换字母（用Y替换a）
		System.out.println(myString.indexOf('w'));//查找一个字母的索引
		System.out.println(myString.substring(1, 9));//索引1到8的留下
		System.out.println(myString.substring(4));//索引4及之后的留下
		
	}

}
