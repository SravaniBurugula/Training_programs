package mavenproject;

public class Human {
	public HumanEye leftEye;
	public HumanEye rightEye;
	public Human() {
		leftEye = new HumanEye();
		rightEye= new HumanEye();
	}
	class HumanEye extends Eye{
		static int value;
	}
class Man extends Human{
	{
		
	}
public class Application{
	public void main(String[] args) {
		Human.HumanEye.value=9;
	}
}
}

}
