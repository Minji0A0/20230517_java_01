package kh.lclass.oop.sample;

public class Driver {
	private int license;
	private int money;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 자동차 구매
//	public void buy(Sonata c) {
//		if(money > c.getPrice() ) {
//			System.out.println("구매확정");
//		}else {
//			System.out.println("잔액 부족");
//		}
//	}
//	public void buy(Avante c) {
//		if(money > c.getPrice() ) {
//			System.out.println("구매확정");
//		}else {
//			System.out.println("잔액 부족");
//		}
//	}
	
	public void buy(Car c) {
		if(money > c.getPrice() ) {
			if(c instanceof Sonata) { //instanceof를 사용해야함
				((Sonata) c).moveCar();
				System.out.println("이벤트에 응모되셨습니다. ");
			}
			if(c instanceof Car) {
				System.out.println("Car 이벤트에 응모되셨습니다.");
			}
			System.out.println(c.getPrice()+"원에 구매확정");
		money = money-c.getPrice();
		c.moveCar();
		}else {
			System.out.println("잔액 부족! . 현재 잔액은 "+ money );
		}
	}
	public void driving() {
		
	}
	
}
