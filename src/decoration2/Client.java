package decoration2;

public class Client {

	public static void main(String[] args) {
		dasheng c=new dasheng_self();
		
		fish fish=new fish(c);
		fish.move();
		
		flower flower=new flower(c);
		flower.move();
		
		bird bird=new bird(c);
		bird.move();
		
		bug worn=new bug(c);
		worn.move();
		
		System.out.println("..........");
		dasheng c1=new dasheng_self();
		dasheng fish1=new fish(c1);
		dasheng bird1=new bird(c1);
		bird1.move();
		






		///////

	}

}
