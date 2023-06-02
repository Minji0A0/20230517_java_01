package kh.lclass.oop.sample;

public class Sonata extends Car{
	public Sonata() {
		super(4000); // super(4000); 쓰고 setPrice안쓰려면 car에서 public car와 price지정해줘야함.
	}
	@Override
	public void moveCar() {
		System.out.println("Sonata moveSonata");
	}

}

