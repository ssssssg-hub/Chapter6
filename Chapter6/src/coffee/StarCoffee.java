package coffee;

public class StarCoffee {
	int money;
	String customer;
	
	public StarCoffee(String customer) {
		this.customer = customer;
	}
	
	public void buy(int money) {
		this.money += 4000;
	}
	
	public void printStarCoffeeInfo() {
		System.out.println(customer + "씨는 " + money + "원으로" + "아메리카노를 구입했습니다");
	}


}
