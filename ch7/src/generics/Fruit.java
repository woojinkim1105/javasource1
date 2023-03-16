package generics;

class Fruit {

	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{

	@Override
	public String toString() {
		return "Apple";
	}
}	
class Grape extends Fruit{
		
	@Override
	public String toString() {
		return "Grape";
	}	
}

class Toy{
	@Override
	public String toString() {
		return "Toy";
	}
	
}

// T extends Fruit : Fruit의 자손만 타입으로 지정 가능
class FruitBox<T extends Fruit> extends Box2<T>{}

public class GenericsEx4 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
//		FruitBox<Toy> toyBox = new FruitBox<>();  (x)
	
		fruitBox.setItem(new Fruit());
		fruitBox.setItem(new Apple());
		fruitBox.setItem(new Grape());
		
		
		appleBox.setItem(new Apple());
		
		grapeBox.setItem(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
	
	}
}
