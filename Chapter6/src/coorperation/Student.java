package coorperation;

public class Student {
	public String studentName;
	public int age;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takebus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway subway) {
		this.money -= 1500;
		subway.take(1500);
	}
	
	public void printStudentInfo() {
		System.out.println(studentName + "�л��� ���� ���� " + money + "���Դϴ�.");
	}
}
