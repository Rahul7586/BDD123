package javap;

 interface interfacedemo{
	int rollNo=123;
	String name="RAG";
	abstract void display();
}
interface interfacedemo2{
	String address = "KOP";
}

interface interfacedemo3 extends interfacedemo2,interfacedemo{
	abstract void put();
}
 
class interfacedemo4 implements interfacedemo3 {
	public void display() {
		 System.out.println(rollNo+ " "+name);
	 }
	public void put() {
		System.out.println(""+address);
	}
 }

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println("Interface Demonstration");
		interfacedemo4 demo = new interfacedemo4();
		demo.display();
		demo.put();
	}

}
