package coorperation;

public class Taxi {
	int money;
	
	public void take(int money) {
		this.money += 10000;
	}
	public void printTaxiInfo() {
		System.out.println("�ýú�� " + money + "���Դϴ�");
	}
}
