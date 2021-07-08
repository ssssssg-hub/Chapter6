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
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입 금액은 " + money + "원입니다.");
	}


}
