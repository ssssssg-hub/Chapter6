package coffee;

public class People {
	public String orderPeople;
	public int money;
	
	public People(String studentName, int money) {
		this.orderPeople = orderPeople;
		this.money = money;
	}
	
	public void StarCoffee(StarCoffee starcoffee) {
		this.money -= 4000;
	}
	
	public void BeenCoffee(BeenCoffee beencoffee) {
		this.money -= 4500;
	}
	
	public void printStudentInfo() {
		System.out.println(orderPeople + "¾¾´Â " + money + "¿øÀ» ³»°í »ò½À´Ï´Ù.");
	}
}

