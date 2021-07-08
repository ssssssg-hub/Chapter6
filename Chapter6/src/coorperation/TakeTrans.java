package coorperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student tomasStudent = new Student("Tomas", 5000);
		Bus bus1004 = new Bus(1004);
		tomasStudent.takebus(bus1004);
		tomasStudent.printStudentInfo();
		bus1004.printbusInfo();
		
		Subway greenLine = new Subway("2È£¼±");
		Student JamesStudent = new Student("James", 10000);
		JamesStudent.takeSubway(greenLine);
		
		JamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
	}

}
