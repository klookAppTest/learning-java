package lessons;

public class MyClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarry = {1,4,5,2,9};
		//还有其他的创建数组方式
				/*
				 int[] myArry = new int[3]; //定义一个数组，有3个元素
				 int[] myArry = {1,2,3};    //给这个数组赋值
				 int[] myArry = new int[]{1,2,3};  //上面两行可以简写成这一行
				 */
				
				// 根据索引来读取数组元素，索引从0开始，例如myarry[0]= 1
		System.out.println("数组索引为0的元素为  " + myarry[0]);
		System.out.println("数组长度为  " + myarry.length);
		int index=0;
		while(index < myarry.length) {
			System.out.println("第" + (index+1) + "个元素是" + myarry[index]);
			index++;
		}
	}

}
