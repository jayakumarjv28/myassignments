package week1.day1;

public class Mobile {
	public void makecall() {
		String mobilemodel="redmi pro";
		float mobileweight=12.0f;
		System.out.println("makecall");
	}
	public void sendmessages() {
		boolean charged=false;
				int mobilecost=14500;
				System.out.println("sending messages");
	}
    public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendmessages();
		obj.makecall();
		System.out.println("this is my mobile");
	} 
		
	
}
