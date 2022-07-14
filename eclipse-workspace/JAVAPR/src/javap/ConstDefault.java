package javap;

class DefultaConst{
	int rollNo;
	String name;
	DefultaConst(){
		rollNo=123;
		name = "RAG";
	}
	public void display() {
		System.out.println(rollNo+ " "+name);
	}
}

public class ConstDefault {

	public static void main(String[] args) {
		DefultaConst c = new DefultaConst();
		c.display();
		
	}

}
