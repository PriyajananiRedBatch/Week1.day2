package week1.day2;

public class MyMobile {
	
	//Global Variables
	int screenSize = 16;
	int cost = 45000;
	char logo = 'A';
	float amps = 2.3f;
	long mobileNumber = 8989098909L;
	boolean isBlueTooth = true;
	String brandName = "Apple 6S";
	
	public void makeCall() {
		System.out.println("Making Calls");
	}
	public void sendMsg() {
		System.out.println("Send out a Message");
	}
private void payBills() {
	System.out.println("Bill Payment is private");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyMobile mobObj = new MyMobile();
mobObj.makeCall();
mobObj.sendMsg();
mobObj.payBills();
float amps2 = mobObj.amps;
System.out.println("Amps " + amps2);

int screenSize2 = mobObj.screenSize;
System.out.println("The screensize of the Mobile is: " + screenSize2);

int cost2 = mobObj.cost;
System.out.println("The cost of the mobile is: " + cost2);

long monu = mobObj.mobileNumber;
System.out.println("The Mobile Number is: " + monu);
	}
 
}
