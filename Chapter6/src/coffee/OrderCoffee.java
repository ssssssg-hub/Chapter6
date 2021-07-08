package coffee;

public class OrderCoffee {

	public static void main(String[] args) {
		People Kim = new People("Kim", 7000);
		StarCoffee starCoffee = new StarCoffee();
		Kim.buyStarCoffee(starCoffee,4000);
		Kim.buyStarCoffee(starCoffee, Kim.money);
		
		People Lee = new People("Lee", 7500);
		StarCoffee BeenCoffee = new BeenCoffee();
		Lee.buyStarCoffee(starCoffee,4000);
		Lee.buyStarCoffee(starCoffee, Lee.money);
	}

}
