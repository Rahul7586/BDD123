package javap;


abstract class Abstractp{
	int rollNo=123;
	String name="RAG";
	abstract void display();
	public void get() {
		System.out.println("Please Display Name & RollNo:");
	}
}
class Abstractpp extends Abstractp{
	void display() {
		System.out.println(rollNo+ " " +name);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Abstractpp abst = new Abstractpp();
		abst.get();
		abst.display();
	}

}
