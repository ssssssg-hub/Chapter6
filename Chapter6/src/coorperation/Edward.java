package coorperation;

public class Edward {
	public String studentName;
	public int age;
	public int money;
	
	public Edward(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
	}
	public void printStudentInfo() {
		System.out.println(studentName + "�л��� ���� ���� " + money + "���Դϴ�.");
	}
}

