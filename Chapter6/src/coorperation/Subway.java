package coorperation;

public class Subway {
	String lineNumber;
	int money;
	int passengerCount;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += 1500;
		this.passengerCount++;
	}
	
	public void printSubwayInfo() {
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + "���̰�, ���� �ݾ��� " + money + "���Դϴ�.");
	}


}
