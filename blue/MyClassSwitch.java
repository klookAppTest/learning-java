package lessons;

public class MyClassSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		//能不能定义数组，比如把90-100的都定义为a，然后case a这样操作
		switch(score)
		{
		case 90:
				System.out.println("优秀");
				break;
		case 80:
				System.out.println("良");
				break;
		case 70:
				System.out.println("一般");
				break;
		case 60:
				System.out.println("及格");
				break;
		default:
				System.out.println("分数等级未定义");
				break;
		}
	}

}
