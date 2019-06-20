package lessons;

public class MyClassGouZaoCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassCube2 c1 = new MyClassCube2();
		System.out.println(c1.getCubeVolum());
		
		MyClassCube2 c2 = new MyClassCube2(20,20,20);
		System.out.println(c2.getCubeVolum());
	}

}

//1）构造函数名称一定要和类名称保持一致。
//
//2）构造函数会在对象创建过程是调用
//
//3）构造函数可以有多个，用参数个数和参数类型区分
//
//4）构造函数内部没有返回语句