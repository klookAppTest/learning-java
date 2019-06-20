package lessons;

public class MyClassCube2 {

	int length;
	int width;
	int height;
	
	public int getCubeVolum() {
		
		return (length * width * height);
		
	}
	
	MyClassCube2(){
		length = 10;
		width = 20;
		height = 30;
		
	}
	
	MyClassCube2(int l, int w,int h){
		length = l ;
		width = w ;
		height = h ;
		
	}

}
