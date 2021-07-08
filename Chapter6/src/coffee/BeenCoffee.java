package coffee;

public class BeenCoffee {
	int money;
	String customer;
	
	public BeenCoffee(String customer) {
		this.customer = customer;
	}
	
	public void buy(int money) {
		this.money += 4500;
	}
	
	public void printBeenCoffeeInfo() {
		System.out.println(customer + "씨는 " + money + "원으로" + " 라떼를 구입했습니다");
	}


}
