package animal.cat;

public class Main{
	public static void main(String []args){
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.setAge(5);
		cat1.setWeight(10);
		cat1.setColour("红色");
		cat1.setKind("波斯猫");
		cat1.setYelling("喵喵");
		cat1.setToy("毛线团");
		cat1.printcat();
		cat1.yelling();
		cat1.play();
		cat2.setAge(3);
		cat2.setWeight(6);
		cat2.setColour("黑白色");
		cat2.setKind("奶牛猫");
		cat2.setYelling("嗷呜");
		cat2.setToy("玩偶");
		cat2.printcat();
		cat2.yelling();
		cat2.play();
		cat1.playing(cat2);
	}
}