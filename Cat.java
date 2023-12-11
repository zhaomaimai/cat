package animal.cat;

public class Cat{
	private int age;
	private double weight;
	private String colour;
	private String kind;
	private String toy;
	private String yelling;
	public Cat(){
	}
	void setAge(int age){
		this.age = age;
	}
	void setWeight(double weight){
		this.weight = weight;
	}
	void setColour(String colour){
		this.colour = colour;
	}
	void setKind(String kind){
		this.kind = kind;
	}
	void setYelling(String yelling){
		this.yelling = yelling;
	}
	void setToy(String toy){
		this.toy = toy;
	}
	void printcat(){
		System.out.println(kind+"的年龄为"+age+"体重为"
		+weight+"千克,颜色为"+colour+"品种为"+kind);
	}
	void yelling(){
		System.out.println("发出"+yelling+"的声音");
	}
	void play(){
		System.out.println("在玩"+toy);
	}
	void playing(Cat cat){
		System.out.println(kind+"和"+cat.kind+"在一起玩");
	}
}