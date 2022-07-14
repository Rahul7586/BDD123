package javap;

class ParaConst{
	int rollNo;
	String name;
	ParaConst(int rollno, String Name){
		rollNo = rollno;
		name = Name;
	}
	public void display() {
		System.out.println(rollNo+ " " +name);
	}
}


public class ConstPara {

	public static void main(String[] args) {
		ParaConst c = new ParaConst(12, "RAG");
		c.display();

	}

}
