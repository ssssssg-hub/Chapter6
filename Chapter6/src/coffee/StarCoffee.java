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
		System.out.println(customer + "���� " + money + "������" + "�Ƹ޸�ī�븦 �����߽��ϴ�");
	}


}
