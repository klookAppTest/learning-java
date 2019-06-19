package lessons;

public class MyClassCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube ci = new Cube();
		System.out.println(ci.getCubeVolum());
		
		Cube co =new Cube(20,20,20);
		System.out.println(co.getCubeVolum());
	}

}
