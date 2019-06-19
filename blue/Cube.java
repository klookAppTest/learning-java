package lessons;

public class Cube {
	int length;
	int width;
	int height;

	public int getCubeVolum() {
		
		return(length * width * height);

	}
	
	Cube(){
		length = 10;
		width = 20;
		height = 30;
		
	}
	
	Cube(int l,int w,int h){
		length = l;
		width = w;
		height = h;
	}

}
